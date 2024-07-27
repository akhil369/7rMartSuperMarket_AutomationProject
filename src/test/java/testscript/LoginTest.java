package testscript;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.XlUtility;

public class LoginTest extends Base
{
	@Test
	public void verifyUserIsAbleToLoginWithValidUsernameAndValidPassword()
	{
		String userNameValue=XlUtility.getString(1, 1, "LoginPage");
		String passwordValue="admin";
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(userNameValue).enterPasswordOnPasswordField(passwordValue).clickOnSignInButton();
		boolean isNavigatedToHomepage=loginpage.verifyHomePageNavigated();
		assertTrue(isNavigatedToHomepage,"Not navigated to homepage even if username and password is correct");

	}
	@Test
	public void verifyUserIsUnAbleToLoginWithValidUsernameAndInvlaidPassword()
	{
		String userNameValue="admin";
		String passwordValue="admin123";
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(userNameValue);
		loginpage.enterPasswordOnPasswordField(passwordValue);
		loginpage.enterUsernameOnUsernameField(userNameValue).enterPasswordOnPasswordField(passwordValue).clickOnSignInButton();
		boolean isAlertMessageDisplay=loginpage.verifyHomePageNotNavigated();
		/*boolean isNavigatedToHomepage=loginpage.verifyHomePageNavigated();*/
		assertTrue(isAlertMessageDisplay," User is able to login to the homepage even if the username is correct and password is incorrect");
		/*assertFalse(isNavigatedToHomepage,"User is not able to navigate to homepage even if alert message display");*/
	}
	@Test
	public void verifyUserIsUnAbleToLoginWithInvalidUsernameAndValidPassword()
	{
		String userNameValue="admintest";
		String passwordValue="admin";
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(userNameValue);
		loginpage.enterPasswordOnPasswordField(passwordValue);
		loginpage.enterUsernameOnUsernameField(userNameValue).enterPasswordOnPasswordField(passwordValue).clickOnSignInButton();
		boolean isAlertMessageDisplay=loginpage.verifyHomePageNotNavigated();
		/*boolean isNavigatedToHomepage=loginpage.verifyHomePageNavigated();*/
		assertTrue(isAlertMessageDisplay," User is able to login to the homepage even if the username is incorrect and password is correct");
		/*assertFalse(isNavigatedToHomepage,"User is not able to navigate to homepage even if alert message display");*/
	}
	@Test
	public void verifyUserIsAbleToLoginWithInValidUsernameAndInvalidPassword() 
	{
		String userNameValue="admintest";
		String passwordValue="admin123";
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(userNameValue);
		loginpage.enterPasswordOnPasswordField(passwordValue);
		loginpage.enterUsernameOnUsernameField(userNameValue).enterPasswordOnPasswordField(passwordValue).clickOnSignInButton();
		boolean isAlertMessageDisplay=loginpage.verifyHomePageNotNavigated();
		/*boolean isNavigatedToHomepage=loginpage.verifyHomePageNavigated();*/
		assertTrue(isAlertMessageDisplay," User is able to login to the homepage even if the username is incorrect and password is incorrect");
		/*assertFalse(isNavigatedToHomepage,"User is not able to navigate to homepage even if alert message display");*/
	}
	

}
