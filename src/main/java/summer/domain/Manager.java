package summer.domain;

import java.io.Serializable;

public class Manager implements Serializable{
	
	public int manager_id;
	public String manager_name;
	public String manager_pwd;
	
	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public int getManager_id() {
		return manager_id;
	}



	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}



	public String getManager_name() {
		return manager_name;
	}



	public void setManager_name(String manager_name) {
		this.manager_name = manager_name;
	}



	public String getManager_pwd() {
		return manager_pwd;
	}



	public void setManager_pwd(String manager_pwd) {
		this.manager_pwd = manager_pwd;
	}



	@Override
	public String toString() {
		return "Manager [manager_id=" + manager_id + ", manager_name=" + manager_name + ",manager_pwd="+ manager_pwd + "]";
	}

}
