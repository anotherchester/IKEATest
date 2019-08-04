package ikea;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccPage extends BasePage {
    public CreateAccPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#createUser_firstName")
    private WebElement firstNameField;

    @FindBy(css = "#createUser_lastName")
    private WebElement lastNameField;

    @FindBy(css = "#createUser_phone2")
    private WebElement phoneField;

    @FindBy(css = "#createUser_email1")
    private WebElement emailField;

    @FindBy(css = "#createUser_email1_verify")
    private WebElement verifyEmailField;

    @FindBy(css = "#createUser_logonPassword")
    private WebElement passwordField;

    @FindBy(css = "#createUser_logonPasswordVerify")
    private WebElement verifyPassField;

    @FindBy(css = ".xCookiebutton")
    private WebElement closeCookie;

    @FindBy(css = "#createUser_acceptCond_lbl")
    private WebElement acceptCondField;



    public void fillFirstName(String firstName) {
        firstNameField.sendKeys(firstName);
    }

    public void fillLastName (String lastName) {
        lastNameField.sendKeys(lastName);
    }

    public void fillPhoneFiled (String phone) {
        phoneField.sendKeys(phone);
    }

    public void fillEmailField (String email) {
        emailField.sendKeys(email);
    }

    public void fillVerifyEmail(String email) {
        verifyEmailField.sendKeys(email);
    }

    public void fillPasswordField(String pass) {
        passwordField.sendKeys(pass);
    }

    public void fillVerifyField(String pass) {
        verifyPassField.sendKeys(pass);
    }

    public void closeCookie() {closeCookie.click();}

    public void clickAcceptCond () {
        acceptCondField.click();
    }



}
