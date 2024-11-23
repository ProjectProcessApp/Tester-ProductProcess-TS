package tester_productprocess_ts.stepDefinitions.uiStepDefinitions.us04;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import tester_productprocess_ts.pages.Anamenu;
import tester_productprocess_ts.pages.TalasliImalatAmiriGorevleri;

import static tester_productprocess_ts.utilities.uiUtilities.ReusableMethods.waitFor;
import static tester_productprocess_ts.utilities.uiUtilities.ReusableMethods.waitForVisibility;

public class LiftMontajAmiriPaslanmazTuruBaslatma {

    TalasliImalatAmiriGorevleri talasligorev = new TalasliImalatAmiriGorevleri();
    int uretilecekAdet;

    @Then("Paslanmaz turunde uretilen toplam mil miktarini dogrular")
    public void paslanmazTurundeUretilenToplamMilMiktariniDogrular() {
        waitFor(1000);
        int siparisAdedi = Integer.parseInt(talasligorev.siparisAdedi.getText());
        int actualUretilenToplamMil=Integer.parseInt(talasligorev.uretilenToplamMil.getText());
        Assert.assertEquals(siparisAdedi,actualUretilenToplamMil);
    }

    @And("PASLANMAZ siparis turu icin uretilecek adet girilir")
    public void paslanmazSiparisTuruIcinUretilecekAdetGirilir() {
        waitForVisibility(talasligorev.uretilenAdetTextBox,10);
        talasligorev.uretilenAdetTextBox.sendKeys("1000");
        uretilecekAdet= 1000;
    }
}
