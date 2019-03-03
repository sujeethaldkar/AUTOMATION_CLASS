package testing;

import variales.Acccessmodifiers;

public class TestFunctions extends Acccessmodifiers {

	public static void main(String[] args) 
	{
		Acccessmodifiers obj= new Acccessmodifiers();
		obj.publicMethod();
		
		TestFunctions fun= new TestFunctions();
		fun.protectedMethod();
		
	}

}
