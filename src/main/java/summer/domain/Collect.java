package summer.domain;

import java.io.Serializable;

public class Collect implements Serializable{
	
	public int collect_id;
	public int collect_uid;
	public int collect_lid;
	public String collect_name;
	public int collect_price;
	public String collect_image;
	
	public Collect() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public int getCollect_id() {
		return collect_id;
	}



	public void setCollect_id(int collect_id) {
		this.collect_id = collect_id;
	}



	public int getCollect_uid() {
		return collect_uid;
	}



	public void setCollect_uid(int collect_uid) {
		this.collect_uid = collect_uid;
	}



	public int getCollect_lid() {
		return collect_lid;
	}



	public void setCollect_lid(int collect_lid) {
		this.collect_lid = collect_lid;
	}



	public String getCollect_name() {
		return collect_name;
	}



	public void setCollect_name(String collect_name) {
		this.collect_name = collect_name;
	}



	public int getCollect_price() {
		return collect_price;
	}



	public void setCollect_price(int collect_price) {
		this.collect_price = collect_price;
	}



	public String getCollect_image() {
		return collect_image;
	}



	public void setCollect_image(String collect_image) {
		this.collect_image = collect_image;
	}



	@Override
	public String toString() {
		return "Collect[collect_id="+collect_id+",collect_uid="+collect_uid+",collect_lid="+collect_lid+","
				+ "collect_name="+collect_name+",collect_price="+collect_price+",collect_image="+collect_image+"]";
	}
	

}
