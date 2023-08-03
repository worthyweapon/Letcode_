package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SignOut {
	public static WebDriver driver;

	public static void main(String[] args) 
	{
		SignOut out = new SignOut();
		out.signout();
	}
	
	public void signout()
	{
		WebElement Accounts =driver.findElement(By.id("nav-link-accountList"));
		Actions builder = new Actions(driver);
		builder.moveToElement(Accounts).perform();
		driver.findElement(By.id("nav-item-signout")).click();
	}

}
