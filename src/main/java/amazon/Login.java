package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Login extends SignOut{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./Web-Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		//Mouse Hover -Hello, Sign in
		WebElement Accounts =driver.findElement(By.id("nav-link-accountList"));
		Actions builder = new Actions(driver);
		builder.moveToElement(Accounts).perform();
		
		//Click on Sign in button
		driver.findElement(By.xpath("//a[@rel='nofollow']//span[text()='Sign in']")).click();
		
		//Enter Email id and Continue
		WebElement Email = driver.switchTo().activeElement();
		Email.sendKeys("sub*****@gmail.com", Keys.ENTER);
		
		//Enter password and Continue
		driver.findElement(By.id("ap_password")).sendKeys("S******");
		driver.findElement(By.id("signInSubmit")).click();
		
		//Amazon dashboard
		driver.findElement(By.id("a-page")).isDisplayed();
		
		//Signout
		Login sign_out = new Login();
		sign_out.signout();
		
		driver.quit();
	}

}
