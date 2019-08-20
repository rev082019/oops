package polymorphism.overloading;
class Bank {
	
	public void deposit() {
		System.out.println("Parent - deposit");
	}
}
class IciciBank extends Bank {
	
	@Override
	public void deposit() {
		System.out.println("Icici - deposit");
	}
}

public class OverridingExample {


	public static void main(String[] args) {

		IciciBank iciciBank = new IciciBank();
		iciciBank.deposit();
	}

}
