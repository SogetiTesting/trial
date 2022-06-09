
package features.step_definitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LandingPage;
import static utils.DriversUtils.getDriver;
public class SortBYPrice {

    @Given("I made a research of existing item")
    public void iMadeAResearchOfExistingItem() {
        getDriver().get("http://automationpractice.com/index.php?controller=search&orderby=position&orderway=desc&search_query=dress&submit_search=");
    }


    @When("I click on sort by  and chose \"sort by price\\(lowest to highest)")
    public void iClickOnSortByAndChoseSortByPriceLowestToHighest() throws Throwable {
        // Write code here that turns the phrase above into concrete actions    throw new cucumber.api.PendingException();}
        LandingPage landingPage = new LandingPage();
        landingPage.getSelectSortBy();
    }

    @Then("I have the result for the search sorted by price\\(lowest to highest)")
    public void iHaveTheResultForTheSearchSortedByPriceLowestToHighest() {

    }

}