package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageLink {

    public static void main(String[] args) throws InterruptedException {
    	
        String baseUrl = "https://www.facebook.com/login/identify?ctx=recover";
        System.setProperty("webdriver.chrome.driver", "/usr/local/chromedriver");
		WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
        Thread.sleep(4000);
        System.out.println(driver.getTitle());
        //click on the "Facebook" logo on the upper left portion
        driver.findElement(By.cssSelector("a[title=\"Go to Facebook Home\"]")).click();
        System.out.println(driver.getTitle());
        //verify that we are now back on Facebook's homepage
        if (driver.getTitle().equals("Facebook - Log In or Sign Up")) {
            System.out.println("We are back at Facebook's homepage");
        } else {
            System.out.println("We are NOT in Facebook's homepage");
        }
        driver.quit();
    }
}
