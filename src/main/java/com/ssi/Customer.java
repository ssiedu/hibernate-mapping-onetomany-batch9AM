package com.ssi;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Customer {
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)	//auto-increment
	//@GeneratedValue(strategy=GenerationType.SEQUENCE)	//generated using a sequence
	//@GeneratedValue(strategy=GenerationType.AUTO)
	
	@SequenceGenerator(name="cust_gen",sequenceName="custcode_gen",allocationSize=1,  initialValue=1001)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="cust_gen" )
	
	private int code;
	private String name;
	private String address;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Customer() {
		super();
	}
	public Customer(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	
	
}
