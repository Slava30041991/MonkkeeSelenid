package page;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static page.HomePage.PAGE_LOCATOR;
public class RegistrationPage extends BasePage{

    public String getTextMessageRegistration(){
        return $(By.xpath("//h1[normalize-space(text()) = 'Registration']")).getText();
    }

    public RegistrationPage registrationMail(String mail){
        $(By.name("registration[email]")).sendKeys(mail);
        return this;
    }
    public RegistrationPage registrationPass(String pass) {
        $(By.name("registration[password]")).sendKeys(pass);
        return this;
    }

    public RegistrationPage registrationConfig(String config) {
        $(By.name("registration[password_confirmation]")).sendKeys(config);
        return this;
    }
    public RegistrationPage registrationPassHint(String passHint) {
        $(By.name("registration[password_hint]")).sendKeys(passHint);
        return this;
    }
    public RegistrationPage clickCheBoxPrivacyPolicy () {
        $(By.id("registration_terms_of_use")).click();
        return this;
    }
    public RegistrationPage clickCheBoxResponsibility () {
        $(By.id("registration_lost_password_warning_registered")).click();
        return this;
    }
    public RegistrationPage clickButtonOk () {
        $(By.xpath(" //div[@class = 'gEDcikh']")).click();
        return this;
    }
    public String getMessageRegistration(){
        return $(By.xpath("//h1[normalize-space(text()) = 'User registered']")).getText();

    }


    @Override
    public boolean isPageOpen() {
        return isExist(PAGE_LOCATOR);
    }
}
