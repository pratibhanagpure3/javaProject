package firstProjectTest;

//13.9.22
public class Rectangle {
	int length;
	int width;
	int area;
	int perimeter;

	Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int area() {
		// this.area = area;
		return (length * width);
	}

	public int perimeter() {
		// this.perimeter = perimeter;
		return (2 * (length + width));
	}

	public String toString() {
		return " " + " length: " + (int) length + " width: " + (int) width + " area: " + (int) area + " perimeter "
				+ (int) perimeter;
	}

	public static void main(String[] args) {
		Rectangle rec = new Rectangle(8, 7);
		System.out.println(rec);
		rec.area();

		rec.perimeter();

		rec.setLength(9);

		rec.setWidth(2);

		System.out.println(rec);

	}

}
