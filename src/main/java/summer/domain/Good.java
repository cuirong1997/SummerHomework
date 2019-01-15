package summer.domain;

import java.io.Serializable;

public class Good implements Serializable{
	
	public Integer good_id;
	public String good_name;
	public String good_dx;
	public String good_time;
	public String good_distance;
	public String good_area;
	public String good_remark;
	public int good_price;
	public int good_store;
	public int good_sell;
	public String good_detail;
	public String good_contain;
	public String good_image;
	public String good_image1;
	public String good_image2;
	public int good_love;
	
	public Good() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Integer getGood_id() {
		return good_id;
	}



	public void setGood_id(Integer good_id) {
		this.good_id = good_id;
	}



	public String getGood_name() {
		return good_name;
	}



	public void setGood_name(String good_name) {
		this.good_name = good_name;
	}



	public String getGood_dx() {
		return good_dx;
	}



	public void setGood_dx(String good_dx) {
		this.good_dx = good_dx;
	}



	public String getGood_time() {
		return good_time;
	}



	public void setGood_time(String good_time) {
		this.good_time = good_time;
	}



	public String getGood_distance() {
		return good_distance;
	}



	public void setGood_distance(String good_distance) {
		this.good_distance = good_distance;
	}



	public String getGood_area() {
		return good_area;
	}



	public void setGood_area(String good_area) {
		this.good_area = good_area;
	}



	public String getGood_remark() {
		return good_remark;
	}



	public void setGood_remark(String good_remark) {
		this.good_remark = good_remark;
	}



	public int getGood_price() {
		return good_price;
	}



	public void setGood_price(int good_price) {
		this.good_price = good_price;
	}



	public Integer getGood_store() {
		return good_store;
	}



	public void setGood_store(int good_store) {
		this.good_store = good_store;
	}



	public int getGood_sell() {
		return good_sell;
	}



	public void setGood_sell(int good_sell) {
		this.good_sell = good_sell;
	}



	public String getGood_detail() {
		return good_detail;
	}



	public void setGood_detail(String good_detail) {
		this.good_detail = good_detail;
	}



	public String getGood_contain() {
		return good_contain;
	}



	public void setGood_contain(String good_contain) {
		this.good_contain = good_contain;
	}



	public String getGood_image() {
		return good_image;
	}



	public void setGood_image(String good_image) {
		this.good_image = good_image;
	}

	

	public String getGood_image1() {
		return good_image1;
	}



	public void setGood_image1(String good_image1) {
		this.good_image1 = good_image1;
	}



	public String getGood_image2() {
		return good_image2;
	}



	public void setGood_image2(String good_image2) {
		this.good_image2 = good_image2;
	}

	

	public int getGood_love() {
		return good_love;
	}



	public void setGood_love(int good_love) {
		this.good_love = good_love;
	}



	@Override
	public String toString(){
		return "Good[good_id="+good_id+",good_name="+good_name+",good_dx="+good_dx+",good_time="+good_time+","
				+ "good_distance="+good_distance+",good_area="+good_area+",good_remark="+good_remark+","
						+ "good_price="+good_price+",good_store="+good_store+",good_sell="+good_sell+",good_detail="+good_detail+","
								+ "good_contain="+good_contain+",good_image="+good_image+",good_image1="+good_image1+",good_image2="+good_image2+",good_love="+good_love+"]";
	}

}
