package encapsulation.eg2;

class Student{
	private String name;	
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if ( age < 0) {
			throw new IllegalArgumentException("Invalid Age");
		}
		this.age = age;
	}
	
	
}

// Using Encapsulation
public class TestStudent {

	public static void main(String[] args) {
		Student obj = new Student();
		obj.setName("Prabhu");
		obj.setAge(3); 
		//obj.setAge(-3); 
		System.out.println("Name:" +obj.getName() +",age:" + obj.getAge());
	}
	
}
