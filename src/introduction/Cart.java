package introduction;


import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Cart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(5));
		
		
		String[] itemsNeeded = {"Cucumber","Brocolli","Beetroot","Carrot"};
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		
		addItems(driver,itemsNeeded);
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promocode")));
		driver.findElement(By.cssSelector(".promocode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector(".promoBtn")).click();
		
		//explicit wait
		
		//WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(5));
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoInfo")));
		
		System.out.println( driver.findElement(By.cssSelector(".promoInfo")).getText());
		
				

	}
	
	
	public static void addItems(WebDriver driver,String[] itemsNeeded)
	
	{
		int j =0;
       List<WebElement> products= driver.findElements(By.cssSelector("h4.product-name"));
		
		for (int i=0;i<products.size();i++)
			
		{
			
			String[] name = products.get(i).getText().split("-");
			String formattedName= name[0].trim();
			//format it to get actual vegetable name
			
			//convert array into array list for easy search
			//check whether name u extracted is present in arraylist or not
			
			List itemsNeededList = Arrays.asList(itemsNeeded);
			
			
			if ( itemsNeededList.contains(formattedName))
				
			{
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
				if(j==itemsNeeded.length)
				{
					break;
				}
				
				
				
			}
			
			
			
		}

		
		
		
	}

}
