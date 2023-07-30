package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) throws InterruptedException 
	{
		// Set the path to the ChromeDriver executable
		System.setProperty("webdriver.chrome.driver", "./Web-Drivers/chromedriver.exe");
		
		// Initialize ChromeDriver
		WebDriver driver = new ChromeDriver();
		
		//Maximize the browser window
		driver.manage().window().maximize();
		
		//Open the URL
		driver.get("https://letcode.in/buttons");
		String Initial_URL = driver.getCurrentUrl();
		System.out.println("The user is in : " + Initial_URL);
		Thread.sleep(2000);
		
		//Go to Home
		driver.findElement(By.id("home")).click();
		String Home_URL = driver.getCurrentUrl();
		System.out.println("The user has clicked on home button : " + Home_URL);
		Thread.sleep(2000);
		
		//Come back here using navigate command
		driver.navigate().back();
		String Navigate_Back = driver.getCurrentUrl();
		System.out.println("The user has navigated back to the initial URL : " + Navigate_Back);
		Thread.sleep(2000);
		
		//Go forward using navigate command
		driver.navigate().forward();
		String Navigate_forward = driver.getCurrentUrl();
		System.out.println("The user has navigated forward : " + Navigate_forward);
		Thread.sleep(2000);
		
		//Refresh the current page
		driver.navigate().refresh();
		System.out.println("The page is refreshed");
		Thread.sleep(2000);
		
		//Navigate to chatgpt
		driver.navigate().to("https://chat.openai.com/");
		String Navigate_To = driver.getCurrentUrl();
		System.out.println("The user has navigated to : " + Navigate_To);
		
		Thread.sleep(2000);
		driver.close();
	}
}
