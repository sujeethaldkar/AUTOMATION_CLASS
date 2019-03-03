package oops.abstraction;

public class User {

	public static void main(String[] args) 
	{
		RBI ref=null;
		
		String name=bankName();
		
		if(name.equals("SBI")){
			ref= new SBI();
		} else if (name.equals("HDFC")) {
			ref= new HDFC();
		} else if (name.equals("CITY")) {
			ref= new CITY();
		}
		//Bank Services = Script Selenium
		ref.creditcard();
		ref.debitcard();
		ref.cuurrentAcc();
		ref.savingsAcc();
		}
public static String bankName()
{
return "SBI";	
}
	
}
