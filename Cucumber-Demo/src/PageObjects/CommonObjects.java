package PageObjects;

import org.openqa.selenium.By;


public class CommonObjects {

	/*
	 * Author: Deepti
	 * Date: 
	 * Description:   
	 *  	
	 */
	
	
	public static By login_link = By.xpath("//a[text()='Log in or Register']");
    public static By username_txt = By.id("UserName");
    public static By password_txt = By.id("UserPwd");
	public static By submit_btn = By.id("submit");
	public static By search_main_txt = By.id("haQuickSearchBox");
	public static By search_main_btn = By.xpath("//button[text()='Search']");
	public static By seach_within_txt = By.id("SrchInDesc_top");
	public static By search_within_btn = By.id("btn_InnerSearch");
	public static By myaccount_btn = By.xpath("//*[text()='My Account']");
	public static By logout_btn = By.xpath("//a[text()='Logout']");
	public static By item_1_viewdetails_btn = By.xpath("(//div[normalize-space(@class)='item-container'])[1]//*[contains(text(),'View Details')]");
	public static By addtocart_btn = By.xpath("(//span[contains(text(),'ADD TO CART')])[2]/..");
	public static By cartitems_btn = By.xpath("//a[@title='Shopping Cart with Items']");
	public static By totalamount_txt = By.xpath("//span[text()='Subtotal:']/following-sibling::*[1]");
	public static By cart_item_1 = By.xpath("(//input[@name='CHKITEM'])[1]");
	public static By remove_selected_btn = By.id("removeFromCart");
	public static By secure_checkout_btn = By.xpath("//a[@title='Secure Checkout']");
}
