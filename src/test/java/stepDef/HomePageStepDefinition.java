package stepDef;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import page.objects.HomePageObject;
import utilities.WebDriverUtility;

public class HomePageStepDefinition extends Base{
	
	HomePageObject homePage = new HomePageObject();

	
	@When("User click on Currency")
	public void user_click_on_currency() {
	    homePage.CurrencyClick();
	    logger.info("user clicked on currency");
	    WebDriverUtility.takeScreenShot();
	    WebDriverUtility.hardWait();
	    
	}
	
	@And("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() {
		homePage.selectionCurrency();
		WebDriverUtility.takeScreenShot();
	    WebDriverUtility.hardWait();
	    
	}
	
	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() {
	  Assert.assertTrue(homePage.isEuroCurrencySelected());  
	  logger.info("currency value changed to Euro");
	  WebDriverUtility.takeScreenShot();
      WebDriverUtility.hardWait();
	  
	}

	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() {
	  homePage.cartButtonClick();
	  logger.info("user clicked on shopping cart");
	  WebDriverUtility.takeScreenShot();
      WebDriverUtility.hardWait();
	}
	
	@Then("{string} message should display")
	public void message_should_display(String string) {
	    Assert.assertTrue(homePage.isshoppingCartMessageDisplayed());
	    logger.info("your shopping cart empty message is displayed");
	    WebDriverUtility.takeScreenShot();
	    WebDriverUtility.hardWait();
	}
	
	
	
	
	
	
	
	
	
}
