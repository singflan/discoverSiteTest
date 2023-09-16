package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends Page {
//    private WebDriver driver;
    private By creditCardsButton = By.linkText("Credit Cards");

//    public HomePage(WebDriver driver) {
//        super(driver);
//    }

    public CreditCardsPage clickCreditCardsButton() {
        driver.findElement(creditCardsButton).click();
        return new CreditCardsPage();
    }
}
