package tester_productprocess_ts.hooks;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import tester_productprocess_ts.utilities.uiUtilities.Driver;

public class Hooks {

    @Before
    public void setup(){
        System.out.println("Test basladi");
    }

    @After
    public void tearDown(Scenario scenario){
        final byte[] failedScreenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        if (scenario.isFailed()) {
            scenario.attach(failedScreenshot, "image/png", "failed_screenshot"+scenario.getName());
        }
    }
}
