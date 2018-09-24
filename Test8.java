import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Test8 {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(

				new Employee(1, "Rahul", 1000), new Employee(11, "Rohit", 10000), new Employee(1, "Mahi", 10000),
				new Employee(1, "Hardik", 1), new Employee(1, "Karthik", 100)

		);

		// employees.forEach((e) -> System.out.println(e));

		// employees.forEach(System.out::println);

		for (Employee e1 : employees) {
			Supplier<Integer> salary = e1::getEmployeeSalary;
			System.out.println(salary.get());
		}

	}

}
