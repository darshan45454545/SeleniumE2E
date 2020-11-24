package samplepakage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC001 {
	
    @Test
	public void testcase1()
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElementById("email").sendKeys("hello");
		driver.findElementById("pass").sendKeys("hello");
		driver.quit();
	}
}
