package com.ssi;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class ProjectEntry {

	public static void main(String[] args) {
		Session session=Utility.getSF().openSession();
		Transaction tr=session.beginTransaction();
		Project p1=new Project("P1","AcSw","Tata");
		Project p2=new Project("P2","BnkSw","SBI");
		Project p3=new Project("P3","ERP","Bajaj");
		Project p4=new Project("P4","FW","Intel");
		Project p5=new Project("P5","SecSys","IBM");
		Project p6=new Project("P6","HotelERP","Taj");
		session.save(p1); session.save(p2); session.save(p3); session.save(p4); session.save(p5); session.save(p6);
		tr.commit();
		session.close();
		System.out.println("Data Stored...!");

	}

}
