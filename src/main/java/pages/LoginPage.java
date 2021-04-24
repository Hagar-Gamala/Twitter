package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "/html/body/div/div/div/div[2]/main/div/div/div[2]/form/div/div[1]/label/div/div[2]/div/input")
    WebElement usernameORemailField;
    @FindBy(xpath = "/html/body/div/div/div/div[2]/main/div/div/div[2]/form/div/div[2]/label/div/div[2]/div/input")
    WebElement passwordField;
    @FindBy(css = "span.css-901oao.css-16my406.css-bfa6kz.r-poiln3.r-bcqeeo.r-qvutc0")
    WebElement loginButton;
    @FindBy(linkText = "Home")
    public WebElement Home;

    public void openTwitter(String email, String password){
        setTextElementText(usernameORemailField,email);
        setTextElementText(passwordField, password);
        clickButton(loginButton);
    }


}
