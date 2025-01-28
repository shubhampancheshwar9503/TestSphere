package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import dwsUtilityBaseClass.BaseClass;

public class OpenNewTab extends BaseClass
{
	public static void main(String[] args) throws InterruptedException 
	{
		preCondition("chrome");
		
		WebElement books =  driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]"));
		
		Actions act = new Actions(driver);
		
		act.keyDown(Keys.CONTROL).click(books).perform();
		
		// Hold The Execution
		Thread.sleep(2000);
		
		postCondition();
	}
}