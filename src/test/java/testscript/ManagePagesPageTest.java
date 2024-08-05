package testscript;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManagePagesPage;
import utilities.XlUtility;

public class ManagePagesPageTest  extends Base{
	@Test
	public void verifyWhetherUserIsAbleToFindSearchedTitle()
	{
		String userNameValue=XlUtility.getString(1, 0, "ManagePagesPage");
		String passwordValue=XlUtility.getString(1, 1, "ManagePagesPage");
		String titleText=XlUtility.getString(1, 2, "ManagePagesPage");
		LoginPage loginpage=new LoginPage(driver);
        loginpage.enterUsernameOnUsernameField(userNameValue);
        loginpage.enterPasswordOnPasswordField(passwordValue);
        loginpage.clickOnSignInButton();
		loginpage.verifyHomePageNavigated();
		ManagePagesPage managepagespage=new ManagePagesPage(driver);
	    managepagespage.managePagesTile().clickSearchButton().enterTitleOnTitleTextField(titleText).clickSubmitSearchButton();
		managepagespage.listPagesNavigated();
	    boolean isEnteredTextFound=managepagespage.verifyTextEnteredInTheList();
		assertTrue(isEnteredTextFound, "User is not able to see entered text in the list");
		
	}
	

}
