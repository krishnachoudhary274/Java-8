import java.util.Arrays;
import java.util.List;

public class Test15 {

	public static void main(String[] args) {
		
		List<Employee> employees = Arrays.asList(

				new Employee(1, "Rahul", 1000), new Employee(11, "Rohit", 10000), new Employee(1, "Mahi", 10000),
				new Employee(1, "Hardik", 1), new Employee(1, "Karthik", 100)

		);
		
		employees.parallelStream().forEach(System.out::println);

	}

}
