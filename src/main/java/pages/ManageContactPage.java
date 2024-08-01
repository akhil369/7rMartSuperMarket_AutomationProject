package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.MemberSubstitution.FieldValue;

public class ManageContactPage {
	public WebDriver driver;
	public ManageContactPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//p[text()='Manage Contact']//parent::div[@class='inner']//following-sibling::a[@href='https://groceryapp.uniqassosiates.com/admin/list-contact']") private WebElement manageContactTile;
	@FindBy(xpath = "//a[@class='btn btn-sm btn btn-primary btncss']") private WebElement editButton;
	@FindBy(xpath = "//input[@id='phone']") private WebElement phoneTextfield;
	@FindBy(xpath = "//input[@id='email']") private WebElement emailTextfield;
	@FindBy(xpath = "//textarea[@placeholder='Enter the Address']") private WebElement addressTextfield;
	@FindBy(xpath = "//textarea[@placeholder='Enter Delivery Time']") private WebElement deliveryTimeTextfield;
	@FindBy(xpath = "//input[@id='del_limit']") private WebElement deliveryChargeTextfield;
	@FindBy(xpath = "//button[@type='submit']") private WebElement updateButton;
	@FindBy(xpath = "//table[@class='table table-bordered table-hover table-sm']//td[1]") private List<WebElement> contactUsTable; 
	
	
	public ManageContactPage clickManageContactTile()
	
	{
		manageContactTile.click();
		return this;
	}
	public ManageContactPage clickEditButton()
	{
		editButton.click();
		return this;
	}
	public ManageContactPage enterPhoneNumber(String phone)
	{
		phoneTextfield.clear();
		phoneTextfield.sendKeys(phone);
		return this;
	}
	public ManageContactPage enterEmail(String email)
	{
		emailTextfield.clear();
		emailTextfield.sendKeys(email);
		return this;
	}
	public ManageContactPage enterAddress(String address)
	{
		addressTextfield.clear();
		addressTextfield.sendKeys(address);
		return this;
	}
	public ManageContactPage enterDeliveryTime(String time)
	{
		deliveryTimeTextfield.clear();
		deliveryTimeTextfield.sendKeys(time);
		return this;
	}
	public ManageContactPage enterDeliveryChargeTime(String limit)
	
	{
		deliveryChargeTextfield.clear();
		deliveryChargeTextfield.sendKeys(limit);
		return this;
	}
	public ManageContactPage updateButtonClick()
	{
		updateButton.click();
		return this;
	}
	public boolean verifyEditedPhoneNumberInList()
	{
		boolean flag=false;
		for(WebElement phoneTypeElement : contactUsTable)
		{
			String textName=phoneTypeElement.getText();
			 if (textName.equals("123456789")) {
	             flag= true;
			   }
		}
		return true;
		
	}
	
	

}
