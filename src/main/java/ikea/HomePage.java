package ikea;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".loginItem")
    private WebElement loginButton;

    public LoginPage clickloginButton() {
        loginButton.click();
        return new LoginPage(driver);
    }

}
