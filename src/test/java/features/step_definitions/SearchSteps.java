package features.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.LandingPage;
import java.io.IOException;

import static utils.DriversUtils.getDriver;

public class SearchSteps {

    //A-The Given
    LandingPage landingPage = new LandingPage();

    public SearchSteps() throws IOException {
    }

    //public SearchSteps() throws IOException {
    //}

    //The Given
    @Given("I am on the landing page")
    public void iAmOnTheLandingPage() throws IOException {

        getDriver().get("https://automationpractice.com/");
    }

    @When("I search for a {string}")
    public void i_search_for_a(String itemName) throws IOException {
        landingPage.searchForItem(itemName);

    }

    @Then("the number of results is set as expected")
    public void the_number_of_results_is_set_as_expected() {
        String numberResult = getDriver().findElement(By.className("heading-counter")).getText();
        System.out.println(numberResult);
    }


}
