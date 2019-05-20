package controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import pojo.MenuInfo;
import pojo.RoleInfo;
import pojo.UsersInfo;
import service.MenuService;
import service.RoleService;
import service.UsersService;

/**
 * 新建一个maven工程，使用Spring MVC框架，实现简单的用户权限管理系统。功能如下：    
 *   系统主界面：用户登录页面，菜单总览      
 *  菜单管理：菜单信息查询，菜单新增，菜单信息修改，删除菜单   
 *     用户管理：用户信息查询，用户新增，用户信息修改，删除用户，修改密码      
 *  	角色管理：角色信息查询，角色新增，删除角色    
 *    用户角色管理：用户角色信息查询，新增用户角色信息，删除用户角色信息    
 *     角色权限管理：角色权限信息查询，新增角色权限信息，删除角色权限信息      
 * 实现要求：用户可以有多个角色，角色可以有多个菜单权限，不同的用户登录展示不同的菜单列表。
 * @author jchen251
 *
 */

@Controller
@RequestMapping(value="/users",produces="text/html;charset=UTF-8")
public class UserController {

	@Autowired
	private UsersService userservice;

	@Autowired
	private RoleService roleservice;
	
	@Autowired 
	private MenuService menuservice;
	
	//登录验证
	@RequestMapping(value = "/user", method = RequestMethod.POST,produces="text/html;charset=UTF-8")
	public String login(HttpServletRequest request, Model model, UsersInfo user, RoleInfo role) throws IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String role1 = request.getParameter("role");
		System.out.println(username + "  " + password);
		List<UsersInfo> query1 = userservice.select_users_All();
		if(username != null && password != null && role1 != null){
		// 验证用户名密码
			for (UsersInfo a : query1) {
				if (a.getUsername().equals(username) && a.getPassword().equals(password)) {
					user.setUid(a.getUid());
					user.setPassword(a.getPassword());
					user.setUsername(a.getUsername());
					request.getSession().setAttribute("user",user);
					List<RoleInfo> select_Role_uid = roleservice.select_Role_uid(user.getUid());
					for (RoleInfo b : select_Role_uid) {
						
						if (b.getRolename().equals(role1)) {
							
							role.setRid(b.getRid());
							role.setRolename(b.getRolename());
							role.setLevel_1(b.getLevel_1());
							role.setUid(b.getUid());
							//验证角色 权限 转发到不同页面	
							request.getSession().setAttribute("role",role);
							
							switch (b.getLevel_1()) {
							case "1":
								return "forward:toshow1";
							case "2":
								return "forward:toshow2";
							case "3":
								return "forward:toshow3";
							case "4":
								return "forward:toshow4";
							default:
								return "forward:usererror";
							}
						}
					}
					return "forward:usererror";
				}
	
			}
		}else{
			return "forward:usererror";
		}
		
