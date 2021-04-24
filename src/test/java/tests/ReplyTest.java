package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.ReplyPage;

public class ReplyTest extends TestBase{
    ReplyPage replyObject;

    @DataProvider(name = "TestData")
    public static Object[] userData() {
        return new Object[]{
                "replying to the user's own tweet"
        };
    }

    @Test(dataProvider = "TestData")
    public void UserCanReply(String replyTweet){
        replyObject = new ReplyPage(driver);
        replyObject.openReplyTweet(replyTweet);
    }
}
