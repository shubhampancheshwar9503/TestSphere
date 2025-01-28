package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoodiesClickAndHold 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// Expected Url
		String expected_title = "Demo 2: Drag and drop"; 
		
		// Launched The Browser
		ChromeDriver driver = new ChromeDriver();
		
		// Upcasting
//		WebDriver driver1 = new ChromeDriver();
		
		// Maximize The Browser
		driver.manage().window().maximize();
		
		// Minimize The Browser
//		driver.manage().window().minimize();
		
		// Enter The Url
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
//		driver.navigate().to("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		// Actual Url
		String actual_title = driver.getTitle();
		
		// Verification By Title
		if(expected_title.equals(actual_title))
		{
			System.out.println("DHTML Goodies Website");
			
			// Object Of Action Class
			Actions act = new Actions(driver);
			
			// Web Element
			WebElement rome = driver.findElement(By.id("box6"));
			
			// Web Element
			WebElement italy = driver.findElement(By.xpath("(//div[@class='dragableBoxRight'])[1]"));
			
			// Click And Hold Then Release
			act.clickAndHold(rome).release(italy).perform();
			
			System.out.println("Actions Performed");
			
			// Hold The Execution
			Thread.sleep(2000);
		}
		else
		{
			System.out.println("I Am Not In DHTML Goodies");
		}
		
		// Hold The Execution
		Thread.sleep(2000);
		
		// Close The Browser
		driver.close();
//		driver.quit();
	}
}