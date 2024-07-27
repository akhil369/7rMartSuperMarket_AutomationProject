package testscript;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageFooterTextPage;

public class ManageFooterTextPageTest extends Base {
	@Test
	public void verifyUserIsAbleToEditUserTextInformations()
	{
		 String userNameValue = "admin";
	     String passwordValue = "admin";
	     String addressValue = "Plavelil House, Puthenpurackal, Kadapra p.o., Kumbanad";
	     String emailValue = "example@example.com";
	     String phoneValue = "1234567890";
	     LoginPage loginpage=new LoginPage(driver).enterUsernameOnUsernameField(userNameValue).enterPasswordOnPasswordField(passwordValue).clickOnSignInButton();
	     ManageFooterTextPage managefootertextpage=new ManageFooterTextPage(driver).clickManageFooterTextPageTile().clickEditButton().scrollDown().enterAddressTextField(addressValue).enterEmailTextField(emailValue).enterPhoneNumberField(phoneValue).updateButtonClick();
	     
	}
	

}
