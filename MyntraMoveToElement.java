package actionsClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MyntraMoveToElement 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// Expected Title
		String expected_title = "Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra";
		
		// Launched The Browser
		ChromeDriver driver = new ChromeDriver(); 
		
		// Upcasting
//		WebDriver driver1 = new ChromeDriver();
		
		// Maximize The Browser
		driver.manage().window().maximize();
		
		// Minimize The Browser
//		driver.manage().window().minimize();
		
		// Enter The Url
		driver.get("https://www.myntra.com/");
//		driver.navigate().to("https://demowebshop.tricentis.com/");
	
		// Actual Title
		String actual_title = driver.getTitle();
		
		// Verification By Title
		if(expected_title.equals(actual_title))
		{
			System.out.println("I Am In Myntra Page");
			
			// Hold The Execution
			Thread.sleep(2000);
			
			WebElement beauty = driver.findElement(By.xpath("(//a[@class='desktop-main'])[5]"));
			
			Actions beauty1 = new Actions(driver);
			
			beauty1.moveToElement(beauty).perform();
			
			// Hold The Execution
			Thread.sleep(2000);
			
			WebElement face_wash = driver.findElement(By.xpath("//a[@data-reactid='724']"));
			
			Actions beauty2 = new Actions(driver);
			
			face_wash.click();
			
			System.out.println("Action Performed");
		}
		else
		{
			System.out.println("I Am Not In Myntra Page");
		}
		
		// Hold The Execution
		Thread.sleep(2000);
		
		// Close The Browser
		driver.close();
//		driver.quit();
	}
}