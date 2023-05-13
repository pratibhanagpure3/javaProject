package firstProjectTest;

import java.util.List;
import java.util.function.Predicate;

public class MethodReference {

	public static void main(String[] args) {

		Predicate<? super Integer> EvenNum = creatReturn();
		List.of(12, 23, 43, 45, 56).stream().filter(EvenNum).map(n -> n * n)
				.forEach(n -> System.out.println(n));

	}

	private static Predicate<? super Integer> creatReturn() {
		return n -> n % 2 == 0;
	}

}
