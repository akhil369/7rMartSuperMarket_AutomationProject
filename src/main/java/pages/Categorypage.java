package pages;

import java.awt.AWTException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.FileUploadUtility;
import utilities.PageUtility;

public class Categorypage {
	public WebDriver driver;
	public Categorypage(WebDriver driver)
	{
		this.driver=driver;	
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//p[text()='Category']//parent::div[@class='inner']//following-sibling::a[@href='https://groceryapp.uniqassosiates.com/admin/list-category']") private WebElement categoryTile;
	@FindBy(xpath="//a[@onclick='click_button(1)']")private WebElement newButton;
	@FindBy(xpath="//input[@id='category']")private WebElement categoryTextField;
	@FindBy(xpath ="//ul[@class=\"ms-list\"]//child::li[@id='134-selectable']")private WebElement groupOne;
	@FindBy(xpath = "//input[@type='file']") private WebElement uploadButton;
	@FindBy(xpath ="//input[@name='top_menu']//ancestor::div[@class='col-md-4']")private WebElement radioButtonTopMenu;
	@FindBy(xpath ="//input[@name='show_home']//ancestor::div[@class='col-md-4']")private WebElement radioButtonLeftMenu;
	@FindBy(xpath="//button[@type='submit']")private WebElement saveButton;
	
	



public Categorypage clickCategoryTile()
{
	categoryTile.click();
	return this;
}

public Categorypage clickNewButton()
{
	newButton.click();
	return this;
}
public Categorypage enterCategoryTextField(String phones)

{
	categoryTextField.sendKeys(phones);
	return this;
}

public Categorypage groupOneClick()

{
	
	groupOne.click();
	return this;
	
}

public Categorypage fileUpload(String filepath) throws AWTException
{
	FileUploadUtility fileuploadutility=new FileUploadUtility();
	fileuploadutility.fileUploadUsingRobotClass(filepath);
	return this;
}
public Categorypage topMenuRadioButton()
{
  radioButtonTopMenu.click();
  return this;
}
public Categorypage leftMenuRadioButton()
{
   radioButtonLeftMenu.click();
   return this;
}
public Categorypage saveButtonClick()
{
	saveButton.click();
	return this;
}
}

