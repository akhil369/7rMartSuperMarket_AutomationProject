package utilities;


import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class PageUtility 
{
	public void selectCategoryUsingSelectByVisibleText(WebElement dropdown,String VisibleText)
	{
		Select select=new Select(dropdown);
		select.selectByVisibleText(VisibleText);
	}
	public void selectCategoryUsingSelectByIndexValue(WebElement dropdown,int index)
	{
		Select select=new Select(dropdown);
		select.selectByIndex(index);
	}
	public void selectCategoryUsingSelectByValue(WebElement dropdown, String Value) 
	{
		Select select = new Select(dropdown);
		select.selectByValue(Value);
	}
	 

	 public void scrollPageUp(WebDriver driver)
	 {
	 		JavascriptExecutor js = (JavascriptExecutor) driver;
	 		js.executeScript("window.scrollBy(0,-350)", "");
	 		
	 }
      public void scrollPageDown(WebDriver driver)
      {
    	  JavascriptExecutor js = (JavascriptExecutor) driver;
	 		js.executeScript("window.scrollBy(0,250)", "");
      }
      public void actionMouseHovering(WebDriver driver,WebElement Element)
      {
    	  Actions actions=new Actions(driver);
    	  actions.moveToElement(Element).build().perform();
      }
      
      public void actionDoubleClick(WebDriver driver,WebElement Element)
      {
    	  Actions actions=new Actions(driver);
    	  actions.doubleClick(Element).build().perform();
    	  
      }
      public void actionRightClick(WebDriver driver,WebElement Element)
      {
    	  Actions actions=new Actions(driver);
    	  actions.contextClick(Element).build().perform();
      }
      public void actionDragAndDrop(WebDriver driver,WebElement sourceElement,WebElement destinationElement)
      
      {
    	  Actions actions=new Actions(driver);
    	  actions.dragAndDrop(sourceElement, destinationElement).build().perform();
      }
      public String alertGetTextHandle(WebDriver driver)
      {
    	 String alertText=driver.switchTo().alert().getText();
 		 return alertText; 
      }
      public String alertGetAcceptHandle(WebDriver driver)
      {
    	  String alertValue=driver.switchTo().alert().getText();
  		  driver.switchTo().alert().accept();
  		  return alertValue;
      }
      public String alertGetDismissHandle(WebDriver driver)
      {
    	  String alertValue=driver.switchTo().alert().getText();
    	  driver.switchTo().alert().dismiss();
    	  return alertValue;
      }
      public void alertEnterValue(WebDriver driver,String element)
      {
    	  driver.switchTo().alert().sendKeys(element);
  		  driver.switchTo().alert().accept();

      }
      public void framesHandle(WebDriver driver,WebElement element)
      {
    	  driver.switchTo().frame(element);
    	  
      }
      public void clickFrameHandle(WebElement Element)
      {
    	  Element.click();
      }
      
      public String getAttributeValue(WebElement element, String attribute)
      {
          return element.getAttribute(attribute);
      }
      public String getCssValue(WebElement element, String cssProperty)
      {
          return element.getCssValue(cssProperty);
      }
      public String getTagName(WebElement element)
      {
          return element.getTagName();
      }

       public String getText(WebElement element)
      {
          return element.getText();
      }
	 }













