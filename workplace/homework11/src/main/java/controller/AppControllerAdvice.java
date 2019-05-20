package controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;

//异常处理  初始化
@ControllerAdvice
public class AppControllerAdvice {

	
	@ModelAttribute
	public void init(){
		System.out.println("初始化");
	}
	
    @ExceptionHandler({Exception.class})
    public String handleException(Exception e,HttpServletRequest request){
//    	model.addAttribute("meeage", "用户密码");
    	System.out.println("爆出异常！");
    	HttpSession session = request.getSession();
    	session.setAttribute("meeage", "用户名密码错误");
        return "error";
    }
    
}
