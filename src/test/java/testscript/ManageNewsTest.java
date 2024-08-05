package testscript;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.XlUtility;

public class ManageNewsTest extends Base {
	@Test
	public void verifyUserIsAbleToAddNewsOnNewsTextField() 
	{
		String userNameValue=XlUtility.getString(1, 0, "ManageNewsPage");
		String passwordValue=XlUtility.getString(1, 1, "ManageNewsPage");
        String newsContent = XlUtility.getString(1, 2, "ManageNewsPage");
        LoginPage loginpage=new LoginPage(driver);
        loginpage.enterUsernameOnUsernameField(userNameValue).enterPasswordOnPasswordField(passwordValue).clickOnSignInButton();
        loginpage.verifyHomePageNavigated();
        ManageNewsPage managanewspage=new ManageNewsPage(driver);
        managanewspage.clickOnManageNewsTile().clickOnNewButton().enterNewsOnNewsTextField(newsContent).clickOnSaveButton();
        managanewspage.verifyManageNewsPageNavigated();
        boolean isNewsAdded = managanewspage.verifyAddedNews();
        assertTrue(isNewsAdded, "User entered news was not added successfully.");
    }
    
      
	@Test
	public void verifyUserIsAbleToEditTextFromList()
      {
		String userNameValue=XlUtility.getString(2, 0, "ManageNewsPage");
		String passwordValue=XlUtility.getString(2, 1, "ManageNewsPage");
        String newsContent = XlUtility.getString(2, 2, "ManageNewsPage");
        LoginPage loginpage=new LoginPage(driver);
        loginpage.enterUsernameOnUsernameField(userNameValue).enterPasswordOnPasswordField(passwordValue).clickOnSignInButton();
        loginpage.verifyHomePageNavigated();
        ManageNewsPage managanewspage=new ManageNewsPage(driver);
        managanewspage.clickOnManageNewsTile().clickEditButton().editNewsOnNewsTextField(newsContent).clickOnUpdateButton();
        managanewspage.verifyManageNewsPageNavigated();
        boolean isNewsUpdated=managanewspage.verifyUpdatedNews();
        assertTrue(isNewsUpdated, "User edited news was not updated successfully");
        
       }
        
    }

