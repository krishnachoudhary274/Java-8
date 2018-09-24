import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Test3 {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>();

		employees.add(new Employee(1, "Ram", 10));
		employees.add(new Employee(2, "Seeta", 100));
		employees.add(new Employee(3, "Laxman", 1000));
		employees.add(new Employee(4, "Bharat", 10000));
		employees.add(new Employee(5, "Kaikai", 1));

		Function<Employee, Integer> f = (Employee e) -> e.getEmployeeSalary();

		for (Employee e : employees) {
			System.out.println(f.apply(e));
		}

	}

}
