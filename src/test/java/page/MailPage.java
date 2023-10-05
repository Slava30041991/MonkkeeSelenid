package page;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.*;

public class MailPage extends BasePage {

    @Step("Open mail page")
    public MailPage openMailSite(String url) {
        Selenide.open(url);
        return this;
    }

    @Step("Click button enter")
    public MailPage clickButtonEnter(){
        $(By.xpath("//button[@class = 'ph-login svelte-1ke9xx5']")).sendKeys(Keys.ENTER);
        return this;
    }

    @Step("Enter mail")
    public MailPage enterMail(String mail){
        $(By.xpath("//input[@name = 'username']")).sendKeys(mail,Keys.ENTER);
        return this;
    }
    @Step("Click button password")
    public MailPage clickButtonPass(){

        $(By.xpath("//span[@class = 'inner-0-2-89 innerTextWrapper-0-2-90']")).click();
        return this;
    }
    @Step("Enter password")
    public MailPage enterPass(String pass){
        $(By.name("password")).sendKeys(pass, Keys.ENTER);
        return this;
    }

    public MailPage clickMail(Keys enter){
        $(By.xpath("//div[@class = 'checkbox']")).click();
        clickMail(Keys.ENTER);
        return this;
    }

    @Override
    public boolean isPageOpen() {
        return false;
    }
}
