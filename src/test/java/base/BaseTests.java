package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

public class BaseTests {
    private static WebDriver driver;
    protected Page page;
    protected HomePage homePage;
    protected CreditCardsPage ccPage;
    protected CCApplicationPage1 ccApplicationPage1;
    protected CCApplicationPage2 ccApplicationPage2;
    private static final String pageURL = "https://www.discover.com/";

    public void setUp() {
        driver = new ChromeDriver();
        driver.get(pageURL);
        homePage = new HomePage();
        homePage.setWebDriver(driver);
    }

    public static void main(String[] args) throws InterruptedException {
        BaseTests test = new BaseTests();
        test.setUp();
        test.testSecuredCreditCardAPRPercentage();
    }

    public void testSecuredCreditCardAPRPercentage() throws InterruptedException {

        // Click on Credit Card button
        ccPage = homePage.clickCreditCardsButton();

        // Scroll down to Secured Credit Card Apply Now Button
        ccPage.scrollToSecuredCCSection();
        int securedCCIndex = ccPage.getSecuredCCIndex();
        ccApplicationPage1 = ccPage.clickApplyNowForSecuredCC(securedCCIndex);
//
        // Skip pre-fill step
        ccApplicationPage2 = ccApplicationPage1.clickSkipThisStepButton();

        // Assert that the APR for Cash Advances is greater than 20%
        ccApplicationPage2.scrollToImportantInfoSection();
        ccApplicationPage2.scrollToCashBackAPR();
        float cashRate = ccApplicationPage2.getAPRPercentage();
        assert(cashRate > 20.00);
        driver.quit();
    }
}
