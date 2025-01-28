package actionsClass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import dwsUtilityBaseClass.BaseClass;

public class SendKeysTab extends BaseClass
{
	public static void main(String[] args) throws InterruptedException 
	{
		preCondition("chrome");
		
		Actions act = new Actions(driver);
		
		act.keyDown(Keys.TAB).perform();
		
		// Hold The Execution
		Thread.sleep(2000);
		
		act.keyDown(Keys.TAB).perform();
		
		// Hold The Execution
		Thread.sleep(2000);
		
		act.keyDown(Keys.TAB).perform();
		
		// Hold The Execution
		Thread.sleep(2000);
		
		act.keyDown(Keys.TAB).perform();
		
		// Hold The Execution
		Thread.sleep(2000);
		
		act.keyDown(Keys.TAB).perform();
		
		// Hold The Execution
		Thread.sleep(2000);
		
		act.keyDown(Keys.TAB).perform();
		
		// Hold The Execution
		Thread.sleep(2000);
		
		act.sendKeys("Jewelry").perform();
		
		// Hold The Execution
		Thread.sleep(2000);
		
		act.keyDown(Keys.TAB).perform();
		
		// Hold The Execution
		Thread.sleep(2000);
		
		act.keyDown(Keys.ENTER).perform();
		
		// Hold The Execution
		Thread.sleep(2000);
		
		postCondition();
	}
}