package controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import pojo.MenuInfo;
import pojo.MenuVO;
import pojo.RoleInfo;
import pojo.RoleVO;
import pojo.UsersInfo;
import pojo.UsersVO;
import service.MenuService;
import service.RoleService;
import service.UsersService;

//菜单处理     页面函数处理
@Controller
@RequestMapping(value="/Menu",produces="text/html;charset=UTF-8")
public class MenuController {
	
	@Autowired
	private UsersService userservice;

	@Autowired
	private RoleService roleservice;
	
	@Autowired 
	private MenuService menuservice;

	//多选删除 最高权限
	@RequestMapping(value="deleteCheckUsers.do",produces="text/html;charset=UTF-8")
	public String deleteCheckStudents(int[] user_uid,int[] role_rid, String[] menu123){
		
		for(int b : role_rid){
			roleservice.delete_Role(b);
		}
		for(int a : user_uid){
			userservice.delete_users(a);
		};
		
		for(String c : menu123 ){
			menuservice.delete_Menu_All(c);
		}
		return "forward:/users/toshow4";
	}
	
	/**
	 * 待条件的查询
	 */
	@RequestMapping("getAllWhere.do")
	public String getAllStudentsWhere(HttpServletRequest request){
		
		String uid = request.getParameter("uid");
		String rolename = request.getParameter("rolename");
		String rid = request.getParameter("rid");
		String level_1 = request.getParameter("level_1");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String menuid = request.getParameter("menuid");
		
		UsersInfo usersInfo = null;
		RoleInfo roleInfo = null;
		
		if(uid==""){
			usersInfo = new UsersInfo(username,password);
		}else{
			System.out.println("sssssssssssssssssssssssss");
			usersInfo = new UsersInfo(Integer.valueOf(uid),username,password);
		}
		
		if(uid==""&&rid==""){
			roleInfo = new RoleInfo(rolename,level_1);
		}else if(uid==""&&rid!=""){
			roleInfo = new RoleInfo(Integer.valueOf(rid),rolename,level_1);
		}else if(uid!=""&&rid==""){
			roleInfo = new RoleInfo(rolename,level_1,Integer.valueOf(uid));
		}else{
			roleInfo = new RoleInfo(Integer.valueOf(rid),rolename,level_1,Integer.valueOf(uid));
		}
		
		List<UsersInfo> allUsersWhere = userservice.getAllUsersWhere(usersInfo);
		request.setAttribute("user123", allUsersWhere);
		
		List<RoleInfo> allWhere = roleservice.getAllWhere(roleInfo);
		request.setAttribute("role123",allWhere);
		
		if(menuid.equals("all")){
			List<MenuInfo> menuquery = menuservice.select_Menu_All();
			request.setAttribute("menu123",menuquery);
		}else{
			List<MenuInfo> menuquery = menuservice.getAllWhere(menuid);
			request.setAttribute("menu123",menuquery);
		}
		
		return "show4";
	}
	
	/**
	 * 批量修改方法
	 */
	@RequestMapping(value="updateAll.do",produces="text/html;charset=UTF-8")
	public String updateAllStudents(HttpServletRequest request) throws Exception {
		
		List<UsersInfo> queryAll = userservice.select_users_All();
		request.setAttribute("user123", queryAll);
		List<RoleInfo> rolequery = roleservice.select_Role_All();
		request.setAttribute("role123",rolequery);
		List<MenuInfo> menuquery = menuservice.select_Menu_All();
		request.setAttribute("menu123",menuquery);
		
		return "listshow";
	}
	
	@RequestMapping(value="updateAllPost.do",produces="text/html;charset=UTF-8")
	public String updateAllStudentsPost(HttpServletRequest request,UsersVO user123,MenuVO menu123,RoleVO role123) throws Exception {
		for(UsersInfo a : user123.getUser123()){
			userservice.updateAll(a);
		}
		for(RoleInfo b : role123.getRole123()){
			roleservice.updateAll(b);
		}
		
		for(MenuInfo c : menu123.getMenu123()){
			menuservice.update_Menu_All(c);
		}
		return "redirect:updateAll.do";
	}
	
	/**
	 * 根据ID删除信息
	 */
	@RequestMapping("deleteUser")
	public String deleteUser(@RequestParam(value="id") int id){
		userservice.delete_users(id);
		return "redirect:/users/toshow4";
	}
	
	@RequestMapping("deleteRole123")
	public String deleteRole123(@RequestParam(value="id") int id){
		roleservice.delete_Role(id);
		return "redirect:/users/toshow4";
	}
	
	@RequestMapping("deleteMenu123")
	public String deleteMenu123(@RequestParam(value="id") String id){
		menuservice.delete_Menu_All(id);
		return "redirect:/users/toshow4";
	}
	
	/**
	 * 直接修改学生信息 参数：user user, 要求user的属性名 和 页面标签的 name属性必须一致，否则会绑定失败
	 */
	@RequestMapping(value = "/updateUser", method = { RequestMethod.POST })
	public String updateUser(UsersInfo usersinfo){
		System.out.println("updateStudent  POST");
		userservice.updateAll(usersinfo);
		return "redirect:/users/toshow4";
	}
	/**
	 * value="id" 表示从页面接收的参数名字叫做 id， 然后在请求方法，改名叫 user_id
	 * required=true，表示该参数必不可少，如果没有传参，则会抛出异常
	 * defaultValue="",是在当没有传参id的时候，可以有一个默认值，防止抛出异常
	 */
	@RequestMapping(value = "updateUser", method = { RequestMethod.GET })
	public String updateUser(Model model, @RequestParam(value = "id", required = true, defaultValue = "1") Integer user_id){
		System.out.println("updateUser  GET");
		UsersInfo select_users = userservice.select_users_uid(user_id);
		model.addAttribute("select_users", select_users);
		return "update/updateUser";
	}
	
	
	/**
	 * 直接修改学生信息 参数：RoleInfo RoleInfo, 要求RoleInfo的属性名 和 页面标签的 name属性必须一致，否则会绑定失败
	 */
	@RequestMapping(value = "/updateRole", method = { RequestMethod.POST })
	public String updateRole(RoleInfo roleInfo){
		System.out.println("updateRole  POST");
		roleservice.updateAll(roleInfo);
		return "redirect:/users/toshow4";
	}

	@RequestMapping(value = "updateRole123", method = { RequestMethod.GET })
	public String updateRole123(Model model, @RequestParam(value = "id", required = true, defaultValue = "1") Integer role_id){
		System.out.println("updateRole123  GET");
		RoleInfo select_Role = roleservice.select_Role_rid(role_id);
		model.addAttribute("select_Role", select_Role);
		return "update/updateRole";
	}
	
	
	
	/**
	 * 直接修改学生信息 参数：Menu Menu, 要求Menu的属性名 和 页面标签的 name属性必须一致，否则会绑定失败
	 */
	@RequestMapping(value = "/updateMenu", method = { RequestMethod.POST })
	public String updateMenu(MenuInfo menuInfo){
		System.out.println("updateMenu  POST");
		menuservice.update_Menu_All(menuInfo);
		return "redirect:/users/toshow4";
	}
	
	@RequestMapping(value = "updateMenu123", method = { RequestMethod.GET })
	public String updateMenu123(Model model, @RequestParam(value = "id", required = true, defaultValue = "1") String menu_id){
		System.out.println("updateMenu123  GET");
		MenuInfo select_Menu = menuservice.select_Menu_All(menu_id);
		model.addAttribute("select_Menu", select_Menu);
		return "update/updateMenu";
	}
	
}
