package pages;

import org.openqa.selenium.By;


public class CCApplicationPage1 extends Page {
//    private WebDriver driver;
    private By skipThisStepButton = By.cssSelector("#adaptive-skip-this-step");
    private By skipThisStepButtonNew = By.cssSelector("#adaptive-skip-this-step");
//    private By importantInfoSection = By.xpath("h2[text()='Important Information']");
//    private By cashAdvanceTitle = By.xpath("h5[text()='APR for Cash Advances']");

    public CCApplicationPage2 clickSkipThisStepButton() {
        try {
            driver.findElement(skipThisStepButton).click();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Couldn't find skip button, attempting to find new version");
            driver.findElement(skipThisStepButtonNew).click();
        }
        return new CCApplicationPage2();
    }
}
