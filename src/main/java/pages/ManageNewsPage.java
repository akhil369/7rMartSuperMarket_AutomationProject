package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNewsPage {

	public WebDriver driver;
	public ManageNewsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath="//i[@class='fas fa-arrow-circle-right']//parent::a[@href='https://groceryapp.uniqassosiates.com/admin/list-news']") WebElement manageNewsTile;
	@FindBy(linkText ="Manage News") WebElement manageNewsPage;
	@FindBy(xpath="//i[@class='fas fa-edit']//parent::a[@class='btn btn-rounded btn-danger']") WebElement newButton;
	@FindBy(xpath="//textarea[@class='form-control']") WebElement enterTheNewsTextField;
	@FindBy(xpath="//button[@type='submit']") WebElement saveButton;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement messageSuccess;
	@FindBy(xpath="//i[@class='fas fa-edit']//parent::a[@href='https://groceryapp.uniqassosiates.com/admin/news/edit?edit=1537&page_ad=1']") WebElement editButtonClick;
	@FindBy(xpath="//textarea[@id='news']") WebElement editNewsTextField;
	@FindBy(xpath="//button[@name='update']") WebElement updateButtonClick;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement editMessageSuccess;
	
	
	
	
	public ManageNewsPage clickOnManageNewsTile()
	{
	    manageNewsTile.click();
	    return this;
    }
	
	public boolean verifyManageNewsPageNavigated()
	{
		boolean isManageNewsPageNavigated=manageNewsPage.isDisplayed();
		return isManageNewsPageNavigated;
	}
	public ManageNewsPage clickOnNewButton() 
	{
		newButton.click();
		return this;
	}
	public ManageNewsPage enterNewsOnNewsTextField(String news) 
	{
	 enterTheNewsTextField.sendKeys(news);
	 return this;
       
    }
	public ManageNewsPage clickOnSaveButton()
	{
		saveButton.click();
		return this;
	}
	public boolean verifyAddedNews()
	{
		boolean isMessageSuccessVerified=messageSuccess.isDisplayed();
		return isMessageSuccessVerified;
	}
	public ManageNewsPage clickOnEditButton()
	{
		editButtonClick.click();
		return this;
	}
	public ManageNewsPage editNewsOnNewsTextField(String updatedNews)
	{
		editNewsTextField.clear();
		editNewsTextField.sendKeys(updatedNews);
		return this;
	}
	
	public ManageNewsPage clickOnUpdateButton()
	{
		updateButtonClick.click();
		return this;
	}
	public boolean verifyUpdatedNews() {
        boolean isUpdatedMessageSuccessVerified=editMessageSuccess.isDisplayed();
        return isUpdatedMessageSuccessVerified;
    }
}
