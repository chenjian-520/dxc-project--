package pojo;

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
public class UsersInfo {
	private int uid ;
	private String username ;
	private String password ;
	
	
	public UsersInfo(String username, String passsword) {
		super();
		this.username = username;
		this.password = passsword;
	}
	
	public UsersInfo(int uid, String username, String passsword) {
		super();
		this.uid = uid;
		this.username = username;
		this.password = passsword;
	}
	public UsersInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "UsersInfo [uid=" + uid + ", username=" + username + ", password=" + password + "]";
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + uid;
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UsersInfo other = (UsersInfo) obj;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (uid != other.uid)
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
	
	
}
