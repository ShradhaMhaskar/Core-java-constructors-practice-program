package constructorsInJava;

//Question 1. Create a class student with fields name and age.Initialize them using a constructor and print their values.

public class Student {
	
	public Student(String name, int age) {
        System.out.println("Student name : " + name);
		System.out.println("Age : " + age);

	}

	public static void main(String[] args) {
		Student s = new Student("Priya",22);

	}

}
