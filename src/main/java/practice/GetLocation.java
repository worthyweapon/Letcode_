package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Web-Drivers/chromedriver.exe");
		ChromeDriver driver  = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://letcode.in/buttons");
		
		//Get the X & Y co-ordinates
		System.out.println(driver.findElement(By.id("position")).getLocation());
		
		/*
		 * WebElement x_y = driver.findElement(By.id("position"));
		 	* FindElement will be stored in WebElement. 
		 	* The WebElement here is an interface
		 * Point point = x_y.getLocation();
		 	* getLocation - Return type is a Point class that contains the (x, y) coordinates of the element
		 * int X= point.x;
		 * int Y = point.y;
		 	* X and Y are inside Point class returns int value
		 * System.out.println("X : " + X);
		 * System.out.println("Y : " + Y);
		 */

		driver.close();
	}

}
