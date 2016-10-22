package Practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Testjava {

@Test	
	public void Screenshot(){
		System.setProperty("webdriver.chrome.driver", "/usr/local/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.southwest.com");
		driver.findElement(By.id("trip-type-one-way")).click();
		String aa = driver.getCurrentUrl();
		System.out.println(aa);
		driver.findElement(By.id("air-city-departure")).sendKeys("DAL");
		String ab = driver.getCurrentUrl();
		System.out.println(ab);
		driver.findElement(By.id("air-city-arrival")).sendKeys("SFO");
		driver.findElement(By.id("air-date-departure")).click();
		driver.findElement(By.xpath(".//*[@id='calendar-september-22']")).click();
		//driver.findElement(By.id("air-date-return")).sendKeys(arg0);//Out9A
		driver.findElement(By.id("jb-booking-form-submit-button")).click();
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.id("Out8A")).click();//Select Price
		driver.findElement(By.id("priceItinerarySubmit")).click();//Submit Itinenary
		driver.findElement(By.id("checkoutButton")).click();//Click Checkout
		driver.findElement(By.id("firstName0")).sendKeys("Narendra");
		driver.findElement(By.id("lastName0")).sendKeys("Reddy");
		
	//Drop down month
		Select dropdown = new Select(driver.findElement(By.id("dobMonth0")));
		dropdown.selectByIndex(9);
		// Day
		Select day = new Select(driver.findElement(By.id("dobDay0")));
		day.selectByIndex(22);
		//Year
		Select year = new Select(driver.findElement(By.id("dobYear0")));
		year.selectByVisibleText("1992");
		//Select Gender
		Select Gender = new Select(driver.findElement(By.id("gender0")));
		Gender.selectByVisibleText("Male");
		//Email for Ticket
		driver.findElement(By.id("js-email")).sendKeys("narendra8659@gmail.com");
		
		//Select Credit card
		
		driver.findElement(By.id("creditCard")).click();
		
		//Select Type of Card
		
		Select Card = new Select(driver.findElement(By.id("creditCardType")));
		Card.selectByVisibleText("Visa");
		
		driver.findElement(By.id("creditCardNumber1")).sendKeys("4567986357291681");
		
		Select Month = new Select(driver.findElement(By.id("expirationMonth")));
		Month.selectByIndex(2);
		
		Select Year = new Select(driver.findElement(By.id("expirationYear")));
		Year.selectByValue("2020");
		
		driver.findElement(By.id("securityCode")).sendKeys("345");
		//FirstNAme
		driver.findElement(By.id("creditCardFirstName")).sendKeys("Narendra");
		//Lastname
		driver.findElement(By.id("creditCardLastName")).sendKeys("Gangavarapu");
		//Address
		driver.findElement(By.id("creditCardAddress1")).sendKeys("1234 Love field Drive");
		driver.findElement(By.id("creditCardAddress2")).sendKeys("CorporateOffice");
		//City
		driver.findElement(By.id("creditCardCity")).sendKeys("Dallas");
		
		
		//State
		
		Select city = new Select(driver.findElement(By.id("creditCardState")));
		city.selectByVisibleText("Texas");
		
		//Zipcode
		driver.findElement(By.id("creditCardZip1")).sendKeys("76010");
		
		/*Select Country = new Select(driver.findElement(By.id("creditCardCountry")));
		Country.selectByIndex(1); */
		//phone number
		
		driver.findElement(By.id("billerAreaCode")).sendKeys("507");
		
		driver.findElement(By.id("billerPrefix")).sendKeys("304");
		
		driver.findElement(By.id("billerUsPhoneLineNumber")).sendKeys("1815");
		
		driver.findElement(By.id("creditCardAddressTypebusiness")).click();
		
		driver.findElement(By.id("emailConfirmationMethod")).click();
		
		driver.findElement(By.id("emailConfirmationAddress")).sendKeys("narendra8659@gmail.com");
		
		driver.findElement(By.id("js-available-emails0")).sendKeys("dallas123@gmail.com");
		
		driver.findElement(By.id("purposeOfTravel2")).click();
		
		//driver.quit();
		//Purchase
		//driver.findElement(By.id("visibleSubmitButton")).click();
	
			File src1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			try{
				 // now copy the  screenshot to desired location using copyFile //method
				FileUtils.copyFile(src1, new File("Screen_SOUTH.png"));
			}
			catch (IOException e)
			 {
			  System.out.println(e.getMessage());
			 
			 } 
		driver.quit();
		

	}

}
