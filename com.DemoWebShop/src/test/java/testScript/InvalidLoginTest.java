package testScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import genericLibrary.FLib;
import pomPages.HomePage;
import pomPages.LoginPage;

public class InvalidLoginTest extends BaseTest
{
	@DataProvider(name = "TestData")
	public Object [][] invalidData() throws EncryptedDocumentException, IOException
	{
		//Object [][] o = new Object[5][2];
		//o[0][0]= "Hello";
	//	o[0][1]= "Hello@123";
		
		//o[1][0]= "Helloasaa";
		//o[1][1]= "Heldsssglo@123";
		
		//o[2][0]= "Hellaacco";
	//	o[2][1]= "Helvssvslo@123";
		
		//o[3][0]= "Helloweweww";
	//	o[3][1]= "Hsdsaaaello@123";
		
	//	o[4][0]= "Hellovvvvv";
		//o[4][1]= "Hellodddd@123";
		
	//	return o;	
	
		return FLib.toGetMultipleDataFromExcel(EXCEL_PATH,Invalid);
	
	
		
	}
	
	@Test(dataProvider = "TestData")
	public void inValidLogin(String username,String password)
	{
		HomePage h= new HomePage(driver);
		h.getLoginLink().click();
		LoginPage l = new LoginPage(driver);
		l.toInvalidLoginIntoDemoWebShop(username, password);
		
		
		
	}
	
	
	
}
