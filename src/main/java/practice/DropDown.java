package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "./Web-Drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
		WebElement product = driver.findElement(By.xpath("//select[@id='first']"));
		
		//Select By Visible Text
		Select dropdown = new Select(product);
		dropdown.selectByVisibleText("Google");
		
		//Select By Value and print the selected text
		WebElement animals = driver.findElement(By.id("animals"));
		Select dropdown1 = new Select(animals);
		dropdown1.selectByValue("big baby cat");
		WebElement selected = dropdown1.getFirstSelectedOption();
		System.out.println(selected.getText());
		
		//Select multiple values
		WebElement multiple = driver.findElement(By.xpath("//select[@id='second']"));
		Select dropdown2 = new Select(multiple);
			//Check if the element is multiple
		boolean check = dropdown2.isMultiple();
		System.out.println(check);
			//Selecting multiple elements
		dropdown2.selectByValue("pizza");
		dropdown2.selectByIndex(3);
		dropdown2.selectByIndex(2);
			//Print all the selected elements using for each
		List<WebElement> All_Selected_Options = dropdown2.getAllSelectedOptions();
		for (WebElement print_elements : All_Selected_Options)
			System.out.println(print_elements.getText());
		
		//Custom Dropdown(Bootstrap Dropdown)
		WebElement custom = driver.findElement(By.id("custom"));
		custom.click();
		driver.findElement(By.xpath("//ul//li[2]//b[text()=' span']")).click();
		
//================================================================================//
		dropdown2.deselectByIndex(2);
				//De-Select can used only for multiple select drop down
				/*If we use deselect in single select dropdown it will throw 
					"UnsupportedOperationException" */

//================================================================================//
		List<WebElement> All_Option = dropdown1.getOptions();
		for (WebElement Options : All_Option)
		System.out.println(Options.getText());
		
		Thread.sleep(2000);
		driver.quit();
	
	}

}
