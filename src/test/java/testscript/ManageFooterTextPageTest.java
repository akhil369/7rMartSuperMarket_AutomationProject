package testscript;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageFooterTextPage;
import utilities.XlUtility;

public class ManageFooterTextPageTest extends Base {
	@Test
	public void verifyUserIsAbleToEditUserTextInformations()
	{
		 String userNameValue = XlUtility.getString(1, 0, "ManageFooterTextPage");
	     String passwordValue = XlUtility.getString(1, 1, "ManageFooterTextPage");
	     String addressValue = XlUtility.getString(1, 2, "ManageFooterTextPage");
	     String emailValue = XlUtility.getString(1, 3, "ManageFooterTextPage");
	     String phoneValue = XlUtility.getString(1, 4, "ManageFooterTextPage");
	     LoginPage loginpage=new LoginPage(driver).enterUsernameOnUsernameField(userNameValue).enterPasswordOnPasswordField(passwordValue).clickOnSignInButton();
	     ManageFooterTextPage managefootertextpage=new ManageFooterTextPage(driver).clickManageFooterTextPageTile().clickEditButton().scrollDown().enterAddressTextField(addressValue).enterEmailTextField(emailValue).enterPhoneNumberField(phoneValue).updateButtonClick();
	     boolean isEditedAddressInList=managefootertextpage.verifyEditedAddressInList();
	     assertTrue(isEditedAddressInList, "Edited Address is not present in the list");
	     
	}
	

}
