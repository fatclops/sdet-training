package oop;

public class BankAccount implements IRate {
	
	// Define variables
	String accountNumber;
	
	// static >> belongs to the CLASS and not the object instance
	// final >> constant - often seen as static final
	private static final String routingNumber = "202545";
	private String name;
	private String ssn;
	String accountType;
	double balance = 0;
	
	// Constructor definitions: unique methods
	// 1. Used to define/setup or initialize properties of an object. 
	// 2. Constructors are IMPLICITLY called upon instantiation
	// 3. The same name as the class itself
	// 4. Constructors have no return type
	
	BankAccount() {
		System.out.println("NEW ACCOUNT CREATED");
	}
	
	// Overloading: call same method name with different arguments
	BankAccount(String accountType) {
		System.out.println("NEW ACCOUNT: " + accountType);
	}
	
	BankAccount(String accountType, double initDeposit) {
		// InitDeposit, accountType and Msg are all local variables
		System.out.println("NEW ACCOUNT: " + accountType);
		System.out.println("Initial Deposit of $" + initDeposit);
		String Msg = null;
		if(initDeposit < 1000) {
			Msg = "ERROR: minimum deposit must be at least $1000";
		} else {
			Msg = "Thanks for your deposit of: $" + initDeposit;
		}
		System.out.println(Msg);
		balance = initDeposit;
	}
	
	// Getters / Setters
	
	// Allow user to define the name
	public void setName(String name) {
		this.name = "Mr. " + name;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	
	// Interface Methods
	
	public void setRate() {
		System.out.println("SETTING RATE");
	}
	
	public void increaseRate() {
		System.out.println("INCREASING RATE");
	}
	
	
	// Define Methods
	
	void deposit(double amount) {
		balance = balance + amount;
		showActivity("DEPOSIT");
	}
	
	void withdrawl(double amount) {
		balance = balance + amount;
		showActivity("WITHDRAW");
	}
	
	// Private: Can only be called from within the class
	private void showActivity(String activity) {
		System.out.println("YOUR RECENT ACTIVITY: " + activity);
		System.out.println("YOUR NEW BALANCE IS: $" + balance);
	}
	
	void checkBalance() {
		System.out.println("Balance :" + balance);
	}
	
	void getStatus() {
		
	}
	
	@Override
	// This means when we call the toString method we'll get this one instead 
	// Of the built in toString method
	
	public String toString() {
		return "NAME: " + name + ". ACCOUNT# " + accountNumber + ". ROUTING# " + routingNumber + ". BALANCE: $" + balance + " ]";
	}
	
}
