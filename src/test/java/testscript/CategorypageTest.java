	package testscript;

import java.awt.AWTException;

import org.testng.annotations.Test;

import pages.Categorypage;
import pages.LoginPage;
import utilities.XlUtility;

public class CategorypageTest extends Base{
	@Test
	public void verifyUserIsAbleToFileUpload() throws AWTException
	{
		String userNameValue=XlUtility.getString(1, 0, "Categorypage");
		String passwordValue=XlUtility.getString(1, 1, "Categorypage");
		String categoryValue=XlUtility.getString(1, 2, "Categorypage");
		String fileValue=XlUtility.getString(1, 3, "Categorypage");
		LoginPage loginpage=new LoginPage(driver).enterUsernameOnUsernameField(userNameValue).enterPasswordOnPasswordField(passwordValue).clickOnSignInButton();
		Categorypage categorypage=new Categorypage(driver);
		categorypage.clickCategoryTile().clickNewButton().enterCategoryTextField(categoryValue).groupOneClick().fileUpload(fileValue).topMenuRadioButton().leftMenuRadioButton().saveButtonClick();
		
		
		
	}

	
}
