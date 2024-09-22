package pages;

import loggerUtility.LoggerUtility;
import objectData.NavigationObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavigationPage extends BasePage{

    public NavigationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[@type='button' and @aria-controls='NavDrawer']")
    public WebElement menuElement;
    @FindBy(xpath = "//a[@id='Label-collections-dog1']")
    public WebElement dogCategoryElement;
    //scroll
    @FindBy(xpath = "//div[text()='Diamond PRO89™ Beef, Pork & Ancient Grains Formula Adult Dog Food 40 Lbs']")
    public WebElement productDogElement;
    @FindBy(id = "AddToCartText-4661065482315")
    public WebElement addToCartElement;
    @FindBy(xpath = "//button[span[text()='Close cart']]")
    public WebElement closeCartElement;
    @FindBy(xpath = "//button[@aria-controls='Linklist-collections-bird5']")
    public WebElement downButtonElement;
    //scroll
    @FindBy(xpath = "//a[@id='Sublabel-collections-toys-29']")
    public WebElement sublabelElement;
    @FindBy(xpath = "//a[@href='/search' and contains(@class, 'site-nav__link')]")
    public WebElement searchElement;
    @FindBy(xpath="//input[@name='q']")
    public WebElement searchStoreElement;
    //search for : Food for birds
    //click search
    @FindBy(xpath = "//button[@class='btn btn--small']")
    public WebElement viewMoreElement;
    @FindBy(xpath = "//div[text()='Pretty Bird® Daily Select Bird Food Medium 8 Lbs']")
    public WebElement productBirdElement;
    @FindBy(id = "AddToCartText-4660964720715")
    public WebElement addToCart1Element;
    @FindBy(xpath = "//button[@name='checkout' and contains(@class, 'cart__checkout')]")
    public WebElement checkOutElement;
    //afisare mesaj eroare
   // @FindBy(id="Return to store")
  //  public WebElement actionElement;

    public void hamburgerMenu(){
        elementMethods.clickElement(menuElement);
        LoggerUtility.info("The user clicks on the hamburger menu.");
        elementMethods.waitForElementVisible(menuElement);
        LoggerUtility.info("The user is waiting for the menu to become visible.");
    }
    public void categoryMenu(){
        elementMethods.clickElement(dogCategoryElement);
        LoggerUtility.info("The user clicks on the dog Category from menu");
        pageMethods.scrollPage(0,350);
        LoggerUtility.info("The user scrolled down the page.");
        elementMethods.clickElement(productDogElement);
        LoggerUtility.info("The user chose the product from the Dog Category.");
    }
    public void addToCart(){
        elementMethods.clickElement(addToCartElement);
        LoggerUtility.info("The user add the product in the cart.");
    }

    public void closeCart(){
        elementMethods.clickElement(closeCartElement);
        LoggerUtility.info("The user closed the card.");
    }
    public void searchProduct(NavigationObject testData){
        elementMethods.clickElement(downButtonElement);
        LoggerUtility.info("The user clicked on the down Button from Menu");
        pageMethods.scrollPage(0,150);
        LoggerUtility.info("The user scrolled down the page.");
        elementMethods.clickElement(sublabelElement);
        LoggerUtility.info("The user clicked on the sublabel menu");
        elementMethods.clickElement(searchElement);
        LoggerUtility.info("The user has accessed the search section");
        elementMethods.fillElement(searchStoreElement,testData.getSearchValue());
        LoggerUtility.info(testData.getSearchValue() + " was inserted in the search box.");
        elementMethods.clickElement(viewMoreElement);
        LoggerUtility.info("The user clicked to view more products.");

    }
    public void addProductToCart(){
        pageMethods.scrollPage(0,150);
        LoggerUtility.info("The user scrolled down the page.");
        elementMethods.clickElement(productBirdElement);
        LoggerUtility.info("The user chose the product.");
        elementMethods.clickElement(addToCart1Element);
        LoggerUtility.info("The user add the product in the cart.");

    }
    public void checkOutCart(){
        elementMethods.clickElement(checkOutElement);
        LoggerUtility.info("The user checks the products in the cart.");

    }





}
