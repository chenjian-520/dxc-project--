package service;

import java.util.List;


import pojo.UsersInfo;

public interface UsersService {

	public abstract List<UsersInfo> select_users_All();
	
	public abstract UsersInfo select_users_uid(int uid);
	
	public abstract int insert_users(UsersInfo users);
	
	public abstract int update_users(String password,int uid);
	
	public abstract int updateAll(UsersInfo user);
	
	public abstract int delete_users(int uid);
	
	public abstract List<UsersInfo> getAllUsersWhere(UsersInfo user);
}
