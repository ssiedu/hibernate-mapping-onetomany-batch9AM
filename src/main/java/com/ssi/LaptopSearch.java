package com.ssi;

import org.hibernate.Session;

public class LaptopSearch {
	public static void main(String[] args) {
		Session session=Utility.getSF().openSession();
		Laptop lapy=session.get(Laptop.class, "L2");
		System.out.println(lapy.getCode());
		System.out.println(lapy.getBrand());
		System.out.println(lapy.getPrice());
		System.out.println(lapy.getEmp().getEno());
		System.out.println(lapy.getEmp().getName());
		System.out.println(lapy.getEmp().getDesg());
		session.close();

	}
}
