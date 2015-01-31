package com.sin.lag.pojo;

import java.util.List;

import org.hibernate.validator.constraints.NotEmpty;

public class Category {
	private Integer id;
	private String name;
	private Integer pid;
	private List<Category> childs;
	public Category() {
		super();
	}

	

	public Category(Integer id, String name, Integer pid) {
		super();
		this.id = id;
		this.name = name;
		this.pid = pid;
	}


	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}


	@NotEmpty(message="名称不能为空")
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}


	public Integer getPid() {
		return pid;
	}



	public void setPid(Integer pid) {
		this.pid = pid;
	}

	

	public List<Category> getChilds() {
		return childs;
	}



	public void setChilds(List<Category> childs) {
		this.childs = childs;
	}



	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", pid=" + pid + "]";
	}

}
