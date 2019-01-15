package summer.domain;

import java.io.Serializable;

public class Love implements Serializable{
	
	public int love_id;
	public int love_uid;
	public int love_gid;
	public String love_name;
	public int love_number;
	public int love_price;
	public String love_mdd;
	public String love_status;
	public String love_image;
	
	public Love() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getLove_id() {
		return love_id;
	}

	public void setLove_id(int love_id) {
		this.love_id = love_id;
	}

	public int getLove_uid() {
		return love_uid;
	}

	public void setLove_uid(int love_uid) {
		this.love_uid = love_uid;
	}

	public int getLove_gid() {
		return love_gid;
	}

	public void setLove_gid(int love_gid) {
		this.love_gid = love_gid;
	}

	public String getLove_name() {
		return love_name;
	}

	public void setLove_name(String love_name) {
		this.love_name = love_name;
	}

	public int getLove_number() {
		return love_number;
	}

	public void setLove_number(int love_number) {
		this.love_number = love_number;
	}

	public int getLove_price() {
		return love_price;
	}

	public void setLove_price(int love_price) {
		this.love_price = love_price;
	}

	public String getLove_mdd() {
		return love_mdd;
	}

	public void setLove_mdd(String love_mdd) {
		this.love_mdd = love_mdd;
	}

	public String getLove_image() {
		return love_image;
	}

	public void setLove_image(String love_image) {
		this.love_image = love_image;
	}
	
	
	
	public String getLove_status() {
		return love_status;
	}

	public void setLove_status(String love_status) {
		this.love_status = love_status;
	}

	@Override
	public String toString() {
		return "Love[love_id="+love_id+",love_uid="+love_uid+",love_gid="+love_gid+",love_name="+love_name+","
				+ "love_number="+love_number+",love_price="+love_price+",love_mdd="+love_mdd+",love_status="+love_status+",love_image="+love_image+"]";
	}

}
