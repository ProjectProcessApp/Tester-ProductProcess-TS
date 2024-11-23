package tester_productprocess_ts.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import tester_productprocess_ts.utilities.uiUtilities.PdfReportGenerator;

import java.io.IOException;

@RunWith(Cucumber.class)//Cucumber ile junit in entegre olmasini saglayan scenario calistirici notasyon
@CucumberOptions(//bu notasyon sayesinde hangi scenariolari calistiracagimiz ve hangi raporlari alacağımızı belirtiriz

        plugin = {
                "pretty",//raporlarin daha ikunakli olmasi icin
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:test-output/htmlReport/cucumber.xml",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "rerun:Failed/failedScenarios.txt"
        },
        monochrome = true,
        features = "src/test/resources/features",
        glue = {"tester_productprocess_ts/stepDefinitions","tester_productprocess_ts/hooks"},
        tags = "@endtoend",
        dryRun = false
)
public class Runner {
}