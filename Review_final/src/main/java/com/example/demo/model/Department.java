package com.example.demo.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
@Table(name="_department")
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int deptId;
	
	@OneToMany(cascade = CascadeType.ALL,fetch=FetchType.EAGER)
	//join column 3 tables
	//@JoinColumn(name = "order_id",referencedColumnName="id")
	//join 2 tables(another method) using two id
	@JoinTable(name="payment_product",joinColumns=@JoinColumn(name="payment_id"),inverseJoinColumns=@JoinColumn(name="product_id"))
	private List<Employee>employee;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public List<Employee> getEmployee() {
		return employee;
	}
	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
	public Department(Long id, int deptId, List<Employee> employee) {
		super();
		this.id = id;
		this.deptId = deptId;
		this.employee = employee;
	}
	public Department() {
		super();
	}
	
	
	
}
