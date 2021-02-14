package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
	
	@Test
	  public void f() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Pradeep\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.facebook.com/");

	  }

}
