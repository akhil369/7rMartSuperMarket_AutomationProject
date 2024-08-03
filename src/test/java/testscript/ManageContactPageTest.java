package testscript;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageContactPage;

public class ManageContactPageTest  extends Base{
	@Test
	
		public void verifyUserIsAbleToEditContactUsInformations()
		{
		String userNameValue="admin";
		String passwordValue="admin";
		String phoneValue="123456789";
		String emailValue="test@testing.com";
		String addressValue="abchouse";
		String deliveryTimeValue="12";
		String deliveryChargeValue="1234";
		LoginPage loginpage=new LoginPage(driver).enterUsernameOnUsernameField(userNameValue).enterPasswordOnPasswordField(passwordValue).clickOnSignInButton();
		ManageContactPage managecontactpage=new ManageContactPage(driver);
		managecontactpage.clickManageContactTile().clickEditButton().enterPhoneNumber(phoneValue).enterEmail(emailValue).enterAddress(addressValue).enterDeliveryTime(deliveryTimeValue).enterDeliveryChargeTime(deliveryChargeValue).updateButtonClick();
		boolean isUpdatedInformationsInList=managecontactpage.verifyEditedPhoneNumberInList();
		assertTrue(isUpdatedInformationsInList, "User is not able to see updtaed informations from list");
		
				
				
		
		}
	
	

}
