package introduction;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
				
				System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				
				String password=getPassword(driver);
				driver.get("https://rahulshettyacademy.com/locatorspractice/");
				driver.findElement(By.id("inputUsername")).sendKeys("Sudharna");
		        driver.findElement(By.name("inputPassword")).sendKeys(password);
		        driver.findElement(By.className("signInBtn")).click();
		        Thread.sleep(2000);
		        System.out.println(driver.findElement(By.tagName("p")).getText());
		        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		        driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		        driver.quit();

	}

	
	public static String getPassword(WebDriver driver) throws InterruptedException
	
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		
		String passwordText = driver.findElement(By.cssSelector("form p")).getText();
		String passwordArray[] = passwordText.split("'");
		String passwordArray1[]= passwordArray[1].split("'");
		String password = passwordArray1[0];
		return password;
		
		
		
		
		
		
	}
}
