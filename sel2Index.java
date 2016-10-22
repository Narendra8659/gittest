package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sel2Index {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/usr/local/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://jsbin.com/osebed/2 ");
		Select drop = new Select(driver.findElement(By.id("fruits")));
		drop.selectByVisibleText("Banana");
		
		if(drop.isMultiple()){
			System.out.println("We can select multiple");
		}
		else{
			System.out.println("We can not select mutliple");
		}
		drop.selectByIndex(2);
		Thread.sleep(5000);
		drop.deselectAll();
		driver.close();
	}

}
