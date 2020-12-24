package Pages;

import TestBase.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {


    @FindBy(xpath = "//input[@class='_2IX_2- VJZDxU']")
    WebElement mobileNum;

    @FindBy(xpath = "//input[@class='_2IX_2- _3mctLh VJZDxU']")
    WebElement password;

    @FindBy(xpath = "//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
    WebElement loginbtn;

    @FindBy(xpath = "//div[@class='exehdJ'][1]")
    WebElement myAccount;

    @FindBy(xpath = "//div[@class='_3vhnxf']")
    WebElement logoutBtn;

    @FindBy(xpath = "//img[@title='Flipkart']")
    WebElement logo;

    @FindBy(xpath = "//img[@title='Flipkart']")
    WebElement errorlabel;


    public LoginPage() {
        PageFactory.initElements(driver,this);

    }

    public void enterUserCredentials(String mob, String pass) throws InterruptedException {

        mobileNum.sendKeys(mob);
        System.out.println("mob entered");

        password.sendKeys(pass);
        System.out.println("password entered");



    }

    public void ClickonLoginbutton()
    {
        loginbtn.click();


        System.out.println("Clicked on login button");
    }
    public boolean verifySuccessfulLogin()
    {
        return myAccount.isDisplayed();
    }


    public boolean getFlipKartLogo() {

        return logo.isDisplayed();

    }
    public String getFlipKartTitle() {

        return driver.getTitle();

    }
    public void  logout() throws InterruptedException {

        System.out.println("In login method");
        Actions action=new Actions(driver);
        action.moveToElement(myAccount).build().perform();
        System.out.println("moved to my account");
        Thread.sleep(3000);
        logoutBtn.click();

        Thread.sleep(3000);
    }


}
