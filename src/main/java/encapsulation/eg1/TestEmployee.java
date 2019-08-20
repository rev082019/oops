package encapsulation.eg1;

class Employee{
	public String name;
	public int age;
}

// Without Encapsulation
public class TestEmployee {

	public static void main(String[] args) {
		Employee obj = new Employee();
		obj.name = "Prabhu";
		obj.age = -3; // Since the variable is public, we cannot restrict the values
		System.out.println("Name:" +obj.name +",age:" + obj.age);
	}
	
}
