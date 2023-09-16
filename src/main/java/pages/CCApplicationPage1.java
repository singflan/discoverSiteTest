package pages;

import org.openqa.selenium.By;


public class CCApplicationPage1 extends Page {
    private By skipThisStepButton = By.cssSelector("#adaptive-skip-this-step");
    private By skipThisStepButtonNew = By.cssSelector("#adaptive-skip-this-step-new");

    public CCApplicationPage2 clickSkipThisStepButton() {
        driver.findElement(skipThisStepButtonNew).click();
        return new CCApplicationPage2();
    }
}
