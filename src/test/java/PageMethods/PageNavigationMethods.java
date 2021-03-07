package PageMethods;

import CommonClasses.AbstractPageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.Set;

public class PageNavigationMethods extends AbstractPageObject {

    private static final By _ProceedToCheckOutSelector1 = By.xpath("//a[@title='Proceed to checkout']");
    private static final By _ProceedToCheckOutSelector2 = By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']");
    private static final By _ProceedToCheckOutSelector3 = By.xpath("//button[@name='processAddress']");
    private static final By _ProceedToCheckOutSelector4 = By.xpath("//button[@name='processCarrier']");
    private static final By _AgreeTermsAndConditions = By.id("cgv");
    private static final By _ConfirmOrder = By.xpath("//p[@id='cart_navigation']//button[@type='submit']");
    private static final By _VerifyOrderConfirmation = By.xpath("//p[@class='cheque-indent']/strong");
    private static final By _BackToOrders = By.xpath("//a[@title='Back to orders']");

    public static void ProceedToCheckoutFirst()
    {
        //driver.switchTo().window(newWindow);
        //return driver.findElement(_ProceedToCheckOutSelector);

        String originalWindow = driver.getWindowHandle();
        String newWindow;
        Set<String> windowHandles = driver.getWindowHandles();
        Iterator<String> stringIterator = windowHandles.iterator();

        while (stringIterator.hasNext()) {
            newWindow = stringIterator.next();
            //  if (!originalWindow.equalsIgnoreCase(newWindow)) {
            driver.switchTo().window(newWindow);
            //System.out.println("The title of the page is: “ + driverInstance.getTitle()));
            driver.findElement(_ProceedToCheckOutSelector1).click();
            // }
        }
    }

    public static void ProceedToCheckoutSecond() {
        driver.findElement(_ProceedToCheckOutSelector2).click();
    }

    public static void ProceedToCheckoutThird() {
        driver.findElement(_ProceedToCheckOutSelector3).click();
    }

    public static void ProceedToCheckoutForth() {
        driver.findElement(_ProceedToCheckOutSelector4).click();
    }



    public static WebElement AgreeTermsAndConditions()
    {
        return driver.findElement(_AgreeTermsAndConditions);
    }

    public static WebElement ConfirmOrder()
    {
        return driver.findElement(_ConfirmOrder);
    }


    public static boolean VerifyOrderConfirmed()
    {
        boolean orderConfirmationVerification=false;
       String order_Confirmation_Verification= driver.findElement(_VerifyOrderConfirmation).getText();
       if(order_Confirmation_Verification.compareToIgnoreCase("Your order on My Store is complete.")==0)
       {
           orderConfirmationVerification = true;
       }

       return orderConfirmationVerification;
    }

    public static WebElement BackToOrders()
    {
        return driver.findElement(_BackToOrders);
    }

}
