import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test12 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(0, 5, 10, 15, 20, 25, 30);

		Stream<Integer> stream = numbers.stream();
		//Stream<Integer> filter = stream.filter(Test13::divide);
		Stream<Integer> filter = stream.filter((e)->
		{
			System.out.println("Ram");
			return e%2==0;	
		});
		
		
	//	List<Integer> newList = filter.collect(Collectors.toList());

		 numbers.forEach((e)->System.out.println(e));

		//newList.forEach(System.out::println);
	}

}

/*class Test13 {

	public static boolean divide(int a) {
		if (a % 2 == 0)
			return true;

		return false;
	}

}*/
