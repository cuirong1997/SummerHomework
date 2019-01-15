package summer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import summer.service.UserService;
import summer.domain.User;
import summer.mapper.UserMapper;

@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper userMapper;

	@Transactional(readOnly=true)
	@Override
	public User login(String loginname, String password) {
		// TODO Auto-generated method stub
		return userMapper.findWithLoginnameAndPassword(loginname, password);
	}

	@Override
	public User insertuser(String user_name, String user_email, String user_sfid, String user_tel, String user_pwd,String user_address) {
		// TODO Auto-generated method stub
		return userMapper.insertuser(user_name, user_email, user_sfid, user_tel, user_pwd,user_address);
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return userMapper.findAll();
	}

	@Override
	public void deleteuser(int id) {
		// TODO Auto-generated method stub
		userMapper.deleteuser(id);
	}

	@Override
	public User findWithLoginnameAndEmail(String loginname, String email) {
		// TODO Auto-generated method stub
		return userMapper.findWithLoginnameAndEmail(loginname, email);
	}

	@Override
	public User updatepwd(String password, int user_id) {
		// TODO Auto-generated method stub
		return userMapper.updatepwd(password, user_id);
	}
	

}
