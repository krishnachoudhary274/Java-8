import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Test {

	public static void doSomething(Predicate<Integer> p, List<Integer> numberList) {

		for (Integer i : numberList) {

			System.out.println(i + "  " + p.test(i));

		}

	}

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(0, 5, 10, 15, 20, 25, 30);

		Predicate<Integer> p1 = (t) -> t % 2 == 0;

		// doSomething(p1, numbers);

		Predicate<Integer> p2 = (t) -> t > 10;

		// doSomething(p2, numbers);

		Predicate<Integer> p3 = p1.and(p2);

		//doSomething(p3, numbers);
		
		Predicate<Integer> p4= p1.negate();
		
		//doSomething(p4, numbers);
		
		Predicate<Integer> p5=p1.or(p2);
		
		doSomething(p5, numbers);

	}

}
