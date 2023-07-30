package practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class HandlingFrame {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "./Web-Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://letcode.in/frame");
		
				//Frame 1
		//Switching to Frame (Frame is an example of method overloading)
		driver.switchTo().frame("firstFr");
		
		driver.findElement(By.name("fname")).sendKeys("Subhashini");
		driver.findElement(By.name("lname")).sendKeys("C");
		
		
				//Frame 2
		WebElement F2 = driver.findElement(By.xpath("//iframe[@src=\"innerFrame\"]"));
		driver.switchTo().frame(F2);
		driver.findElement(By.name("email")).sendKeys("worthyweapon@gmail.com");
		
		
				//Default Frame
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()=\"Watch tutorial\"]")).click();
		File from = driver.getScreenshotAs(OutputType.FILE);
		File to = new File("./Snap/img7.png");
		FileHandler.copy(from, to);
		
		Thread.sleep(2000);
		
		driver.quit();
	}

}
