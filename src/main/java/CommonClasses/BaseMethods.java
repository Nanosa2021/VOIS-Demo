package CommonClasses;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static io.github.bonigarcia.wdm.DriverManagerType.CHROME;
import static io.github.bonigarcia.wdm.DriverManagerType.FIREFOX;

public class BaseMethods extends AbstractPageObject {

    public static void launchBrowser() throws Exception {
        String Browser_Config = Property.getProperty("Browser");
        try {
            if (Browser_Config.equalsIgnoreCase("chrome")) {
                WebDriverManager.getInstance(CHROME).setup();
                ChromeOptions options = new ChromeOptions();
                options.setPageLoadStrategy(PageLoadStrategy.EAGER);
                options.addArguments("--window-size=1024,768");
               // options.addArguments("--start-maximized");
                driver = new ChromeDriver(options);
                driver.manage().window().maximize();
                driver.manage().deleteAllCookies();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            } else if (Browser_Config.equalsIgnoreCase("firefox")) {
                WebDriverManager.getInstance(FIREFOX).setup();
                FirefoxOptions options = new FirefoxOptions();
                options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
                options.addArguments("--window-size=1024,768");
                options.addArguments("--start-maximized");
                driver.manage().window().maximize();
                driver.manage().deleteAllCookies();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            } else {
                throw new Exception("enter valid browser name");
            }

            //return driver;
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception();
        }
    }

    public static void WaitForElementVisible(WebElement VisibleElement) {

        WebDriverWait wait = new WebDriverWait(driver, 1000);
        wait.until(ExpectedConditions.visibilityOf(VisibleElement));
    }
}
