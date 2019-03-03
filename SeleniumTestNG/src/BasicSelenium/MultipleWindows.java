package BasicSelenium;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sujeet\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 ChromeDriver dr = new ChromeDriver();
		 
		 dr.manage().window().maximize();
		 dr.get("https://www.naukri.com/");
		// dr.close();
	//dr.quit();
String parent=dr.getWindowHandle();
System.out.println(parent);
Set<String> wins=dr.getWindowHandles();
for(String s:wins)
{
	//System.out.println(s);
	dr.switchTo().window(s);
	if(!s.equals(parent))
	{
		dr.close();
	}
}
	}

}
