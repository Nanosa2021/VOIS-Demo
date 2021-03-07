package PageMethods;

import CommonClasses.AbstractPageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProductMethods extends AbstractPageObject {

    public static WebElement selectProduct(String product)
    {
        return driver.findElement(By.xpath("//img[@title='"+product+"']"));

    }



}
