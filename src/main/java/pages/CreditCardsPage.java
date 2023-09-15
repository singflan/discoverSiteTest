package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CreditCardsPage {
    private WebDriver driver;
//    private By securedCreditCardTitle = By.linkText("Secured Credit Card");
    private By securedCCCApplyNowButton = By.xpath("//h2[text()='Secured Credit Card']/../../following-sibling::div[2]/descendant::a[text()='Apply Now']");


    public CreditCardsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void scrollToSecuredCCSection() {
//        Actions actions = new Actions(driver);
//        actions.moveToElement((WebElement) securedCreditCardTitle);
//        actions.perform();
        WebElement securedCreditCardTitle = driver.findElement(By.linkText("Secured Credit Card"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", securedCreditCardTitle);
//        Thread.sleep(500);
    }

    public CCApplicationPage clickApplyNowForSecuredCC() {
        driver.findElement(securedCCCApplyNowButton).click();
        return new CCApplicationPage(driver);
    }
}
