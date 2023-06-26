package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class testBase {
    protected static WebDriver driver;

    @Before
    public void setup() {
        String logLocation = "target\\classes\\log4j.properties"; // Update this with the actual path to your log file
        System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, logLocation);

        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Webdriver for selenium\\chromedriver.exe");
        
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com");
    }

    @After
   public void teardown() { try {
    Thread.sleep(3000);
       //Close the browser
       if (driver != null) {
           driver.quit();
   }
   } catch (Exception e) {
    
   }
    
  }
}
