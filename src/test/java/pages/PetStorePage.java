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

    @FindBy(id = "icon icon-user")
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

    public void createUser(RegisterLoginObject testData1) {
        LoggerUtility.info("Create account for a new user.");
        elementMethods.fillElement(firstNameElement, testData1.getFirstNameValue());
        LoggerUtility.info(testData1.getFirstNameValue() + " is inserted with success in the 'First Name' field.");
        elementMethods.fillElement(lastNameElement, testData1.getLastNameValue());
        LoggerUtility.info(testData1.getLastNameValue() + " is inserted with success in the 'Last Name' field. ");
        elementMethods.fillElement(emailElement, testData1.getEmailValue());
        LoggerUtility.info(testData1.getEmailValue() + " is inserted with success in the 'Email' field. ");
        elementMethods.fillElement(passwordElement, testData1.getPasswordValue());
        LoggerUtility.info("The password '" + testData1.getPasswordValue() + "' is inserted with succes.");
        elementMethods.clickElement(createButton);
        LoggerUtility.info("A new user has successfully created an account.");


    }
}