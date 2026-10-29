package constructorsInJava;
// Question8.Create a class BankAccount with fields accountHolder and balance.Initialize them using a constructor and display 
//the account details.  

public class BankAccount {
	String accountHolder="Shradha";
	double balance=450000.0;
	public BankAccount() {
		System.out.println("Account holder name : " +accountHolder);
		System.out.println("Account balace : " +balance);
	}
	public static void main(String[] args) {
		BankAccount ac=new BankAccount();
	}

}
