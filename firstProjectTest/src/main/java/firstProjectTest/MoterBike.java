package firstProjectTest;

public class MoterBike {

	public static void main(String[] args) {
		MoterBike1 ducati = new MoterBike1();
		MoterBike1 honda = new MoterBike1();

		ducati.start();
		// honda.start();

		ducati.setSpeed(100);
		System.out.println("ducati speed " + ducati.getSpeed());

		honda.start();
		honda.setSpeed(90);
		System.out.println("honda speed " + honda.getSpeed());

	}

}
