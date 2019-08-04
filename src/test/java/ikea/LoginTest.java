package ikea;

import org.junit.Test;

public class LoginTest extends BaseTest{

    private HomePage homePage;
    private LoginPage loginPage;
    private CreateAccPage createAccPage;

    @Test
    public void testLogin() throws InterruptedException {

        HomePage homePage = new HomePage(driver);
        loginPage = homePage.clickloginButton();
        createAccPage = loginPage.clickCreateAcc();
        createAccPage.fillFirstName("Oleg");
        createAccPage.fillLastName("Cherniaev");
        createAccPage.fillPhoneFiled("2067717171");
        createAccPage.fillEmailField("ocherniaev@gmail.com");
        createAccPage.fillVerifyEmail("ocherniaev@gmail.com");
        createAccPage.fillPasswordField("ikeaT3$t");
        createAccPage.fillVerifyField("ikeaT3$t");
        createAccPage.closeCookie();
        createAccPage.clickAcceptCond();







    }


}
