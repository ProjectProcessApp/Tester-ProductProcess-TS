package tester_productprocess_ts.stepDefinitions;

import io.cucumber.java.en.When;
import tester_productprocess_ts.utilities.uiUtilities.ConfigReader;
import tester_productprocess_ts.utilities.uiUtilities.Driver;

public class Register {
    @When("Register sayfasini acar")
    public void registerSayfasiniAcar() {

        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }
}
