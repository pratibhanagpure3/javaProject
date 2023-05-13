package firstProjectTest;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class Multithreading {

	public static void main(String[] args) {
		List<Integer> al = (List<Integer>) Arrays.asList(1, 2, 3, 4, 5, 6);

		System.out.println("Inside Multithreading ");
		int i = 0;

		List<CompletableFuture<Integer>> al2;

		al2 = al.stream().map(num ->

		//
		CompletableFuture.supplyAsync(() ->
		//
		{
			return sum(num);
		})).collect(Collectors.toList());

		List<Integer> response = al2.stream().map(CompletableFuture::join).collect(Collectors.toList());

		System.out.println("al1" + al.toString());
		System.out.println("al2" + response.toString());

	}

	private static int sum(int i) {

		int result = i + 1;
		System.out.println(result);
		return result;

	}

}