		return "forward:usererror";
	}
	
	//处理一切异常 跳转到error页面
	@RequestMapping(value="/usererror",produces="text/html;charset=UTF-8")
	public String error() throws IOException {
		throw new IOException("用户名密码不存在");
	}
	// 1级 权限
	@RequestMapping(value="/toshow1",produces="text/html;charset=UTF-8")
	public String toShow1(Model model) {
		System.out.println("show1");
		List<MenuInfo> menuquery = menuservice.select_Menu_All();
		model.addAttribute("menu1",menuquery);
		return "show1";
	}
	// 2级 权限
	@RequestMapping(value="/toshow2",produces="text/html;charset=UTF-8")
	public String toShow2(Model model) {
		System.out.println("show2");
		List<MenuInfo> menuquery = menuservice.select_Menu_All();
		model.addAttribute("menu2",menuquery);
		return "show2";
	}
	// 3级 权限
	@RequestMapping(value="/toshow3",produces="text/html;charset=UTF-8")
	public String toShow3(Model model) {
		System.out.println("show3");
		List<MenuInfo> menuquery = menuservice.select_Menu_All();
		model.addAttribute("menu3",menuquery);
		return "show3";
	}
	// 4级 权限
	@RequestMapping(value="/toshow4",produces="text/html;charset=UTF-8")
	public String toShow4(Model model) {
		System.out.println("show4");
		List<UsersInfo> queryAll = userservice.select_users_All();
		model.addAttribute("user123", queryAll);
		List<RoleInfo> rolequery = roleservice.select_Role_All();
		model.addAttribute("role123",rolequery);
		List<MenuInfo> menuquery = menuservice.select_Menu_All();
		model.addAttribute("menu123",menuquery);
		return "show4";
	}
	
	//查询role全表
		@RequestMapping(value="/showRolerAll",produces="text/html;charset=UTF-8")
		public String queryRole(Model model) {
			List<RoleInfo> select_Role = roleservice.select_Role_All();
			model.addAttribute("role123", select_Role);
			System.out.println(select_Role);
			return "role";
		}
	
		//查询menu全表
		@RequestMapping(value="/showMenuAll",produces="text/html;charset=UTF-8")
		public String queryMenu(Model model) {
			List<MenuInfo> select_Menu = menuservice.select_Menu_All();
			model.addAttribute("menu", select_Menu);
			System.out.println(select_Menu);
			return "menu";
		}
		
		
		//查询user全表
		@RequestMapping(value="/showAll",produces="text/html;charset=UTF-8")
		public String query(Model model) {
			List<UsersInfo> queryAll = userservice.select_users_All();
			model.addAttribute("user123", queryAll);
			System.out.println(queryAll);
			return "users";
		}
		
		/**
		 * 待条件的查询
		 */
		@RequestMapping("getAllWhere.do")
		public String getAllStudentsWhere(HttpServletRequest request,Model model) throws Exception {
			
			String uid = request.getParameter("uid");
			String rolename = request.getParameter("rolename");
			String rid = request.getParameter("rid");
			String level_1 = request.getParameter("level_1");
			
			RoleInfo roleInfo = null;
			
			if(uid==""&&rid==""){
				roleInfo = new RoleInfo(rolename,level_1);
			}else if(uid==""&&rid!=""){
				roleInfo = new RoleInfo(Integer.valueOf(rid),rolename,level_1);
			}else if(uid!=""&&rid==""){
				roleInfo = new RoleInfo(rolename,level_1,Integer.valueOf(uid));
			}else{
				roleInfo = new RoleInfo(Integer.valueOf(rid),rolename,level_1,Integer.valueOf(uid));
			}
			
			System.out.println(roleInfo);
			List<RoleInfo> allWhere = roleservice.getAllWhere(roleInfo);
			model.addAttribute("role123",allWhere);
			
					
			return "role";
		}
		//向user表插入数据
		@RequestMapping(value="/insertUser",produces="text/html;charset=UTF-8",method = RequestMethod.POST)
		public String insertUser(Model model,UsersInfo users) {
			if(users.getUsername()!=""&&users.getPassword()!=""){
				int insert_users = userservice.insert_users(users);
				System.out.println(insert_users);
				return "index";
			}else{
				return "error";
			}
		
		}
		//向menu表插入数据
		@RequestMapping(value="/insertMenu",produces="text/html;charset=UTF-8",method = RequestMethod.POST)
		public String insertMenu(Model model,MenuInfo menu) {
			if(menu.getId()!=""){
				int insert_Menu_All = menuservice.insert_Menu_All(menu);
				System.out.println(insert_Menu_All);
				return "index";
			}else{
				return "error";
			}
			
		}
		//向rolr表插入数据
		@RequestMapping(value="/insertRole",produces="text/html;charset=UTF-8",method = RequestMethod.POST)
		public String insertRole(Model model,RoleInfo role) {
			if(role.getRolename()!=""){
				int insert_Role = roleservice.insert_Role(role);
				System.out.println(insert_Role);
				return "index";
			}else{
				return "error";
			}
			
		}
}
