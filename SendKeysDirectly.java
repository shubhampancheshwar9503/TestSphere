package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import dwsUtilityBaseClass.BaseClass;

public class SendKeysDirectly extends BaseClass
{
	public static void main(String[] args) throws InterruptedException 
	{
		preCondition("chrome");
		
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		
		WebElement subscribe = driver.findElement(By.id("newsletter-email"));
		
		act.sendKeys(subscribe, "Mr Beast").perform();
		
		System.out.println("Action Performed");
		
		// Hold The Execution
		Thread.sleep(2000);
		
		postCondition();
	}
}