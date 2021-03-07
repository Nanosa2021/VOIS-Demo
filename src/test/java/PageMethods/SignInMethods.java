package PageMethods;

import CommonClasses.AbstractPageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SignInMethods extends AbstractPageObject {

    private static final By _EmailSelector = By.id("email_create");
    private static final By _VerifyEmailSelector = By.xpath("//p[contains(text(),'Please enter your email address to create an account')]");
    private static final By _CreateAccountButtonSelector = By.id("SubmitCreate");
    private static final By _ConfiguredEmailAddressSelector = By.id("email");
    private static final By _ConfiguredPasswordSelector = By.id("passwd");
    private static final By _SignInSelector = By.id("SubmitLogin");
    private static final By _SignInVerificationSelector = By.xpath("//p[@class='info-account']");

    public static WebElement Email() {
        return driver.findElement(_EmailSelector);
    }
    public static WebElement VerifyEmail() {
        return driver.findElement(_VerifyEmailSelector);
    }
    public static WebElement CreateAccountButton() {
        return driver.findElement(_CreateAccountButtonSelector);
    }
    public static WebElement EnterConfiguredEmailAddress(){return driver.findElement(_ConfiguredEmailAddressSelector);}
    public static WebElement EnterConfiguredPassword(){return driver.findElement(_ConfiguredPasswordSelector);}
    public static WebElement SignIn(){return driver.findElement(_SignInSelector);}
    public static boolean VerifySignedIn() {
        boolean signedIn = false;
        String signedInVerif = driver.findElement(_SignInVerificationSelector).getText();
        if (signedInVerif.compareToIgnoreCase("Welcome to your account. Here you can manage all of your personal information and orders.") == 0) {
            signedIn = true;
        }
        return signedIn;
    }

}
