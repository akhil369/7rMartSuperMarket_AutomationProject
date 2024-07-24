package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Categorypage {
	public WebDriver driver;
	public Categorypage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//i[@class='fas fa-arrow-circle-right']//parent::a[@href='https://groceryapp.uniqassosiates.com/admin/list-page']") WebElement categoryTile;
	@FindBy(xpath="//a[@onclick='click_button(1)']") WebElement newButton;
	@FindBy(xpath="//input[@id='category']") WebElement categoryTextField;
	@FindBy(xpath ="//li[@class='ms-elem-selectable ms-hover']") WebElement groupOne;
	

}
