package helperMethods;

import lombok.AllArgsConstructor;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


@AllArgsConstructor
public class ElementMethods {
    public WebDriver driver;

    public void waitForElementVisible(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void clickElement(WebElement element){
        waitForElementVisible(element);
        element.click();
    }
    public void fillElement(WebElement element, String text){
        waitForElementVisible(element);
        element.sendKeys(text);
    }
    public void clickJSElement(WebElement element){
        waitForElementVisible(element);
        JavascriptExecutor jsClick = (JavascriptExecutor) driver;
        jsClick.executeScript("arguments[0].click;", element);
    }

}
