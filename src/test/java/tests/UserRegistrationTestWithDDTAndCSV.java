package tests;



import java.io.FileReader;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.opencsv.CSVReader;

import pages.HomePage;
import pages.LoginPage;
import pages.UserRegistrationPage;

public class UserRegistrationTestWithDDTAndCSV extends TestBase
{
	HomePage homeObject ; 
	UserRegistrationPage registerObject ; 
	LoginPage loginObject ; 

	CSVReader reader ; 

	@Test(priority=1,alwaysRun=true)
	public void UserCanRegisterSuccssfully() throws IOException 
	{
		// get path of CSV file 
		String CSV_file = System.getProperty("user.dir")+"/src/test/java/data/UserData.csv";
		reader = new CSVReader(new FileReader(CSV_file)); 

		String[] csvCell ; 

		// while loop will be executed till the lastvalue in CSV file . 
		while((csvCell = reader.readNext()) != null) 
		{
			String firstname = csvCell[0]; 
			String lastName = csvCell[1]; 
			String Address = csvCell[2];
			String City = csvCell[3];
			String State = csvCell[4];
			String ZipCode = csvCell[5];
			String PhoneNumber = csvCell[6];
			String SSN = csvCell[7];
			String UserName = csvCell[8];
			String Password = csvCell[9];



			homeObject = new HomePage(driver); 
			homeObject.openRegistrationPage();
			registerObject = new UserRegistrationPage(driver); 
			registerObject.userRegistration(firstname, lastName, Address, City ,State , ZipCode , PhoneNumber , SSN , UserName , Password );
			Assert.assertTrue(registerObject.successMessage.getText().contains("Your account was created successfully. You are now logged in"));
			registerObject.userLogout();
			loginObject = new LoginPage(driver); 
			loginObject.UserLogin(UserName,Password);
			Assert.assertTrue(homeObject.transferFundslink.getText().contains("Transfer Funds"));
			registerObject.userLogout();
		}
	}
}
