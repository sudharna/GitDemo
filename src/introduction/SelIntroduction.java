package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//chrome	
	/*System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();*/
	
	//firefox
	
	/*System.setProperty("webdriver.gecko`.driver", "C:\\geckodriver-v0.33.0-win64\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();*/
	
	//edge
	System.setProperty("webdriver.edge.driver", "C:\\edgedriver_win64\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	
	
	driver.get("https://rahulshettyacademy.com");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());	
	driver.close();
	driver.quit();

	}

}
