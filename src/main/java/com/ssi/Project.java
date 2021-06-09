package com.ssi;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	
	@Id
	private String pcode;
	private String ptitle;
	private String cname;
	
	@ManyToMany(mappedBy="projects")
	private List<Emp> emps;
	
	public String getPcode() {
		return pcode;
	}
	public void setPcode(String pcode) {
		this.pcode = pcode;
	}
	public String getPtitle() {
		return ptitle;
	}
	public void setPtitle(String ptitle) {
		this.ptitle = ptitle;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public List<Emp> getEmps() {
		return emps;
	}
	public void setEmps(List<Emp> emps) {
		this.emps = emps;
	}
	public Project(String pcode, String ptitle, String cname) {
		super();
		this.pcode = pcode;
		this.ptitle = ptitle;
		this.cname = cname;
	}
	public Project() {
		super();
	}
	public Project(String pcode) {
		super();
		this.pcode = pcode;
	}
	@Override
	public String toString() {
		return "Project [pcode=" + pcode + ", ptitle=" + ptitle + ", cname=" + cname + "]";
	}
	
}
