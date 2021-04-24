package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PollPage extends PageBase{
    public PollPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"react-root\"]/div/div/div[2]/header/div/div/div/div[1]/div[3]/a/div/span/div/div/span/span")
    WebElement tweetBtn;
    @FindBy(xpath = "//*[@id=\"layers\"]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div[3]/div/div/div/div[1]/div/div/div/div/div[2]/div[4]/div/div/div[1]/div[3]/div")
    WebElement pollButton;
    @FindBy(css = "div.public-DraftStyleDefault-block.public-DraftStyleDefault-ltr")
    WebElement askQuation;
    @FindBy(name = "Choice1")
    WebElement choiceOne;
    @FindBy(name = "Choice2")
    WebElement choiceTwo;
    @FindBy(xpath = "//*[@id=\"layers\"]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div[3]/div/div/div/div[1]/div/div/div/div/div[2]/div[4]/div/div/div[2]/div[4]/div")
    WebElement tweetButton;


    public void openPollForm(String question, String choice1, String choices2){
        clickButton(tweetBtn);
        clickButton(pollButton);
        setTextElementText(askQuation,question);
        setTextElementText(choiceOne,choice1);
        setTextElementText(choiceTwo,choices2);
        clickButton(tweetButton);
    }
}
