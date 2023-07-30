package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingInputs {

	public static void main(String[] args) throws InterruptedException 
	{
		// Set the path to the ChromeDriver executable
		System.setProperty("webdriver.chrome.driver", "./Web-Drivers/chromedriver.exe");
	
		// Initialize ChromeDriver
		WebDriver driver = new ChromeDriver();
		
		//Open the URL
		driver.get("https://letcode.in/edit");
		
		//Maximize the browser window
		driver.manage().window().maximize();
		
		//Enter Text
		driver.findElement(By.id("fullName")).sendKeys("Subha");
		
		//Append Text(add something to the end of a written document)
		driver.findElement(By.id("join")).sendKeys(" person", Keys.TAB);
		
		//Get the value of the input box
		String getValue = driver.findElement(By.id("getMe")).getAttribute("value");
		System.out.println("Value : " + getValue);
		
		//Clear the Text
		driver.findElement(By.id("clearMe")).clear();
		
		//Confirm edit field is disabled
		boolean check = driver.findElement(By.id("noEdit")).isEnabled();
		System.out.println("Confirm edit field is disabled : " + check);
		
		Thread.sleep(3000);
		driver.close();
	}
	
	

}
