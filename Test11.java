import java.util.Map;
import java.util.TreeMap;

public class Test11 {

	public static void main(String[] args) {
		Map<Employee, Integer> employees = new TreeMap<>(
				(o1, o2) -> o2.getEmployeeName().compareTo(o1.getEmployeeName()));

		employees.put(new Employee(1, "Rahul", 1000), 10);
		employees.put(new Employee(11, "Rohit", 10000), 12);
		employees.put(new Employee(1, "Mahi", 10000), 11);
		employees.put(new Employee(1, "Hardik", 1), 16);
		employees.put(new Employee(1, "Karthik", 100), 15);

		System.out.println(employees);
	}

}
