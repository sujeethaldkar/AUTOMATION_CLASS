package oops.abstraction;

public class User2 {

	public static void main(String[] args) 
	{
		RBI ref;
				
		
	ref= new HDFC();
	ref.creditcard();
	ref.debitcard();
	ref.cuurrentAcc();
	ref.savingsAcc();
	
	ref= new SBI();
	ref.creditcard();
	ref.debitcard();
	ref.cuurrentAcc();
	ref.savingsAcc();
	
	ref= new CITY();
	ref.creditcard();
	ref.debitcard();
	ref.cuurrentAcc();
	ref.savingsAcc();
	}

}
