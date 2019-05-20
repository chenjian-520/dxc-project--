package com.mazh.ssm.controller;

import com.mazh.ssm.pojo.Pageviews;
import com.mazh.ssm.pojo.PageviewsVO;
import com.mazh.ssm.service.PageviewsService;
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
@RequestMapping("pageviews")
public class PageviewsController {

	@Autowired
	private PageviewsService pageviewsService;


	/**
	 * 不带条件的查询
	 */
	@RequestMapping("getAllPageviews.do")
	public ModelAndView getAllPageviews() throws Exception {

		List<Pageviews> PageviewsList = pageviewsService.getAllPageviews();
		for (int i=0;i<=3;i++){
			System.out.println(PageviewsList.get(i));
		}
		// 返回ModelAndView
		ModelAndView modelAndView = new ModelAndView();
		// 相当 于request的setAttribut，在jsp页面中通过itemsList取数据
		modelAndView.addObject("pageviewsList", PageviewsList);
		modelAndView.addObject("aaa",PageviewsList.get(1));
		modelAndView.setViewName("pageviews/listPageviews");

		return modelAndView;
	}

	/**
	 * 待条件的查询
	 */
	@RequestMapping("getAllPageviewsWhere.do")
	public String getAllPageviewsWhere(HttpServletRequest request, Pageviews pageviews, Date birthday) throws Exception {
		List<Pageviews> PageviewsList = pageviewsService.getAllPageviewsWhere(pageviews);
		System.out.println("-----" + birthday +PageviewsList);
		request.setAttribute("pageviewsList", PageviewsList);
		request.setAttribute("birthday", birthday);
		return "pageviews/listPageviews";
	}

	@RequestMapping("updateAllPageviews.do")
	public String updateAllPageviews(HttpServletRequest request, Pageviews pageviews) throws Exception {
		List<Pageviews> PageviewsList = pageviewsService.getAllPageviewsWhere(pageviews);
		request.setAttribute("pageviewsList", PageviewsList);
		return "pageviews/listPageviewsUpdate";
	}

	/**
	 * 批量修改方法
	 */
	@RequestMapping("updateAllPageviewsPost.do")
	public String updateAllPageviewsPost(HttpServletRequest request, PageviewsVO pageviewsVO) throws Exception {
		pageviewsService.updateAllPageviews(pageviewsVO);
		return "redirect:getAllPageviews.do";
	}

	@RequestMapping("getOnePageviews.do")
	public ModelAndView getOnePageviews(String session) throws Exception {

		Pageviews pageviews = pageviewsService.getOnePageviews(session);

		// 返回ModelAndView
		ModelAndView modelAndView = new ModelAndView();
		// 相当 于request的setAttribut，在jsp页面中通过itemsList取数据
		modelAndView.addObject("pageviews", pageviews);

		modelAndView.setViewName("pageviews/PageviewsInfo");

		return modelAndView;
	}

	/**
	 * 返回值是String， 该返回值表示逻辑视图名 获取修改页面的参数值绑定到student对象里
	 */
	@RequestMapping(value = "insertPageviews.do", method = { RequestMethod.POST })
	public String insertPageviews(Pageviews pageviews, Model model) throws Exception {
		pageviewsService.insertPageviews(pageviews);
		model.addAttribute("pageviews",pageviews);
		return "pageviews/PageviewsInfo";
	}

	/**
	 * get请求，表示跳转到添加学生信息页面
	 */
	@RequestMapping(value = "insertPageviews.do", method = {RequestMethod.GET })
	public String insertPageviews() throws Exception {

		return "pageviews/insertPageviews";
	}

	/**
	 * 直接修改学生信息 参数：Student student, 要求student的属性名 和 页面标签的 name属性必须一致，否则会绑定失败
	 */
	@RequestMapping(value = "/updatePageviews.do", method = { RequestMethod.POST })
	public String updatePageviews(Pageviews pageviews) throws Exception {
		System.out.println("updatePageviews  POST");
		pageviewsService.updatePageviews(pageviews);
		return "redirect:getAllPageviews.do";
	}

	/**
	 * value="id" 表示从页面接收的参数名字叫做 id， 然后在请求方法，改名叫 student_id
	 * required=true，表示该参数必不可少，如果没有传参，则会抛出异常
	 * defaultValue="",是在当没有传参id的时候，可以有一个默认值，防止抛出异常
	 */
	@RequestMapping(value = "updatePageviews.do", method = { RequestMethod.GET })
	public String updatePageviews(Model model, @RequestParam(value = "session", required = true, defaultValue = "1") String pageviews_session) throws Exception {
		System.out.println("updatePageviews  GET");
		Pageviews pageviews = pageviewsService.getOnePageviews(pageviews_session);
		model.addAttribute("pageviews", pageviews);
		return "pageviews/updatePageviews";
	}

	/**
	 * 根据学生ID删除学生信息
	 */
	@RequestMapping("deletePageviews.do")
	public String deletePageviews(String session) throws Exception {
		pageviewsService.deletePageviews(session);
		return "redirect:getAllPageviews.do";
	}

	@RequestMapping("deleteCheckPageviews.do")
	public String deleteCheckPageviews(String[] Pageviews_ids) throws Exception {
		pageviewsService.deleteCheckPageviews(Pageviews_ids);
		return "redirect:getAllPageviews.do";
	}



}
