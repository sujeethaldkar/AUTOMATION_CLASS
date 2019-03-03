package collections;

import java.util.HashMap;
import java.util.Set;

public class MapInterface {

	public static void main(String[] args) 
	{
HashMap<String, Integer> map=new HashMap<String, Integer>();
map.put("Anand", 30964);
map.put("Sujeet", 605954);
map.put("Vishal", 12345);
map.put(null,4235);
map.put("Anand", 3034);
Set<String> set=map.keySet();
for(String key:set)
{
System.out.println(map.get(key));	
}

//System.out.println(map.get("Anand"));
//System.out.println(map.get(null));

/*Hashtable<String, String> map2= new Hashtable<String, String>();
map2.put("Sujeet", "onesujeet@gmail.com");
map2.put("Shiva", "shivat@gmail.com");
map2.put("Rohit", "rohitk@wipro.com");
map2.put(null, "sdaj@dfjdf.com");
//System.out.println(map2.get("Sujeet"));
System.out.println(map2.get(null));
*/	}

}
