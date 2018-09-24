import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;

public class Test5 {

	static String[] weather = { "Rainy", "Sunny", "Windy", "Cloudy" };
	
	

	public static String get() {

		int i = ThreadLocalRandom.current().nextInt(0, 4);
		return weather[i];

	}

	public static void main(String[] args) {
		Supplier<String> s = Test5::get;
	}

}
