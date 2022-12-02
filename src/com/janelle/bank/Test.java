package com.janelle.bank;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Account janelleAccounts = new Account();
        Account samAccounts = new Account();
        
        
        janelleAccounts.depositSaving(5102050.00);
        janelleAccounts.depositChecking(43020.00);
        janelleAccounts.withdrawChecking(30.00);
        
        
        
        samAccounts.depositSaving(43020.00);
        samAccounts.depositChecking(20000.00);
        samAccounts.withdrawChecking(30000.00);
        
        
        System.out.println(janelleAccounts.getSavingAccount());
        System.out.println(janelleAccounts.getCheckingAccount()); 
        System.out.println(samAccounts.getSavingAccount());
        System.out.println(samAccounts.getCheckingAccount());
        System.out.println(janelleAccounts.getcheckingSavings());
        System.out.println(Account.getTotalMoney());
      
	    
	}

}
