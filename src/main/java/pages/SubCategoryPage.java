package pages;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.FileUploadUtility;
import utilities.PageUtility;

public class SubCategoryPage {
	public WebDriver driver;
	public SubCategoryPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-sub-category']//child::i[@class='fas fa-arrow-circle-right']")private WebElement subCategoryTile;
	@FindBy(xpath="//a[@onclick='click_button(1)']")private WebElement newButton;
	@FindBy(xpath="//select[@name='cat_id']")private WebElement selectDropdown;
	@FindBy(xpath="//select[@class='form-control selectpicker']")private WebElement dropDownClick;
	@FindBy(xpath="//input[@id='subcategory']")private WebElement subCategory;
	@FindBy(xpath="//input[@type='file']")private WebElement chooseFile;
	@FindBy(xpath="//button[@type='submit']")private WebElement saveButton;
	
	
	
	
	public SubCategoryPage clickOnSubCategoryTile()
	{
		subCategoryTile.click();
		return this;
	}
	
	public SubCategoryPage clickNewButton()
	{
		newButton.click();
		return this;
	}
	public SubCategoryPage clickCategorySelectDropdown()
	{
		selectDropdown.click();
		return this;
		
	}
	public SubCategoryPage dropDownToSelectCategory(String Value)
	{
		PageUtility pageutility=new PageUtility();
		pageutility.selectCategoryUsingSelectByValue(dropDownClick,Value);
		return this;
		
	}
	public SubCategoryPage enterSubCategoryName(String cellphones)
	{
		subCategory.sendKeys(cellphones);
		return this;
	}
	
	public SubCategoryPage fileChoosen(String filepath) throws AWTException
	{
	  FileUploadUtility fileuploadutility=new FileUploadUtility();
	  fileuploadutility.fileUploadUsingRobotClass(filepath);
	  return this;
	
    }
	public SubCategoryPage saveButtonClick()
	{
		saveButton.click();
		return this;
	}
	
	
	

	
	
}  
