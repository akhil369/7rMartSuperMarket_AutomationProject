package pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageFooterTextPage {

	public WebDriver driver;
	public ManageFooterTextPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath ="//p[text()='Manage Footer Text']//parent::div[@class='inner']//following-sibling::a[@href='https://groceryapp.uniqassosiates.com/admin/list-footertext']")private WebElement managerFooterTextTile;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/Footertext/edit?edit=1']//child::i[@class='fas fa-edit']")private WebElement editButtonClick;
	@FindBy(xpath="//textarea[@placeholder='Enter the Address']")private WebElement addressTextField;
	@FindBy(xpath="//input[@id='email']")private WebElement emailTextField;
	@FindBy(xpath="//input[@id='phone']")private WebElement phoneTextField;
	@FindBy(xpath="//button[@type='submit']")private WebElement updateButton;
	@FindBy(xpath = "//table[@class='table table-bordered table-hover table-sm']//td[1]") private  List<WebElement> footerTextTable;

	
	public ManageFooterTextPage clickManageFooterTextPageTile()
	{
		managerFooterTextTile.click();
		return this;
	}
	public ManageFooterTextPage clickEditButton()
	{
		editButtonClick.click();
		return this;
	}
	public ManageFooterTextPage scrollDown()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
 		js.executeScript("window.scrollBy(0,250)", "");
 		return this;
	}
	public ManageFooterTextPage enterAddressTextField(String address)
	{
		addressTextField.clear();
		addressTextField.sendKeys(address);
		return this;
	}
	public ManageFooterTextPage enterEmailTextField(String email)
	{
		emailTextField.clear();
		emailTextField.sendKeys(email);
		return this;
	}
	public ManageFooterTextPage enterPhoneNumberField(String phone)
	{
		phoneTextField.clear();
		phoneTextField.sendKeys(phone);
		return this;
	}
	public ManageFooterTextPage updateButtonClick()
	{
		updateButton.click();
		return this;
	}
	public boolean verifyEditedAddressInList()
	{
		
		boolean flag=false;
		for (WebElement userTypeElement : footerTextTable)
		   {
			String textName=userTypeElement.getText();
			 if (textName.equals("Plavelil House, Puthenpurackal, Kadapra p.o., Kumbanad")) {
	             flag= true;
			   }
		   }
		return flag;
		   
	}

	
}


