package firstProjectTest;

public class bikeRunner {
	public static void main(String[] args) {
		bike honda = new bike();
		bike ducati = new bike();

		// honda.start();
		// ducati.start();

		honda.setSpeed(50);
		// ducati.start(100);
		honda.increasSpeed(100);
		System.out.println(honda.getSpeed());
	}
}
