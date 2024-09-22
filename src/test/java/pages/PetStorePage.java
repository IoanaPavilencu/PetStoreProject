package pages;

import loggerUtility.LoggerUtility;
import objectData.RegisterLoginObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PetStorePage extends BasePage {

    public PetStorePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[name()='svg' and contains(@class, 'icon-user')]")
    private WebElement userButton;

    @FindBy(id = "customer_register_link")
    private WebElement createAccountButton;

    @FindBy(xpath = "//input[@id='FirstName']")
    private WebElement firstNameElement;

    @FindBy(xpath = "//input[@id='LastName']")
    private WebElement lastNameElement;

    @FindBy(xpath = "//input[@id='Email']")
    private WebElement emailElement;

    @FindBy(xpath = "//input[@id='CreatePassword']")
    private WebElement passwordElement;

    @FindBy(xpath = "//input[@value='Create']")
    private WebElement createButton;

    public void createUser(RegisterLoginObject testData) {
        elementMethods.clickElement(userButton);
        LoggerUtility.info("Create account for a new user.");
        elementMethods.clickElement(createAccountButton);
        LoggerUtility.info("The new user wants to create an account.");
        elementMethods.clickElement(firstNameElement);
        LoggerUtility.info("The new user clicked on 'First Name' field.");
        elementMethods.fillElement(firstNameElement, testData.getFirstNameValue());
        LoggerUtility.info(testData.getFirstNameValue() + " is inserted with success in the 'First Name' field.");
        elementMethods.clickElement(lastNameElement);
        LoggerUtility.info("The new user clicked on 'Last Name' field.");
        elementMethods.fillElement(lastNameElement, testData.getLastNameValue());
        LoggerUtility.info(testData.getLastNameValue() + " is inserted with success in the 'Last Name' field. ");
        elementMethods.clickElement(emailElement);
        LoggerUtility.info("The new user clicked on 'Email' field.");
        elementMethods.fillElement(emailElement, testData.getEmailValue());
        LoggerUtility.info(testData.getEmailValue() + " is inserted with success in the 'Email' field. ");
        elementMethods.clickElement(passwordElement);
        LoggerUtility.info("The new user clicked on 'Password' field.");
        elementMethods.fillElement(passwordElement, testData.getPasswordValue());
        LoggerUtility.info("The password '" + testData.getPasswordValue() + "' is inserted with success.");
        elementMethods.clickElement(createButton);
        LoggerUtility.info("A new user has successfully created an account.");


    }
}