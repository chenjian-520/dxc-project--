package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapper.RoleMapper;
import pojo.RoleInfo;
import service.RoleService;

@Service("RoleService1")
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleMapper rolemapper;
	@Override
	public List<RoleInfo> select_Role_All() {
		// TODO Auto-generated method stub
		return rolemapper.select_Role_All();
	}

	@Override
	public RoleInfo select_Role_rid(int rid) {
		// TODO Auto-generated method stub
		return rolemapper.select_Role_rid(rid);
	}

	@Override
	public int select_Role_level(int rid) {
		// TODO Auto-generated method stub
		return rolemapper.select_Role_level(rid);
	}

	@Override
	public int update_Role_level(int rid, int level_1) {
		// TODO Auto-generated method stub
		return rolemapper.update_Role_level(rid, level_1);
	}

	@Override
	public int insert_Role(RoleInfo roleinfo) {
		// TODO Auto-generated method stub
		return rolemapper.insert_Role(roleinfo);
	}

	@Override
	public int delete_Role(int rid) {
		// TODO Auto-generated method stub
		return rolemapper.delete_Role(rid);
	}

	@Override
	public List<RoleInfo> select_Role_uid(int uid) {
		// TODO Auto-generated method stub
		return rolemapper.select_Role_uid(uid);
	}

	@Override
	public int updateAll(RoleInfo roleinfo) {
		// TODO Auto-generated method stub
		return rolemapper.updateAll(roleinfo);
	}

	@Override
	public List<RoleInfo> getAllWhere(RoleInfo roleinfo) {
		// TODO Auto-generated method stub
		return rolemapper.getAllWhere(roleinfo);
	}

}
