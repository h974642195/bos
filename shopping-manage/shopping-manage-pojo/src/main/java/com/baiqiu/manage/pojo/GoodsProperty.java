package com.baiqiu.manage.pojo;

import javax.persistence.Table;

@Table(name = "tb_goodsproperty")
public class GoodsProperty extends BasePojo{

	private int id;
	private String propertyname; 
	private String creator;
	private String lastupdator;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getPropertyname() {
		return propertyname;
	}
	public void setPropertyname(String propertyname) {
		this.propertyname = propertyname;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public String getLastupdator() {
		return lastupdator;
	}
	public void setLastupdator(String lastupdator) {
		this.lastupdator = lastupdator;
	}
	
}
