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
                "json:target/json-reports/cucumber.json",  //plugin ekledikten sonra bunu cucumber report için ekle
                "junit:test-output/htmlReport/cucumber.xml", //xml report için
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "rerun:Failed/failedScenarios.txt" // bu satirdaki kod kosulan testlerden hata verenlerin yeniden ReRunner classi tarafindan kosulmasini saglar
        },
        monochrome = true,//raporlarin consoleda okunakli sekilde cikmasi icin
        features = "src/test/resources/features",//features folder path
        glue = {"tester_productprocess_ts/stepDefinitions","tester_productprocess_ts/hooks"},   //stepdefinitions path
        tags = "@US2",
        dryRun = false
)
public class Runner {


}