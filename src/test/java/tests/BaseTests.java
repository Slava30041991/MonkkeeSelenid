package tests;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import page.HomePage;
import page.RegistrationPage;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class BaseTests {
    @BeforeMethod
    public void init(){
        setUp();
    }
    HomePage homePage;
    RegistrationPage registrationPage;

    public void setUp(){
        Configuration.baseUrl = "https://monkkee.com/en";
        Configuration.headless = true;
        Configuration.browserSize = "1920x1080";
        Configuration.savePageSource = false;
        Configuration.screenshots = true;
        Configuration.timeout = 20000;

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        Configuration.browserCapabilities = chromeOptions;


        homePage = new HomePage();
        registrationPage = new RegistrationPage();

    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
       getWebDriver().quit();
}
}
