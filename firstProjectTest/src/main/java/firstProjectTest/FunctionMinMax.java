package firstProjectTest;

import java.util.List;

public class FunctionMinMax {

	public static void main(String[] args) {
		List<Integer> obj = List.of(34, 13, 12, 24, 12, 13);

		System.out.println("sorted");
		obj.stream().sorted().forEach(element -> System.out.println(element));
		System.out.println();

		System.out.println("distinct");
		obj.stream().distinct().forEach(e -> System.out.println(e));
		System.out.println();

		System.out.println("distinct sorted");
		obj.stream().distinct().sorted().forEach(e -> System.out.println(e));
		System.out.println();

		System.out.println("square of the number");
		obj.stream().map(e -> e * e).forEach(e -> System.out.println(e));
		System.out.println();

		System.out.println("sum");
		int sum = Sumfp(obj);
		System.out.println(sum);
	}

// what's happening behind the screen that

	public static int Sumfp(List<Integer> obj) {
		return obj.stream().reduce(0, (n1, n2) -> {
			System.out.println(n1 + " " + n2);
			return n1 + n2;
		});
	}
}
