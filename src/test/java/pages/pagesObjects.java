package pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class pagesObjects {
    private WebDriver driver;

    public pagesObjects(WebDriver driver) {
        this.driver = driver;
    }

    public void parseDatailsinSeachbox(String search) {
        WebElement searchbox = driver.findElement(By.xpath("//*[@id=\"gh-ac\"]"));
        searchbox.sendKeys(search);
    }

    public void hitSearchButton() {
        WebElement searchbutton = driver.findElement(By.xpath("//*[@id=\"gh-btn\"]"));
        searchbutton.click();
    }

    public void scrollDown(){
         JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 1000);");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    public void clickBeauty(){
        WebElement cb = driver.findElement(By.xpath("/html/body/div[5]/div[6]/ul/li[2]/a/div[1]/div/div"));
        cb.click();
    }
}
