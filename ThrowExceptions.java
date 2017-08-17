import javax.naming.InsufficientResourcesException;

public class ThrowExceptions {

	public static void main(String[] args) {
		BankAccountThrowExceptions b = new BankAccountThrowExceptions(1234,500);
				try{
					b.withdraw(1000);
				}catch(InsufficientResourcesException e){
					System.out.println("Got Exception");
					double bal = b.getBalance();
					System.out.println("Current Balance is  "+ bal);
				}
	}

}
