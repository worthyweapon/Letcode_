package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Web-Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement Right_Click = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		//Right click
		Actions builder = new Actions(driver);
		builder.contextClick(Right_Click).perform();
		
		driver.findElement(By.xpath("//ul//li//span[text()='Edit']")).click();
		
		//Alert
		Alert accept = driver.switchTo().alert();
		accept.accept();
		
		//Double Click
		WebElement Double_Click = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		builder.doubleClick(Double_Click).perform();
		
		driver.switchTo().alert();
		accept.accept();
		
		Thread.sleep(2000);
	}

}
