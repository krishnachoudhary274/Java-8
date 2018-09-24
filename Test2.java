import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Test2 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(0, 5, 10, 15, 20, 25, 30);

		List<Integer> evenNubmerList = new ArrayList<>();

		Function<Integer, Integer> f = (i) -> {

			if (i % 2 == 0) {
				evenNubmerList.add(i);
			}

			return 0;
		};

		for (Integer i : numbers) {
			f.apply(i);
		}

		for (Integer i : evenNubmerList) {
			System.out.println(i);
		}

	}

}
