package page;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
public class HomePage  extends BasePage{

    public static final By PAGE_LOCATOR = By.xpath("//a[text() = 'Homepage']");

        @Step("Open home page")
        public HomePage openHomePage(String url) {

        Selenide.open(url);

        return this;
    }
        @Step("Click button sing up")
        public HomePage clickButtonSingUP() {
        $(By.xpath("//a[normalize-space(text()) = 'Sign up – it’s free!']")).click();
        return this;
        }

    @Override
    public boolean isPageOpen() {
        return isExist(PAGE_LOCATOR);
    }
}
