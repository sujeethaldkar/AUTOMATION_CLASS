package string;

public class StringFunctions {

	public static void main(String[] args) {

String name= "  anand  ";
String name2= "Anand";
String name3= "Anand$Bhayre$TechBodhi$Pune";
String name4= "AnandVishalBhayreVishalTechbodhiVishalPune";

//int count = name.length() - name.replace("a", "").length();
System.out.println(name.length() - name.replace("a", "").length());


//Split

String[] str=name4.split("Vishal");

for(String s:str)
{
System.out.println(s);	
}

//Replace
System.out.println(name.replace('a', 'c'));
System.out.println(name3.replace("$", " "));
System.out.println(name4.replace("Vishal", " Vikas "));


//Substring
System.out.println(name3.substring(6));
System.out.println(name3.substring(0, 5));

//trim
System.out.println(name);
System.out.println(name.length());
System.out.println(name.trim());
//Equals and Equalsignorecase
System.out.println(name.equals(name2));
System.out.println(name.equalsIgnoreCase(name2));

//1. length
int I= name.length();
System.out.println(I);
	
	//2.length
char c=name.charAt(0);
System.out.println(c);


	
	}

	private static void characterCount(String string) {
		// TODO Auto-generated method stub
		
	}

}
