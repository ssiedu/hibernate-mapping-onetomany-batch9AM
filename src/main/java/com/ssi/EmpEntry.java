package com.ssi;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class EmpEntry {

	public static void main(String[] args) {
		
		Session session=Utility.getSF().openSession();
		Transaction tr=session.beginTransaction();
		
		Project p1=new Project("P1");
		Project p2=new Project("P2");
		Project p3=new Project("P3");
		Project p4=new Project("P4");
		Project p5=new Project("P5");
		Project p6=new Project("P6");
		
		List<Project> pList1=Arrays.asList(p1,p2);
		List<Project> pList2=Arrays.asList(p3,p4);
		List<Project> pList3=Arrays.asList(p5,p6);
		
		Emp e1=new Emp(101,"AAA",50000,"SE",  pList1);
		Emp e2=new Emp(102,"BBB",60000,"SSE", pList2);
		Emp e3=new Emp(103,"CCC",70000,"TL",  pList3);
		
		session.save(e1); session.save(e2); session.save(e3);
		
		tr.commit();
		session.close();
		System.out.println("Data Stored...!");
		
	}

}
