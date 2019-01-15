package summer.domain;

import java.io.Serializable;

public class Order implements Serializable{
	
	public Integer Order_id;
	public Integer Order_uid;
	public Integer Order_gid;
	public String Order_name;
	public int Order_price;
	public int Order_number;
	public String Order_image;
	public String Order_address;
	public String Order_status;
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getOrder_id() {
		return Order_id;
	}

	public void setOrder_id(Integer order_id) {
		Order_id = order_id;
	}

	public Integer getOrder_uid() {
		return Order_uid;
	}

	public void setOrder_uid(Integer order_uid) {
		Order_uid = order_uid;
	}

	public Integer getOrder_gid() {
		return Order_gid;
	}

	public void setOrder_gid(Integer order_gid) {
		Order_gid = order_gid;
	}

	public String getOrder_name() {
		return Order_name;
	}

	public void setOrder_gname(String order_name) {
		Order_name = order_name;
	}

	public int getOrder_price() {
		return Order_price;
	}

	public void setOrder_price(int order_price) {
		Order_price = order_price;
	}

	public int getOrder_number() {
		return Order_number;
	}

	public void setOrder_number(int order_number) {
		Order_number = order_number;
	}

	public String getOrder_image() {
		return Order_image;
	}

	public void setOrder_image(String order_image) {
		Order_image = order_image;
	}

	public String getOrder_status() {
		return Order_status;
	}

	public void setOrder_status(String order_status) {
		Order_status = order_status;
	}
	
	
	
	public String getOrder_address() {
		return Order_address;
	}

	public void setOrder_address(String order_address) {
		Order_address = order_address;
	}

	@Override
	public String toString() {
		return "Order[Order_id="+Order_id+",Order_uid="+Order_uid+",Order_gid="+Order_gid+","
				+ " Order_name="+Order_name+",Order_price="+Order_price+",Order_number="+Order_number+","
						+ "Order_image="+Order_image+",Order_address="+Order_address+",Order_status="+Order_status+"]";}
}
