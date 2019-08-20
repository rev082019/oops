package inheritance.eg1_abstractclass;

public class IciciBank extends Bank{

	public IciciBank(){
		super(); // 1st line in constructor is super() which calls the parent constructor
		System.out.println("Icici - Constructor ");
	}
	
	public void withdrawal() {
		System.out.println("Icici - withdrawal");
	}
}
