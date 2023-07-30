package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LetCodeLogin 
{
	
	public WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        // Set the path to the ChromeDriver executable
    	System.setProperty("webdriver.chrome.driver", "./Web-Drivers/chromedriver.exe");
   
        // Initialize ChromeDriver
    	WebDriver driver = new ChromeDriver();
        
        // Optional: Maximize the browser window
        driver.manage().window().maximize();
        
        //Open the URL
        driver.get("https://letcode.in/");
        
        //Click on Login
        driver.findElement(By.linkText("Log in")).click();
        Thread.sleep(3000);
        
        //Enter Login Credentials
        driver.findElement(By.name("email")).sendKeys("******@gmail.com");
        driver.findElement(By.name("password")).sendKeys("*******");
        Thread.sleep(3000);
        
        //Click on login
        driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
        Thread.sleep(5000);
        
        driver.close();
    }
}
