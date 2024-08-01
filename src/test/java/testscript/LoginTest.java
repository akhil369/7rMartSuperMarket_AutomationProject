package testscript;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.XlUtility;

public class LoginTest extends Base
{
	@Test(description="This is for verifying loginpage with valid credentials ",groups= {"Smoke"},retryAnalyzer =retry.Retry.class )
	public void verifyUserIsAbleToLoginWithValidUsernameAndValidPassword()
	{
		String userNameValue=XlUtility.getString(1, 0, "LoginPage");
		String passwordValue=XlUtility.getString(1, 1, "LoginPage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(userNameValue).enterPasswordOnPasswordField(passwordValue).clickOnSignInButton();
		boolean isNavigatedToHomepage=loginpage.verifyHomePageNavigated();
		assertTrue(isNavigatedToHomepage,"Not navigated to homepage even if username and password is correct");

	}
	@Test(description="This is for verifying loginpage with validusername and invalidpassword  credentials ",groups= {"Regression"},retryAnalyzer =retry.Retry.class)
	public void verifyUserIsUnAbleToLoginWithValidUsernameAndInvlaidPassword()
	{
		String userNameValue=XlUtility.getString(1, 0, "LoginPage");
		String passwordValue=XlUtility.getString(1, 3, "LoginPage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(userNameValue);
		loginpage.enterPasswordOnPasswordField(passwordValue);
		loginpage.enterUsernameOnUsernameField(userNameValue).enterPasswordOnPasswordField(passwordValue).clickOnSignInButton();
		boolean isAlertMessageDisplay=loginpage.verifyHomePageNotNavigated();
		assertTrue(isAlertMessageDisplay," User is able to login to the homepage even if the username is correct and password is incorrect");
		
	}
	@Test(description="This is for verifying loginpage with Invalidusername and validpassword  credentials ",groups= {"Regression"},retryAnalyzer =retry.Retry.class)
	public void verifyUserIsUnAbleToLoginWithInvalidUsernameAndValidPassword()
	{
		String userNameValue=XlUtility.getString(1, 2, "LoginPage");
		String passwordValue=XlUtility.getString(1, 1, "LoginPage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(userNameValue);
		loginpage.enterPasswordOnPasswordField(passwordValue);
		loginpage.enterUsernameOnUsernameField(userNameValue).enterPasswordOnPasswordField(passwordValue).clickOnSignInButton();
		boolean isAlertMessageDisplay=loginpage.verifyHomePageNotNavigated();
		assertTrue(isAlertMessageDisplay," User is able to login to the homepage even if the username is incorrect and password is correct");
		
	}
	@Test(dataProvider="LoginProvider")
	public void verifyUserIsAbleToLoginWithInValidUsernameAndInvalidPassword() 
	{
		String userNameValue=XlUtility.getString(1, 2, "LoginPage");
		String passwordValue=XlUtility.getString(1, 3, "LoginPage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(userNameValue);
		loginpage.enterPasswordOnPasswordField(passwordValue);
		loginpage.enterUsernameOnUsernameField(userNameValue).enterPasswordOnPasswordField(passwordValue).clickOnSignInButton();
		boolean isAlertMessageDisplay=loginpage.verifyHomePageNotNavigated();
		assertTrue(isAlertMessageDisplay," User is able to login to the homepage even if the username is incorrect and password is incorrect");
		
	}
	@DataProvider(name = "LoginProvider")
	public Object[][] getDataFromTestData() {
		return new Object[][] { { XlUtility.getString(1, 2, "LoginPage"), XlUtility.getString(1, 1, "LoginPage") },

		};
	

}
}
