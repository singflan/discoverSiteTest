package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CCApplicationPage {
    private WebDriver driver;
    private By skipThisStepButton = By.cssSelector("#adaptive-skip-this-step");
    private By importantInfoSection = By.xpath("h2[text()='Important Information']");
    private By cashAdvanceTitle = By.xpath("h5[text()='APR for Cash Advances']");

    public CCApplicationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSkipThisStepButton() {
        driver.findElement(skipThisStepButton).click();
    }



}
