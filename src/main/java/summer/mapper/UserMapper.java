package summer.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import summer.domain.User;

public interface UserMapper {
	
	@Select("select * from tb_user where user_name= #{loginname} and user_pwd = #{password}")
	User findWithLoginnameAndPassword(@Param("loginname")String loginname,
			@Param("password") String password);
	
	@Select("insert into tb_user(user_name,user_email,user_sfid,user_tel,user_pwd,user_address) values(#{user_name},#{user_email},#{user_sfid},#{user_tel},#{user_pwd},#{user_address})")
	User insertuser(@Param("user_name")String user_name,@Param("user_email")String user_email,
			@Param("user_sfid") String user_sfid,@Param("user_tel") String user_tel,
			@Param("user_pwd") String user_pwd,@Param("user_address") String user_address);
	
	@Select("select * from tb_user")
	List<User> findAll();
	
	@Delete("delete from tb_user where user_id=#{id}")
	void deleteuser(@Param("id")int id);
	
	@Select("select * from tb_user where user_name= #{loginname} and user_email = #{email}")
	User findWithLoginnameAndEmail(@Param("loginname")String loginname,
			@Param("email") String email);
	
	@Select("update tb_user set user_pwd=#{password} where user_id=#{user_id}")
	User updatepwd(@Param("password")String password,@Param("user_id")int user_id);
}
