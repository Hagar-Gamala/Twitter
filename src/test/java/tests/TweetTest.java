package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.TweetPage;

import java.util.concurrent.TimeUnit;

public class TweetTest extends TestBase{
    LoginPage loginObject;
    TweetPage tweetObject;

    @DataProvider(name = "TestData")
    public static Object[] userData() {
        return new Object[]{
                "Test any other social media site Facebook has length requirements when it comes to writing on the wall, providing status, messaging and commenting. Understanding how many characters you can use, enables you to more effectively use Facebook as bus.Twitter's character limit is 280."
        };
    }

    @DataProvider(name = "TestsData")
    public static Object[] userDatas() {
        return new Object[]{
                "Assessment Test Like any other social media site Facebook has length requirements when it comes to writing on the wall, providing status, messaging and commenting. Understanding how many characters you can use, enables you to more effectively use Facebook as bus.Twitter's character limit is 280."
        };
    }

    @DataProvider(name = "TestDataTwitter")
    public static Object[] userDataTwitter() {
        return new Object[]{
                "https://www.blindtextgenerator.com/lorem-ipsum/stack-overview"
        };
    }

    //Users can send a tweet contains a URL, and when sharing it, users see from the URL 49 characters only
    @Test(priority = 1, dataProvider = "TestDataTwitter")
    public void UserCanSendTweetWithURL(String numberOfCharacters) {
        loginObject = new LoginPage(driver);
        tweetObject = new TweetPage(driver);
        tweetObject.sendTweet(numberOfCharacters);
        driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
    }

    //user can send a tweet of maximum 280 characters and share it with their followers
    @Test(priority = 2, dataProvider = "TestData")
    public void UserCanSendTweet(String numberOfCharacters){
        loginObject = new LoginPage(driver);
        tweetObject = new TweetPage(driver);
        tweetObject.sendTweet(numberOfCharacters);
    }

    //user can't share the same tweet twice in a row
    @Test(priority = 3, dataProvider = "TestData")
    public void UserCannotSendSameTweetTwiceInRow(String numberOfCharacters){
        loginObject = new LoginPage(driver);
        tweetObject = new TweetPage(driver);
        tweetObject.sendTweet(numberOfCharacters);
        Assert.assertTrue(tweetObject.errorMessage.isDisplayed());
        tweetObject.userCloseForm();

    }
    //user can't send a tweet Greater Than 280 characters
    @Test(priority = 4, dataProvider = "TestsData")
    public void UserCannotTweetGreaterthan280(String numberOfCharacters){
        loginObject = new LoginPage(driver);
        tweetObject = new TweetPage(driver);
        tweetObject.sendTweet(numberOfCharacters);
        tweetObject.userCloseForm();
        tweetObject.userDiscard();
    }

}
