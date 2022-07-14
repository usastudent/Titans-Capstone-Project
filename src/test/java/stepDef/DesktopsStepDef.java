package stepDef;

import java.util.List;


import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import page.objects.DesktopsPageObject;
import utilities.WebDriverUtility;

public class DesktopsStepDef extends Base {
	
	/* because we have already this code:@Given("User is on Retail website") in the -
	 * -RetailStepDefinition class, so we don't need to repeat it once more here, as long-
	 * -as they are under the same package
	 */
	
	/*
	 * syntax @Tag("exact words of step from scenario")
	 * 
	 * public void nameOfTheMethod(){ }
	 */
	
	/*WebElement element = driver.findElement(By.xpath(" ")
	 * element.click();
	 * logger.info("user clicked on Desktops tab");
	 * WebDriverUtility.takeScreenShot();
	 * we can use this type of coding and then we don't need Page objects class-
	 * - because we find UI elements here and in the same time we code it, but for-
	 * - better maintenance and avoiding repeating we use POM (page object class.
	 */
	
	DesktopsPageObject desktop = new DesktopsPageObject();
	
	
	@When("User click on Desktops tab")
	public void user_click_on_Desktops_tab() {
		
		desktop.desktopTapClick();
		logger.info("user is on desktops tab");
		WebDriverUtility.takeScreenShot();
		
	}
	
	@And("User click on Show all desktops")
	public void user_click_on_show_all_desktops() {
		WebDriverUtility.hardWait();
		desktop.showAllDesktopsClick();
		logger.info("user clicked on show all desktops");
		
		
	}
	
	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() {
	    
		/*
		 * because we have list:
		 * step 1: we need to store the element in a list
		 * step 2: we need to iterate through the list
		 * step 3: we need to write an assertion to validate each element (index) is present
		 */
		
		List<WebElement>desktopsElements = desktop.desktopsItems();
		for(WebElement element : desktopsElements) {
			Assert.assertTrue(element.isDisplayed());
			logger.info(element.getAttribute("title")+ " is present");
		}
		WebDriverUtility.takeScreenShot();
		WebDriverUtility.hardWait();
		
	}
	
	
	@And("User click ADD TO CART option on HP LP3065 item")
	public void user_click_ADD_TO_CART_option_on_HP_LP3065_item() {
		
		desktop.clickOnhpLp3065item();
		logger.info("user clicked on add to cart option");
		
		
		
	}
	
	@And("User select quantity {string}")
	public void user_select_quantity(String string) {
		
		desktop.selectQuantity(string);
		logger.info("user selected quantity "+ string);
		
	}
	
	@And("User click add to Cart button")
	public void user_click_add_to_cart_button() {
		
		desktop.clickOnAddToCardButton();
		logger.info("user clicked add to cart buttion");
		
	}
	
//	@Then("User should see a message {string}")
//	public void user_should_see_a_message(String expectedSuccessMessage) {
//	    
//		Assert.assertEquals(desktop.successMessage(), expectedSuccessMessage );
//		Assert.assertTrue(desktop.isSuccessMessagePresent());
//		logger.info(expectedSuccessMessage + " equals to " + desktop.successMessage());
//		WebDriverUtility.takeScreenShot();
//		WebDriverUtility.hardWait();
//	}
	
	
	
	@When("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() {
	    desktop.clickOnCannonEQS5DCamera();
	    logger.info("user clicked on cannon EQS 5D item");
	    WebDriverUtility.takeScreenShot();
	   
	}
	
	@When("User click on write a review link")
	public void user_click_on_write_a_review_link() {
	    desktop.clickOnReviewLink();
	    logger.info("user clicked on review link");
	}
	
	@When("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(DataTable dataTable) {
	  
		// the return type of cucumber is List, this list store Map, and Map has -
		// -key and value
		List<Map<String,String>> reviewInformation = dataTable.asMaps(String.class,String.class);
		desktop.enterYOurName(reviewInformation.get(0).get("yourname"));
		desktop.enterYourReview(reviewInformation.get(0).get("yourReview"));
		desktop.selectRating(reviewInformation.get(0).get("Rating"));
		
		logger.info("user added data in dataTable");
		WebDriverUtility.hardWait();
		WebDriverUtility.takeScreenShot();
	    
	}
	
	@When("User click on Continue Button")
	public void user_click_on_continue_button() {
	  desktop.clickOnContinueButton();
	   logger.info("user clicked on continue button");
	}
	
	@Then("User should see a message with {string}")
	public void user_should_see_a_message_with(String string) {
	    
	    Assert.assertTrue(desktop.isReviewTextPresent());
	    logger.info("the success message is present");
	    WebDriverUtility.hardWait();
	    WebDriverUtility.takeScreenShot();
	}

	@When("User click ADD TO CART option on Canon EOS 5D item")
	public void user_click_add_to_cart_option_on_canon_eos_5d_item() {
	 desktop.clickOnCannonEQS5DCamera();
	 logger.info("user clicked on add to cart option ");
	 WebDriverUtility.takeScreenShot();
	 WebDriverUtility.hardWait();
	 
	}
	
	@When("User select color from dropdown Red")
	public void user_select_color_from_dropdown_red() {
		
		desktop.selectRedOption();
		logger.info("user selected red color form dropdown");
		WebDriverUtility.takeScreenShot();
		WebDriverUtility.hardWait();
	}

	@Then("User should see a message {string}")
	public void user_should_see_a_message(String string) {
	    desktop.isCameraSuccessMessagepresent();
	    logger.info("user saw a success message");
	    WebDriverUtility.takeScreenShot();
		WebDriverUtility.hardWait();
	    
	}
	
	
	
	
	
	
	
	
}
