package com.ssi;

import java.util.List;

import org.hibernate.Session;

public class SearchProject {

	public static void main(String[] args) {

		Session session=Utility.getSF().openSession();
		Project project=session.get(Project.class, "P1");
		System.out.println(project);
		System.out.println("Employees Working On This Project : - ");
		List<Emp> emps=project.getEmps();
		for(Emp emp:emps) {
			System.out.println(emp.getEno()+","+emp.getName());
		}
		session.close();

	}

}
