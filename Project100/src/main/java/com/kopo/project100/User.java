package com.kopo.project100;

public class User {
	int idx;
	String id;
	String pwd;
	String name;
	String phone;
	String sex;
	String address;
	String joined;
	String type;
	
	User() {
		
	}
	
	User(String id, String pwd, String name, String phone, String sex, String address, String joined, String type) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.phone = phone;
		this.sex = sex;
		this.address = address;
		this.joined = joined;
		this.type = type;
	}
	
	User(int idx, String id, String pwd, String name, String phone, String sex, String address, String joined, String type) {
		this.idx = idx;
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.phone = phone;
		this.sex = sex;
		this.address = address;
		this.joined = joined;
		this.type = type;
	}
}
