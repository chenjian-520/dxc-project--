package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;


import pojo.RoleInfo;

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
public interface RoleMapper {
	public abstract List<RoleInfo> select_Role_All();
	
	public abstract RoleInfo select_Role_rid(int rid);
	
	public abstract List<RoleInfo> select_Role_uid(int uid);
	
	public abstract int select_Role_level(int rid);
	
	public abstract int update_Role_level(@Param("rid")int rid,@Param("level_1")int level_1);
	
	public abstract int updateAll(RoleInfo roleinfo);
	
	public abstract int insert_Role(RoleInfo roleinfo);
	
	public abstract int delete_Role(int rid);
	
	public abstract List<RoleInfo> getAllWhere(RoleInfo roleinfo);
	
}