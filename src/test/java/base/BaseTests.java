package base;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.CCApplicationPage;
import pages.CreditCardsPage;
import pages.HomePage;

public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;
    protected CreditCardsPage ccPage;
    protected CCApplicationPage ccApplicationPage;

    public void setUp() {
//        System.setProperty("webdriver.chrome.driver", "../../resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.discover.com/");
    }

    public static void main(String[] args) {
        BaseTests test = new BaseTests();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
//        System.out.println(driver.getTitle());
        test.setUp();
        test.testSecuredCreditCardAPRPercentage();
    }

    public void testSecuredCreditCardAPRPercentage() {
        homePage = new HomePage(driver);

        // Click on Credit Card button
        ccPage = homePage.clickCreditCardsButton();

        // Scroll down to Secured Credit Card Apply Now Button
        ccPage.scrollToSecuredCCSection();
        ccApplicationPage = ccPage.clickApplyNowForSecuredCC();
//
        // Skip pre-fill step
        ccApplicationPage.clickSkipThisStepButton();

        // Assert that the APR for Cash Advances is greater than 20%

        driver.quit();
    }
}
