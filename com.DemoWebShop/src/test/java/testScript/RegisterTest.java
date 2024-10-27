package testScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import genericLibrary.FLib;
import genericLibrary.WorkLib;
import pomPages.HomePage;
import pomPages.RegistrationPage;


public class RegisterTest extends BaseTest
{
	String email = "banerjee"+WorkLib.getRandomNumber()+"@gmail.com";
	
	@Test(description = "Verify if user is able to register or not",groups={"FT"})
	public void register() throws EncryptedDocumentException, IOException, InterruptedException
	{
		//Click on register link
		HomePage hp = new HomePage(driver);
		hp.getRegisterLink().click();
		
		//Fetching Data
		FLib l = new FLib();
		String fn = l.getDataFromExcel(EXCEL_PATH,REG_PATH,1,0);
		String ln = l.getDataFromExcel(EXCEL_PATH,REG_PATH,1,1);
		String password = l.getDataFromExcel(EXCEL_PATH,REG_PATH,1,3);
		
		//To register
		RegistrationPage rp = new RegistrationPage(driver);
		rp.toRegisterIntoDemoWebShop(fn, ln, email, password);
		
		
		
	}
													

}
