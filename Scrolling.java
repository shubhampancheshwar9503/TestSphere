package actionsClass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import dwsUtilityBaseClass.BaseClass;

public class Scrolling extends BaseClass
{
	public static void main(String[] args) throws InterruptedException 
	{
		preCondition("chrome");
		
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		
		act.keyDown(Keys.PAGE_DOWN).perform();
		
		Thread.sleep(2000);
		
		act.keyDown(Keys.PAGE_UP).perform();
		
		Thread.sleep(2000);
		
		postCondition();
	}
}