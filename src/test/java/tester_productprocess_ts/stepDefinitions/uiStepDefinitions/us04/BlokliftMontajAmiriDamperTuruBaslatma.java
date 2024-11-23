package tester_productprocess_ts.stepDefinitions.uiStepDefinitions.us04;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import tester_productprocess_ts.pages.Anamenu;
import tester_productprocess_ts.pages.TalasliImalatAmiriGorevleri;

import static tester_productprocess_ts.utilities.uiUtilities.ReusableMethods.*;

public class BlokliftMontajAmiriDamperTuruBaslatma {

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


    @Then("Damper turunde uretilen toplam mil miktarini dogrular")
    public void damperTurundeUretilenToplamMilMiktariniDogrular() {
        waitFor(1500);
        int siparisAdedi = Integer.parseInt(talasligorev.siparisAdedi.getText());
        int actualUretilenToplamMil=Integer.parseInt(talasligorev.uretilenToplamMil.getText());
        Assert.assertEquals(siparisAdedi,actualUretilenToplamMil);
    }

    @Then("Bloklift Montaj Butonunu gri renk oldugu dogrulanir")
    public void blokliftMontajButonunuGriRenkOlduguDogrulanir() {
        waitFor(1000);
        String buttonRenk=talasligorev.blokliftMontajButon.getCssValue("background-color");
        Assert.assertEquals(gri,buttonRenk);
    }

    @Then("Test Butonunun gri renk oldugu dogrulanir")
    public void testButonununGriRenkOlduguDogrulanir() {
        waitFor(1000);
        String buttonRenk=talasligorev.testButon.getCssValue("background-color");
        Assert.assertEquals(gri,buttonRenk);
    }

    @And("DAMPER siparis turu icin uretilecek adet girilir")
    public void damperSiparisTuruIcinUretilecekAdetGirilir() {
        waitForVisibility(talasligorev.uretilenAdetTextBox,10);
        talasligorev.uretilenAdetTextBox.sendKeys("1000");
        uretilecekAdet= 1000;
    }

    @Then("Bloklift Montaj Butonunu sari renk oldugu dogrulanir")
    public void blokliftMontajButonunuSariRenkOlduguDogrulanir() {
        waitFor(1000);
        String buttonRenk=talasligorev.blokliftMontajButon.getCssValue("background-color");
        Assert.assertEquals(sari,buttonRenk);
    }

    @And("Bloklift Montaj butonuna tiklanir")
    public void blokliftMontajButonunaTiklanir() {
        waitFor(1000);
        clickWithJS(talasligorev.blokliftMontajButon);
    }

    @Then("Bloklift Montaj Butonunu yesil renk oldugu dogrulanir")
    public void blokliftMontajButonunuYesilRenkOlduguDogrulanir() {
        waitFor(1000);
        String buttonRenk=talasligorev.blokliftMontajButon.getCssValue("background-color");
        Assert.assertEquals(yesil,buttonRenk);
    }

    @Then("Test Butonunun sari renk oldugu dogrulanir")
    public void testButonununSariRenkOlduguDogrulanir() {
        waitFor(1000);
        String buttonRenk=talasligorev.testButon.getCssValue("background-color");
        Assert.assertEquals(sari,buttonRenk);
    }

    @And("Test butonuna tiklanir")
    public void testButonunaTiklanir() {
        waitFor(500);
        clickWithJS(talasligorev.testButon);
    }

    @Then("girilen adedin sag tarafta test biten bolumune islendigi dogrulanir")
    public void girilenAdedinSagTaraftaTestBitenBolumuneIslendigiDogrulanir() {
        waitFor(1500);
        waitForVisibility(talasligorev.testBitenButton,10);
        Assert.assertEquals(Integer.parseInt(talasligorev.testBitenButton.getText()),Integer.parseInt(talasligorev.siparisAdedi.getText()));
    }

    @Then("sag taraftaki test kalan bolumundeki rakam dogrulanir")
    public void sagTaraftakiTestKalanBolumundekiRakamDogrulanir() {
        int siparisAdedi= Integer.parseInt(talasligorev.siparisAdedi.getText());
        waitFor(1500);
        int actualBaslikTakmaKalanText= Integer.parseInt(talasligorev.testKalanText.getText());
        Assert.assertTrue(siparisAdedi>actualBaslikTakmaKalanText);
    }

    @Then("Test butonunun yesil renk oldugu dogrulanir")
    public void testButonununYesilRenkOlduguDogrulanir() {
        waitFor(1000);
        String buttonRenk=talasligorev.testButon.getCssValue("background-color");
        Assert.assertEquals(yesil,buttonRenk);
    }

    @Then("girilen adedin sag tarafta bloklift montaj biten bolumune islendigi dogrulanir")
    public void girilenAdedinSagTaraftaBlokliftMontajBitenBolumuneIslendigiDogrulanir() {
        waitFor(1500);
        Assert.assertEquals(Integer.parseInt(talasligorev.blokliftMontajBitenButton.getText()),Integer.parseInt(talasligorev.siparisAdedi.getText()));
    }

    @Then("sag taraftaki bloklift montaj kalan bolumundeki rakam dogrulanir")
    public void sagTaraftakiBlokliftMontajKalanBolumundekiRakamDogrulanir() {
        int siparisAdedi= Integer.parseInt(talasligorev.siparisAdedi.getText());
        waitFor(1500);
        int actualLiftMontajKalanText= Integer.parseInt(talasligorev.blokliftMontajKalanText.getText());
        Assert.assertTrue(siparisAdedi>actualLiftMontajKalanText);
    }
}
