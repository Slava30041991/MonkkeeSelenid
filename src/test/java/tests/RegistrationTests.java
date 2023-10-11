package tests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
public class RegistrationTests extends BaseTests {

    @Test(description = "Registration new user")
    public void registrationNewUser() throws InterruptedException {
        homePage.openHomePage("https://monkkee.com")
                .clickButtonSingUP();
        registrationPage.registrationMail("test30041991@mail.ru")
                .registrationPass("Boloshenko")
                .registrationConfig("Boloshenko")
                .registrationPassHint("Test")
                .clickCheBoxPrivacyPolicy()
                .clickCheBoxResponsibility()
                .clickButtonOk();

                 assertEquals(registrationPage.getMessageRegistration(),"User registered","Текс не совпадает");

                 mailPage.openMailSite("https://account.mail.ru/login?&fail=1&from=navi")
                         .enterMail("test30041991")
                         .clickButtonPass()
                         .enterPass("Boloshenko")
                         .clickButtonEnter()
                         .clickMail(Keys.ENTER);



    }
}
