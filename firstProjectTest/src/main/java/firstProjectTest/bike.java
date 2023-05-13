package firstProjectTest;

public class bike {
	/*
	 * void start(int speed) { System.out.println(speed);
	 * 
	 * }
	 */
	private int speed;

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
		System.out.println(speed);
		System.out.println(this.speed);
		this.speed = speed;
	}

	public void increasSpeed(int howmuch) {
		this.speed = this.speed + howmuch;
	}

}
