package testscript;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageContactPage;
import utilities.XlUtility;

public class ManageContactPageTest  extends Base{
	@Test
	
		public void verifyUserIsAbleToEditContactUsInformations()
		{
		String userNameValue=XlUtility.getString(1, 0, "ManageContactPage");
		String passwordValue=XlUtility.getString(1, 1, "ManageContactPage");
		String phoneValue=XlUtility.getString(1, 2, "ManageContactPage");
		String emailValue=XlUtility.getString(1, 3, "ManageContactPage");
		String addressValue=XlUtility.getString(1, 4, "ManageContactPage");
		String deliveryTimeValue=XlUtility.getString(1, 5, "ManageContactPage");
		String deliveryChargeValue=XlUtility.getString(1, 6, "ManageContactPage");
		LoginPage loginpage=new LoginPage(driver).enterUsernameOnUsernameField(userNameValue).enterPasswordOnPasswordField(passwordValue).clickOnSignInButton();
		ManageContactPage managecontactpage=new ManageContactPage(driver);
		managecontactpage.clickManageContactTile().clickEditButton().enterPhoneNumber(phoneValue).enterEmail(emailValue).enterAddress(addressValue).enterDeliveryTime(deliveryTimeValue).enterDeliveryChargeTime(deliveryChargeValue).updateButtonClick();
		boolean isUpdatedInformationsInList=managecontactpage.verifyEditedPhoneNumberInList();
		assertTrue(isUpdatedInformationsInList, "User is not able to see updtaed informations from list");
		
				
				
		
		}
	
	

}
