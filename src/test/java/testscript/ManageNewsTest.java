package testscript;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageNewsPage;

public class ManageNewsTest extends Base {
	@Test
	public void verifyUserIsAbleToAddNewsOnNewsTextField() 
	{
		String userNameValue="admin";
		String passwordValue="admin";
        String newsContent = "test news";
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
		String userNameValue="admin";
		String passwordValue="admin";
        String newsContent = " test news updated";
        LoginPage loginpage=new LoginPage(driver);
        loginpage.enterUsernameOnUsernameField(userNameValue).enterPasswordOnPasswordField(passwordValue).clickOnSignInButton();
        loginpage.verifyHomePageNavigated();
        ManageNewsPage managanewspage=new ManageNewsPage(driver);
        managanewspage.clickOnManageNewsTile().clickOnEditButton().editNewsOnNewsTextField(newsContent).clickOnUpdateButton();
        managanewspage.verifyManageNewsPageNavigated();
        boolean isNewsUpdated=managanewspage.verifyUpdatedNews();
        assertTrue(isNewsUpdated, "User edited news was not updated successfully");
        
       }
        
    }

