package Testing.BankAccount;

public class Account {
	private double balance;
	private double minimumBalance;
	private boolean isActive = true;
	private String holderName;

	public void setActive(boolean active) {
		isActive = active;
	}

	public boolean getActive() {
		return this.isActive;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public String getHolderName() {
		return this.holderName;
	}

	public Account(double balance, double minimumBalance){
		this.balance = balance;
		this.minimumBalance = minimumBalance;
	}

	public double getBalance() {
		return balance;
	}

	public double getMinimumBalance() {
		return minimumBalance;
	}

	public double withdraw(double amount){
		if(this.balance - amount > this.minimumBalance){
			this.balance -= amount;
			return this.balance;
		}
		throw new RuntimeException("Amount should be greater than Minimum Balance!");
	}

	public double deposit(int amount){
		if(amount > 0) {
			return balance += amount;
		}
		throw new RuntimeException("Amount should not be less than zero!");
	}
}