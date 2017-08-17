import javax.naming.InsufficientResourcesException;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;

public class BankAccountThrowExceptions extends Base {
	
	protected int accountNumber;
	protected double balance;
	protected boolean accountStatus;
	
	public BankAccountThrowExceptions(int i, int j) {
		// TODO Auto-generated constructor stub
	}

	public void BankAccountWithException (int accountNumber,double balance){
		this.accountNumber = accountNumber;
		this.balance = balance;
		
		
	}
 
	public void deposite(double amount){
	balance = balance + amount;
	
	}
	public void withdraw(double amount) throws InsufficientResourcesException{
	if (balance > amount){
		 balance = balance - amount;
	} else {
		InsufficientResourcesException ibalance = new InsufficientResourcesException("You have insufficient Balance");
	
				throw ibalance;
		
	}
	}
	public double getBalance(){
		return balance;
	}
	public String toString(){
		String accountDetails = "Account No:" +accountNumber+ "Account Balance:" +balance;
		return accountDetails;
	}
}
