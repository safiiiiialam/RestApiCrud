package com.RestApi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EmpolyeeCrud_Info")
public class Empolyee {
	@Id
	@GeneratedValue
	private long id;

	private String name;
	
	 private String role;
	 private double salary;
	 private double experience;
	 public Empolyee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Empolyee [id=" + id + ", name=" + name + ", role=" + role + ", salary=" + salary + ", experience="
				+ experience + "]";
	}
	public Empolyee(long id, String name, String role, double salary, double experience) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
		this.salary = salary;
		this.experience = experience;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getExperience() {
		return experience;
	}
	public void setExperience(double experience) {
		this.experience = experience;
	}
	

}
