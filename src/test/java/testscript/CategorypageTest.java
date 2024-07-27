package testscript;

import java.awt.AWTException;

import org.testng.annotations.Test;

import pages.Categorypage;
import pages.LoginPage;

public class CategorypageTest extends Base{
	@Test
	public void verifyUserIsAbleToDragAndDropAndFileUpload() throws AWTException
	{
		String userNameValue="admin";
		String passwordValue="admin";
		String categoryValue="Phones";
		String fileValue="C:\\Users\\akhilv\\Documents\\Annual.pdf";
		LoginPage loginpage=new LoginPage(driver).enterUsernameOnUsernameField(userNameValue).enterPasswordOnPasswordField(passwordValue).clickOnSignInButton();
		Categorypage categorypage=new Categorypage(driver);
		categorypage.clickCategoryTile().clickNewButton().enterCategoryTextField(categoryValue).groupOneClick().fileUpload(fileValue).topMenuRadioButton().leftMenuRadioButton().saveButtonClick();
		
		
		
	}

	
}
