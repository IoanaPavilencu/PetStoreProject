package pages;

import helperMethods.ElementMethods;
import helperMethods.PageMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class BasePage {

    protected WebDriver driver;
    protected ElementMethods elementMethods;
    protected PageMethods pageMethods;

    public BasePage(WebDriver driver){
        this.driver = driver;
        elementMethods = new ElementMethods(driver);
        pageMethods = new PageMethods(driver);
        PageFactory.initElements(driver, this);
    }
}
