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

public class BlokliftMontajAmiriBlokliftTuruBaslatma {

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

    @Then("Bloklift turunde uretilen toplam mil miktarini dogrular")
    public void blokliftTurundeUretilenToplamMilMiktariniDogrular() {
        waitFor(1000);
        int siparisAdedi = Integer.parseInt(talasligorev.siparisAdedi.getText());
        int actualUretilenToplamMil=Integer.parseInt(talasligorev.uretilenToplamMil.getText());
        Assert.assertEquals(siparisAdedi,actualUretilenToplamMil);
    }

    @Then("Boru Kapama Butonunun gri renk oldugu dogrulanir")
    public void boruKapamaButonununGriRenkOlduguDogrulanir() {
        waitFor(1000);
        String buttonRenk=talasligorev.boruKapamaButon.getCssValue("background-color");
        Assert.assertEquals(gri,buttonRenk);
    }

    @And("BLOKLIFT siparis turu icin uretilecek adet girilir")
    public void blokliftSiparisTuruIcinUretilecekAdetGirilir() {
        waitForVisibility(talasligorev.uretilenAdetTextBox,10);
        talasligorev.uretilenAdetTextBox.sendKeys("1500");
        uretilecekAdet= 1500;
    }

    @Then("Gaz Dolum Butonunu sari renk oldugu dogrulanir")
    public void gazDolumButonunuSariRenkOlduguDogrulanir() {
        waitFor(1000);
        String buttonRenk=talasligorev.gazDolumButon.getCssValue("background-color");
        Assert.assertEquals(sari,buttonRenk);
    }
}
