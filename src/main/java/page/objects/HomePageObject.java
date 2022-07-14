package page.objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HomePageObject extends Base {

	public HomePageObject () {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//span[text()='Currency']")
	private WebElement currencyField;
	
	@FindBy (xpath = "(//button[@class='currency-select btn btn-link btn-block'])[1]")
	private WebElement currencyChooseField;
	
	@FindBy (xpath = "//strong[text()='€']")
	private WebElement euroCurrencyField;
	
	@FindBy (id = "cart-total")
	private WebElement cartButtonField;
	
	@FindBy (xpath = "//p[text()='Your shopping cart is empty!']")
	private WebElement shoppingCartField;
	
	
	
	public void CurrencyClick () {
		currencyField.click();
	}
	
	public void selectionCurrency () {
		currencyChooseField.click();
			
	}
	
	public boolean isEuroCurrencySelected() {
		if(euroCurrencyField.isDisplayed())
			return true;
		else
			return false;
	}
	
	public void cartButtonClick() {
		cartButtonField.click();
	}
	
	public boolean isshoppingCartMessageDisplayed() {
		if(shoppingCartField.isDisplayed())
			return true;
		else
			return false;
	}
	
	
	
}
