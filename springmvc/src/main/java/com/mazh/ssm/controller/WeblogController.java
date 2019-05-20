package com.mazh.ssm.controller;

import com.mazh.ssm.pojo.Visits;
import com.mazh.ssm.pojo.VisitsVO;
import com.mazh.ssm.pojo.Weblog;
import com.mazh.ssm.pojo.WeblogVO;
import com.mazh.ssm.service.VisitsService;
import com.mazh.ssm.service.WeblogService;
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
@RequestMapping("weblog")
public class WeblogController {

    @Autowired
    private WeblogService weblogService;


    /**
     * 不带条件的查询
     */
    @RequestMapping("getAllWeblog.do")
    public ModelAndView getAllWeblog() throws Exception {

        List<Weblog> WeblogList = weblogService.getAllWeblog();
        for (int i=0;i<=3;i++){
            System.out.println(WeblogList.get(i));
        }
        // 返回ModelAndView
        ModelAndView modelAndView = new ModelAndView();
        // 相当 于request的setAttribut，在jsp页面中通过itemsList取数据
        modelAndView.addObject("weblogList", WeblogList);
        modelAndView.addObject("vvv",WeblogList.get(1));
        modelAndView.setViewName("weblog/listWeblog");

        return modelAndView;
    }

    /**
     * 待条件的查询
     */
    @RequestMapping("getAllWeblogWhere.do")
    public String getAllWeblogWhere(HttpServletRequest request, Weblog weblog, Date birthday) throws Exception {
        List<Weblog> WeblogList = weblogService.getAllWeblogWhere(weblog);
        System.out.println("-----" + birthday +WeblogList);
        request.setAttribute("weblogList", WeblogList);
        request.setAttribute("birthday", birthday);
        return "weblog/listWeblog";
    }

    @RequestMapping("updateAllWeblog.do")
    public String updateAllWeblog(HttpServletRequest request, Weblog weblog) throws Exception {
        List<Weblog> WeblogList = weblogService.getAllWeblogWhere(weblog);
        request.setAttribute("weblogList", WeblogList);
        return "weblog/listWeblogUpdate";
    }

    /**
     * 批量修改方法
     */
    @RequestMapping("updateAllWeblogPost.do")
    public String updateAllWeblogPost(HttpServletRequest request, WeblogVO weblogVO) throws Exception {
        weblogService.updateAllWeblog(weblogVO);
        return "redirect:getAllVisits.do";
    }

    @RequestMapping("getOneWeblog.do")
    public ModelAndView getOneWeblog(String remote_addr) throws Exception {

        List<Weblog> weblogList = weblogService.getOneWeblog(remote_addr);

        // 返回ModelAndView
        ModelAndView modelAndView = new ModelAndView();
        // 相当 于request的setAttribut，在jsp页面中通过itemsList取数据
        modelAndView.addObject("weblogList", weblogList);

        modelAndView.setViewName("weblog/WeblogInfo");

        return modelAndView;
    }

    /**
     * 返回值是String， 该返回值表示逻辑视图名 获取修改页面的参数值绑定到student对象里
     */
    @RequestMapping(value = "insertWeblog.do", method = { RequestMethod.POST })
    public String insertWeblog(Weblog weblog,Model model) throws Exception {
        weblogService.insertWeblog(weblog);
        List<Weblog> weblogList = new ArrayList<>();
        weblogList.add(weblog);
        model.addAttribute("weblogList",weblogList);
        return "weblog/WeblogInfo";
    }

    /**
     * get请求，表示跳转到添加学生信息页面
     */
    @RequestMapping(value = "insertWeblog.do", method = {RequestMethod.GET })
    public String insertWeblog() throws Exception {
        System.out.println("1111111111111");
        return "weblog/insertWeblog";
    }

    /**
     * 直接修改学生信息 参数：Student student, 要求student的属性名 和 页面标签的 name属性必须一致，否则会绑定失败
     */
    @RequestMapping(value = "/updateWeblog.do", method = { RequestMethod.POST })
    public String updateWeblog(Weblog weblog) throws Exception {
        System.out.println("updateWeblog  POST");
        weblogService.updateWeblog(weblog);
        return "redirect:getAllWeblog.do";
    }

    /**
     * value="id" 表示从页面接收的参数名字叫做 id， 然后在请求方法，改名叫 student_id
     * required=true，表示该参数必不可少，如果没有传参，则会抛出异常
     * defaultValue="",是在当没有传参id的时候，可以有一个默认值，防止抛出异常
     */
    @RequestMapping(value = "updateWeblog.do", method = { RequestMethod.GET })
    public String updateWeblog(Model model, @RequestParam(value = "remote_addr", required = true, defaultValue = "1") String weblog_remote_addr) throws Exception {
        System.out.println("updateWeblog  GET");
        List<Weblog> WeblogList = weblogService.getOneWeblog(weblog_remote_addr);

            System.out.println(WeblogList.get(0));

        model.addAttribute("weblogList", WeblogList);
        return "weblog/updateWeblog";
    }

    /**
     * 根据学生ID删除学生信息
     */
    @RequestMapping("deleteWeblog.do")
    public String deleteWeblog(String Remote_addr) throws Exception {
        weblogService.deleteWeblog(Remote_addr);
        return "redirect:getAllVisits.do";
    }

    @RequestMapping("deleteCheckWeblog.do")
    public String deleteCheckWeblog(String[] weblog_ids) throws Exception {
        weblogService.deleteCheckWeblog(weblog_ids);
        return "redirect:getAllWeblog.do";
    }



}
