package inheritance.eg1_abstractclass;

/**
 * Abstract class can contain both abstract and concrete methods
 * Object cannot be created for abstract class
 *
 */

public abstract class Bank {

	public Bank(){
		System.out.println("Bank - Constructor ");
	}
	
	public void deposit() {
		System.out.println("Parent- deposit");
	}
	
	public abstract void withdrawal();
}
