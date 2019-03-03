package collections;

import java.util.TreeSet;

public class SetInterface {

	public static void main(String[] args) 
	{
	
	//HashSet
/*HashSet<Integer> set=new HashSet<>();
set.add(10);
set.add(20);
set.add(20);
set.add(10);
	//it remove duplicate value
	for(int a:set)
	{
		System.out.println(a);
	}
	*/

	/*LinkedHashSet<Integer> set=new LinkedHashSet<>();
	set.add(10);
	set.add(20);
	set.add(20);
	set.add(10);
		//it remove given in same order as input value
		for(int a:set)
		{
			System.out.println(a);
		}
		
	*/
	
		TreeSet<Integer> set=new TreeSet<>();
		set.add(10);
		set.add(20);
		set.add(40);
		set.add(30);
			//it remove given sorted order
			for(int a:set)
			{
				System.out.println(a);
			}
			
	
	}

}
