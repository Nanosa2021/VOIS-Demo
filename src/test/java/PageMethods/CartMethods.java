package PageMethods;

import CommonClasses.AbstractPageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CartMethods extends AbstractPageObject {

    private static final By _AddToCartSelector = By.xpath("//p[@id='add_to_cart']//button");

    public static WebElement Color(String color)
    {
        driver.switchTo().frame(driver.findElement(By.xpath("// iframe[contains(@id,'fancybox')]")));
        return driver.findElement(By.xpath("//a[@name='"+color+"']"));

    }

    public static void Size(String size)
    {
        //Select Size = new Select (driver.findElement(By.xpath("//a[@title='"+size+"']")));
        Select Size = new Select (driver.findElement(By.id("group_1")));
        Size.selectByVisibleText(size);
    }


    public static WebElement AddToCart()
    {
        return driver.findElement(_AddToCartSelector);
    }

}
