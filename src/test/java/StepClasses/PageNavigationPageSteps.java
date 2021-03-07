package StepClasses;

import CommonClasses.AbstractPageObject;
import PageMethods.PageNavigationMethods;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import CommonClasses.BaseMethods;
import CommonClasses.Property;
import cucumber.api.java.en.Then;
import org.junit.jupiter.api.Assertions;


public class PageNavigationPageSteps extends AbstractPageObject {

    @Given("^The user has launched the automation Practise application$")
    public void theUserHasLaunchedTheAutomationPractiseApplication() throws Exception {

        BaseMethods.launchBrowser();
        driver.get(Property.getProperty("BaseURL"));
    }


    @And("^the user proceed to (.*) checkout$")
    public void theUserProceedToFirstCheckOut(String pgeNum) {
        if(pgeNum.compareToIgnoreCase("first")==0) {
            PageNavigationMethods.ProceedToCheckoutFirst();
        }
        else if(pgeNum.compareToIgnoreCase("second")==0)
        {
            PageNavigationMethods.ProceedToCheckoutSecond();
        }
        else if(pgeNum.compareToIgnoreCase("third")==0)
        {
            PageNavigationMethods.ProceedToCheckoutThird();
        }
        else if(pgeNum.compareToIgnoreCase("forth")==0)
        {
            PageNavigationMethods.ProceedToCheckoutForth();
        }



    }



        @And("^the user agree to the terms and conditions$")
        public void agreeTotheTermsAndConditions ()
        {
            PageNavigationMethods.AgreeTermsAndConditions().click();
        }

         @And("^the user confirms the order$")
        public void theUserConfirmsTheOrder()
         {
         PageNavigationMethods.ConfirmOrder().click();
         }

         @Then("^order should be confirmed$")
          public void orderConfirmation()
         {
             boolean order_Confirmed = PageNavigationMethods.VerifyOrderConfirmed();
             Assertions.assertEquals(true , order_Confirmed);
         }


}
