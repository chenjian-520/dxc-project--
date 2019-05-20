package com.mazh.ssm.controller;

import com.mazh.ssm.pojo.Visits;
import com.mazh.ssm.pojo.VisitsVO;
import com.mazh.ssm.service.VisitsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

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
@RequestMapping("visits")
public class VisitsController {

	@Autowired
	private VisitsService visitsService;


	/**
	 * 不带条件的查询
	 */
	@RequestMapping("getAllVisits.do")
	public ModelAndView getAllVisits() throws Exception {

		List<Visits> VisitsList = visitsService.getAllVisits();
		for (int i=0;i<=3;i++){
			System.out.println(VisitsList.get(i));
		}
		// 返回ModelAndView
		ModelAndView modelAndView = new ModelAndView();
		// 相当 于request的setAttribut，在jsp页面中通过itemsList取数据
		modelAndView.addObject("visitsList", VisitsList);
		modelAndView.addObject("vvv",VisitsList.get(1));
		modelAndView.setViewName("visits/listVisits");

		return modelAndView;
	}

	/**
	 * 待条件的查询
	 */
	@RequestMapping("getAllVisitsWhere.do")
	public String getAllVisitsWhere(HttpServletRequest request, Visits visits, Date birthday) throws Exception {
		List<Visits> VisitsList = visitsService.getAllVisitsWhere(visits);
		System.out.println("-----" + birthday +VisitsList);
		request.setAttribute("visitsList", VisitsList);
		request.setAttribute("birthday", birthday);
		return "visits/listVisits";
	}

	@RequestMapping("updateAllVisits.do")
	public String updateAllVisits(HttpServletRequest request, Visits visits) throws Exception {
		List<Visits> VisitsList = visitsService.getAllVisitsWhere(visits);
		request.setAttribute("visitsList", VisitsList);
		return "visits/listVisitsUpdate";
	}

	/**
	 * 批量修改方法
	 */
	@RequestMapping("updateAllVisitsPost.do")
	public String updateAllVisitsPost(HttpServletRequest request, VisitsVO visitsVO) throws Exception {
		visitsService.updateAllVisits(visitsVO);
		return "redirect:getAllVisits.do";
	}

	@RequestMapping("getOneVisits.do")
	public ModelAndView getOneVisits(String session) throws Exception {

		Visits visits = visitsService.getOneVisits(session);

		// 返回ModelAndView
		ModelAndView modelAndView = new ModelAndView();
		// 相当 于request的setAttribut，在jsp页面中通过itemsList取数据
		modelAndView.addObject("visits", visits);

		modelAndView.setViewName("visits/VisitsInfo");

		return modelAndView;
	}

	/**
	 * 返回值是String， 该返回值表示逻辑视图名 获取修改页面的参数值绑定到student对象里
	 */
	@RequestMapping(value = "insertVisits.do", method = { RequestMethod.POST })
	public String insertVisits(Visits visits,Model model) throws Exception {
		visitsService.insertVisits(visits);
		model.addAttribute("visits",visits);
		return "visits/VisitsInfo";
	}

	/**
	 * get请求，表示跳转到添加学生信息页面
	 */
	@RequestMapping(value = "insertVisits.do", method = {RequestMethod.GET })
	public String insertVisits() throws Exception {
		return "visits/insertVisits";
	}

	/**
	 * 直接修改学生信息 参数：Student student, 要求student的属性名 和 页面标签的 name属性必须一致，否则会绑定失败
	 */
	@RequestMapping(value = "/updateVisits.do", method = { RequestMethod.POST })
	public String updateVisits(Visits visits) throws Exception {
		System.out.println("updateVisits  POST");
		visitsService.updateVisits(visits);
		return "redirect:getAllVisits.do";
	}

	/**
	 * value="id" 表示从页面接收的参数名字叫做 id， 然后在请求方法，改名叫 student_id
	 * required=true，表示该参数必不可少，如果没有传参，则会抛出异常
	 * defaultValue="",是在当没有传参id的时候，可以有一个默认值，防止抛出异常
	 */
	@RequestMapping(value = "updateVisits.do", method = { RequestMethod.GET })
	public String updateVisits(Model model, @RequestParam(value = "session", required = true, defaultValue = "1") String visits_session) throws Exception {
		System.out.println("updateVisits  GET");
		Visits visits = visitsService.getOneVisits(visits_session);
		model.addAttribute("visits", visits);
		return "visits/updateVisits";
	}

	/**
	 * 根据学生ID删除学生信息
	 */
	@RequestMapping("deleteVisits.do")
	public String deleteVisits(String session) throws Exception {
		visitsService.deleteVisits(session);
		return "redirect:getAllVisits.do";
	}

	@RequestMapping("deleteCheckVisits.do")
	public String deleteCheckVisits(String[] visits_ids) throws Exception {
		visitsService.deleteCheckVisits(visits_ids);
		return "redirect:getAllVisits.do";
	}



}
