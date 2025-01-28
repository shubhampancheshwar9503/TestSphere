package actionsClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import dwsUtilityBaseClass.BaseClass;

public class OpenAllNewTab extends BaseClass
{
	public static void main(String[] args) throws InterruptedException 
	{
		preCondition("chrome");
		
		List<WebElement> elements = driver.findElements(By.xpath("//ul[@class='top-menu']/li"));
		
		Actions act = new Actions(driver);
		
		for (WebElement web : elements) 
		{
			act.keyDown(Keys.CONTROL).click(web).perform();
			
			// Hold The Execution
			Thread.sleep(2000);
		}
		
		postCondition();
	}
}