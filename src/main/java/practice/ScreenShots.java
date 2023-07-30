package practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class ScreenShots {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "./Web-Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://letcode.in/buttons");
		
	//Take Screenshot 1
		File from = driver.getScreenshotAs(OutputType.FILE);
		File to = new File("./Snap/img1.png");
		FileHandler.copy(from, to);
		
	//Take Screenshot 2
		//FileHandler.copy(driver.getScreenshotAs(OutputType.FILE), new File("./Snap/img2.png"));

	//Take screenshot of a particular element 1
		//File from1 = driver.findElement(By.id("position")).getScreenshotAs(OutputType.FILE);
		//File to2 = new File("./Snap/img3.png");
		//FileHandler.copy(from1, to2);
		
	//Take screenshot of a particular element 2
		WebElement ele = driver.findElement(By.id("position"));
		File from1 = ele.getScreenshotAs(OutputType.FILE);
		File to2 = new File("./Snap/img4.png");
		FileHandler.copy(from1, to2);
		
		driver.close();
	}

}
