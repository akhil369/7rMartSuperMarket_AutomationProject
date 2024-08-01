package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManagePagesPage {
	public WebDriver driver;
	public ManagePagesPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//i[@class='fas fa-arrow-circle-right']//parent::a[@href='https://groceryapp.uniqassosiates.com/admin/list-page']")private WebElement verifyManagePagesTile;
	@FindBy(xpath="//li[@class='breadcrumb-item active']//parent::ol[@class='breadcrumb float-sm-right']")private WebElement verifyListPages;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")private WebElement searchButton;
	@FindBy(xpath="//input[@placeholder='Title']")private WebElement verifytitleTextField;
	@FindBy(xpath="//button[@type='submit']" )private WebElement submitSearchButton;
	
	
	
	
	
	
	public ManagePagesPage managePagesTile()
	{
		verifyManagePagesTile.click();
		return this;
	}
	public boolean listPagesNavigated()
	{
		boolean isListPagesNavigated=verifyListPages.isDisplayed();
		return isListPagesNavigated;
	}
	public ManagePagesPage clickSearchButton()
	{
		searchButton.click();
		return this;
	}
	public ManagePagesPage enterTitleOnTitleTextField(String titleText)
	{
		verifytitleTextField.sendKeys(titleText);
		return this;
	}
	public ManagePagesPage clickSubmitSearchButton()
	{
		submitSearchButton.click();
		String searchedValue=submitSearchButton.getText();
		return this;
	}
	public boolean verifyTextEnteredInTheList()
	{
		boolean isTextFound=verifytitleTextField.isDisplayed();
		return isTextFound;
	}
	
	}
	
	

