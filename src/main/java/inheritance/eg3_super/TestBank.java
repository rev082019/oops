package inheritance.eg3_super;


class Bank {
	protected int balance;
	public Bank(int balance) {
		this.balance = balance;
	}
	public void withdrawal(int amount) {
		this.balance = balance - amount;
	}
	
	public int getBalance() {
		return balance;
	}
}

class IciciBank extends Bank {

	public IciciBank(int balance) {
		super(balance);
	}
	
	@Override
	public void withdrawal(int amount) {
		super.withdrawal(amount);  // Using super keyword we can call parent class method
		this.balance = this.balance - 10; // Rs.10 withdrawal fee
	}
	
	
}

class CanaraBank extends Bank {

	public CanaraBank(int balance) {
		super(balance);
	}
	
	@Override
	public void withdrawal(int amount) {
		super.withdrawal(amount);
		this.balance = this.balance - 5; // Rs.5 withdrawal fee
	}	
	
}

public class TestBank {

	public static void main(String[] args) {

		Bank bank1 = new IciciBank(1000);
		bank1.withdrawal(100);
		System.out.println("Icici:" + bank1.getBalance());
		
		Bank bank2 = new CanaraBank(1000);
		bank2.withdrawal(100);
		System.out.println("Canara:" + bank2.getBalance());
		
	}

}
