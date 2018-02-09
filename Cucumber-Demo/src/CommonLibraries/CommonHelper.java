package CommonLibraries;

import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import PageObjects.CommonObjects;
import SupportLibraries.SeleniumHelper;

public class CommonHelper extends SeleniumHelper {
	
	/*
	 * Author: Deepti
	 * Date: 
	 * Description:   
	 *  	
	 */
	

	public static void LoginIntoApplication(){
		driver.findElement(CommonObjects.login_link).click();
		ValidateBrowserReady();
		driver.findElement(CommonObjects.username_txt).sendKeys("ctschallenge18@gmail.com");
		driver.findElement(CommonObjects.password_txt).sendKeys("Challenge18");
		driver.findElement(CommonObjects.submit_btn).click();
		ValidateBrowserReady();
	}
	
	public static void LoginOutFromApplication() throws Exception{
		Actions objActions = new Actions(driver);
		objActions.moveToElement(driver.findElement(CommonObjects.myaccount_btn)).build().perform();
		Thread.sleep(1000);
		driver.findElement(CommonObjects.logout_btn).click();
		ValidateBrowserReady();
	}
	
	public static void AddItemToCart() throws Exception{
		driver.findElement(CommonObjects.item_1_viewdetails_btn).click();
		ValidateBrowserReady();
		driver.findElement(CommonObjects.addtocart_btn).click();
		ValidateBrowserReady();
	}
	
	public static void ValidateAmountReflected() throws Exception{
		String sAmount = driver.findElement(CommonObjects.totalamount_txt).getText().trim();
		driver.findElement(CommonObjects.cart_item_1).click();
		ValidateBrowserReady();
		driver.findElement(CommonObjects.remove_selected_btn).click();
		ValidateBrowserReady();
		String sAmount1 = driver.findElement(CommonObjects.totalamount_txt).getText().trim();
		Assert.assertNotEquals(sAmount, sAmount1);
	}
	
	public static void SecureCheckout() throws Exception{
		driver.findElement(CommonObjects.secure_checkout_btn).click();
		ValidateBrowserReady();
	}
	
}