package steps;

import com.test.selenium.steps.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps {

    HomePage home = new HomePage();

    @Given("^launch chrome browser$")
    public void launch_chrome_browser() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        home.launchBrowser();
    }

    @When("^user navigates to OrangeHRM home page$")
    public void user_navigates_to_OrangeHRM_home_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        home.navigateToHomePage();
    }

    @Then("^verify OrangeHRM logo$")
    public void verify_OrangeHRM_logo() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        home.validateLogo();
    }

    @Then("enter valid email address")
    public void enter_valid_email_address() {
        // Write code here that turns the phrase above into concrete actions
       home.validateEmailAddress();
    }
    @Then("close the browser")
    public void close_the_browser() {
        // Write code here that turns the phrase above into concrete actions
       home.closeBrowser();
    }
}
