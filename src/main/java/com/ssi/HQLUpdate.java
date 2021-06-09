package com.ssi;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class HQLUpdate {

	public static void main(String[] args) {
		
		Session session=Utility.getSF().openSession();
		Transaction tr=session.beginTransaction();
		//we are increasing salary of each employee by 1000 rs.
		//String hql="update Emp set sal=sal+1000 where desg='SE'";
		
		/*
		Query query=session.createQuery("update Emp set sal=sal+? where desg=?");
		query.setParameter(0,1000);
		query.setParameter(1, "TL");
		*/
		
		
		String hql="update Emp set sal=sal+:amount where desg=:dg";
		Query query=session.createQuery(hql);
		query.setParameter("amount", 1500);
		query.setParameter("dg", "SSE");
		
		int n=query.executeUpdate();	//returns the number of entities updated.
		tr.commit();
		System.out.println(n+" rows modified....");
		session.close();
		
		

	}

}
