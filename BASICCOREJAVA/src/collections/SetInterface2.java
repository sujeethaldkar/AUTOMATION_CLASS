package collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetInterface2 {

	public static void main(String[] args) 
	{
	Set<String> set= new LinkedHashSet<>();
	set.add("anand");
	set.add("bhayre");
	set.add("techbodhi");
	set.add("pune");
	set.add("anand");
	
	for(String s:set)
	{
		System.out.println(s);
		
	}
	
	
	}

}
