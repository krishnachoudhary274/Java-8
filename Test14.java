import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Test14 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(0, 5, 10, 15, 20, 30, 25);
		
		Optional<Integer> min = numbers.stream().max((o1,o2)->o1.compareTo(o2));
		
		System.out.println(min);

	}

}
