package practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ScreenshotUsingMethod 
{
WebDriver driver;
//ChromeDriver driver;
	public void LaunchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "./Web-Drivers/chromedriver.exe");
		//driver = new ChromeDriver();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/buttons");
	}
	
	public void TakeSS() throws IOException
	{
		//Using Typecast converting WebDriver object to TakesScreenshot
		TakesScreenshot screenshot = (TakesScreenshot) driver;
			//ChromeDriver driver; - If we using this instead of WebDriver driver we don't need to typecast it
			//TakesScreenshot screenshot = driver;
/*But we will never use this in script instead we will use this(WebDriver driver)
* Because if we are using it as chromeDriver driver we will need to change it everytime to test in other browser.
* We can use this with switch case still we don't prefer this much
*/
		File from = screenshot.getScreenshotAs(OutputType.FILE);
		File to = new File("./Snap/img6.png");
		FileHandler.copy(from, to);
	}
 
	public static void main(String[] args) throws IOException 
	{
		ScreenshotUsingMethod ss = new ScreenshotUsingMethod();
		ss.LaunchBrowser();
		ss.TakeSS();
	}
}

//https://www.guru99.com/take-screenshot-selenium-webdriver.html - Reference
