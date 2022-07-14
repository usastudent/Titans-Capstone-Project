package stepDef;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.RetailPageObject;
import utilities.WebDriverUtility;

public class RetailStepDefinition extends Base{
	
	RetailPageObject retail = new RetailPageObject();
	
	@Given("User is on Retail website")
	public void user_is_on_Retail_website() {
		Assert.assertTrue(retail.isLogoPresent());
		Assert.assertEquals("TEK SCHOOL", retail.getTitle());
		logger.info("user is on Retail Website");
		WebDriverUtility.takeScreenShot();
		WebDriverUtility.hardWait(); // this method is added only because we can see what happens.
	}
	
	@And("User click on MyAccount")
	public void user_click_on_MyAccount() {
		retail.clickOnMyAccount();
		logger.info("user clicked on MyAccount option");
		WebDriverUtility.takeScreenShot();
		
	}
	
	@When("User click on Login")
	public void user_click_on_Login() {
		retail.clickLoginOption();
		logger.info("user clicked on login option");
		WebDriverUtility.takeScreenShot();
	}
	
	@And("User enter userName {string} and password {string}")
	public void user_enter_userName_and_Password (String userName, String password){
		retail.enterEmail(userName);
		retail.enterPassword(password);
		
		
		logger.info("user entered " + userName + " and"+ " password");
		WebDriverUtility.takeScreenShot();
		WebDriverUtility.hardWait();
	}
	
	
	@And ("User click on Login button")
	public void user_click_on_Login_button() {
		retail.clickLoginButton();
		logger.info("user click on login Button");
		
	}
	
	@Then("User should be logged in to MyAccount dashboard")
	public void user_should_be_logged_in_MyAccount_dashboard() {
		Assert.assertTrue(retail.isLogoPresent());;
		logger.info("user logged in to myAccount dashboard");
		WebDriverUtility.takeScreenShot();
		WebDriverUtility.hardWait();
	}
	
	@When ("User click on Register for an Affiliate Account link")
		public void user_click_on_Register_for_an_Affiliate_Account_link() {
			retail.clickRegisterLink();
			logger.info("user clicked on register for an affiliate Account link");
			WebDriverUtility.hardWait();
		
	}
	
	@When ("User fill affiliate form with below information")
		public void user_fill_affiliate_from_with_below_information(DataTable dataTable) {
		
		List<Map<String, String>> affiliateInformation = dataTable.asMaps(String.class, String .class);
		retail.companyName(affiliateInformation.get(0).get("company"));
		retail.websiteAddress(affiliateInformation.get(0).get("website"));
		retail.taxIdNumber(affiliateInformation.get(0).get("taxID"));
		retail.choosePaymentMethod(affiliateInformation.get(0).get("paymentMethod"));
		retail.paymentAccountName(affiliateInformation.get(0).get("payeeName"));
		logger.info("user filled affiliate form");
		WebDriverUtility.takeScreenShot();
		WebDriverUtility.hardWait();
		
	}
	
	@When ("User check on About us check box")
	public void user_check_on_About_us_check_box() {
		retail.chckingBoxOption();
		logger.info("user checked on about us check box");
		
	}
	
	@When ("User click on Continue button")
	public void user_click_on_Continue_button() {
		retail.continueButton();
		logger.info("user clicked on continue button");
		
		
	}
	
	@Then ("User should see a success message")
	public void user_should_see_a_success_message() {
		Assert.assertTrue(retail.isConfirmationMessage());
		logger.info("success message is present");
		WebDriverUtility.takeScreenShot();
		WebDriverUtility.hardWait();
		
	}
	
	
	@When("User click on Edit your affiliate information link")
	public void user_click_on_Edit_your_affiliate_information_link() {
		retail.editAffiliateInformationClick();
		logger.info("user clicked on Edit your affiliate information link");
		WebDriverUtility.takeScreenShot();
		WebDriverUtility.hardWait();
	}
	
	
	@When("user click on Bank Transfer radio button")
		public void user_click_on_Bank_Transfer_radio_button() {
		retail.selectBankTransferOption("Bank Transfer");
		logger.info("user clicked on Bank Transfer button");
		WebDriverUtility.takeScreenShot();
		WebDriverUtility.hardWait();
	}


	@When("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(DataTable dataTable) {

	List<Map<String, String>> affiliateEditInfo= dataTable.asMaps(String.class, String.class);
	
	retail.bankName(affiliateEditInfo.get(0).get("bankName"));
	retail.bankBranchName(affiliateEditInfo.get(0).get("abaNumber"));
	retail.swiftCodeInput(affiliateEditInfo.get(0).get("swiftCode"));
	retail.accountNameInput(affiliateEditInfo.get(0).get("accountName"));
	retail.accountNumberInput(affiliateEditInfo.get(0).get("accountNumber"));
	logger.info("user filled the Bank Transfer information");
	WebDriverUtility.takeScreenShot();
	WebDriverUtility.hardWait();
	
	}


	@When("User click on Edit your account information link")
	public void user_click_on_edit_your_account_information_link() {
	   retail.editAccountInfoLink();
	   logger.info("user clicked on edit your account information link");
	   WebDriverUtility.takeScreenShot();
	   WebDriverUtility.hardWait();
	}
	
	
	@And("User modify below information")
	public void user_modify_below_information(DataTable dataTable) {
		 List<Map<String, String>> editAccountUpdate =dataTable.asMaps(String.class, String.class); 
		 retail.firstNameInput(editAccountUpdate.get(0).get("firstname"));
		 retail.lastNameInput(editAccountUpdate.get(0).get("lastName"));
		 retail.emialAddressInput(editAccountUpdate.get(0).get("email"));
		 retail.telephoneNumberInput(editAccountUpdate.get(0).get("telephone"));
		 logger.info("account information is updated");
		 WebDriverUtility.takeScreenShot();
		 WebDriverUtility.hardWait();
	}
	
	
	@And("User click on continue button")
	public void user_click_on_continue_button() {
	    retail.continueButtonClick();
	}

	



	
	
	
	
}
