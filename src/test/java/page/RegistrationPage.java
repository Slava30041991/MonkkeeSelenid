package page;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static page.HomePage.PAGE_LOCATOR;
public class RegistrationPage extends BasePage{

    public String getTextMessageRegistration(){
       return $(By.xpath("//h1[normalize-space(text()) = 'Registration']")).getText();
    }

    @Override
    public boolean isPageOpen() {
        return isExist(PAGE_LOCATOR);
    }
}
