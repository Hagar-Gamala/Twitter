package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import org.testng.Assert;

public class LoginTest extends TestBase{
    HomePage homeObject;
    LoginPage loginObject;

    @DataProvider(name = "TestData")
    public static Object[][] userData() {
        return new Object[][]{
                {"Tester91811121", "Tester@12345"}
        };
    }

    @Test(dataProvider = "TestData")
    public void UserCanLoginSuccessfully(String email, String password){
        homeObject = new HomePage(driver);
        homeObject.openLoginPage();
        loginObject = new LoginPage(driver);
        loginObject.openTwitter(email, password);
        Assert.assertTrue(loginObject.Home.getText().contains("Home"));
    }
}
