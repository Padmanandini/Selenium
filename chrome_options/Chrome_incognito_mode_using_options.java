package chrome_options;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome_incognito_mode_using_options {

	public static void main(String[] args) 
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("incognito");
		
		System.setProperty("webdriver.chrome.driver", "Drivers'\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
	}

}
