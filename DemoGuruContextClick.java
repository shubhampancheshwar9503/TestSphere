package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoGuruContextClick 
{
	public static void main(String[] args) throws InterruptedException
	{
		// Expected Url
		String expected_url = "https://demo.guru99.com/test/simple_context_menu.html";
		
		// Launched The Browser
		ChromeDriver driver = new ChromeDriver();
		
		// Upcasting
//		WebDriver driver1 = new ChromeDriver();
		
		// Maximize The Browser
		driver.manage().window().maximize();
		
		// Minimize The Browser
//		driver.manage().window().minimize();
		
		// Enter The Url
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
//		driver.navigate().to("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		// Actual Url
		String actual_url = driver.getCurrentUrl();
		
		// Verification By Title
		if(expected_url.equals(actual_url))
		{
			System.out.println("I Am In Demo Guru Website");
			
			// Object Of Action Class
			Actions act = new Actions(driver);
			
			// Web Element
			WebElement rightClick = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
			
			// Web Element
			WebElement click = driver.findElement(By.xpath("//span[text()='Copy']"));
			
			// Right Click + Click
			act.contextClick(rightClick).click(click).perform();
			
			System.out.println("Actions Performed");
			
			// Hold The Execution
			Thread.sleep(2000);
			
			try 
			{
				// Right Click + Click
				rightClick.click();
				System.out.println("Pop Up Is Not Displayed");
			} 
			catch (Exception e) 
			{
				// Right Click + Click
				act.contextClick(rightClick).click(click).perform();
				
				System.out.println("Pop Up Is Displayed");
			}
		}
		else
		{
			System.out.println("I Am Not In Demo Guru Website");
		}
		
		// Hold The Execution
		Thread.sleep(2000);
		
		// Close The Browser
		driver.close();
//		driver.quit();
	}
}