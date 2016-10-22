package Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckLinks {

    public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/usr/local/chromedriver");
		WebDriver driver = new ChromeDriver();
        String baseUrl = "http://newtours.demoaut.com/";
        String underConsTitle = "Under Construction: Mercury Tours";
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get(baseUrl);
        List<WebElement> linkelements = driver.findElements(By.tagName("a"));
        String[] linktexts = new String[linkelements.size()];
       /* List<WebElement> linkElements = driver.findElements(By.tagName("a"));
        String[] linkTexts = new String[linkElements.size()];*/
        int i = 0;

        //extract the link texts of each link element
        for (WebElement e : linkelements) {
            linktexts[i] = e.getText();
            i++;
        }

        //test each link
        for (String t : linktexts) {
            driver.findElement(By.linkText(t)).click();
            if (driver.getTitle().equals(underConsTitle)) {
                System.out.println("\"" + t + "\""
                        + " is under construction.");
            } else {
                System.out.println("\"" + t + "\""
                        + " is working.");
            }
            driver.navigate().back();
        }
        driver.quit();
    }
}
