package firstProjectTest;

public class Fan {
	String make;
	double radius;
	String color;
	boolean IsOn;
	byte speed;// 0 to 5

	public Fan(String make, double radius, String color) {
		this.make = make;
		this.radius = radius;
		this.color = color;
	}
	// public void IsOn(boolean IsOn) {
	// this.IsOn =IsOn;
	// } iske alawa switchOn aur switchOf method bhi use kr sakte h

	public void switchOn() {
		this.IsOn = true;
		this.SetSpeed((byte) 5);
	}

	public void switchOff() {
		this.IsOn = false;
		this.SetSpeed((byte) 0);
	}

	public void SetSpeed(byte speed) {
		this.speed = speed;
	}

	/*
	 * public String toString() {
	 * 
	 * 
	 * return String
	 * .format("make- %s ,radius- %f ,color- %s ,IsOn- %b ,speed- %d , make, radius, color, IsOn, spped "
	 * ); }
	 */
	public String toString() {
		return "" + "make:" + (String) make + " radius:" + String.valueOf(radius) + " color: " + color + " IsOn: "
				+ IsOn + " speed: " + speed;
	}

	/*
	 * public String toString() { return "make:"+make +
	 * " radius:"+String.valueOf(radius)+" color "+color; ) }
	 */

	public static void main(String[] args) {
		Fan obj = new Fan("manufacture1", 0.56, "red");
		obj.SetSpeed((byte) 4);
		System.out.println(obj);
		obj.switchOn();
		System.out.println(obj);
		obj.switchOff();
		System.out.println(obj);
	}
}
