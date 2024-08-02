package testscript;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.AdminUsers;
import pages.LoginPage;
import utilities.XlUtility;

public class AdminUsersTest extends Base{
	@Test
	public void verifyUserIsAbleToAddUserType()
	{

		String userNameValue=XlUtility.getString(1, 0, "AdminUsers");
		String passwordValue=XlUtility.getString(1, 1, "AdminUsers");
		String userNameValueText=XlUtility.getString(1, 2, "AdminUsers");
		String passwordValueText=XlUtility.getString(1, 3, "AdminUsers");
		String userTypeValue=XlUtility.getString(1, 4, "AdminUsers");
		LoginPage loginpage=new LoginPage(driver).enterUsernameOnUsernameField(userNameValue).enterPasswordOnPasswordField(passwordValue).clickOnSignInButton();
		AdminUsers adminusers=new AdminUsers(driver);
		adminusers.clickAdminUsersTile().newButtonClick().enterUsernameTextField(userNameValueText).enterPasswordTextField(passwordValueText).dropDownToSelectUserType(userTypeValue).saveButtonClick();
		boolean isUsernameCreatedIsPresentInList=adminusers.verifyUserTypeIsPresentInList();
		assertTrue(isUsernameCreatedIsPresentInList, "Username created is not present in the listed");
		
		
		
	}

}
