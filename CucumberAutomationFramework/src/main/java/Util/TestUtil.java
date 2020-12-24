package Util;

import TestBase.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestUtil extends TestBase {

    public static long PAGE_LOAD_TIMEOUT=50;

    public static long IMPLICIT_WAIT=50;
    public static void explicitWait(WebElement element )
    {

        WebDriverWait wait=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.elementToBeClickable(element));

    }
}
