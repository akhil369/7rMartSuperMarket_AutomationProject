package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.j2objc.annotations.RetainedLocalRef;

import utilities.PageUtility;

public class AdminUsers {
	public WebDriver driver;
	public AdminUsers(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}



@FindBy(xpath = "//p[text()='Admin Users']//parent::div[@class='inner']//following-sibling::a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin']") WebElement adminUsersTile;
@FindBy(xpath = "//a[@onclick='click_button(1)']") WebElement newButtonClick;
@FindBy(xpath = "//input[@id='username']") WebElement usernameTextField;
@FindBy(xpath = "//input[@id='password']") WebElement passwordTextField;
@FindBy(xpath = "//select[@id='user_type']") WebElement selectDropdown;
@FindBy(xpath = "//button[@name='Create']") WebElement saveButton;



public AdminUsers clickAdminUsersTile()
{
	adminUsersTile.click();
	return this;
}
public AdminUsers newButtonClick()
{
	newButtonClick.click();
	return this;
}
public AdminUsers enterUsernameTextField(String admin)
{
	usernameTextField.sendKeys(admin);
	return this;
}
public AdminUsers enterPasswordTextField(String admin)
{
	passwordTextField.sendKeys(admin);
	return this;
}
public AdminUsers dropDownToSelectUserType(String value)
{
	PageUtility pageutility=new PageUtility();
	pageutility.selectCategoryUsingSelectByValue(selectDropdown,value);
	return this;
}

public AdminUsers saveButtonClick()
{
	saveButton.click();
	return this;
}








}