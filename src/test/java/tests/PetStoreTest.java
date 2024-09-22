package tests;

import objectData.LoginObject;
import objectData.NavigationObject;
import objectData.RegisterLoginObject;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.NavigationPage;
import pages.NotTodaySubscribePage;
import pages.PetStorePage;
import sharedData.SharedData;

public class PetStoreTest extends SharedData {

    @Test
    public void testMethod(){

        NotTodaySubscribePage notTodaySubscribePage = new NotTodaySubscribePage(getDriver());
        notTodaySubscribePage.joinTheNewsletter();


        NavigationObject testData1 = new NavigationObject("src/test/resources/testData/NavigationData.json");
        NavigationPage navigationPage = new NavigationPage(getDriver());
        navigationPage.hamburgerMenu();
        navigationPage.categoryMenu();
        navigationPage.addToCart();
        navigationPage.closeCart();
        navigationPage.hamburgerMenu();
        navigationPage.searchProduct(testData1);
        navigationPage.addProductToCart();
        navigationPage.checkOutCart();

        LoginObject testData = new LoginObject("src/test/resources/testData/LoginData.json");
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.login(testData);


    }
}
