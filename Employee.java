package constructorsInJava;
//Question2. Create a class employee with fields empId,empName and salary.Initialize all three fields using a constructor.

public class Employee {
	public Employee(int empId,String empName,double salary) {
		System.out.println("Employee Id is : " +empId);
		System.out.println("Employee Name : " +empName);
		System.out.println("Salary : " +salary);
		
	}
	public static void main(String[] args) {
		Employee e=new Employee(123,"Ram",45000.0);
	}
	
	

}
