package Pages;

import TestBase.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchProductPage extends TestBase  {

    @FindBy(xpath = "//input[@title='Search for products, brands and more']")
    WebElement searchProduct;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement searchIcon;


    @FindBy(xpath = "//div[@class='bhgxx2 col-12-12'][5]")
    WebElement clickonProduct;

    @FindBy(xpath = " //div[@class='KK-o3G']")
    WebElement viewCart;


    public SearchProductPage() {
        PageFactory.initElements(driver,this);

    }

    public void searchProduct(String product) throws InterruptedException {
        Thread.sleep(2000);
        searchProduct.sendKeys(product);
        Thread.sleep(2000);
    }
    public void clickOnSearchIcon() throws InterruptedException {
        searchIcon.click();
        Thread.sleep(2000);
    }

    public void viewCart() throws InterruptedException {
        viewCart.click();
        Thread.sleep(2000);
    }
}
