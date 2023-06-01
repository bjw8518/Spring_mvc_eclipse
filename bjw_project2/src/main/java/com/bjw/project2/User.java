package com.bjw.project2;

public class User {
	int idx;//index
	String id;
	String pwd;
	String name;
	String phone;
	String sex;
	String address;
	String joindate;
	String type;
	
	User(){
		
	}
	
	
	User(String id,String pwd,String name,String phone,String sex,String address,String joindate,String type){
		this.id=id;
		this.pwd=pwd;
		this.name=name;
		this.phone=phone;
		this.sex=sex;
		this.address=address;
		this.joindate=joindate;
		this.type=type;
	}
	
	User(int idx,String id,String pwd,String name,String phone,String sex,String address,String joindate,String type){
		this.idx=idx;
		this.id=id;
		this.pwd=pwd;
		this.name=name;
		this.phone=phone;
		this.sex=sex;
		this.address=address;
		this.joindate=joindate;
		this.type=type;
	}	

}
