package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapper.MenuMapper;
import pojo.MenuInfo;
import service.MenuService;

@Service("MenuService1")
public class MenuServiceImpl implements MenuService {

	
	@Autowired
	private MenuMapper menumapper;
	
	@Override
	public MenuInfo select_Menu_All(String name) {
		// TODO Auto-generated method stub
		return menumapper.select_Menu_name(name);
	}

	@Override
	public int insert_Menu_All(MenuInfo menuinfo) {
		// TODO Auto-generated method stub
		return menumapper.insert_Menu_All(menuinfo);
	}

	@Override
	public int update_Menu_All(MenuInfo menuinfo) {
		// TODO Auto-generated method stub
		return menumapper.update_Menu_All(menuinfo);
	}

	@Override
	public int delete_Menu_All(String name) {
		// TODO Auto-generated method stub
		return menumapper.delete_Menu_All(name);
	}

	@Override
	public List<MenuInfo> select_Menu_All() {
		// TODO Auto-generated method stub
		return menumapper.select_Menu_All();
	}

	@Override
	public List<MenuInfo> getAllWhere(String id) {
		// TODO Auto-generated method stub
		return menumapper.getAllWhere(id);
	}

}
