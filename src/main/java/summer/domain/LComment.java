package summer.domain;

import java.io.Serializable;

public class LComment implements Serializable{
	public int lcom_id;
	public User lcom_uid;
	public Good lcom_lid;
	public String lcom_con;
	
	public LComment() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	


	public int getLcom_id() {
		return lcom_id;
	}




	public void setLcom_id(int lcom_id) {
		this.lcom_id = lcom_id;
	}




	public User getLcom_uid() {
		return lcom_uid;
	}




	public void setLcom_uid(User lcom_uid) {
		this.lcom_uid = lcom_uid;
	}




	public Good getLcom_lid() {
		return lcom_lid;
	}




	public void setLcom_lid(Good lcom_lid) {
		this.lcom_lid = lcom_lid;
	}




	public String getLcom_con() {
		return lcom_con;
	}




	public void setLcom_con(String lcom_con) {
		this.lcom_con = lcom_con;
	}




	@Override
	public String toString() {
		return "LComment[lcom_id="+lcom_id+",lcom_uid="+lcom_uid+",lcom_lid="+lcom_lid+",lcom_con="+lcom_con+"]";
	}
}
