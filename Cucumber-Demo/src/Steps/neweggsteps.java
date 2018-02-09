package Steps;

import CommonLibraries.CommonHelper;
import PageObjects.CommonObjects;
import SupportLibraries.SeleniumHelper;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class neweggsteps extends SeleniumHelper{
	
	@Before
	public void before() throws Exception{
		setup();
	}
	
	@After
	public void after() throws Exception{
		teardown();
	}
	
	@Given("^user logged into application$")
	public void user_login() throws Throwable {
		CommonHelper.LoginIntoApplication();
	}
	
	@Then("^Enter \"([^\"]*)\" in Search text field$")
	public void enter_in_search_main_text_field(String sData) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(CommonObjects.search_main_txt).sendKeys(sData);
		driver.findElement(CommonObjects.search_main_btn).click();
		ValidateBrowserReady();
	}
	
	@Then("^Enter \"([^\"]*)\" in Search Within text field$")
	public void enter_in_search_within_text_field(String sData) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(CommonObjects.seach_within_txt).sendKeys(sData);
		driver.findElement(CommonObjects.search_within_btn).click();
		ValidateBrowserReady();
	}
	
	@Then("^user add item to the cart$")
	public void add_item_to_the_cart() throws Throwable {
		CommonHelper.AddItemToCart();
	}
	
	@Then("^Remove Item From Cart and Verify amount calculated$")
	public void remove_item_validate_amount() throws Throwable {
		CommonHelper.ValidateAmountReflected();
	}
	
	@Then("^user logged out from application$")
	public void user_logout() throws Throwable {
		CommonHelper.LoginOutFromApplication();
	}
	
	@Then("^user clicks secure checkout$")
	public void secure_checkout() throws Throwable {
		CommonHelper.SecureCheckout();
	}
	
	
}
