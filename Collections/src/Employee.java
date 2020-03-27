import java.util.Comparator;
import java.util.Objects;
	
public class Employee implements Comparator<Employee> {
	
	private String name;
	private String last_name;
	private String country;
	private String code_employee;
	
	public Employee(String name, String last_name, String country, String code_employee) {
			this.name = name;
			this.last_name = last_name;
			this.country = country;
			this.code_employee = code_employee;
	}
		
		public Employee() {
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
		public int compare(Employee arg0, Employee arg1) {
			String descriptionA=arg0.getCode_employee();
			
			String descriptionB=arg1.getCode_employee();
			
			return descriptionA.compareTo(descriptionB);
		}

		public static boolean isEmpty() {
			// TODO Auto-generated method stub
			return false;
		}

		public static boolean isEmpty1() {
			// TODO Auto-generated method stub
			return false;
		}

	}