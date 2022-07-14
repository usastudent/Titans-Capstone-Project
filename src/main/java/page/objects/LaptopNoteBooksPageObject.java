package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import io.cucumber.java.en.And;

public class LaptopNoteBooksPageObject extends Base {
	
	public LaptopNoteBooksPageObject() {
		PageFactory.initElements(driver, this);
	}
	

	@FindBy (xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement laptopsAndNOtbooksField;
	
	@FindBy (xpath = "//a[text()='Show All Laptops & Notebooks']")
	private WebElement showAllLaptopsAndNotebooksField;
	
	@FindBy (xpath = "//a[text()='MacBook']")
	private WebElement macBookField;

	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement clickToAddToCart;

	@FindBy(xpath = "//*[text()='Success: You have added ']")
	private WebElement theSuccessMassage;
	
	@FindBy (xpath = "//td[contains(text(),'x 1')]")
	private WebElement quantityNumber;
	
	@FindBy(xpath = "//*[text()=' 1 item(s) - $602.00']")
	private WebElement SeeOneItemInItemsOption;

	@FindBy(xpath = "//span[text()=' 1 item(s) - $602.00']")
	private WebElement ClickOnCartOption;

	@FindBy(xpath = "//button[@title='Remove']")
	private WebElement clickOnRemovetheitems;

	@FindBy(xpath = "//span[text()=' 0 item(s) - $0.00']")
	private WebElement noItemsAddtothecart;

	
//	@FindBy (xpath = "//td[contains(text(),'$602.00')]")
//	private WebElement priceAmount;
	
	@FindBy (xpath = "//i[@class='fa fa-times']")
	private WebElement crossSign;
	
	@FindBy (xpath = "(//button[@data-original-title='Compare this Product'])[2]")
	private WebElement mackBookComparison;
	
	@FindBy (xpath = "(//button[@data-original-title='Compare this Product'])[3]")
	private WebElement macBookAirCompraison;
	
	@FindBy (xpath = "//a[text()='MacBook Air']")
	private WebElement macBookAirElement;
	
	@FindBy (id = "compare-total")
	private WebElement camparisonLinkField;
	
	@FindBy (xpath = "//h1[text()='Product Comparison']")
	private WebElement camparisonTextField;
	
	@FindBy (xpath = "(//i[@class='fa fa-heart'])[6]")
	private WebElement heartField;
	
	@FindBy (xpath = "//a[text()='create an account']")
	private WebElement washListCreatingAccountText;
	
	@FindBy (xpath = "//a[text()='MacBook Pro']")
	private WebElement validateClickMackbookField;
	
	@FindBy (xpath = "//h2[text()='$2,000.00']")
	private WebElement priceTagField;
	
	
	
	public void laptopsAndNotbooksclick () {
		Actions action = new Actions(driver);
		action.moveToElement(laptopsAndNOtbooksField).build().perform();
	}
	
	public void showAllLaptopsAndNotebooksClick() {
		showAllLaptopsAndNotebooksField.click();
	}
	
	public void macBookClick() {
		macBookField.click();
	}
	public void clickToAddToCart() {
		clickToAddToCart.click();

	}

	public boolean theSuccessMassage() {
		if (theSuccessMassage.isDisplayed())
			return true;
		else
			return false;
	}

	public void SeeOneItemInItemsOption() {
		SeeOneItemInItemsOption.isDisplayed();
	}

	public void ClickOnCartOption() {
		ClickOnCartOption.click();
	}

	public void clickOnRemovetheitems() {
		clickOnRemovetheitems.click();
	}

	public void noItemsAddtothecart() {
		noItemsAddtothecart.isDisplayed();
	}
	
//	public boolean priceMatchField() {
//		if (quantityNumber.equals(quantityNumber)) {
//			
//		}
//	}
	
	public void mackBookComprasionClic() {
		mackBookComparison.click();
	}
	
	public void macBookAirCompraisonClick() {
		macBookAirCompraison.click();
	}
	
	public String macBookAirCongratsMessage () {
		String realText = "Success: You have added "+macBookAirElement.getText()+" to your product comparison!";
		return realText;
	}
	
	public boolean ismacBookTextPresent() {
		if(macBookAirElement.isDisplayed())
			return true;
		else
			return false;
	}
	
	public void camparisonLinkClick() {
		camparisonLinkField.click();
	}
	
	public boolean isCamparisonTextShown () {
	if (camparisonTextField.isDisplayed())
		return true;
	else
		return false;
	}
	
	public void heartclick () {
		heartField.click();
	}
	
	public boolean isCreatingAccountMessage() {
		if(washListCreatingAccountText.isDisplayed())
			return true;
		else
			return false;
	}
	
	public void validateClickMackbookClick() {
		validateClickMackbookField.click();
	}
	
	public boolean isPriceTagPresent() {
		if (priceTagField.isDisplayed())
			return true;
		else
			return false;
	}
	
	
	
	
	
	
	
	
	
	
}
