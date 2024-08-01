package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
	public LoginPage(WebDriver driver)
	{
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath="//input[@name='username']") private WebElement userNameTextField;
	@FindBy(xpath="//input[@name='password']") private WebElement passwordTextField;
	@FindBy(xpath="//button[@class='btn btn-dark btn-block']")private  WebElement signInButton;
	@FindBy(xpath="//a[text()='Home']")private WebElement homePageCheck;
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")private WebElement errorMessageExist;
	  
	
	public LoginPage enterUsernameOnUsernameField(String username) 
	{
		userNameTextField.sendKeys(username);
		return this;
	}
	
	public LoginPage  enterPasswordOnPasswordField(String password)
	{
		passwordTextField.sendKeys(password);
		return this;
	}
	
	public LoginPage clickOnSignInButton()
	{
		signInButton.click();
		return this;
	}
	public boolean verifyHomePageNavigated()
	{
		boolean isHomePageNavigated=homePageCheck.isDisplayed();
		return isHomePageNavigated;
	}
	
	public boolean verifyHomePageNotNavigated()
	{
		boolean isAlertMessageDisplayed=errorMessageExist.isDisplayed();
		return isAlertMessageDisplayed;
	}
}
