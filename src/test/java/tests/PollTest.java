package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.PollPage;

public class PollTest extends TestBase{
    PollPage pollObject;

    @Test
    public void UserCanCreatePoll(){
        pollObject = new PollPage(driver);
        pollObject.openPollForm("What do you want the next session?", "API Testing", "Performance Testing");
    }
}
