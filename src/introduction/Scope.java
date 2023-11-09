package introduction;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//1. give count of links on the page
		System.out.println( driver.findElements(By.tagName("a")).size());
		
		//2. to get count of no. of links in the footer section only
		
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));// limiting webdriver scope
		
		System.out.println( footerdriver.findElements(By.tagName("a")).size());
		
		//3. count no. of links only in the frst column of footer
		
	 WebElement columndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
	 
	 System.out.println (columndriver.findElements(By.tagName("a")).size());
	 
	 //4. click on each link in the column and check if the pages are opening
	 
	 for (int i=1;i<columndriver.findElements(By.tagName("a")).size();i++)
		 
	 {
		String clickonlinkTab =  Keys.chord(Keys.CONTROL,Keys.ENTER);
		 columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
		 Thread.sleep(5000L);
		 
		 	
		 
	 }
	 
	 Set<String> windows =  driver.getWindowHandles();
	 
	Iterator<String> it= windows.iterator();
	
	while(it.hasNext())
	{
		
		driver.switchTo().window(it.next());
		
		System.out.println (driver.getTitle());
	}
		 
		 
		 

	}

}
