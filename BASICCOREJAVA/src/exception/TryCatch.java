package exception;

import java.util.Hashtable;

public class TryCatch {

	public static void main(String[] args) 
	{
try
{
	//Arithmetic exception
	int a=10;
	int b=5;
	System.out.println(a/b);
	
	//Null pointer exception
	Hashtable<String, String> table= new Hashtable<String, String>();
	//table.put(null, "anand");
	//System.out.println(table.get(null));
	
	//StringIndexOutofBoundException
	
	String str="A";
	System.out.println(str.charAt(1));

	Thread.sleep(5000);
	
	
}catch(ArithmeticException e)
{
System.out.println("Fail : Divident is zero");	
}
catch(NullPointerException e)
{
System.out.println("You have passed Null key in Hashtable");	
}
catch(RuntimeException e)
{
System.out.println("RunTime exception or unchecked exception");	
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
System.out.println("Anand");
	
	}

	}


