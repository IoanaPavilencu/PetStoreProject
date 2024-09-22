package tests;

import objectData.RegisterLoginObject;
import org.testng.annotations.Test;
import pages.NavigationPage;
import pages.PetStorePage;
import pages.NotTodaySubscribePage;
import sharedData.SharedData;

public class RegisterLoginTest extends SharedData {

    @Test
    public void testMethod(){

        NotTodaySubscribePage notTodaySubscribePage = new NotTodaySubscribePage(getDriver());
        notTodaySubscribePage.joinTheNewsletter();

        RegisterLoginObject testData = new RegisterLoginObject("src/test/resources/testData/RegisterLoginData.json");
        PetStorePage petStorePage = new PetStorePage(getDriver());
        petStorePage.createUser(testData);

    }
}
