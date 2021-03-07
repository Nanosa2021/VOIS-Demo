package TestRunner;

import CommonClasses.AbstractPageObject;
import CommonClasses.Property;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import java.io.File;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Features",
        glue = {"StepClasses"}, plugin = {
        "com.cucumber.listener.ExtentCucumberFormatter:target/cucumberReports/report.html", "pretty",
        "html:target/CucumberReports/", "junit:target/CucumberReports/Cucumber.xml",
        "json:target/CucumberReports/Cucumber.json"}, monochrome = true, tags = "~@ignore", dryRun = false)
public class RunnerTest extends AbstractPageObject {

    @AfterClass
    public static void writeExtentReport() {
        Reporter.loadXMLConfig(new File(Property.getProperty("reportConfigPath")));
    }
}