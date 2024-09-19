package tests;

import objectData.RegisterLoginObject;
import objectData.SubscribeObject;
import org.testng.annotations.Test;
import pages.PetStorePage;
import pages.SubscribePage;
import sharedData.SharedData;

public class RegisterLoginTest extends SharedData {

    @Test
    public void testMethod(){

        SubscribeObject testData= new SubscribeObject("src/test/resources/testData/SubscribeData.json");
        SubscribePage subscribePage = new SubscribePage(getDriver());
        subscribePage.joinTheNewsletter(testData);
        RegisterLoginObject testData1 = new RegisterLoginObject("src/test/resources/testData/RegisterLoginData.json");
        PetStorePage petStorePage = new PetStorePage(getDriver());
        petStorePage.createUser(testData1);



    }
}
