package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("checkBoxOption3")).click();
		String option = (driver.findElement(By.xpath("//label[@for = 'honda']")).getText());
		
		WebElement staticdropdown =  driver.findElement(By.id("dropdown-class-example"));
		
		
		Select dropdown = new Select(staticdropdown);
		
		dropdown.selectByVisibleText(option);
		
		driver.findElement(By.id("name")).sendKeys(option);
		driver.findElement(By.id("alertbtn")).click();
	String alert = 	driver.switchTo().alert().getText();
	
	if(alert.contains(option))
	{
		System.out.println ("verified!!");
	}

	}

}
