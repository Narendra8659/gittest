package Practice;

import org.apache.bcel.verifier.exc.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.Test;

public class uploadfile {
	public static void main(String[] args){
	//System.setProperty("webdriver.chrome.driver", "/usr/local/chromedriver");
	//WebDriver driver = new ChromeDriver();
	WebDriver driver = new FirefoxDriver();
	

	driver.get("https://www.freepdfconvert.com/");
	driver.findElement(By.id("clientUpload")).sendKeys("/Users/narendragangavarapu/Desktop/123");
	//Utility.CaptureScreenshot(driver, "facebook");
}
}