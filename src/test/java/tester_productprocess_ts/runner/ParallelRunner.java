package tester_productprocess_ts.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)//Cucumber ile junit in entegre olmasini saglayan scenario calistirici notasyon
@CucumberOptions(//bu notasyon sayesinde hangi scenariolari calistiracagimiz ve hangi raporlari alacağımızı belirtiriz

        plugin = {
                "pretty",//Console da scenariolar ile ilgili ayrintili bilgi almamizi saglar
                "html:target/default-cucumber-reports1.html",
                "json:target/json-reports/cucumber1.json",
                "junit:target/xml-report/cucumber1.xml",
                "rerun:TestOutput/failed_scenario.txt"//rerun plugini ile fail olan scenariolari burada belirtmis oludgumuz txt dosyasi icinde tutabiliriz
        },
        features = "src/test/resources/features",
        glue = {"tester_productprocess_ts/stepDefinitions","hooks"},
        tags = "",
        dryRun = false,
        monochrome = false
)
public class ParallelRunner {
}// Terminale gelip mvn clean verify yazıp ctrl+enter dersek yine calışır paralel testler