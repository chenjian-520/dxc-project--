package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapper.UsersMapper;
import pojo.UsersInfo;
import service.UsersService;

@Service("UsersService1")
public class UsersServiceImpl implements UsersService {

	@Autowired
	private UsersMapper usersmapper;
	
	@Override
	public List<UsersInfo> select_users_All() {
		// TODO Auto-generated method stub
		return usersmapper.select_users_All();
	}

	@Override
	public UsersInfo select_users_uid(int uid) {
		// TODO Auto-generated method stub
		return usersmapper.select_users_uid(uid);
	}

	@Override
	public int insert_users(UsersInfo users) {
		// TODO Auto-generated method stub
		return usersmapper.insert_users(users);
	}

	@Override
	public int update_users(String password, int uid) {
		// TODO Auto-generated method stub
		return usersmapper.update_users(password, uid);
	}

	@Override
	public int delete_users(int uid) {
		// TODO Auto-generated method stub
		return usersmapper.delete_users(uid);
	}

	@Override
	public int updateAll(UsersInfo user) {
		// TODO Auto-generated method stub
		return usersmapper.updateAll(user);
	}

	@Override
	public List<UsersInfo> getAllUsersWhere(UsersInfo user) {
		// TODO Auto-generated method stub
		return usersmapper.getAllUsersWhere(user);
	}

}
