package introduction;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calendar1 {



public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));


driver.get("https://www.path2usa.com/travel-companion/");		
Thread.sleep(2000);		
JavascriptExecutor js=(JavascriptExecutor)driver;		
js.executeScript("window.scrollBy(0,1200)");		
Thread.sleep(3000);		
driver.findElement(By.xpath("//input[@id='form-field-travel_comp_date']")).click();		
while(!driver.findElement(By.xpath("//div[@class='flatpickr-month']")).getText().contains("August"))
		
{			     
driver.findElement(By.xpath("//span[@class='flatpickr-next-month']")).click();		    
Thread.sleep(2000);		}
int count= driver.findElements(By.xpath("//span[@class='flatpickr-day ']")).size();
for(int i=0;i<count;i++)
{
String text=driver.findElements(By.xpath("//span[@class='flatpickr-day ']")).get(i).getText();
if(text.equalsIgnoreCase("26"))
{
// driver.findElements(By.cssSelector("td[class*='day']")).get(i).click();
driver.findElements(By.xpath("//span[@class='flatpickr-day ']")).get(i).click();
System.out.println(text);
break;
		     }
		}
		}
}