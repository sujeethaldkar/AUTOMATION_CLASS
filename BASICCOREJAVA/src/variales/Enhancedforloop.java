package variales;

public class Enhancedforloop {

	public static void main(String[] args) 
	{
	
		int[] arr= {10,20,30,40,50,60,70};
		
		/*for(int i=0; i<arr.length; i++)
			System.out.println(arr[i]);		
		*/
		for(int i:arr)
		{
			
			System.out.println(i);
		
			String[] str= {"abc", "xyz", "pqr"};
			for(String s:str)
				
			{
				System.out.println(s);
				
			}
		}
	}

}
