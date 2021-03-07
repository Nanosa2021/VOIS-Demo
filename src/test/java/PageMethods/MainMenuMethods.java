package PageMethods;

import CommonClasses.AbstractPageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MainMenuMethods extends AbstractPageObject {

    public static void  MainCategoory(String Category)
    {
        Actions actions = new Actions(driver);
        WebElement categorySelected = driver.findElement(By.xpath("//a[@title='"+Category+"']"));
        actions.moveToElement(categorySelected).perform();
    }

    public static WebElement SubCategoory(String subCategory)
    {
        return driver.findElement(By.xpath("//a[@title='"+subCategory+"']"));

    }

}
