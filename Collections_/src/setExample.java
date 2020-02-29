import java.util.*;

public class setExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp1 = new Employee ("John", "Smith", "USA", "001");
		Employee emp2 = new Employee ("Susan", "Taylor", "USA", "002");
		Employee emp3 = new Employee ("Juan", "Gomez", "Mexico", "003");
		Employee emp4 = new Employee ("Maria", "Lopez", "Mexico", "004");
		Employee emp5 = new Employee ("Sean", "Nole", "Canada", "005");
		Employee emp6 = new Employee ("Mark", "Applegate", "Canada", "006");
		Employee emp7 = new Employee ("Ryan", "Danner", "USA", "007");
		//emp8 line will not print because in the class worker overrides the methods hashcode and equal
		Employee emp8 = new Employee("Sara", "Wells", "Canada", "008");
		
		Set<Employee> workers = new HashSet<Employee>();
		
		workers.add(emp1);
		workers.add(emp2);
		workers.add(emp3);
		workers.add(emp4);
		workers.add(emp5);
		workers.add(emp6);
		workers.add(emp7);
		workers.add(emp8);
		
		System.out.println("The workings employed are:");
		
		for (Employee worker : workers) {
			System.out.println(worker.getName() + " " + worker.getLast_name() + " from " + worker.getCountry());
		}
		
		//Clear all elements
		workers.clear();
		
		System.out.println("\nworkers is empty: " + workers.isEmpty() + "\n");
		
		//Checking the number of elements
		System.out.println("workers have: " + workers.size() + " Elements\n");
		
		}

}