package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CreditCardsPage extends Page {
//    private WebDriver driver;
    private String securedCCTitleText = "Secured Credit Card";
    private String studentCard = "Student Cash Back Credit Card";

//    public CreditCardsPage(WebDriver driver) {
//        super(driver);
////        this.driver = driver;
//    }

    public void scrollToSecuredCCSection() {
//        WebElement securedCreditCard = driver.findElement(By.linkText(securedCCTitleText));
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", securedCreditCard);
        // scroll to student card so secured is on scrteen
        super.scrollToTextElement(studentCard);
    }

    public int getSecuredCCIndex() {
        int indexOfText = -1;
        List<WebElement> ccTitleList = driver.findElements(By.tagName("h2"));

        for(int i = 0; i < ccTitleList.size(); i++) {
            String elementText = ccTitleList.get(i).getText();
            System.out.println(elementText);
            if (elementText.equals(securedCCTitleText)) {
                indexOfText = i;
            }
        }
        // For now, need to subtract 1 b/c the first h2 is not a credit card type
        return indexOfText - 1;
    }

    public CCApplicationPage1 clickApplyNowForSecuredCC(int index) throws InterruptedException {
        List<WebElement> applyNowButtonsList = driver.findElements(By.linkText("Apply Now"));
        applyNowButtonsList.get(index).click();
        Thread.sleep(500);
        return new CCApplicationPage1();
    }
}
