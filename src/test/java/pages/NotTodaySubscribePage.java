package pages;

import loggerUtility.LoggerUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NotTodaySubscribePage extends BasePage{
    public NotTodaySubscribePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[text()='Not today']")
    private WebElement notTodayElement;

    public void joinTheNewsletter(){
        elementMethods.clickElement(notTodayElement);
        LoggerUtility.info("The user refuse to subscribe today");
    }
}
