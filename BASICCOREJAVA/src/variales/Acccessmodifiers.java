package variales;

public class Acccessmodifiers {

	public static void main(String[] args) 
	
	{
		Acccessmodifiers obj = new Acccessmodifiers();
		obj.publicMethod();
		obj.privatemethod();
		obj.noAccessModMethod();
		obj.protectedMethod();
	}
public void publicMethod()
{
System.out.println("PublicMethod");	
}
	
private void privatemethod()
{
System.out.println("PrivateMethod");	
}
void noAccessModMethod()
{
System.out.println("noAccessModMethod");	
}

protected void protectedMethod()
{
System.out.println("protectedMethod");	
}
}
