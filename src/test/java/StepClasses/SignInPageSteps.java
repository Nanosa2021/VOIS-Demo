package StepClasses;

import CommonClasses.AbstractPageObject;
import CommonClasses.BaseMethods;
import PageMethods.CreateAccountMethods;
import PageMethods.SignInMethods;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.junit.jupiter.api.Assertions;


public class SignInPageSteps extends AbstractPageObject {

    @Given("^the user create an account with the email (.*)$")
    public void theUserCreatesAnAccountWithTheEmail(String emailAddress) {
        BaseMethods.WaitForElementVisible(SignInMethods.Email());
        SignInMethods.Email().sendKeys(emailAddress);

    }

    @Given("^the email is verified successfully$")
    public void theEmailIsVerifiedSuccessfully() {
        SignInMethods.VerifyEmail().click();
    }

    @Given("^the user clicks on create an account$")
    public void theUserClicksOnCreateAnAccount(){
        SignInMethods.CreateAccountButton().click();
    }

    //////////////////////////////////Functions for Login //////////////////////////////////


    @And("^the user enters the configured Email Address (.*)$")
    public void theUserEntersTheConfiguredEmailAddress(String email){
        SignInMethods.EnterConfiguredEmailAddress().sendKeys(email);
    }

    @And("^the user enters the configured password (.*)$")
    public void theUserEntersTheConfiguredPassword(String password){
        SignInMethods.EnterConfiguredPassword().sendKeys(password);
    }

    @And("^the user clicks on signIn$")
    public void theUserClicksOnSignIn(){
        SignInMethods.SignIn().click();
    }

    @And("^the user logged in successfully$")
    public void theUserLoggedInSuccessfully(){
        Boolean signedInSuccessfully = SignInMethods.VerifySignedIn();
        Assertions.assertEquals(true , signedInSuccessfully);
    }


}
