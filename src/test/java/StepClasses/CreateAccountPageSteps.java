package StepClasses;

import CommonClasses.AbstractPageObject;
import PageMethods.CreateAccountMethods;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.jupiter.api.Assertions;


public class CreateAccountPageSteps extends AbstractPageObject {


    @Given("^the user enters the title (.*)$")
    public void theUserEntersTheTitle(String title) {
        if (title.compareToIgnoreCase("MR") == 0) {
            CreateAccountMethods.Title("1").click();
        } else {
            CreateAccountMethods.Title("2").click();
        }
    }

    @Given("^the user enters first name (.*)$")
    public void theUserEntersFirstName(String firstName) {
        CreateAccountMethods.FirstName().sendKeys(firstName);
        }

    @Given("^the user enters last name (.*)$")
    public void theUserEntersLastName(String lastName) {
        CreateAccountMethods.LastName().sendKeys(lastName);
    }

    @Given("^the user enters password (.*)$")
    public void theUserEntersPassword(String Password) {
        CreateAccountMethods.Password().sendKeys(Password);
    }

    @Given("^the user enters date of birth as (.*) and (.*) and (.*)$")
    public void theUserEntersPassword(String day , String month , String year) {
        CreateAccountMethods.Day(day);
        CreateAccountMethods.Month(month);
        CreateAccountMethods.Year(year);
    }

    @Given("^the user enters the address details as (.*) and (.*)$")
    public void theUserEntersPassword( String company , String finalAddress) {
        CreateAccountMethods.Company().sendKeys(company);
        CreateAccountMethods.FinalAddress().sendKeys(finalAddress);
    }

    @Given("^the user enters city (.*)$")
    public void theUserEntersCity( String city) {
        CreateAccountMethods.City().sendKeys(city);
    }

    @Given("^the user enters state (.*)$")
    public void theUserEntersState(String state) {
        CreateAccountMethods.State(state);
    }

    @Given("^the user enters postal code (.*)$")
    public void theUserEntersPostalCode(String postalCode) {
        CreateAccountMethods.Postal().sendKeys(postalCode);
    }

    @Given("^the user enters country (.*)$")
    public void theUserEntersCountry(String country) {
        CreateAccountMethods.Country(country);
    }

    @Given("^the user enters mobile phone (.*)$")
    public void theUserEntersHomePhone(String mobilePhone) {
        CreateAccountMethods.MobilePhone().sendKeys(mobilePhone);
    }

    @Given("^the user assigns an address alias for future reference (.*)$")
    public void theUserAssignAddressAlias(String addressAlias) {
        CreateAccountMethods.AddressAlias().sendKeys(addressAlias);
    }

    @Given("^the user clicks on Register$")
    public void theUserClicksOnRegister() {
        CreateAccountMethods.RegistrationButton().click();
    }

    @Then("^Account is Created Successfully$")
    public void AccountIsCreatedSuccessfully() {
        Boolean accountCreated = CreateAccountMethods.VerifyCreatedAccount();
        Assertions.assertEquals(true , accountCreated);
    }



}
