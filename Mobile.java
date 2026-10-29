package constructorsInJava;
//Question4. Create a class mobile with fields brand,price and ram.Initialize these fields using constructor and print them.

public class Mobile {
	String brand="Poco";
	String color="Black";
	String ram="128GB";
	public Mobile() {
		System.out.println("Mobile brand : " +brand);
		System.out.println("Color : " +color);
		System.out.println("Ram : " +ram);
	}
	public static void main(String[] args) {
		Mobile m=new Mobile();
	}

}
