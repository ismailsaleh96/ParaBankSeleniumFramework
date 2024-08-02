package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends PageBase
{
	public HomePage(WebDriver driver) {
		super(driver);
		jse = (JavascriptExecutor) driver; 
		action = new Actions(driver); 
	}

	@FindBy(linkText="Register")
	public WebElement  registerLink ;


	@FindBy(linkText="ParaBank Is Now Re-Opened")
	public WebElement  paraBankIsOpenedLink ;

	@FindBy(linkText="Transfer Funds")
	public WebElement  transferFundslink ;

	@FindBy(xpath="//*[@id=\"topPanel\"]/a[2]/img")
	public WebElement  bankLogo ;


	public void openRegistrationPage()
	{
		clickButton(registerLink);
	}

}
