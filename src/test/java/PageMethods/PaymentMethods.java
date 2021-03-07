package PageMethods;

import CommonClasses.AbstractPageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PaymentMethods extends AbstractPageObject {

    public static WebElement PayBy(String paymentOption)
    {
        return driver.findElement(By.xpath("//a[@class='"+paymentOption+"']"));
    }

}
