package firstProjectTest;

import java.util.List;

public class FunctionInteger {

	public static void main(String[] args) {
		List<Integer> myobj = List.of(1, 2, 3, 4, 5, 6);
		PrintInt(myobj);
		PrintIntFilterOdd(myobj);
		PrintIntFilterEven(myobj);
		PrintSum(myobj);
		int sum = PrintfpSum(myobj);
		System.out.println(sum);
	}

	public static void PrintInt(List<Integer> myobj) {
		myobj.stream().forEach(elment -> System.out.println("element" + " " + elment));
	}

	public static void PrintIntFilterOdd(List<Integer> myobj) {
		myobj.stream().filter(element -> element % 2 == 1)
				.forEach(element -> System.out.println("element odd" + " " + element));
	}

	public static void PrintIntFilterEven(List<Integer> myobj) {
		myobj.stream().filter(element -> element % 2 == 0)
				.forEach(element -> System.out.println("element even" + " " + element));
	}

	public static void PrintSum(List<Integer> myobj) {
		// int sum = 0;
		int sum = myobj.stream().reduce(0, (number1, number2) -> number1 + number2);
		System.out.println("sum" + " " + sum);
	}

	public static int PrintfpSum(List<Integer> myobj) {
		return myobj.stream().reduce(0, (n1, n2) -> n1 + n2);
	}

}
