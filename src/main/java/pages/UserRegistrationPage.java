package pages;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegistrationPage extends PageBase 
{
	public UserRegistrationPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="customer.firstName")
	WebElement firstNameField;
	
	@FindBy(id="customer.lastName")
	WebElement lastNameField ;
	
	@FindBy(id="customer.address.street")
	WebElement AddressField ;
	
	@FindBy(id="customer.address.city")
	WebElement cityField ;
	
	@FindBy(id="customer.address.state")
	WebElement stateField ;
	
	@FindBy(id="customer.address.zipCode")
	WebElement zipCodeField ;

	@FindBy(id="customer.phoneNumber")
	WebElement phoneNumberField ;

	@FindBy(id="customer.ssn")
	WebElement SsnField ;

	@FindBy(id="customer.username")
	WebElement userNameField ;
	
	@FindBy(id="customer.password")
	public WebElement passwordField ;
	
	@FindBy(id="repeatedPassword")
	public WebElement repeatedPasswordField ;
	
	@FindBy(xpath="//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")
	WebElement RegisterBtn ;

	@FindBy(xpath="//*[@id=\"rightPanel\"]/p")
	public WebElement successMessage ;

	@FindBy(linkText="Log Out")
	public WebElement logoutLink ;

	public void userRegistration(String firstName , String lastName , String Address , String City , String State , String ZipCode  , String PhoneNumber , String SSN , String UserName , String Password )
	{
		setTextElementText(firstNameField, firstName);
		setTextElementText(lastNameField, lastName);
		setTextElementText(AddressField, Address);
		setTextElementText(cityField, City);
		setTextElementText(stateField, State);
		setTextElementText(zipCodeField, ZipCode);
		setTextElementText(phoneNumberField, PhoneNumber);
		setTextElementText(SsnField, SSN);
		setTextElementText(userNameField, UserName);
		setTextElementText(passwordField, Password);
		setTextElementText(repeatedPasswordField, Password);
		clickButton(RegisterBtn);
	}
	
	public void userLogout() 
	{
		clickButton(logoutLink);
	}

	
}
