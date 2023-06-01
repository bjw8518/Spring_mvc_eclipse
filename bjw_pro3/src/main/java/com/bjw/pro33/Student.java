package com.bjw.pro33;

public class Student {
	int idx;
	String name;
	String phone;
	String address;
	
	Student(){
		
	}
	
	Student(String name, String phone, String address){
		this.name = name;
		this.phone = phone;
		this.address = address;
	}
	
	Student(int idx,String name, String phone, String address){
		this.idx=idx;
		this.name = name;
		this.phone = phone;
		this.address = address;
	}
}
