package com.mazh.ssm.controller;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import com.mazh.ssm.pojo.Student;
import com.mazh.ssm.pojo.StudentVO;
import com.mazh.ssm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

/**
 * 使用注解进行Controller开发时： 
 * 1、直接自定义controller类， 不用进行任何的继承和实现 
 * 2、在controller上可以加 reqeustMapping， 作用就是隔离controller， 窄化请求范围
 * 
 * 3、方法的定义 
 * 	3.1、方法的返回值可以是void， 可以是string， 可以是ModelAndView 
 * 	3.2、方法的参数绑定(基本类型， 包装类型......， HttpServletReuqest, HttpServletResponse, HttpSession, Model/ModelMap) 
 * 	3.3、限制方法能处理的请求范围，是POST 还是 GET
 */
@Controller
@RequestMapping("student")
public class StudentController {

	@Autowired
	private StudentService studentService;

	/**
	 * 不带条件的查询
	 */
	@RequestMapping("getAllStudents.do")
	public ModelAndView getAllStudents() throws Exception {

		List<Student> studentList = studentService.getAllStudent();

		// 返回ModelAndView
		ModelAndView modelAndView = new ModelAndView();
		// 相当 于request的setAttribut，在jsp页面中通过itemsList取数据
		modelAndView.addObject("studentList", studentList);

		modelAndView.setViewName("students/listStudent");

		return modelAndView;
	}

	/**
	 * 待条件的查询
	 */
	@RequestMapping("getAllStudentsWhere.do")
	public String getAllStudentsWhere(HttpServletRequest request, Student student, Date birthday) throws Exception {
		List<Student> studentList = studentService.getAllStudentsWhere(student);
		System.out.println("-----" + birthday);
		request.setAttribute("studentList", studentList);
		request.setAttribute("birthday", birthday);
		return "students/listStudent";
	}

	@RequestMapping("updateAllStudents.do")
	public String updateAllStudents(HttpServletRequest request, Student student) throws Exception {
		List<Student> studentList = studentService.getAllStudentsWhere(student);
		request.setAttribute("studentList", studentList);
		return "students/listStudentUpdate";
	}

	/**
	 * 批量修改方法
	 */
	@RequestMapping("updateAllStudentsPost.do")
	public String updateAllStudentsPost(HttpServletRequest request, StudentVO studentVO) throws Exception {
		studentService.updateAllStudent(studentVO);
		return "redirect:getAllStudents.do";
	}

	@RequestMapping("getOneStudent.do")
	public ModelAndView getOneStudent(int id) throws Exception {

		Student student = studentService.getOneStudent(id);

		// 返回ModelAndView
		ModelAndView modelAndView = new ModelAndView();
		// 相当 于request的setAttribut，在jsp页面中通过itemsList取数据
		modelAndView.addObject("student", student);

		modelAndView.setViewName("students/studentInfo");

		return modelAndView;
	}

	/**
	 * 返回值是String， 该返回值表示逻辑视图名 获取修改页面的参数值绑定到student对象里
	 */
	@RequestMapping(value = "insertStudent.do", method = { RequestMethod.POST })
	public String insertStudent(Student student) throws Exception {
		studentService.insertStudent(student);
		// 跳转到学生列表页面
		// return "redirect:student/getAllStudents.do";
		
//		WebApplicationContext wac = ContextLoader.getCurrentWebApplicationContext();

		// 跳转到学生修改页面
		return "forward:student/updateStudent.do";
	}

	// 等同于上面的方法
	/*@RequestMapping(value = "insertStudent.do", method = { RequestMethod.POST })
	public void insertStudent(HttpServletRequest request, HttpServletResponse response, Student student) throws Exception {
		studentService.insertStudent(student);
		response.sendRedirect("student/getAllStudents.do");
	}*/

	/**
	 * get请求，表示跳转到添加学生信息页面
	 */
	@RequestMapping(value = "insertStudent.do", method = {RequestMethod.GET })
	public String insertStudent(HttpServletRequest request,  int id) throws Exception {

		Student oneStudent = studentService.getOneStudent(id);
		request.setAttribute("student", oneStudent);

		return "students/insertStudent.do";
	}

	/**
	 * 直接修改学生信息 参数：Student student, 要求student的属性名 和 页面标签的 name属性必须一致，否则会绑定失败
	 */
	@RequestMapping(value = "/updateStudent.do", method = { RequestMethod.POST })
	public String updateStudent(Student student) throws Exception {
		System.out.println("updateStudent  POST");
		studentService.updateStudent(student);
		return "redirect:getAllStudents.do";
	}

	/**
	 * value="id" 表示从页面接收的参数名字叫做 id， 然后在请求方法，改名叫 student_id
	 * required=true，表示该参数必不可少，如果没有传参，则会抛出异常
	 * defaultValue="",是在当没有传参id的时候，可以有一个默认值，防止抛出异常
	 */
	@RequestMapping(value = "updateStudent.do", method = { RequestMethod.GET })
	public String updateStudent(Model model, @RequestParam(value = "id", required = true, defaultValue = "1") Integer student_id) throws Exception {
		System.out.println("updateStudent  GET");
		Student student = studentService.getOneStudent(student_id);
		model.addAttribute("student", student);
		return "students/updateStudent";
	}

	/**
	 * 根据学生ID删除学生信息
	 */
	@RequestMapping("deleteStudent.do")
	public String deleteStudent(int id) throws Exception {
		studentService.deleteStudent(id);
		return "redirect:getAllStudents.do";
	}

	@RequestMapping("deleteCheckStudents.do")
	public String deleteCheckStudents(int[] student_ids) throws Exception {
		studentService.deleteCheckStudents(student_ids);
		return "redirect:getAllStudents.do";
	}

	@RequestMapping("updateLoadFile.do")
	public String updateLoadFile() {
		return "students/studentPicture";
	}

	@RequestMapping("uploadPicture.do")
	public String uploadPicture(HttpServletRequest request, MultipartFile pictureFile) throws Exception, IOException {

		// 原始文件名称
		String pictureFile_name = pictureFile.getOriginalFilename();
		// 新文件名称
		String newFileName = UUID.randomUUID().toString() + pictureFile_name.substring(pictureFile_name.lastIndexOf("."));

		// 获取项目路径。
		String realPath = request.getServletContext().getRealPath("/");
		System.out.println("项目发布路径："+realPath);
		// 上传图片
		String newFileName2 = realPath +"\\"+ newFileName;
		File uploadPic = new File(newFileName2);

		if (!uploadPic.exists()) {
			uploadPic.mkdirs();
		}
		// 向磁盘写文件
		pictureFile.transferTo(uploadPic);
		System.out.println("上传的文件路径为：" + newFileName2);

		request.setAttribute("newFileName2", newFileName);

		return "students/studentPicture";
	}

}
