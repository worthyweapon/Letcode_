package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingButtons {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./Web-Drivers/chromedriver.exe");
		ChromeDriver driver  = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://letcode.in/buttons");
		
		//Get the color of an element
		System.out.println(driver.findElement(By.id("color")).getCssValue("background-color"));
			//findElement returns WebElement
			//getcssValue returns String
		
		//Confirm button is disabled
		System.out.println(driver.findElement(By.id("isDisabled")).isEnabled());
		
		driver.quit();
	}
	
	

}
