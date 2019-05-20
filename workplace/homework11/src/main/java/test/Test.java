package test;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import mapper.MenuMapper;
import mapper.RoleMapper;
import mapper.UsersMapper;
import pojo.MenuInfo;
import pojo.RoleInfo;
import pojo.UsersInfo;
import service.MenuService;
import service.RoleService;
import service.UsersService;




@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class Test {

	/*@org.junit.Test
	public void test() throws IOException{
		Reader reader = Resources.getResourceAsReader("mybatis.xml");
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(reader);
		SqlSession session = ssf.openSession(true);
		UserMapper mapper = session.getMapper(UserMapper.class);
		System.out.println(mapper.queryAll());
		session.close();
	}*/
	
	@Autowired
	MenuService userservice;
	@org.junit.Test
	public void test(){
	//	UsersInfo user = new UsersInfo(1,"","");
	//	RoleInfo roleService = new RoleInfo(1,"","",1);
//		List<MenuInfo> allWhere = userservice.getAllWhere("menu_management");
//		System.out.println(allWhere);
//		MenuInfo menuinfo= new MenuInfo("菜单新增","删除菜单","菜单信息修改","用户角色信息查询","","","","");
//		System.out.println(userservice.select_Menu_All());
	}
}
