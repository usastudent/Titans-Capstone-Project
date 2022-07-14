package page.objects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class RetailPageObject extends Base {
	
	public RetailPageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	public WebElement testEnvironmentLogo;

	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement myAccountOption;

	@FindBy(xpath = "//a[text()='Login']")
	private WebElement loginOption;

	@FindBy(id = "input-email")
	private WebElement emailField;

	@FindBy(id = "input-password")
	private WebElement passWordField;

	@FindBy(xpath = "//input[@class='btn btn-primary']")
	private WebElement loginButton;

	@FindBy(xpath = "//h2[text()='My Account']")
	private WebElement myAccountDashboard;

	@FindBy(xpath = "//a[text()='Register for an affiliate account']")
	private WebElement registerForAnAffiliateAccount;

	@FindBy(id = "input-company")
	private WebElement companyField;

	@FindBy(id = "input-website")
	private WebElement webSiteField;

	@FindBy(id = "input-tax")
	private WebElement taxField;

	@FindBy(xpath = "//input[@value='cheque']")
	private WebElement chequeButton;

	@FindBy(xpath = "//input[@value='paypal']")
	private WebElement paypalButton;

	@FindBy(xpath = "//input[@value='bank']")
	private WebElement bankButton;

	@FindBy(id = "input-cheque")
	private WebElement chequePayeeNameField;

	@FindBy(xpath = "//input[@value='1']")
	private WebElement aboutUsCheckBox;

	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continueButton;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessageOnAffiliatePage;
	
	@FindBy(xpath = "//a[text()='Edit your affiliate information']")
	private WebElement editAffiliateInformationField;
	
	@FindBy (xpath = "//input[@value='bank']")
	private WebElement bankTransferField;
	
	@FindBy (id = "input-bank-name")
	private WebElement bankNameField;
	
	@FindBy (id = "input-bank-branch-number")
	private WebElement bankBranchField;
	
	@FindBy (id = "input-bank-swift-code")
	private WebElement swiftCodeFiled;
	
	@FindBy (id = "input-bank-account-name")
	private WebElement accountNameField;
	
	@FindBy (id = "input-bank-account-number")
	private WebElement accountNumberField;
	
	@FindBy (xpath = "//a[text()='Edit your account information']")
	private WebElement editAccountField;
	
	@FindBy (id = "input-firstname")
	private WebElement firstNameField;
	
	@FindBy (id = "input-lastname")
	private WebElement lastNameField;
	
	@FindBy (id = "input-email")
	private WebElement emailAddressField;
	
	@FindBy (id = "input-telephone")
	private WebElement telephoneNumberField;
	
	@FindBy (xpath = "//input[@value='Continue']")
	private WebElement editAccountButton;

	@FindBy (xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successM;
	
	
	public void clickOnMyAccount() {
		myAccountOption.click();
	}

	public void clickLoginOption() {
		loginOption.click();
	}

	public boolean isLogoPresent() {
		if (testEnvironmentLogo.isDisplayed())
			return true;
		else
			return false;
	}

	public String getTitle() {
		return driver.getTitle();
	}

	public void enterEmail(String userNameValue) {
		emailField.sendKeys(userNameValue);
		
	}
	
	public void enterPassword (String passValue ) {
		passWordField.sendKeys(passValue);
	}
	

	public void clickLoginButton() {
		loginButton.click();
	}

	public boolean successfulLogin() {
		if (myAccountDashboard.isDisplayed())
			return true;
		else
			return false;
	}

	public void clickRegisterLink() {
		registerForAnAffiliateAccount.click();
	}

	public void companyName(String companyNameValue) {
		companyField.sendKeys(companyNameValue);
	}

	public void websiteAddress(String webSiteValue) {
		webSiteField.sendKeys(webSiteValue);
	}

	public void taxIdNumber(String taxIDValue) {
		taxField.sendKeys(taxIDValue);
	}

	public void choosePaymentMethod(String paymentType) {
		if (paymentType.trim().equalsIgnoreCase("cheque")) {
			if (!chequeButton.isSelected()) {
				chequeButton.click();
			}
		} else if (paymentType.trim().equalsIgnoreCase("paypal")) {
			paypalButton.click();
		} else
			bankButton.click();
	}

	public void paymentAccountName(String chequePayeeNameValue) {
		chequePayeeNameField.sendKeys(chequePayeeNameValue);
	}

	public void continueButton() {
		continueButton.click();
	}

	public boolean isConfirmationMessage() {
		if(successMessageOnAffiliatePage.isDisplayed()) 
			return true;
			else 
			return false;
		
	}
	
	public void chckingBoxOption() {
		aboutUsCheckBox.click();
	}

	
	public void editAffiliateInformationClick() {
		editAffiliateInformationField.click();
		
	}
	
	public void selectBankTransferOption(String paytype) {
		if (paytype.trim().equalsIgnoreCase("Bank Transfer")) {
			bankTransferField.click();
		}
		
	}

	public void bankName(String bankNameValue) {
		bankNameField.sendKeys(bankNameValue);;
	}
	
	public void bankBranchName(String branchNameValue) {
		bankBranchField.sendKeys(branchNameValue);
	}
	
	public void swiftCodeInput(String swiftCodeValue) {
	swiftCodeFiled.sendKeys(swiftCodeValue);
	}
	
	public void accountNameInput(String accountNameValue) {
	accountNameField.sendKeys(accountNameValue);
	
	}
	
	public void accountNumberInput(String accountNumberValue) {
	accountNumberField.sendKeys(accountNumberValue);
	}
	
	public void editAccountInfoLink () {
		editAccountField.click();
	}
	
	public void firstNameInput(String firstNameValue) {
		firstNameField.clear();
		firstNameField.sendKeys(firstNameValue);
	}
	
	public void lastNameInput (String lastNameValue) {
		lastNameField.clear();
		lastNameField.sendKeys(lastNameValue);	
	}
	
	public void emialAddressInput(String emialValue) {
		emailAddressField.clear();
		emailAddressField.sendKeys(emialValue);
	}
	
	public void telephoneNumberInput(String telephoneNumberValue) {
		telephoneNumberField.clear();
		telephoneNumberField.sendKeys(telephoneNumberValue);
	}
	
	public void continueButtonClick() {
	editAccountButton.click();
	}
	
//	public boolean isSuccessMpresent() {
//		if(successM.isDisplayed())
//			return true;
//		else
//			return false;
//	}
	
	
	
}
