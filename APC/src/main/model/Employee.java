package main.model;

import java.util.Objects;

public class Employee {

	private String name;
	private String last_name;
	private String country;
	private String code_employee;
	private Classification classification;

	public Employee(String code_employee,String name, String last_name, String country,  Classification classification) {
		this.name = name;
		this.last_name = last_name;
		this.country = country;
		this.code_employee = code_employee;
		this.classification=classification;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String code_employee, String name, String last_name, Classification classification) {
		// TODO Auto-generated constructor stub
		this.code_employee = code_employee;
		this.name = name;
		this.last_name = last_name;
		this.classification=classification;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCode_employee() {
		return code_employee;
	}

	public void setCode_employee(String code_employee) {
		this.code_employee = code_employee;
	}

	public Classification getClassification() {
		return classification;
	}

	public void setClassification(Classification classification) {
		this.classification = classification;
	}



	@Override
	public int hashCode() {
		return Objects.hash(code_employee);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Employee))
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(code_employee, other.code_employee);
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", last_name=" + last_name + ", country=" + country + ", code_employee="
				+ code_employee + ",  classification=" + classification + "]";
	}

}