package StepDefinitions;

import Pages.LoginPage;
import Pages.SearchProductPage;
import TestBase.TestBase;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class Loginstepdefinition extends TestBase {

 //  public WebDriver driver;

	@Before
	public void setup()
	{

		intialization();
	}
   @Given("^User is already on Login page$")
	public void user_is_already_on_Login_page() {

	   loginpage = new LoginPage();
		System.out.println("User is on home page");

	}
	@When("^User enters \\\"(.*)\\\" and \\\"(.*)\\\"$")
	public void user_enters_username_and_password(String mob,String pass)  {
		try {

			loginpage.enterUserCredentials(mob,pass);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	@Then("^User clicks on Login button$")
	public void user_clicks_on_Login_button()  {
		loginpage.ClickonLoginbutton();
			//boolean b=loginpage.verifySuccessfulLogin();
			//Assert.assertFalse(b);
		//String msg=loginpage.getErrormessage();
		//Assert.assertFalse("Not able to login",msg.contains("Your username or password is incorrect"));

	}

	@Then("^Verify title as \"([^\"]*)\"$")
	public void verify_title_as(String title) throws Throwable {

		String title1=loginpage.getFlipKartTitle();
		Assert.assertEquals(title1,title);
	}
	@Then("^verify logo$")
	public void verify_logo() {
		boolean f=loginpage.getFlipKartLogo();
		Assert.assertTrue(f);
	}

	@When("^user search for product \"([^\"]*)\"$")
	public void user_search_for_product(String product) throws InterruptedException {
     searchproductpage=new SearchProductPage();
     searchproductpage.searchProduct(product);
     searchproductpage.clickOnSearchIcon();
	}


	@When("^clicks on cart$")
	public void clicks_on_cart() throws InterruptedException {
   	searchproductpage=new SearchProductPage();
		searchproductpage.viewCart();
	}


	@Then("^logout from browser$")
	public void logout_from_browser() throws InterruptedException {
		loginpage.logout();
	}

	@Then("^Close the browser$")
	public void close_the_browser()  {
		driver.quit();
	}



	@Then("^User is on home page$")
	public void user_is_on_home_page()  {
		//loginpage=new LoginPage();
		boolean f= loginpage.getFlipKartLogo();
		Assert.assertTrue(f);
	}




}
