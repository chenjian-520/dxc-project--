package service;

import java.util.List;

import pojo.MenuInfo;

public interface MenuService {
	
	public abstract List<MenuInfo> select_Menu_All();
	
	public abstract MenuInfo select_Menu_All(String name);
	
	public abstract int insert_Menu_All(MenuInfo menuinfo);
	
	public abstract int update_Menu_All(MenuInfo menuinfo);
	
	public abstract int delete_Menu_All(String name);
	
	public abstract List<MenuInfo> getAllWhere(String id);
}
