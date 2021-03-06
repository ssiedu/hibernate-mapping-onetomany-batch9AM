package com.ssi;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Laptop {
	@Id
	private String code;
	private String brand;
	private int price;
	@ManyToOne
	private Emp emp;
	
	public Emp getEmp() {
		return emp;
	}

	public void setEmp(Emp emp) {
		this.emp = emp;
	}

	public Laptop(String code, String brand, int price, Emp emp) {
		super();
		this.code = code;
		this.brand = brand;
		this.price = price;
		this.emp = emp;
	}

	public Laptop() {
		super();
	}

	public Laptop(String code) {
		super();
		this.code = code;
	}

	public Laptop(String code, String brand, int price) {
		super();
		this.code = code;
		this.brand = brand;
		this.price = price;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Laptop [code=" + code + ", brand=" + brand + ", price=" + price + "]";
	}

}
