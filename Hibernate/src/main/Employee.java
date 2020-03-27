package main;

import javax.persistence.Entity;  
import javax.persistence.Id;  
import javax.persistence.Table; 

@Entity
@Table(name = "EMPLOYEE")

public class Employee {

	@Id
	private String code_employee;
	
	private String name,last_name;

	public Employee(String code_employee, String name, String last_name) {
		// TODO Auto-generated constructor stub
		this.code_employee=code_employee;
		this.name=name;
		this.last_name=last_name;
	}

	public String getCode_employee() {
		return code_employee;
	}

	public void setCode_employee(String code_employee) {
		this.code_employee = code_employee;
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
	
}
	