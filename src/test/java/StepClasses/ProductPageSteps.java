package StepClasses;

import CommonClasses.AbstractPageObject;
import PageMethods.ProductMethods;
import cucumber.api.java.en.Given;

public class ProductPageSteps extends AbstractPageObject {

    @Given("^the user selects the (.*) product$")
    public void theUserSelectsProduct(String Product) throws Exception {
        ProductMethods.selectProduct(Product).click();
    }
}
