package firstProjectTest;

import java.util.List;

public class Functional {
	public static void main(String[] args) {

		List<String> obj = List.of("apple", "bat", "cat");
		Printfp(obj);
		PrintfpWithFiltering(obj);
	}

	public static void Printfp(List<String> obj) {
		obj.stream().forEach(System.out::println); // shortcut forEach
	}

	public static void PrintfpWithFiltering(List<String> obj) {
		obj.stream().filter(element -> element.endsWith("at"))
				.forEach(element -> System.out.println("element" + " " + element));
	}
}
