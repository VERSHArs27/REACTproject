package com.example.demo.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String employeeName;
	private Long salary;
	private Long leaveDays;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Long getSalary() {
		return salary;
	}
	public void setSalary(Long salary) {
		this.salary = salary;
	}
	public Long getLeaveDays() {
		return leaveDays;
	}
	public void setLeaveDays(Long leaveDays) {
		this.leaveDays = leaveDays;
	}
	public Employee(Long id, String employeeName, Long salary, Long leaveDays) {
		super();
		this.id = id;
		this.employeeName = employeeName;
		this.salary = salary;
		this.leaveDays = leaveDays;
	}
	public Employee() {
		super();
	}
	
}
