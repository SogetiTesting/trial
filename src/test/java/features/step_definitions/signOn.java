package features.step_definitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pages.LandingPage;
import java.io.IOException;
//this on
import org.openqa.selenium.WebElement;
//& this on
import org.openqa.selenium.support.ui.Select;
import static utils.DriversUtils.getDriver;
//& all of theses
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class signOn {

    //WebDriverManager.chromedriver().setup();

    private Object statedropdown;
    private Object oSelect;

    //need to set the implicitlyWait to get things working
    //NotWorking : need to find how to apply the wait for current getDriver session
    //getDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    @Given("I am on the home page")
    public void iAmOnTheLandingPage() throws IOException {
        getDriver().get("https://automationpractice.com/");
    }

    @When("I click on the signOn button")
    public void iClickOnSignOnButton() throws Throwable {
        //LandingPage landingPage = new LandingPage();
        getDriver().findElement(By.linkText("Sign in")).click();
    }

    @And("I enter an valid email data \"saidoundjahid@gmail.com\"")
    public void iEnterValidEmailData() {
        getDriver().findElement(By.cssSelector("[name='email_create']")).sendKeys("saidoundjahid@gmail.com");
    }

    @And("click on create an account button")
    public void iClickOnCreateAnAccountButton() throws Throwable {
        getDriver().findElement(By.xpath("//button[@name=\"SubmitCreate\"]")).click();
    }

    @And("user select Title and fill in registration data \"djahid\" and \"saidoun\" and \"saidoundjahid@gmail.com\" and \"123456\"")
    public void informationFillingPartOne() throws Throwable {
        //error when i'am trying to click on Mr title (UPDATE SOLVED)
        getDriver().findElement(By.xpath("//input[@id=\"id_gender1\"]")).click();
        getDriver().findElement(By.id("customer_firstname")).sendKeys("djahid");
        getDriver().findElement(By.id("customer_lastname")).sendKeys("saidoun");
        getDriver().findElement(By.id("passwd")).sendKeys("123456");
    }

    //no idea how to retrive & select date object file by day month year on same form field in the webpage ?
    //@And("select date of birth \"01/10/1995\"")
    //public void dateOfBirthSelection() throws Throwable {
    //}

    @And("enter \"djahid\" and \"saidoun\" and \"sogeti\" and \"18, BessenveldStraat\" and \"Diegem\"")
    public void informationFillingPartTwo() throws Throwable {
        getDriver().findElement(By.id("firstname")).sendKeys("djahid");
        getDriver().findElement(By.id("lastname")).sendKeys("saidoun");
        getDriver().findElement(By.id("company")).sendKeys("sogeti");
        getDriver().findElement(By.id("address1")).sendKeys("18, BessenveldStraat");
        getDriver().findElement(By.id("city")).sendKeys("Diegem");
    }

    @And("select \"alabama\" in state")
    public void stateAlabamaChoose() throws Throwable {
        WebElement statedropdown=getDriver().findElement(By.name("id_state"));
        Select oSelect=new Select(statedropdown);
        oSelect.selectByValue("1");
    }

    @And("enter \"1830\" in zipcode field")
    public void informationFillingPartThree() throws Throwable{
        getDriver().findElement(By.name("postcode")).sendKeys("1830");
    }

    @And("select \"United States\" in country list")
    public void countryChoose() throws Throwable {
        WebElement countrydropDown=getDriver().findElement(By.name("id_country"));
        Select oSelectC=new Select(countrydropDown);
        oSelectC.selectByVisibleText("United States");
    }

    @And("enter \"23254628\" in phone field and \"alias\" in alias field")
    public void informationFillingPartFour() throws Throwable {
        getDriver().findElement(By.id("phone_mobile")).sendKeys("234567890");
        getDriver().findElement(By.xpath("//input[@name=\"alias\"]")).clear();
        getDriver().findElement(By.xpath("//input[@name=\"alias\"]")).sendKeys("alias");
    }
    @And("click on \"register button\" at the end of the page")
    public void clickOnRegister() throws Throwable {
            getDriver().findElement(By.name("submitAccount")).click();
    }

    @Then("user is successfully registered and his data are validated")
    public void successDataRegistration() throws Throwable {
        String userText=getDriver().findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).getText();
        // Validate that user has created
        if(userText.contains("saidoun")) {
            System.out.println("User Verified & Registered,Test case Passed");
        }
        else {
            System.out.println("User Data Verification Failed,Test case Failed");
        }
    }
}

