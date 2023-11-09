package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@minlength='2']")).sendKeys("Sudharna");
		driver.findElement(By.name("email")).sendKeys("sudharna1965@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("aashsudharna");
		driver.findElement(By.id("exampleCheck1")).click();
		
		WebElement staticdropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown = new Select(staticdropdown);
	    dropdown.selectByIndex(1);
	    driver.findElement(By.id("inlineRadio1")).click();
	    driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("17/08/1995");
	    driver.findElement(By.xpath("//input[@value='Submit']")).click();
	    System.out.println( driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());

	}

}
