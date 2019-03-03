package variales;

public class Arr2 {

	public static void main(String[] args) {
		String[][] str= new String[2][4];

		///Row1
		str[0][0]="Sujeet";
		str[0][1]="Haldkar";
		str[0][2]="Accelya";
		str[0][3]="Pune";
		//Row2
		
		str[1][0]="Rohit";
		str[1][1]="Kashyap";
		str[1][2]="Wipro";
		str[1][3]="Pune";
	
		for(int r=0; r<str.length; r++)
		{
			for(int c=0; c<str[r].length; c++)
			{
				System.out.println(str[r][c]);
			}
		}

	}

}
