package com.ssi;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class CustomerEntry {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name : ");
		String name=sc.next();
		System.out.println("Enter Address : ");
		String address=sc.next();
		
		Session session=Utility.getSF().openSession();
		Transaction tr=session.beginTransaction();
		
		Customer c=new Customer(name,address);
		session.save(c);
		
		tr.commit();
		session.close();
		System.out.println("Data Stored...!");

	}

}
