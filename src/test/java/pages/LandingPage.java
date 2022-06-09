package pages;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

import static utils.DriversUtils.getDriver;

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


public class LandingPage {

    public WebDriver webDriver;

    @FindBy(id= "search_query_top")
    public WebElement searchBoxElement;

    public LandingPage() throws IOException{
        PageFactory.initElements(getDriver(), new PageFactory());
    }


    //public void searchForItem(String itemName) throws IOException {
    //    searchBoxElement.sendKeys(itemName);
    //    //getDriver().findElement(By.id()).sendKeys(itemName);


    //   searchBoxElement.sendKeys(Keys.ENTER);
    //    //getDriver().findElement(By.id()).sendKeys(Keys.ENTER);

    //}

    public void searchForItem(String itemName) throws IOException {
        WebElement searchBox = getDriver().findElement(By.id("search_query_top"));
        searchBox.sendKeys(itemName);
        //fillInTextBoxById("search_query_top",itemName);
        // fillInTextBoxById("search_query_top", String.valueOf(Keys.ENTER));

        //enter permet de rentrer une recherche dans l'input
        getDriver().findElement(By.id("search_query_top")).sendKeys(Keys.ENTER);
        /*
         or
        searchBox.sendKeys(Keys.ENTER);
        */
    }

    static Select selectSortBy = new Select(getDriver().findElement(By.id("selectProductSort")));


    public static Select getSelectSortBy() {
        //Select selectSortBy;
        selectSortBy.selectByVisibleText("Price: Lowest first");
        return getSelectSortBy();
    }



}
