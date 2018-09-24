import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Test6 {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(

				new Employee(1, "Rahul", 1000), new Employee(11, "Rohit", 10000), new Employee(1, "Mahi", 10000),
				new Employee(1, "Hardik", 1), new Employee(1, "Karthik", 100)

		);

		List<Employee> newList = new ArrayList<>();
		Predicate<Employee> namesStartsWithR = (Employee e) -> e.getEmployeeName().charAt(0) == 'R';

		for (Employee e : employees) {

			if (namesStartsWithR.test(e)) {
				newList.add(e);
			}
		}

		for (Employee e : newList) {

			System.out.println(e);
		}

	}

}
