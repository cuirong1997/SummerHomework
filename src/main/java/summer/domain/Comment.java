package summer.domain;

import java.io.Serializable;

public class Comment implements Serializable{
	public int com_id;
	public User com_uid;
	public Good com_gid;
	public String com_con;
	
	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public int getCom_id() {
		return com_id;
	}



	public void setCom_id(int com_id) {
		this.com_id = com_id;
	}



	public User getCom_uid() {
		return com_uid;
	}



	public void setCom_uid(User com_uid) {
		this.com_uid = com_uid;
	}



	public Good getCom_gid() {
		return com_gid;
	}



	public void setCom_gid(Good com_gid) {
		this.com_gid = com_gid;
	}



	public String getCom_con() {
		return com_con;
	}



	public void setCom_con(String com_con) {
		this.com_con = com_con;
	}



	@Override
	public String toString() {
		return "Comment[com_id="+com_id+",com_uid="+com_uid+",com_gid="+com_gid+",com_con="+com_con+"]";
	}
	
	

}
