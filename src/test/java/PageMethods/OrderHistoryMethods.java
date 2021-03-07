package PageMethods;

import CommonClasses.AbstractPageObject;
import cucumber.api.java.en.And;
import org.openqa.selenium.By;

public class OrderHistoryMethods extends AbstractPageObject {

    private static final By _ProductSelector = By.xpath("// td[@class='bold']");
    //private static final By _ProductColorSelector = By.xpath("//span[@title='Continue shopping']");
    //private static final By _ProductSizeSelector = By.xpath("//span[@title='Continue shopping']");
    private static final By _QuantitySelector = By.xpath("//span[@title='Continue shopping']");
    private static final By _TotalPriceSelector = By.xpath("//span[@title='Continue shopping']");
    private static final By _firstItem = By.xpath("//tr[@class='first_item ']/td/a");


    public static boolean verifyOrderPlaced(String product ,String productColor ,String productSize ,String quantity ,String totalPrice )
    {
        boolean prodVerification=false;
        driver.findElement(_firstItem).click();
        String productValidation= driver.findElement(_ProductSelector).getText();
        if(productValidation.contains(product) && productValidation.contains(productColor) && productValidation.contains(productSize))
        {
            prodVerification = true;
        }

        return prodVerification;
    }
}
