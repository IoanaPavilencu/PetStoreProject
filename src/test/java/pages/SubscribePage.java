package pages;

import loggerUtility.LoggerUtility;
import objectData.SubscribeObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SubscribePage extends BasePage{
    public SubscribePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath="//input[@id='Email-newsletter-popup']")
    private WebElement enterYourEmailElement;

    @FindBy(xpath = "//button//span[text()='Subscribe']")
    private WebElement subscribeButton;

    @FindBy(xpath = "//button[@class='modal__close js-modal-close text-link']")
    private WebElement closeButton;

    public void joinTheNewsletter(SubscribeObject testData){
        elementMethods.fillElement(enterYourEmailElement,testData.getEnterYourEmailValue());
        LoggerUtility.info(testData.getEnterYourEmailValue() + "is inserted with success in the 'Enter your email' field");
        elementMethods.clickElement(subscribeButton);
        LoggerUtility.info("The user subscribe with succes!");
    }
}
