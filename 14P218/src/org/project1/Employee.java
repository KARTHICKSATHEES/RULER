package org.project1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE_DETAILS")
public class Employee {

	public Employee(int id, String name, String email, long phone) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name2) {
		this.name = name2;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	@Id
	@Column(name = "Emp_Id", nullable = false)
	private int id;
	@Column(name = "Emp_Name", length = 255, nullable = false)
	private String name;
	@Column(name = "EMAIL_ID", unique = true)
	private String email;
	@Column(name = "Phone_No", unique = true, nullable = false)
	private long phone;
	@Column(name = "Basic_salary")
	private int basicSalary;
	@Column(name = "DA")
	private int dearnessAllowance;
	@Column(name = "HRA")
	private int houseRentAllowance;
	@Column(name = "TA")
	private int travelAllowance;
	@javax.persistence.Transient
	private int netSalary;

	public int getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(int basicSalary) {
		this.basicSalary = basicSalary;
	}

	public int getDearnessAllowance() {
		return dearnessAllowance;
	}

	public void setDearnessAllowance(int dearnessAllowance) {
		this.dearnessAllowance = dearnessAllowance;
	}

	public int getHouseRentAllowance() {
		return houseRentAllowance;
	}

	public void setHouseRentAllowance(int houseRentAllowance) {
		this.houseRentAllowance = houseRentAllowance;
	}

	public int getTravelAllowance() {
		return travelAllowance;
	}

	public void setTravelAllowance(int travelAllowance) {
		this.travelAllowance = travelAllowance;
	}

	public int getNetSalary() {
		return netSalary;
	}

	public void setNetSalary(int netSalary) {
		this.netSalary = netSalary;
	}

}
