package inheritance.eg1_abstractclass;

public class TestBank {

	public static void main(String[] args) {

		//You cannot create an object for abstract class
		//Bank bank = new Bank();
		
		Bank bank = new IciciBank();
		bank.deposit();
		bank.withdrawal();
		
		Bank bank2 = new CanaraBank();
		bank2.deposit();
		bank2.withdrawal();
	}

}
