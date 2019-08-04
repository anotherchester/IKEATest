package ikea;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".sc-bxivhb.bTdUOM")
    private WebElement createAcc;

    public CreateAccPage clickCreateAcc() {

        createAcc.click();
        return new CreateAccPage(driver);
    }


}
