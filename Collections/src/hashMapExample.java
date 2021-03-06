import java.util.*;
import java.util.Map.Entry;

public class hashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp1 = new Employee ("John", "Smith", "USA", "001");
		Employee emp2 = new Employee ("Susan", "Taylor", "USA", "002");
		Employee emp3 = new Employee ("Juan", "Gomez", "Mexico", "003");
		Employee emp4 = new Employee ("Maria", "Lopez", "Mexico", "004");
		Employee emp5 = new Employee ("Sean", "Nole", "Canada", "005");
		Employee emp6 = new Employee ("Mark", "Applegate", "Canada", "006");
		Employee emp7 = new Employee ("Ryan", "Danner", "USA", "007");
		
		Map<String, Employee> workers = new HashMap<String, Employee>();
		
		workers.put("John", emp1);
		workers.put("Susan", emp2);
		workers.put("Juan", emp3);
		workers.put("Maria", emp4);
		workers.put("Sean", emp5);
		workers.put("Mark", emp6);
		workers.put("Ryan", emp7);
		
		System.out.println("Total Employees: " + workers.size());
		
		for (Entry<String, Employee> employee : workers.entrySet()) {
			String clave = employee.getKey();
			Employee valor = employee.getValue();
			System.out.println(clave+"  =  "+valor.toString());
			
		}
		
		String searchKey = "John";
		
		System.out.println("Number of employees with the name: John\n");
		
			if(workers.containsKey(searchKey))
				System.out.println("Found total: " + workers.get(searchKey) + " with the name " + searchKey + "\n");
			
			workers.clear();
			
		//Checking the number of elements
		System.out.println("Workers have: " + workers.size() + " Elements\n ");
		
	}

}