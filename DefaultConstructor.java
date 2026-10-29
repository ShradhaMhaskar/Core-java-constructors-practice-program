package constructorsInJava;
//Question5. Create a java program to demonstrate a default constructor.Print a message when object is created.

public class DefaultConstructor {
	public DefaultConstructor() {
		System.out.println("Default constructor called...!");
	}
	public static void main(String[] args) {
		DefaultConstructor d=new DefaultConstructor();
	}

}
