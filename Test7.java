import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Test7 {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(

				new Employee(1, "Rahul", 1000), 
				new Employee(11, "Rohit", 10000), 
				new Employee(1, "Mahi", 10000),
				new Employee(1, "Hardik", 1), 
				new Employee(1, "Karthik", 100)

		);

		List<Employee> newList = new ArrayList<>();
		
		Function<Employee, Employee> f=(e)->{
			if(e.getEmployeeSalary()>5000) {
				newList.add(e);
			}
			return null;
		};
		
		
		for(Employee e:employees)
			f.apply(e);
		
		for(Employee e:newList) {
			System.out.println(e);
		}

	}

}
