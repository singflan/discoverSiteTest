package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;
    private By creditCardsButton = By.linkText("Credit Cards");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public CreditCardsPage clickCreditCardsButton() {
        driver.findElement(creditCardsButton).click();
        return new CreditCardsPage(driver);
    }
}
