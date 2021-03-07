package StepClasses;

import CommonClasses.BaseMethods;
import PageMethods.HomePageMethods;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;


public class HomePageSteps {
    @When("^the user click on Sign in$")
    public void theUserClicksOnSignIn() {
        BaseMethods.WaitForElementVisible(HomePageMethods.SignInButton());
        HomePageMethods.SignInButton().click();
    }

}
