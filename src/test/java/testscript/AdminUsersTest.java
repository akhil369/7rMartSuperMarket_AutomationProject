package testscript;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.AdminUsers;
import pages.LoginPage;

public class AdminUsersTest extends Base{
	@Test
	public void verifyUserIsAbleToAddUserType()
	{

		String userNameValue="admin";
		String passwordValue="admin";
		String userNameValueText="admintest123";
		String passwordValueText="admin@123";
		String userTypeValue="db";
		LoginPage loginpage=new LoginPage(driver).enterUsernameOnUsernameField(userNameValue).enterPasswordOnPasswordField(passwordValue).clickOnSignInButton();
		AdminUsers adminusers=new AdminUsers(driver);
		adminusers.clickAdminUsersTile().newButtonClick().enterUsernameTextField(userNameValueText).enterPasswordTextField(passwordValueText).dropDownToSelectUserType(userTypeValue).saveButtonClick();
		boolean isUsernameCreatedIsPresentInList=adminusers.verifyUserTypeIsPresentInList();
		assertTrue(isUsernameCreatedIsPresentInList, "Username created is not present in the list");
		
		
		
	}

}
