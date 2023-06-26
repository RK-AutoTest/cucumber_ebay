package stepDefinations;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.pagesObjects;

public class StepDefinitions {
    WebDriver driver;
    pagesObjects po;

    public StepDefinitions() {
        // Constructor
        driver = testBase.driver; // Initialize your WebDriver instance here
        po = new pagesObjects(driver);
    }

    @Given("User is on the eBay homepage")
    public void user_is_on_ebay_homepage() {
        System.out.println("User is on the eBay homepage");
    }

    @When("User clicks on the input field and enters data {string}")
    public void user_clicks_on_search_box(String data) {
        po.parseDatailsinSeachbox(data);
        System.out.println("User clicks on the 'Search box' input field");
    }

    @Then("User clicks on the search button")
    public void user_clicks_on_search_button() {
        po.hitSearchButton();
        System.out.println("User clicks on the search button");
    }



    @Given("user scroll down to page.")
public void user_scroll_down_to_page() {
    po.scrollDown();
    
}
@When("element gets visible user clicks on the element beauty.")
public void element_gets_visible_user_clicks_on_the_element_beauty() {
    po.clickBeauty();
  
}


}
