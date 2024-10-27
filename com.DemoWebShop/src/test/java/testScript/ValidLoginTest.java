package testScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import genericLibrary.CustomListener;
import genericLibrary.FLib;
import pomPages.HomePage;
import pomPages.LoginPage; 

@Listeners(CustomListener.class)

public class ValidLoginTest extends BaseTest
{
	@Test(description = "Verify the user is able to perform login or not",groups = { "ST", "RT" })
	public void login() throws EncryptedDocumentException, IOException
	{
		HomePage hp= new HomePage(driver);
		hp.getLoginLink().click();
		FLib l = new FLib();
		String username = l.getDataFromExcel(EXCEL_PATH, valid, 1,0);
		String password = l.getDataFromExcel(EXCEL_PATH, valid, 1,1);
		LoginPage lp = new LoginPage(driver);
		lp.toLoginIntoDemoWebShop(username, password);
		
	}

}
