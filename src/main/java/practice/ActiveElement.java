package practice;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiveElement {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./Web-Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		
		//ActiveElement - switches to the active element of the page
		WebElement active = driver.switchTo().activeElement();
		active.sendKeys("****@gmail.com", Keys.TAB, "1q2w3e4r", Keys.ENTER);
		//Entering gmail id, Doing keyboard action TAB to move to next active element, Do enter
	}

}
