package files.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

	public static void main(String[] args )
			
			
			{
		//fun1();
			}
	/*{
	Properties or=new Properties();
	FileInputStream file= new FileInputStream("C:\\Codebase\\BASICCOREJAVA\\src\\files\\properties\\ObjectRepositery.properties");

	
	or.load(file);
	
	System.out.println(or.getProperty("url"));
	System.out.println(or.getProperty("username1"));
	
	}
*/	
	public static void fun1() throws IOException
	{
		
		Properties or=new Properties();
		FileInputStream file= new FileInputStream("C:\\Codebase\\BASICCOREJAVA\\src\\files\\properties\\ObjectRepositery.properties");

		
		or.load(file);
		
		System.out.println(or.getProperty("url"));
		System.out.println(or.getProperty("username"));
			
	}

}
