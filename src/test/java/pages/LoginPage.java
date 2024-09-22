package pages;

import loggerUtility.LoggerUtility;
import objectData.LoginObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id='CustomerEmail']")
    public WebElement emailLoginElement;
    @FindBy(xpath = "//input[@id='CustomerPassword']")
    public WebElement passwordLoginElement;
    @FindBy(xpath = "//button[@class='btn btn--full']")
    public WebElement signInElement;

    public void login(LoginObject testData){
        elementMethods.clickElement(emailLoginElement);
        LoggerUtility.info("The user clicked on 'Email' field.");
        elementMethods.fillElement(emailLoginElement,testData.getEmailLoginValue());
        LoggerUtility.info(testData.getEmailLoginValue() + " was inserted with success in the 'Email' field.");
        elementMethods.clickElement(passwordLoginElement);
        LoggerUtility.info("The user clicked on 'Password' field.");
        elementMethods.fillElement(passwordLoginElement,testData.getPasswordLoginValue());
        LoggerUtility.info(testData.getPasswordLoginValue() + " was inserted with success in the 'Password' field.");
        elementMethods.clickElement(signInElement);
        LoggerUtility.info("The user clicked on 'Sign In' button.");


    }
}
