package com.ssi;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class LaptopEntry {

	public static void main(String[] args) {
		
		Session session=Utility.getSF().openSession();
		Transaction tr=session.beginTransaction();
		Laptop l1=new Laptop("L1","Dell",50000,new Emp(101));
		Laptop l2=new Laptop("L2","HP",60000,new Emp(101));
		Laptop l3=new Laptop("L3","HCL",40000,new Emp(102));
		Laptop l4=new Laptop("L4","Mac",80000,new Emp(102));
		Laptop l5=new Laptop("L5","Lenovo",55000,new Emp(103));
		Laptop l6=new Laptop("L6","Sony",45000,new Emp(103));
		
		session.save(l1); session.save(l2); session.save(l3); session.save(l4); session.save(l5); session.save(l6);
		
		tr.commit();
		session.close();
		System.out.println("Data Stored...!");
		
	}

}
