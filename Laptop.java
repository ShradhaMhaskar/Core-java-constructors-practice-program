package constructorsInJava;
//Question9.Create a class Laptop with fields brand,processor,and price.Create 2 objects with different values using the same constructor.

public class Laptop {
	String brand;
	String processor;
	double price;

	public Laptop(String brand, String processor, double price) {
		this.brand = brand;
		this.processor = processor;
		this.price = price;
		System.out.println("Laptop brand name : " +brand);
		System.out.println("Processor : " +processor);
		System.out.println("Price : " +price);
	}
	public static void main(String[] args) {
		Laptop l1=new Laptop("Dell","Intel i5",55000.0);
		System.out.println();
		Laptop l2=new Laptop("hp","Intel i7",65000.0);
	}

}
