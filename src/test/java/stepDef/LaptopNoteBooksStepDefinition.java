package stepDef;

import core.Base;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import page.objects.LaptopNoteBooksPageObject;
import utilities.WebDriverUtility;

public class LaptopNoteBooksStepDefinition extends Base{

	LaptopNoteBooksPageObject laptop = new LaptopNoteBooksPageObject();
	
	
	@When("User click on Laptop &NoteBook tab")
	public void user_click_on_laptop_note_book_tab() {
	    laptop.laptopsAndNotbooksclick();
	    logger.info("user clicked on laptop and notbook tab");
	    WebDriverUtility.hardWait();
	    WebDriverUtility.takeScreenShot();
	    
	}
	
	@When("User click on Show all Laptop &NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() {
	    laptop.showAllLaptopsAndNotebooksClick();
	    logger.info("user clicked on show all laptop and Notebook option");
	    WebDriverUtility.hardWait();
	    WebDriverUtility.takeScreenShot();
	}
	
	@When("User click on MacBook item")
	public void user_click_on_mac_book_item() {
	   laptop.macBookClick();
	   logger.info("user clicked on Macbook item");
	   WebDriverUtility.hardWait();
	   WebDriverUtility.takeScreenShot();
	}
	@When("User click add to Cart button for Mac Book")
	public void user_click_add_to_cart_button_for_mac_book() throws InterruptedException {
		laptop.clickToAddToCart();
		logger.info("user Add MacBook To Cart");
		Thread.sleep(2000);
	}
	@Then("User should see {string} item\\(s){string} showed to the cart")
	public void user_should_see_item_s_showed_to_the_cart(String string, String string2) {
	    Assert.assertTrue(laptop.theSuccessMassage());
	    logger.info("user saw the item with price");
	    WebDriverUtility.takeScreenShot();
	    WebDriverUtility.hardWait();
	}
	@Then("User should see {string} showed to the cart")
	public void user_should_see_showed_to_the_cart(String string) throws InterruptedException {
		laptop.SeeOneItemInItemsOption();
		logger.info("user can see one Item in the items");
		Thread.sleep(2000);
	}
	@And("User click on cart option")
	public void user_click_on_cart_option() {
	    laptop.ClickOnCartOption();
	    logger.info("user clicked on cart option");
	    WebDriverUtility.takeScreenShot();
	    WebDriverUtility.hardWait();
	    
	}
	
	@And("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
		laptop.clickOnRemovetheitems();
		logger.info("user clicked on red x button");
		WebDriverUtility.takeScreenShot();
	    WebDriverUtility.hardWait();
	    
	}
	
	@Then("item should be removed and cart should show {int} item\\(s)")
	public void item_should_be_removed_and_cart_should_show_item_s(Integer int1) {
	  laptop.noItemsAddtothecart();
	  logger.info("item should be removed");
	}

	@When("User click on product comparison icon on MacBook")
	public void user_click_on_product_comparison_icon_on_mac_book() {
	    laptop.mackBookComprasionClic();
	    logger.info("user clicked on product comparison icon on Macbook");
	    WebDriverUtility.takeScreenShot();
	    WebDriverUtility.hardWait();
	    
		
	}
	
	@When("User click on product comparison icon on MacBook Air")
	public void user_click_on_product_comparison_icon_on_mac_book_air() {
		laptop.macBookAirCompraisonClick();
		logger.info("user clicked on product comparison icon on Macbook Air");
		WebDriverUtility.takeScreenShot();
	    WebDriverUtility.hardWait();
	    
		
	}
	
	@Then("User should see a message 'Success: You have added MacBook Air to your product comparison!’")
	public void user_should_see_a_message_success_you_have_added_mac_book_air_to_your_product_comparison() {
	    Assert.assertTrue(laptop.ismacBookTextPresent());
	    logger.info("user saw a success message");
	    WebDriverUtility.takeScreenShot();
	    WebDriverUtility.hardWait();
	}
	
	@Then("User click on Product comparison link")
	public void user_click_on_product_comparison_link() {
		laptop.camparisonLinkClick();
		logger.info("user clicked on product comparison link");
		WebDriverUtility.takeScreenShot();
	    WebDriverUtility.hardWait();
	    
	}
	
	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() {
	   Assert.assertTrue(laptop.isCamparisonTextShown());
	   logger.info("user saw product comparison chart");
	   WebDriverUtility.takeScreenShot();
	   WebDriverUtility.hardWait();
	}

	@When("User click on heart icon to add Sony VaIO laptop to wish list")
	public void user_click_on_heart_icon_to_add_laptop_to_wish_list() {
	    laptop.heartclick();
	    logger.info("user clicked on heart icon to add laptop to wishlist");
	    WebDriverUtility.takeScreenShot();
		   WebDriverUtility.hardWait();
	}
	
	@Then("User should get a message {string}")
	public void user_should_get_a_message(String string) {
	   Assert.assertTrue(laptop.isCreatingAccountMessage());
	   logger.info("user saw a message");
	   WebDriverUtility.takeScreenShot();
	   WebDriverUtility.hardWait();
	}
	
	@When("User click on ‘MacBook Pro’ item")
	public void user_click_on_mac_book_pro_item() {
		laptop.validateClickMackbookClick();
		logger.info("user clicked on Mackbook Pro item");
		WebDriverUtility.takeScreenShot();
	   WebDriverUtility.hardWait();
	   
	}
	
	@Then("User should see {string} price tag is present on UI")
	public void user_should_see_price_tag_is_present_on_ui(String string) {
		Assert.assertTrue(laptop.isPriceTagPresent());
		logger.info("user confirmed price tag is present on UI");
		WebDriverUtility.takeScreenShot();
		   WebDriverUtility.hardWait();
	}
	
	
	
}
