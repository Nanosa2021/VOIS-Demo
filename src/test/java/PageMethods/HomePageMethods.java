package PageMethods;

import CommonClasses.AbstractPageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePageMethods extends AbstractPageObject {

    private static final By _signInButtonSelector = By.xpath("//a[@class='login']");

    public static WebElement SignInButton() {
        return driver.findElement(_signInButtonSelector);
    }
}
