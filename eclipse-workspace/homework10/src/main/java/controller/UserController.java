package controller;


import java.io.IOException;
import java.util.List;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.support.AutowireCandidateQualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pojo.UserInfo;
import service.UserService;



@Controller
public class UserController {

	
	@Resource(name="UserService")
	private UserService userservice;
	
	@RequestMapping(value="/user",method=RequestMethod.POST)
	public String login(HttpServletRequest request, Model model,UserInfo user) throws IOException{
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println(username+"  "+password);
		List<UserInfo> query1 = userservice.queryAll();
		//验证用户名密码
		for(UserInfo a : query1){
			if(a.getUname().equals(username)&&a.getPassword().equals(password)){
				user.setUid(a.getUid());
				user.setPassword(a.getPassword());
				user.setUname(a.getUname());
				model.addAttribute("user",user);
				
				return "forward:toshow";
			}		
						
		}
		return "forward:usererror";
	}
	
	
	@RequestMapping("/usererror")
	public String error() throws IOException{
		throw new IOException("用户名密码不存在");	
	}
	
	@RequestMapping("/toshow")
	public String toShow(){
		System.out.println("show");
		return "show";
	}
	
	@RequestMapping("/showAll")
	public String query(Model model){
		List<UserInfo> queryAll = userservice.queryAll();
		model.addAttribute("user123", queryAll);
		System.out.println(queryAll);
		return "users";
	}
	
	
//	 @ExceptionHandler({Exception.class})       
//	     public String exception(Exception e) {       
//	         System.out.println(e.getMessage());       
//	         e.printStackTrace();       
//	         return "error";       
//	     } 
}
