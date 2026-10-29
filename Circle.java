package constructorsInJava;
//Question 10. Create a class circle with fields radius.Initialize the radius using a constructor and calculate the area using the formula.

public class Circle {
	double radius;
	public Circle(double radius) {
		this.radius=radius;
		
	}
	public void CalculateArea() {
		double area=3.14*radius*radius;
		System.out.println("Area of a circle : " +area);
	}
	public static void main(String[] args) {
		Circle c=new Circle(5);
		c.CalculateArea();
	}

}
