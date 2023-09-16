package pages;

import org.openqa.selenium.By;

public class CCApplicationPage2 extends Page {
    private String downloadText = "Download";
    private String cashBackAPRText = "APR for Cash Advances";
    private By cashRatePercentage = By.cssSelector("cash-rate");

    public void scrollToImportantInfoSection() {
//        WebElement importantInformationText = driver.findElement(By.linkText("Important Information"));
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", importantInformationText);
        super.scrollToTextElement(downloadText);
    }

    public void scrollToCashBackAPR() {
        super.scrollToTextElement(cashBackAPRText);
    }

    public float getAPRPercentage() {
        String cashRateStr = driver.findElement(cashRatePercentage).getText();
        float cashRateNum = Float.parseFloat(cashRateStr.substring(0, 5));
        System.out.println(cashRateNum);
        return cashRateNum;
    }
}
