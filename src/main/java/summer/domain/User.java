package summer.domain;

import java.io.Serializable;

public class User implements Serializable{
	
	public int user_id;
	public String user_name;
	public String user_email;
	public String user_sfid;
	public String user_tel;
	public String user_pwd;
	public String user_address;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public int getUser_id() {
		return user_id;
	}



	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}



	public String getUser_name() {
		return user_name;
	}



	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}



	public String getUser_email() {
		return user_email;
	}



	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}



	public String getUser_sfid() {
		return user_sfid;
	}



	public void setUser_sfid(String user_sfid) {
		this.user_sfid = user_sfid;
	}



	public String getUser_tel() {
		return user_tel;
	}



	public void setUser_tel(String user_tel) {
		this.user_tel = user_tel;
	}



	public String getUser_pwd() {
		return user_pwd;
	}



	public void setUser_pwd(String user_pwd) {
		this.user_pwd = user_pwd;
	}

	

	public String getUser_address() {
		return user_address;
	}



	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}



	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", user_name=" + user_name + ", user_email="+user_email+","
				+ "user_sfid="+user_sfid+",user_tel="+user_tel+",user_pwd="+ user_pwd + ",user_address="+user_address+"]";
	}

}
