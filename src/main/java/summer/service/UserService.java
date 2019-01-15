package summer.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import summer.domain.User;

public interface UserService {
	
	User login(String loginname,String password);
	
	User insertuser(String user_name,String user_email,String user_sfid,String user_tel,String user_pwd,String user_address);
	
	List<User> getAll();
	
	void deleteuser(int id);
	
	User findWithLoginnameAndEmail(String loginname,String email);
	
	User updatepwd(String password,int user_id);

}
