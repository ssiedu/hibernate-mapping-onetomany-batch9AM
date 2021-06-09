package com.ssi;

import java.util.List;

import org.hibernate.Session;

public class EmpSearch {

	public static void main(String[] args) {
		Session session=Utility.getSF().openSession();
		Emp emp=session.get(Emp.class, 102);
		System.out.println(emp.getEno());
		System.out.println(emp.getName());
		System.out.println(emp.getSal());
		System.out.println(emp.getDesg());
		System.out.println("Laptop-Details : - ");
		List<Laptop> laptops=emp.getLaptops();
		for(Laptop laptop:laptops) {
			System.out.println(laptop);
		}
		System.out.println("Project-Details : - ");
		List<Project> projects = emp.getProjects();
		for(Project project:projects) {
			System.out.println(project);
		}
		session.close();

	}

}
