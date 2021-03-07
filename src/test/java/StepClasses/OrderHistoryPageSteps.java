package StepClasses;

import CommonClasses.AbstractPageObject;
import PageMethods.OrderHistoryMethods;
import PageMethods.PageNavigationMethods;
import PageMethods.PaymentMethods;
import cucumber.api.java.en.And;
import org.junit.jupiter.api.Assertions;

public class OrderHistoryPageSteps extends AbstractPageObject {

    @And("^order is placed on order history page (.*) and (.*) and (.*) and (.*) and (.*) are displayed correctly$")
    public void orderIsPlacedOnOrderHistoryPage(String product , String productColor , String productSize , String quantity , String totalPrice)
    {
        PageNavigationMethods.BackToOrders().click();
        Boolean orderPlaced = OrderHistoryMethods.verifyOrderPlaced(product , productColor , productSize , quantity ,totalPrice );
        Assertions.assertEquals(true, orderPlaced);
    }
}
