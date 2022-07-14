package page.objects;

import java.util.List;

import javax.lang.model.element.Element;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import core.Base;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import utilities.WebDriverUtility;

public class DesktopsPageObject extends Base {

	/* if we have the same UI elements which they are already defined in other page.objects-
	 * classes so I don't need to redefine them 
	 * 
	 * syntax for method:
	 * accessModifier returnType method name
	 */
	
	public DesktopsPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Desktops')]")
	private WebElement desktopTab;
	
	@FindBy(xpath="//a[contains(text(),'Show All Desktops')]")
	private WebElement showAllDesktops;
	
	@FindBy(tagName = "img")
	private List <WebElement> items; // driver.findElements
	
	@FindBy (xpath = "//a[text()='HP LP3065']")
	private WebElement hpLp3065Link;
	
	@FindBy(id = "input-quantity")
	private WebElement quantityinput;
	
	@FindBy(id = "button-cart")
	private WebElement addtoCardButton;
	
	@FindBy (xpath = "(//a[text()='HP LP3065'])[3]")
	private WebElement HPLPsuccessmessage; // when you put text() at the end of your xpath-
	//- the return type should be String instead of WebElement.
	
	
	@FindBy (xpath = "//a[contains(text(),'Canon EOS 5D Camera')]")
	private WebElement canonEQS5DCamera;
	
	@FindBy (xpath = "//a[contains(text(),'Write a review')]")
	private WebElement reviewLink;
	
	@FindBy (id = "input-name")
	private WebElement yourNameField;
	
	@FindBy (id = "input-review")
	private WebElement yourReviewField;
	
	@FindBy (xpath = "//input[@type='radio']")
	private List <WebElement> rating;
	
	@FindBy (id= "button-review")
	private WebElement reviewContinueButton;
	
	@FindBy (xpath = "//body/div[@id='product-product']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]")
	private WebElement reviewSubmissisonMessage;
	
//	@FindBy (xpath = "//a[text()='Canon EOS 5D Camera']")
//	private WebElement canonEOS5DCamera;
	
	@FindBy (id = "input-option226")
	private WebElement availableOptionField;
	
	@FindBy (id ="input-quantity")
	private WebElement quantitySelection;
	
	@FindBy (xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement cameraSuccessMessage;
	
	
	
	public void desktopTapClick() {
		WebDriverUtility.moveToElement(desktopTab);
		
	}
	
	public void showAllDesktopsClick() {
		showAllDesktops.click();
		
	}
	
	public List<WebElement> desktopsItems() {
		List<WebElement> itemsDesktop = items;
		return itemsDesktop;
	}
	
	public void clickOnhpLp3065item() {
		hpLp3065Link.click();
	}
	
	public void selectQuantity(String quantityValue) {
		
		quantityinput.clear();
		quantityinput.sendKeys(quantityValue);
	}
	
	public void clickOnAddToCardButton() {
		addtoCardButton.click();
	}
	
//	public String successMessage() {
//		String actualResult = "Success: You have added "+HPLPsuccessmessage.getText()+" to your Shopping cart!";
//		return actualResult;
//	}
//	
//	public boolean isSuccessMessagePresent() {
//		if(HPLPsuccessmessage.isDisplayed())
//			return true;
//		else
//			return false;
//	}
	
	public void clickOnCannonEQS5DCamera() {
		canonEQS5DCamera.click();
	}
	
	public void clickOnReviewLink() {
		reviewLink.click();
	}
	
	public void selectRating(String ratingValue) {  
	List<WebElement> ratingElements = rating;
	for(WebElement element : ratingElements) {
		if (element.getAttribute("value").equalsIgnoreCase(ratingValue.trim())) {
			element.click(); 
			break;
			// trim(): is a String method, it removes extra space before and after value
		}
	}
			
			
	}
	
	public void clickOnContinueButton() {
		reviewContinueButton.click();
	}
	
	public void enterYOurName(String nameValue ) {
		yourNameField.sendKeys(nameValue);
	}
	
	public void enterYourReview(String reviewValue) {
		yourReviewField.sendKeys(reviewValue);
	}
	
	public boolean isReviewTextPresent() {
		if(reviewSubmissisonMessage.isDisplayed())
			return true;
		else
			return false;
	}
	
	public void availableOptionClick() {
		availableOptionField.click();
	}
	
	public void selectRedOption() {
		Select selectRed = new Select (availableOptionField);
		selectRed.selectByValue("15");
	}
	
	public boolean isCameraSuccessMessagepresent() {
	if (cameraSuccessMessage.isDisplayed())
		return true;
	    else
		return false;
	}
//	public void canonEOS5DCameraClick() {
//		canonEOS5DCamera.click();
//	}
	
	
	
	
	
}
