import java.util.*;

public class treeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp1 = new Employee ("John", "Smith", "USA", "001");
		Employee emp2 = new Employee ("Susan", "Taylor", "USA", "002");
		Employee emp3 = new Employee ("Juan", "Gomez", "Mexico", "003");
		Employee emp4 = new Employee ("Maria", "Lopez", "Mexico", "004");
		Employee emp5 = new Employee ("Sean", "Nole", "Canada", "005");
		Employee emp6 = new Employee ("Mark", "Applegate", "Canada", "006");
		Employee emp7 = new Employee ("Ryan", "Danner", "USA", "007");
		
		TreeMap<String, Employee> workers = new TreeMap<String, Employee>();
		
		workers.put("001", emp1);
		workers.put("002", emp2);
		workers.put("003", emp3);
		workers.put("004", emp4);
		workers.put("005", emp5);
		workers.put("006", emp6);
		workers.put("007", emp7);
		
		System.out.println("Total Employees: " + workers.size());
        
        Iterator<String> it = workers.keySet().iterator();
        
        it = workers.keySet().iterator();
        while(it.hasNext()){
          Object key = it.next();
          System.out.println("Clave: " + key + " is Value: " + workers.get(key).getLast_name());
        }
        
        System.out.println("\n-------Various methods of Tree Maps-------");
        System.out.println("This shows the number of elements in the Tree Map: "+workers.size());
        System.out.println("Here, you can see if the Tree Map is Empty: "+workers.isEmpty());
        System.out.println("Key 001 element of the Tree Map: "+workers.get("001").getLast_name());
        System.out.println("Removed the element of the TreeMap with the key 003: "+workers.remove("003").getLast_name());
        System.out.println("See what happens if we want to get the key 003: "+workers.get("003"));
        System.out.println("And now to see if there is an element with the key 003: "+workers.containsKey("003"));
        System.out.println("Here all the elements of the Map are removed: "); workers.clear();
        System.out.println("And check if we have removed it by seeing its size: "+workers.size());
        System.out.println("Last, verify if it is empty: "+workers.isEmpty());
		
	}

}