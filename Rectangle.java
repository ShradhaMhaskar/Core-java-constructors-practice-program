package constructorsInJava;
//Question7.Create a class rectangle with fields length and breadth.Initialize them using a constructor and calculate the area. 

public class Rectangle {
	int length;
	int breadth;

	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public void calculateArea() {
		int area = length * breadth;

		System.out.println("Area of a rectangle : " + area);

	}

	public static void main(String[] args) {
		Rectangle r = new Rectangle(10,5);
		r.calculateArea();

	}

}
