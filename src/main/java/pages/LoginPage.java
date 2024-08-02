package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase
{
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(linkText="Forgot login info?")
	WebElement forgotLoginLink ;

	@FindBy(name="username")
	WebElement userNameLoginField ;

	@FindBy(name="password")
	WebElement passwordLoginField ;

	@FindBy(xpath="/html/body/div[1]/div[3]/div[1]/div/form/div[3]/input")
	WebElement loginBtn;
	
	public void UserLogin(String userName , String Password)
	{
		setTextElementText(userNameLoginField, userName);
		setTextElementText(passwordLoginField, Password);
		clickButton(loginBtn);
	}

}
