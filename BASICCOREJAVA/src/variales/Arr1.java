package variales;

public class Arr1 {

	public static void main(String[] args) {
		
		String[] std= new String[6];
std[0]="abc";
std[1]="xyz";
std[2]="Vishal";
std[3]="Kamlesh";
std[4]="Rakhi";
std[5]="Shubhangi";

	/*System.out.println(std[0]);
	System.out.println(std[1]);
	System.out.println(std[2]);
	System.out.println(std[3]);
	System.out.println(std[4]);
	System.out.println(std[5]);*/
	System.out.println(std.length);
	
	for(int i=0; i<std.length; i++)
	{
		System.out.println(i);
	}
	}
	

}
