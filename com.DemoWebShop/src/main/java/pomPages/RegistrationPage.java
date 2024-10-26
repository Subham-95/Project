package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends Baseclass
{

	public RegistrationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	@FindBy(id ="gender-male")
	private WebElement maleRadioButton;
	
	@FindBy(id ="FirstName")
	private WebElement firstNameTextField;
	
	@FindBy(id ="LastName")
	private WebElement lastNameTextField;
	
	@FindBy(id ="Email")
	private WebElement emailTextField;
	
	@FindBy(id ="Password")
	private WebElement passwordTextField;
	
	@FindBy(id ="ConfirmPassword")
	private WebElement confirmPasswordTextField;
	
	@FindBy(id ="register-button")
	private WebElement registrationbutton;

	public WebElement getMaleRadioButton() {
		return maleRadioButton;
	}

	public WebElement getFirstNameTextField() {
		return firstNameTextField;
	}

	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getConfirmPasswordTextField() {
		return confirmPasswordTextField;
	}

	public WebElement getRegistrationbutton() {
		return registrationbutton;
	}
	
	//business logic
	public void toRegisterIntoDemoWebShop(String fn, String ln,String email,String password) throws InterruptedException
	{
		maleRadioButton.click();
		Thread.sleep(2000);
		firstNameTextField.sendKeys(fn);
		Thread.sleep(2000);
		lastNameTextField.sendKeys(ln);
		Thread.sleep(2000);
		emailTextField.sendKeys(email);
		Thread.sleep(2000);
		passwordTextField.sendKeys(password);
		Thread.sleep(2000);
		confirmPasswordTextField.sendKeys(password);
	}
	
	

}
