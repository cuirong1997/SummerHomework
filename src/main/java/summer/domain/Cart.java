package summer.domain;

import java.io.Serializable;

public class Cart implements Serializable{
	
	public int cart_id;
	public int cart_uid;
	public int cart_gid;
	public String cart_gname;
	public int cart_number;
	public int cart_price;
	public String cart_image;
	
	
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public int getCart_id() {
		return cart_id;
	}



	public void setCart_id(int cart_id) {
		this.cart_id = cart_id;
	}



	public int getCart_uid() {
		return cart_uid;
	}



	public void setCart_uid(int cart_uid) {
		this.cart_uid = cart_uid;
	}



	public int getCart_gid() {
		return cart_gid;
	}



	public void setCart_gid(int cart_gid) {
		this.cart_gid = cart_gid;
	}



	public String getCart_gname() {
		return cart_gname;
	}



	public void setCart_gname(String cart_gname) {
		this.cart_gname = cart_gname;
	}



	public int getCart_number() {
		return cart_number;
	}



	public void setCart_number(int cart_number) {
		this.cart_number = cart_number;
	}



	public int getCart_price() {
		return cart_price;
	}



	public void setCart_price(int cart_price) {
		this.cart_price = cart_price;
	}



	public String getCart_image() {
		return cart_image;
	}



	public void setCart_image(String cart_image) {
		this.cart_image = cart_image;
	}



	@Override
	public String toString() {
		return "Cart[cart_id="+cart_id+",cart_uid="+cart_uid+",cart_gid="+cart_gid+",cart_gname="+cart_gname+","
				+ "cart_number="+cart_number+",cart_price="+cart_price+",cart_image="+cart_image+"]";
	}

}
