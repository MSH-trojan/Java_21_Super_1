package driver_2;

class InterestBearingAccount extends Account{
	private static double default_interest = 7.95;
	private double interest_rate;
	
	public InterestBearingAccount(double amount, double interest) {
		super(amount);
		interest_rate = interest;
	}
	
	public InterestBearingAccount(double amount) {
		balance = amount;
		interest_rate = default_interest;
	}
	
	public void add_monthly_interest() {
		balance = balance + (balance * interest_rate/100)/12;
	}
}



class Account{
	protected double balance;
	
	public Account(double amount){
	
	balance = amount;
	}
	public Account() {
		balance = 0.0;
}	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public double withdraw(double amount) {
		if(balance >= amount) {
			balance -= amount;
			return amount;
		}
		else
			return 0.0;
	}
	
	public double getBalance() {
		return balance;
	}
}

public class Driver2 {
	public static void main(String[] args) {
		InterestBearingAccount ac1 = new InterestBearingAccount(1000.0 , 5.0);
		ac1.add_monthly_interest();
		ac1.withdraw(100.0);
		System.out.println("balance = " + ac1.getBalance());
	}
}

