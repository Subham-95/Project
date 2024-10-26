package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Baseclass 
{
	public Baseclass(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
