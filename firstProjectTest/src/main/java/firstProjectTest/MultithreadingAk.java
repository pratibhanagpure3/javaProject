package firstProjectTest;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class MultithreadingAk {

	public static void main(String[] args) {

		System.out.println(" ak Inside Multithreading ");
		int i = 0;

		List<Integer> al = (List<Integer>) Arrays.asList(1, 2, 3, 4, 5, 6);

        List<CompletableFuture<Integer>> futureList = al.stream().map(
        		int -> CompletableFuture.supplyAsync(() -> {
                    try {
                        return sum(int);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                })).collect(toList());

        CompletableFuture.allOf(futureList.toArray(new CompletableFuture[0])).join();

        List<Integer> response = futureList.stream().map(CompletableFuture::join)
            .collect(Collectors.toList());

        System.out.println("processed elements : " + response);

        return response;
    }

	private static int sum(int i) {

		int result = i + 1;
		System.out.println(result);
		return result;

	}
}
