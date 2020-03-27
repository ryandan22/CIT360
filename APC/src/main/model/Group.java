package main.model;

import java.util.ArrayList;

public class Group {

	private ArrayList<Employee> employees;


	public Group() {

		employees=new ArrayList<>();

		employees.add(new Employee("001", "John", "Smith", "USA", Classification.NEWHIRE));
		employees.add(new Employee("002", "Susan", "Taylor", "USA", Classification.TENYEARPLUS));
		employees.add(new Employee("003", "Juan", "Gomez", "Mexico", Classification.ONEYEAR));
		employees.add(new Employee("004", "Maria", "Lopez", "Mexico", Classification.NEWHIRE));
		employees.add(new Employee("005", "Sean", "Nole", "Canada", Classification.FIVEYEAR));
		employees.add(new Employee("006", "Mark", "Applegate", "Canada", Classification.NEWHIRE));
		employees.add(new Employee("007", "Ryan", "Danner", "USA", Classification.ONEYEAR));

	}

	public void addEmployee(Employee employee) {
		this.employees.add(employee);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Group [employees=\n\t");
		ArrayList<String> employeeList = new ArrayList<>();
		for(Employee employee : employees) {
			employeeList.add(employee.toString());
		}
		String employeeStrings = String.join(",\n\t", employeeList);
		builder.append(employeeStrings);
		builder.append("\n]");
		return builder.toString();
	}

}