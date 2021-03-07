package StepClasses;

import CommonClasses.AbstractPageObject;
import PageMethods.CartMethods;
import PageMethods.PaymentMethods;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class PaymentPageSteps extends AbstractPageObject {


    @And("^the user selects payment option (.*)$")
    public void selectsPaymentOption(String paymentOption) {
        PaymentMethods.PayBy(paymentOption).click();
    }
}
