package firstProjectTest;

class Task1 extends Thread {

	public void run() {
		System.out.println("start task1");
		for (int i = 101; i <= 199; i++) {
			System.out.print(i + " ");
		}
	}
}

public class ThreadRun {

	public static void main(String[] args) {

		Task1 obj = new Task1();
		obj.run();

	}

}
