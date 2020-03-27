package main.handlers;

import java.util.HashMap;
import java.util.Scanner;

import main.model.Employee;
import main.model.Classification;
import main.model.Group;

public class addEmployeeHandler implements Handler {
	
	@Override
	public Object handleIt(HashMap<String, Object> data) {
		Scanner scanner = (Scanner) data.get("scanner");
		Group group = (Group) data.get("group");

		System.out.print("Enter an Id: ");
		String id = scanner.nextLine();
		System.out.print("Enter a Name: ");
		String name = scanner.nextLine();
		System.out.print("Enter a Last Name: ");
		String lastName = scanner.nextLine();
		System.out.print("Enter a Country: ");
		String country = scanner.nextLine();
		System.out.println("Classification:");
		int i = 1;
		Classification[] classifications = Classification.values();
		int classificationSelection = 0;
		while (classificationSelection < 1 || classificationSelection > classifications.length) {
			for (Classification classification : classifications) {
				System.out.println(i++ + "-" + classification.toString());
			}
			System.out.print("Select a classification: ");
			classificationSelection = GetNextInt(scanner);
			i = 1;
		}
		Classification selectedClassification = classifications[classificationSelection - 1];

		Employee newEmployee = new Employee(id, name, lastName,country, selectedClassification);
		group.addEmployee(newEmployee);
		return null;
	}

	private int GetNextInt(Scanner scanner) {
		String input = scanner.nextLine();
		try {
			return Integer.parseInt(input);
		} catch (Exception e) {
			System.out.println("Please choose a classification from the list");
			return -1;
		}
	}

}