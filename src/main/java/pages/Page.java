package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Page {

    protected static WebDriver driver;


    public void setWebDriver(WebDriver driver) {
        Page.driver = driver;
    }

    public void scrollToTextElement(String elementText) {
        WebElement securedCreditCard = driver.findElement(By.linkText(elementText));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", securedCreditCard);
    }
}
