package tests;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
public class HomeTest extends BaseTests {

    @Test
    public void opensWebsite() {
        homePage.openHomePage("https://monkkee.com")
                .clickButtonSingUP();

        assertEquals(registrationPage.getTextMessageRegistration(), "Registration","Текст не совпадает");

    }
}
