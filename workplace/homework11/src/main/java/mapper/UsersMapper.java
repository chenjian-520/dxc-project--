package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;


import pojo.UsersInfo;

/**
 * 新建一个maven工程，使用Spring MVC框架，实现简单的用户权限管理系统。功能如下：    
 *   系统主界面：用户登录页面，菜单总览      菜单管理：菜单信息查询，菜单新增，菜单信息修改，删除菜单   
 *     用户管理：用户信息查询，用户新增，用户信息修改，删除用户，修改密码      
 *  	角色管理：角色信息查询，角色新增，删除角色    
 *    用户角色管理：用户角色信息查询，新增用户角色信息，删除用户角色信息    
 *     角色权限管理：角色权限信息查询，新增角色权限信息，删除角色权限信息      
 * 实现要求：用户可以有多个角色，角色可以有多个菜单权限，不同的用户登录展示不同的菜单列表。
 * @author jchen251
 *
 */
public interface UsersMapper {

	public abstract List<UsersInfo> select_users_All();
	
	public abstract UsersInfo select_users_uid(int uid);
	
	public abstract int insert_users(UsersInfo users);
	
	public abstract int update_users(@Param("password")String password,@Param("uid")int uid);
	
	public abstract int updateAll(UsersInfo user);
	
	public abstract int delete_users(int uid);
	
	public abstract List<UsersInfo> getAllUsersWhere(UsersInfo user);
}
