package inheritance.eg3_super;

class Car{ 
	public Car() {
		System.out.println("Parent Constructor");
	}		
	
}

class HondaCar extends Car {
	public HondaCar() {
		super(); //super will call the parent class method
		System.out.println("Child Constructor");
	}
	
}


public class TestConstructor {

	public static void main(String[] args) {

		//Car car1 = new Car(); 
		Car car = new HondaCar();
	}

}
