import java.util.Arrays;
import java.util.List;

public class Test13 {
	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(0, 5, 10, 15, 20, 25, 30);

		System.out.println(numbers.stream().filter((e) -> e > 10).count());

	}

}
