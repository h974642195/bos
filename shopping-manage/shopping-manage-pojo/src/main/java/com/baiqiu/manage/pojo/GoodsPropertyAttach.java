package com.baiqiu.manage.pojo;

import javax.persistence.Table;

@Table(name = "tb_propertyattach")
public class GoodsPropertyAttach extends BasePojo {
 
	private int id;
	private String propertyvalue;
	private String description;
	private String creator;
	private String lastupdator;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPropertyvalue() {
		return propertyvalue;
	}
	public void setPropertyvalue(String propertyvalue) {
		this.propertyvalue = propertyvalue;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
