package oop;

public class BackAccountApp {

	public static void main(String[] args) {
		// Creating a new account - this instantiates the object
		
		BankAccount acc1 = new BankAccount();
		
		// acc1.name = "Roger hue";
		// with Encapsulation: Public API Methods
		acc1.setName("Roger Hue");
		System.out.println(acc1.getName());
		acc1.setSsn("321321321");
		System.out.println("SSN: " + acc1.getSsn());
		
		
		acc1.accountNumber = "0123456789";
		acc1.balance = 10000;
		acc1.setRate();
		acc1.increaseRate();
		
		acc1.deposit(1500);
		
		// Polymorphism through overriding
		System.out.println(acc1.toString());
		
		// Polymorphism through overloading	
		BankAccount acc2 = new BankAccount("Checking Account");
		acc2.accountNumber = "9879879875";
		
		BankAccount acc3 = new BankAccount("Savings Account", 5000);
		acc3.accountNumber = "6543219875";
		
		
		/*
		
		acc3.checkBalance();
		
//		System.out.println(acc1.routingNumber);
//		System.out.println(acc2.routingNumber);
//		System.out.println(acc3.routingNumber);
		
		// Demo for inheritance
		CDAccount cd1 = new CDAccount();
		cd1.balance = 3000;
		cd1.interestRate = "4.5";
		cd1.name = "Juan";
		cd1.accountType = "CD Account";
		System.out.println(cd1.toString());
		*/
		
	}

}
