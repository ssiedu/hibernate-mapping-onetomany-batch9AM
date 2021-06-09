package com.ssi;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Emp {
	@Id
	private int eno;
	private String name;
	private int sal;
	private String desg;
	@OneToMany(mappedBy="emp")
	private List<Laptop> laptops;
	
	@ManyToMany	
	private List<Project> projects;
	
	public List<Laptop> getLaptops() {
		return laptops;
	}

	public void setLaptops(List<Laptop> laptops) {
		this.laptops = laptops;
	}

	public Emp(int eno, String name, int sal, String desg) {
		super();
		this.eno = eno;
		this.name = name;
		this.sal = sal;
		this.desg = desg;
	}

	public Emp(int eno) {
		super();
		this.eno = eno;
	}

	public Emp() {
		super();
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	public Emp(int eno, String name, int sal, String desg,  List<Project> projects) {
		super();
		this.eno = eno;
		this.name = name;
		this.sal = sal;
		this.desg = desg;
		this.projects = projects;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

}
