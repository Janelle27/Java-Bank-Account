package com.janelle.bank;

public class Account {
//MEMBER VARIBLES
	private double checkingAccount;
	private double savingAccount;
	
// CLASS VARIBLE
	private static int totalAccounts = 0;
	private static double totalMoney = 0.0;
	
    	
//EMPTYCON
	public Account() {
		this(0.00 , 0.00);
		totalAccounts++;
	}
	
//FULLCON
 public Account(double checkingAccount, double savingAccount) {
		super();
		this.checkingAccount = checkingAccount;
		this.savingAccount = savingAccount;
		totalAccounts++;
		totalMoney += checkingAccount + savingAccount;
 }
// GETTERS & SETTERS + OTHER METHODS
	public void depositChecking( double amount) {
		 this.checkingAccount += amount;
		 Account.totalMoney += amount;	 
	}
	
	public void withdrawChecking(double amount) {
		if (amount <= checkingAccount ) {
			this.checkingAccount -= amount;
			Account.totalMoney -= amount;
			System.out.println("user withdraw" + amount);
		}
		else {
			System.out.println("not enough");
		}
	
	}
	
	public void withdrawSaving(double amount) {
		if (amount <= savingAccount ) {
			this.savingAccount -= amount ;
			Account.totalMoney -= amount;
			System.out.println("user withdraw" + amount);
		}
		else {
			System.out.println("not enough");
		}
	}
    public void depositSaving(double amount) {
    	this.savingAccount += amount ;
    	totalMoney += amount;
    }
	public void setCheckingAccount(double checkingAccount) {
		this.checkingAccount = checkingAccount;
	}
	
		public double getCheckingAccount() {
		return checkingAccount;
	}
	
	public double getSavingAccount() {
		return savingAccount;
	}
	
	public void setSavingAccount(double savingAccount) {
		this.savingAccount = savingAccount;
	}
	
	public static int getTotalAccounts() {
		return totalAccounts;
	}
	
	public static void setTotalAccounts(int totalAccounts) {
		Account.totalAccounts = totalAccounts;
	}
	
	public static double getTotalMoney() {
		return Account.totalMoney;
	}
	
	public void setTotalMoney(double totalMoney) {
		Account.totalMoney = totalMoney;
	}
	 
	public double getcheckingSavings() {
		return this.checkingAccount + this.savingAccount;
	}


 
}