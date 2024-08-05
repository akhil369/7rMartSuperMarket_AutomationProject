package testscript;

import java.awt.AWTException;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.SubCategoryPage;
import utilities.XlUtility;

public class SubCategoryPageTest extends Base {
	@Test
public void verifyUserIsAbleToAddSubCategoryAndFileUpload() throws AWTException
  {
		String userNameValue=XlUtility.getString(1, 0, "SubCategoryPage");
		String passwordValue=XlUtility.getString(1, 1, "SubCategoryPage");
		String categoryValue=XlUtility.getString(1, 2, "SubCategoryPage");
		String subCatTextField=XlUtility.getString(1, 3, "SubCategoryPage");
		String fileValue=XlUtility.getString(1, 4, "SubCategoryPage");
		LoginPage loginpage=new LoginPage(driver).enterUsernameOnUsernameField(userNameValue).enterPasswordOnPasswordField(passwordValue).clickOnSignInButton();
        loginpage.verifyHomePageNavigated();
        SubCategoryPage subcategorypage=new SubCategoryPage(driver);
        subcategorypage.clickOnSubCategoryTile().clickNewButton().clickCategorySelectDropdown().dropDownToSelectCategory(categoryValue).enterSubCategoryName(subCatTextField).fileChoosen(fileValue).saveButtonClick();
        
        
       
   }
}
