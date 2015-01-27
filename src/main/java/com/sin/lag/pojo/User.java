package com.sin.lag.pojo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {
	private String id;
	private String username;
	private String password;
	private int age;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@NotNull(message = "用户名不能为空")
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@NotNull(message = "密码不能为空")
	@Size(min = 6, max = 10, message = "密码程度必须在6-10之间")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password="
				+ password + ", age=" + age + "]";
	}

}
