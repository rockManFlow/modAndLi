package com.model.test.shiwu;

import aming.framework.db.ColumnProperty;

@ColumnProperty("t_main")
public class MainPojo {
	@ColumnProperty("id")
	private Integer id;

	@ColumnProperty("name")
	private String name;

	@ColumnProperty("age")
	private Integer age;

	@ColumnProperty("detail")
	private String detail;

	@ColumnProperty("enable")
	private String  enable;



	public Integer getId() {
		 return id;
	}

	public void setId(Integer id) {
		 this.id=id;
	}

	public String getName() {
		 return name;
	}

	public void setName(String name) {
		 this.name=name;
	}

	public Integer getAge() {
		 return age;
	}

	public void setAge(Integer age) {
		 this.age=age;
	}

	public String getDetail() {
		 return detail;
	}

	public void setDetail(String detail) {
		 this.detail=detail;
	}

	public String  getEnable() {
		 return enable;
	}

	public void setEnable(String enable) {
		 this.enable=enable;
	}

}