package JavaBankApplication;

// ************************************************************************
// Account.java	  Template created on15.9.2016
// - The class for Account objects
// ************************************************************************
public class Account {
	// Fields

private String accountNumber;
private double balance;
public Account(String accountNumber, double balance) {
	super();
	this.accountNumber = accountNumber;
	this.balance = balance;
}
public String getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(String accountNumber) {
	this.accountNumber = accountNumber;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}

public String toString() {
	return  accountNumber + " " + balance;
	}
public <accountNumber> Account(accountNumber String) {
	
}
public void deposit(double amount) {
}
public boolean withdrow (double amount) {
	return false;	
}


}
// End