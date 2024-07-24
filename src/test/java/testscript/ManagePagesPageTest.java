package testscript;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManagePagesPage;

public class ManagePagesPageTest  extends Base{
	@Test
	public void verifyWhetherUserIsAbleToFindSearchedTitle()
	{
		String userNameValue="admin";
		String passwordValue="admin";
		String titleText="akhil";
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
