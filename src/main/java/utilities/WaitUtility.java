package utilities;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility
{
	public static final long EXPLICITWAIT=10;
	public static final long IMPLICITWAIT=10;
	public void clickbleWait(WebDriver driver,WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(EXPLICITWAIT));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	public void clickableWait(WebDriver driver, WebElement element ) 
	{
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(EXPLICITWAIT));
		 wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	    
	    public void framesWait(WebDriver driver, WebElement element ) 
	    {
	   	 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(EXPLICITWAIT));
	   	 wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(element));
	   	}
	    public void titleIsWait(WebDriver driver, String element ) 
	    {
	      	 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(EXPLICITWAIT));
	      	 wait.until(ExpectedConditions.titleIs(element));
	    }
	    public void urlContainsFluentWait(WebDriver driver, String element)
	    {
	    	 Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
	 	            .withTimeout(Duration.ofSeconds(30))
	 	            .pollingEvery(Duration.ofSeconds(5))
	 	            .ignoring(NoSuchElementException.class);
	 	    fluentWait.until(ExpectedConditions.urlContains(element));
	    }
	    public void elementToBeClickableFluentWait(WebDriver driver, WebElement element) {
	    	 Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
	 	            .withTimeout(Duration.ofSeconds(30))
	 	            .pollingEvery(Duration.ofSeconds(5))
	 	            .ignoring(NoSuchElementException.class);
	 	    fluentWait.until(ExpectedConditions.elementToBeClickable(element));
	    }
	    public void framesToBeAvailableFluentWait(WebDriver driver, WebElement element) {
	    	 Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
	 	            .withTimeout(Duration.ofSeconds(30))
	 	            .pollingEvery(Duration.ofSeconds(5))
	 	            .ignoring(NoSuchElementException.class);
	 	    fluentWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
}
}
