package chapter2;

public class Account{

	private String name;
	private double balance;
	private double deposit;

	public Account(String name, double balance){
		this.name = name;
		if (balance > 0.00){
			this.balance = balance;
		}
	}

	public void deposit(double depositAmount){
		balance += depositAmount;
	}


	public double getBalance(){
		return balance;
	}


	public void setName(String sarah){
		this.name = name;
	}

	public String getName(){
		return name;
	}


}