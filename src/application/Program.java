package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		

		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		// Upcasting
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);
		
		// Downcasting
		
		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(100.00);
		
		// BusinessAccount acc5 = (BusinessAccount) acc3;
		
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(500.00);
			System.out.println("Loan!!");
		}
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update!!");
		}
		
		Account accc = new Account(2001, "Alex", 1000.0);
		accc.withdraw(200.0);
		System.out.println(accc.getBalance());
		
		Account accc2 = new SavingsAccount(2002, "Maria", 1000.0, 0.01);
		accc2.withdraw(200.0);
		System.out.println(accc2.getBalance());
		
		Account accc3 = new BusinessAccount(2003, "Bob", 1000.0, 500.0);
		accc3.withdraw(200.0);
		System.out.println(accc3.getBalance());
		
		Account x = new Account(1020, "Alex", 1000.0);
		Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
		x.withdraw(50.0);
		y.withdraw(50.0);
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
 
	}

}
