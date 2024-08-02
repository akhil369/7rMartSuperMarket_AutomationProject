package pages;

import java.util.List;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



import utilities.PageUtility;

public class AdminUsers {
	public WebDriver driver;
	public AdminUsers(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}



@FindBy(xpath = "//p[text()='Admin Users']//parent::div[@class='inner']//following-sibling::a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin']")  private WebElement adminUsersTile;
@FindBy(xpath = "//a[@onclick='click_button(1)']") private WebElement newButtonClick;
@FindBy(xpath = "//input[@id='username']") private WebElement usernameTextField;
@FindBy(xpath = "//input[@id='password']") private WebElement passwordTextField;
@FindBy(xpath = "//select[@id='user_type']") private WebElement selectDropdown;
@FindBy(xpath = "//button[@name='Create']") private  WebElement saveButton;
@FindBy(xpath = "//table[@class='table table-bordered table-hover table-sm']//td[1]") private List<WebElement>  userTypeTable;




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

public boolean  verifyUserTypeIsPresentInList()
{
	 boolean flag=false;
	for (WebElement userTypeElement : userTypeTable)
	   {
		String textName=userTypeElement.getText();
		 if (textName.equals("admintest123")) {
             flag= true;
		   }
	   }
	return flag;
}
//public boolean  verifyUserTypeIsPresentInList(String userType)
//{
//	 
//	for (WebElement userTypeElement : userTypeTable)
//	   {
//		 if (userTypeElement.getText().equals(userType)) {
//             return true;
//		   }
//	   }
//	return false;
//	   
//}
}








