package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(linkText = "Log in")
    WebElement LoginButton;

    public void openLoginPage(){
        clickButton(LoginButton);
    }
}
