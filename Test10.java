import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test10 {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(

				new Employee(1, "Rahul", 1000), new Employee(11, "Rohit", 10000), new Employee(1, "Mahi", 10000),
				new Employee(1, "Hardik", 1), new Employee(1, "Karthik", 100)

		);

		Collections.sort(employees, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
			
				return o2.getEmployeeName().compareTo(o1.getEmployeeName());
			}
		});
		
		Collections.sort(employees,(o1,o2) ->  o2.getEmployeeName().compareTo(o1.getEmployeeName()));

		System.out.println(employees);

	}

}
