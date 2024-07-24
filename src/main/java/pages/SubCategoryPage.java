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
	
	
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-sub-category']//child::i[@class='fas fa-arrow-circle-right']") WebElement subCategoryTile;
	@FindBy(xpath="//a[@onclick='click_button(1)']") WebElement newButton;
	@FindBy(xpath="//select[@name='cat_id']") WebElement selectDropdown;
	@FindBy(xpath="//select[@class='form-control selectpicker']") WebElement dropDownClick;
	@FindBy(xpath="//input[@id='subcategory']") WebElement subCategory;
	@FindBy(xpath="//input[@id='main_img']") WebElement chooseFile;
	@FindBy(xpath="//button[@type='submit']") WebElement saveButton;
	@FindBy(xpath="//input[@type='file']") WebElement fileClick;
	
	
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
	

	
	
}  
