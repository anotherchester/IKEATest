package ikea;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    protected WebDriver driver;

    @Before
    public void start() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Neko\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.ikea.com/us/en/");
    }
}
