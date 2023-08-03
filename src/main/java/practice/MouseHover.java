package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./Web-Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement hover =driver.findElement(By.id("nav-link-accountList"));
		
		Actions builder = new Actions(driver);
		builder.moveToElement(hover).perform();
		
		driver.findElement(By.xpath("//a[@rel='nofollow']//span[text()='Sign in']")).click();
		
		driver.quit();
	}

}
