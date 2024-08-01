package testscript;

import java.awt.AWTException;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.SubCategoryPage;

public class SubCategoryPageTest extends Base {
	@Test
public void verifyUserIsAbleToAddSubCategoryAndFileUpload() throws AWTException
  {
		String userNameValue="admin";
		String passwordValue="admin";
		String categoryValue="164";
		String subCatTextField="Cellphones";
		String fileValue="C:\\Users\\akhilv\\Documents\\Annual.pdf";
		LoginPage loginpage=new LoginPage(driver).enterUsernameOnUsernameField(userNameValue).enterPasswordOnPasswordField(passwordValue).clickOnSignInButton();
        loginpage.verifyHomePageNavigated();
        SubCategoryPage subcategorypage=new SubCategoryPage(driver);
        subcategorypage.clickOnSubCategoryTile().clickNewButton().clickCategorySelectDropdown().dropDownToSelectCategory(categoryValue).enterSubCategoryName(subCatTextField).fileChoosen(fileValue).saveButtonClick();
        
        
       
   }
}
