package week1;

public class Account {
	private String name;
	private double balance;
	
	public Account() {
		name = "";
		balance = 0;
	}
	
	public Account(String n, double d) {
		name = n;
		balance = d;
	}
	
	public String getName() {
		return name;
	}
	

	public double checkBalance() {
		return balance;
	}
	
	public void deposit(double d) {
		balance += d;
	}
	
	public void withdraw(double d) {
		if(balance - d >= 0) {
			balance -= d;
		}
	}
}
