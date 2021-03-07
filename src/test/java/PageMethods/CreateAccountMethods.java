package PageMethods;

import CommonClasses.AbstractPageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountMethods extends AbstractPageObject {

    private static final By _FirstNameSelector = By.id("customer_firstname");
    private static final By _LastNameSelector = By.id("customer_lastname");
    private static final By _PasswordSelector = By.id("passwd");
    // drop down
    private static final By _DaySelector = By.id("days");
    //drop down
    private static final By _MonthSelector = By.id("months");
    //drop down
    private static final By _YearSelector = By.id("years");
    private static final By _CompanySelector = By.id("company");
    private static final By _FinalAddressSelector = By.id("address1");
    private static final By _CitySelector = By.id("city");
    //drop down
    private static final By _StateSelector = By.id("id_state");
    private static final By _PostalCodeSelector = By.id("postcode");
    //drop down
    private static final By _CountrySelector = By.id("id_country");
    private static final By _MobilePhoneSelector = By.id("phone_mobile");
    private static final By _AddressAliasSelector = By.id("alias");
    private static final By _RegistrationButtonSelector = By.id("submitAccount");
    private static final By _verifyCreatedAccount = By.xpath("//p[@class='info-account']");


    public static WebElement Title(String gen) {
        return driver.findElement(By.xpath("//input[@id='id_gender"+gen+"']"));
    }

    public static WebElement FirstName() {
        return driver.findElement(_FirstNameSelector);
    }

    public static WebElement LastName() {
        return driver.findElement(_LastNameSelector);
    }

    public static WebElement Password() {
        return driver.findElement(_PasswordSelector);
    }

    public static void Day(String day) {
        Select Day = new Select (driver.findElement(_DaySelector));
        Day.selectByValue(day);
    }

    public static void Month(String month) {
        Select Day = new Select (driver.findElement(_MonthSelector));
        Day.selectByValue(month);
    }

    public static void Year(String year) {
        Select Day = new Select (driver.findElement(_YearSelector));
        Day.selectByValue(year);
    }

    public static WebElement Company() {
        return driver.findElement(_CompanySelector);
    }

    public static WebElement FinalAddress() {
        return driver.findElement(_FinalAddressSelector);
    }


    public static WebElement City() {
        return driver.findElement(_CitySelector);
    }

    public static void State(String state) {
        Select State = new Select (driver.findElement(_StateSelector));
        State.selectByVisibleText(state);
    }

    public static WebElement Postal() {
        return driver.findElement(_PostalCodeSelector);
    }

    public static void Country(String country) {
        Select Country = new Select (driver.findElement(_CountrySelector));
        Country.selectByVisibleText(country);
    }

    public static WebElement MobilePhone() {
        return driver.findElement(_MobilePhoneSelector);
    }

    public static WebElement AddressAlias() {
        return driver.findElement(_AddressAliasSelector);
    }

    public static WebElement RegistrationButton() {
        return driver.findElement(_RegistrationButtonSelector);
    }

    public static boolean VerifyCreatedAccount() {
        boolean accountVerified = false;
         String account_Created = driver.findElement(_verifyCreatedAccount).getText();
         if(account_Created.compareToIgnoreCase("Welcome to your account. Here you can manage all of your personal information and orders.")==0)
         {
             accountVerified = true;
         }
         return accountVerified;

    }



}




