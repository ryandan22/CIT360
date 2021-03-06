import java.util.*; 

public class listExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp1 = new Employee ("John", "Smith", "USA", "001");
		Employee emp2 = new Employee ("Susan", "Taylor", "USA", "002");
		Employee emp3 = new Employee ("Juan", "Gomez", "Mexico", "003");
		Employee emp4 = new Employee ("Maria", "Lopez", "Mexico", "004");
		Employee emp5 = new Employee ("Sean", "Nole", "Canada", "005");
		Employee emp6 = new Employee ("Mark", "Applegate", "Canada", "006");
		Employee emp7 = new Employee ("Ryan", "Danner", "USA", "007");
		
		List<Employee> workers = new ArrayList<Employee>();
		
		workers.add(emp1);
		workers.add(emp2);
		workers.add(emp3);
		workers.add(emp4);
		workers.add(emp5);
		workers.add(emp6);
		workers.add(emp7);
		
		//Print elements of the set
		System.out.println("List Objects: " + workers + "\n");
		
		System.out.println("The workings employed are:");
		
		for (Employee worker : workers) {
			System.out.println(worker.getName() + " " + worker.getLast_name() + " from " + worker.getCountry());
		}

		Employee emp8=new Employee("Sara", "Wells", "Canada", "008");
		
		//Modify the list and places it to a specific index so we can see the new place of the objects.
		workers.add(1, emp8);
		
		System.out.println("\n List objects: " + workers + "\n");
		
		for (Employee worker : workers) {
			System.out.println(worker.getName() + " " + worker.getLast_name() + " from " + worker.getCountry());
		}
		
		//Modify the list using set method. This will replace what is currently in the index.
		workers.set(2, emp1);
		
		System.out.println("\nList Objects: " + workers + "\n");
		
		for (Employee worker : workers) {
			System.out.println(worker.getName() + " " + worker.getLast_name() + " from " + worker.getCountry());
		}
		
	}
		
}		