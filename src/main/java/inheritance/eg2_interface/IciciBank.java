package inheritance.eg2_interface;

public class IciciBank implements Bank{

	public void withdrawal() {
		System.out.println("Icici - withdrawal");
	}

	public void deposit() {
		System.out.println("Icici - deposit");
	}
}
