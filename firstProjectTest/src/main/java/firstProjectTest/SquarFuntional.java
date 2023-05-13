package firstProjectTest;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SquarFuntional {
	// print the value of 1st 10 integer value

	public static void main(String[] args) {
		IntStream.range(1, 11).forEach(p -> System.out.println(p));

		// print the square of 1st 10 integer value
		System.out.println("square value");

		IntStream.range(1, 11).map(e -> e * e).forEach(p -> System.out.println(p));

		// print the sum of all the value
		System.out.println("sum of the value");
		int sum = IntStream.range(1, 11).reduce(0, (n1, n2) -> n1 + n2);
		System.out.println(sum);

		// print the lower case of string value
		System.out.println("print lower case");
		List.of("Apple", "Bat", "Cat").stream().map(u -> u.toLowerCase()).forEach(p -> System.out.println(p));

		// print the length of the string
		System.out.println("print length");
		List.of("Apple", "Bat", "Cat").stream().map(s -> s.length()).forEach(p -> System.out.println(p));

		System.out.println();
		System.out.println("max value");
		int mx = List.of(12, 45, 64, 23).stream().max((n1, n2) -> Integer.compare(n1, n2)).get();
		System.out.println(mx);

		System.out.println();
		System.out.println("print list odd number");

		List.of(23, 23, 25, 15, 14).stream().filter(e -> e % 2 == 1).collect(Collectors.toList());

		// List<Integer> collect =

		System.out.println(List.of(23, 23, 25, 15, 14).stream().filter(e -> e % 2 == 1).collect(Collectors.toList()));

		/*
		 * for (int n : collect) { System.out.println(n); }
		 */

		System.out.println();
		System.out.println("square in box");
		IntStream.range(1, 11).map(e -> e * e).boxed().collect(Collectors.toList()).forEach(e -> System.out.println(e));
	}

}
