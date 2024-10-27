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

    String token="";
    TalasliImalatAmiriGorevleri talasligorev = new TalasliImalatAmiriGorevleri();
    Anamenu anamenu = new Anamenu();
    Response response;
    JsonPath json;
    Boolean weiter = false;
    String sari ="rgba(255, 255, 0, 1)";
    String gri ="rgba(180, 177, 177, 1)";
    String yesil="rgba(0, 128, 0, 1)";
    int uretilecekAdet;

    @Then("Paslanmaz turunde uretilen toplam mil miktarini dogrular")
    public void paslanmazTurundeUretilenToplamMilMiktariniDogrular() {
        waitFor(1500);
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
