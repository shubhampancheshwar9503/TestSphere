package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoodiesDragAndDrop 
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
			
			WebElement source = driver.findElement(By.id("box3"));
			
			WebElement target = driver.findElement(By.xpath("(//div[@class='dragableBoxRight'])[7]"));
			
			Actions act = new Actions(driver);
			
			act.dragAndDrop(source, target).perform();
			
			System.out.println("Drag And Drop Is Performed");
			
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