package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TweetPage extends PageBase{
    public TweetPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "/html/body/div/div/div/div[2]/header/div/div/div/div[1]/div[3]/a/div/span")
    WebElement tweetBtn;
    @FindBy(css = "div.public-DraftStyleDefault-block.public-DraftStyleDefault-ltr")
    WebElement tweetText;
    @FindBy(xpath = "//*[@id=\"layers\"]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div[3]/div/div/div/div[1]/div/div/div/div/div[2]/div[4]/div/div/div[2]/div[4]/div")
    WebElement tweetButton;
    @FindBy(xpath = "/html/body/div/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div[3]/div/div/div[1]/div/div/div/div/div/div")
    public WebElement errorMessage;
    @FindBy(xpath = "/html/body/div/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div[3]/div/div/div/div[1]/div/div/div/div/div[2]/div[2]/div/div/div/span/span")
    WebElement select;
    @FindBy(xpath = "/html/body/div/div/div/div[1]/div[3]/div/div/div[2]/div/div[2]/div/div/div/div/div/div[2]/div[2]/div[2]/div/span")
    WebElement followers;
    @FindBy(xpath = "/html/body/div/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/div/div[1]/div")
    WebElement close;
    @FindBy(xpath = "/html/body/div/div/div/div[1]/div[3]/div/div/div/div/div/div[2]/div[2]/div[3]/div[1]/div")
    WebElement discardButton;

    public void sendTweet(String numberOfCharacters){
        clickButton(tweetBtn);
        setTextElementText(tweetText, numberOfCharacters);
        clickButton(select);
        clickButton(followers);
        clickButton(tweetButton);
    }

    public void userCloseForm(){
        clickButton(close);
    }

    public void userDiscard(){
        clickButton(discardButton);
    }
}
