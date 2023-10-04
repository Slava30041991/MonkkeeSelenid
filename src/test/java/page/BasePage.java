package page;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import static com.codeborne.selenide.Selenide.$;

public abstract class BasePage {

    public abstract boolean isPageOpen();
    public boolean isExist(By locator) {
        try {
        return  $(locator).isDisplayed();
        } catch (NoSuchElementException e)
        {
        return false;
        }

    }
}
