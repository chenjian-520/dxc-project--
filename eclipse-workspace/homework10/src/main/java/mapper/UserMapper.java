package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import pojo.UserInfo;

public interface UserMapper {

	@Select("select uid,uname,password from userinfo")
	List<UserInfo> queryAll();
	
}
