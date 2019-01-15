package summer.domain;

import java.io.Serializable;

public class Land implements Serializable{
	
	public int land_id;
	public String land_name;
	public String land_output;
	public String land_place;
	public String land_kind;
	public String land_area;
	public String land_remark;
	public int land_price;
	public String land_image;
	public String land_image1;
	public String land_image2;
	public String land_rimage;
	
	public Land() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getLand_id() {
		return land_id;
	}

	public void setLand_id(int land_id) {
		this.land_id = land_id;
	}

	public String getLand_name() {
		return land_name;
	}

	public void setLand_name(String land_name) {
		this.land_name = land_name;
	}

	public String getLand_output() {
		return land_output;
	}

	public void setLand_output(String land_output) {
		this.land_output = land_output;
	}

	public String getLand_place() {
		return land_place;
	}

	public void setLand_place(String land_place) {
		this.land_place = land_place;
	}

	public String getLand_kind() {
		return land_kind;
	}

	public void setLand_kind(String land_kind) {
		this.land_kind = land_kind;
	}

	public String getLand_area() {
		return land_area;
	}

	public void setLand_area(String land_area) {
		this.land_area = land_area;
	}

	public String getLand_remark() {
		return land_remark;
	}

	public void setLand_remark(String land_remark) {
		this.land_remark = land_remark;
	}

	public int getLand_price() {
		return land_price;
	}

	public void setLand_price(int land_price) {
		this.land_price = land_price;
	}

	public String getLand_image() {
		return land_image;
	}

	public void setLand_image(String land_image) {
		this.land_image = land_image;
	}

	public String getLand_rimage() {
		return land_rimage;
	}

	public void setLang_rimage(String land_rimage) {
		this.land_rimage = land_rimage;
	}
	
	
	
	public String getLand_image1() {
		return land_image1;
	}

	public void setLand_image1(String land_image1) {
		this.land_image1 = land_image1;
	}

	public String getLand_image2() {
		return land_image2;
	}

	public void setLand_image2(String land_image2) {
		this.land_image2 = land_image2;
	}

	

	@Override
	public String toString(){
		return "Land[land_id="+land_id+",land_name="+land_name+",land_output="+land_output+","
				+ "land_place="+land_place+",land_kind="+land_kind+",land_area="+land_area+","
						+ "land_remark="+land_remark+",land_price="+land_price+","
								+ "land_image="+land_image+",land_image1="+land_image1+",land_image2="+land_image2+",land_rimage="+land_rimage+"]";
	}
		
		

}
