package constructorsInJava;
//Question3. Create a class car with fields brand,color and average.Create an object and initialize its value using a constructor.

public class Car {
	String brand="Thar";
	String color="Black";
	String average="200km/hr";
	public Car() {
		System.out.println("Car brand : " +brand);
		System.out.println("Color : " +color);
		System.out.println("Average : " +average);
	}
	public static void main(String[] args) {
		Car c=new Car();
	}

}
