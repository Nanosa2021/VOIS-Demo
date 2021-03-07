package StepClasses;

import CommonClasses.AbstractPageObject;
import PageMethods.CartMethods;
import cucumber.api.java.en.Given;

public class CartPageSteps extends AbstractPageObject {

    @Given("^the user selects (.*) color and (.*) size$")
    public void theUserSelectsColorAndSize(String color , String size) throws Exception {
        CartMethods.Color(color).click();
        CartMethods.Size(size);
    }

    @Given("^the user click on add to cart$")
    public void addToCart() throws Exception {
        CartMethods.AddToCart().click();
    }


}
