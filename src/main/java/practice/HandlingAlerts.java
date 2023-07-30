package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Web-Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		 driver.manage().window().maximize();
		 driver.get("https://letcode.in/alert");
		 
		 //To accept the alert
		 driver.findElement(By.id("accept")).click();
		 Alert simple_alert = driver.switchTo().alert();
		 	//Alert is an interface in Java
		 String simple_alert_msg= simple_alert.getText();
		 System.out.println(simple_alert_msg);
		 simple_alert.accept();
		 
		 //To dismiss
		 driver.findElement(By.id("confirm")).click();
		 driver.switchTo().alert().dismiss();
		 System.out.println("Dismissed Alerts");
		 
		 //Prompt alert
		 driver.findElement(By.id("prompt")).click();
		 driver.switchTo().alert().sendKeys("Subhashini");
		 simple_alert.accept();
		 String get_name = driver.findElement(By.id("myName")).getText();
		 System.out.println(get_name);
		 
//Exception - UnhandledAlertException
		 //driver.findElement(By.id("confirm")).click();
		 		//Once the button is clicked the alert will come up
		 //System.out.println(driver.getCurrentUrl());
		 		//Trying to perform an action when the alert is open
		 //driver.switchTo().alert().dismiss();
		 
//Exception - NoAlertPresentException
		 //driver.switchTo().alert().dismiss();
		 		//There is no alert but driver is trying to switch to alert and dismiss
		 //driver.findElement(By.id("confirm")).click();
		  
		 driver.quit();
	}

}
