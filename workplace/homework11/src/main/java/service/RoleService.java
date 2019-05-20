package service;

import java.util.List;

import pojo.RoleInfo;

public interface RoleService {
	public abstract List<RoleInfo> select_Role_All();
	
	public abstract RoleInfo select_Role_rid(int rid);
	
	public abstract List<RoleInfo> select_Role_uid(int uid);
	
	public abstract int select_Role_level(int rid);
	
	public abstract int update_Role_level(int rid,int level_1);
	
	public abstract int updateAll(RoleInfo roleinfo);
	
	public abstract int insert_Role(RoleInfo roleinfo);
	
	public abstract int delete_Role(int rid);
	
	public abstract List<RoleInfo> getAllWhere(RoleInfo roleinfo);
}
