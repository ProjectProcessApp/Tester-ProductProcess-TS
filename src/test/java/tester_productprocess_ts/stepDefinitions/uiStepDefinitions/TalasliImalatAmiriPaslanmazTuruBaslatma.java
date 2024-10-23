package tester_productprocess_ts.stepDefinitions.uiStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import tester_productprocess_ts.pages.Anamenu;
import tester_productprocess_ts.pages.TalasliImalatAmiriGorevleri;
import tester_productprocess_ts.utilities.uiUtilities.Driver;

import static tester_productprocess_ts.utilities.uiUtilities.ReusableMethods.*;

public class TalasliImalatAmiriPaslanmazTuruBaslatma {

    String token="";
    TalasliImalatAmiriGorevleri talasligorev = new TalasliImalatAmiriGorevleri();
    Anamenu anamenu = new Anamenu();
    Response response;
    JsonPath json;
    Boolean weiter = false;
    String sari ="rgba(255, 255, 0, 1)";
    String gri ="rgba(158, 156, 156, 1)";
    String yesil="rgba(0, 128, 0, 1)";
    int uretilecekAdet;

    @Then("Paslanmaz siparis turundeki siparisin basla butonuna tiklar")
    public void paslanmaz_siparis_turundeki_siparisin_basla_butonuna_tiklar() {
        if (!talasligorev.paslanmazBaslaButton.isEmpty() & !talasligorev.paslanmazBaslaButton.getFirst().getText().equals("Durdur")) {
            clickWithJS(talasligorev.paslanmazBaslaButton.getFirst());
            waitFor(3000);
            waitForVisibility(talasligorev.paslanmazSatirButton, 10);
            clickWithJS(talasligorev.paslanmazSatirButton);
            weiter = true;
        }else if(talasligorev.paslanmazBaslaButton.getFirst().getText().equals("Durdur")){
            waitForVisibility(talasligorev.paslanmazSatirButton, 10);
            clickWithJS(talasligorev.paslanmazSatirButton);
            weiter = true;
        }
    }
    @Then("Paslanmaz siparis turundeki siparisin bulundugu satira tiklar")
    public void paslanmaz_siparis_turundeki_siparisin_bulundugu_satira_tiklar() {
        if(weiter=false)
            waitForVisibility(talasligorev.paslanmazSatirButton,10);
            clickWithJS(talasligorev.paslanmazSatirButton);
    }
    @Then("Ezme Butonunu gri renk oldugu dogrulanir")
    public void ezme_butonunu_gri_renk_oldugu_dogrulanir() {
        waitForVisibility(talasligorev.ezmeButton,10);
        String buttonRenk=talasligorev.ezmeButton.getCssValue("background-color");
        Assert.assertEquals(gri,buttonRenk);
    }
    @Then("Paslanmaz siparis turu icin uretilecek adet girilir")
    public void paslanmaz_siparis_turu_icin_uretilecek_adet_girilir() {
        waitForVisibility(talasligorev.uretilenAdetTextBox,10);
        talasligorev.uretilenAdetTextBox.sendKeys("1500");
        uretilecekAdet= 1500;
    }
    @Then("Ezme Butonunu sari renk oldugu dogrulanir")
    public void ezme_butonunu_sari_renk_oldugu_dogrulanir() {
        waitForVisibility(talasligorev.ezmeButton,10);
        String buttonRenk=talasligorev.ezmeButton.getCssValue("background-color");
        Assert.assertEquals(sari,buttonRenk);
    }
    @Then("Kalite kontrol Amirindeki Paslanmaz siparis turundeki siparisin bulundugu satira tiklar")
    public void kalite_kontrol_amirindeki_paslanmaz_siparis_turundeki_siparisin_bulundugu_satira_tiklar() {
        Driver.getDriver().navigate().refresh();
        waitFor(3000);
        clickWithJS(talasligorev.paslanmazSatirButton);
    }

    @And("Mil Taslama sonrasi butona tiklar")
    public void milTaslamaSonrasiButonaTiklar() {
        clickWithJS(talasligorev.milTaslamaSonrasiSatirButton);
    }

    @Then("Paslanmaz Siparis turu girilen adedin sag tarafta biten bolumune islendigi dogrulanir")
    public void paslanmazSiparisTuruGirilenAdedinSagTaraftaBitenBolumuneIslendigiDogrulanir() {
        waitFor(2000);
        waitForVisibility(talasligorev.kaliteKontrolBitenButton,10);
        Assert.assertEquals(Integer.parseInt(talasligorev.kaliteKontrolBitenButton.getText()),Integer.parseInt(talasligorev.siparisAdedi.getText()));
    }

    @Then("Paslanmaz Siparis turu sag taraftaki kalan bolumundeki rakam dogrulanir")
    public void paslanmazSiparisTuruSagTaraftakiKalanBolumundekiRakamDogrulanir() {
        int siparisAdedi= Integer.parseInt(talasligorev.siparisAdedi.getText());
        waitFor(2000);
        int kalan= Integer.parseInt(talasligorev.kaliteKontrolKalanText.getText());
        int biten = Integer.parseInt(talasligorev.kaliteKontrolBitenButton.getText());
        Assert.assertTrue(kalan>=siparisAdedi-biten);
    }

    @And("Ezme butonuna tiklanir")
    public void ezmeButonunaTiklanir() {
        clickWithJS(talasligorev.ezmeButton);
    }

    @Then("Ezme Butonunu yesil renk oldugu dogrulanir")
    public void ezmeButonunuYesilRenkOlduguDogrulanir() {
        waitFor(3000);
        waitForVisibility(talasligorev.ezmeButton,10);
        String buttonRenk=talasligorev.ezmeButton.getCssValue("background-color");
        Assert.assertEquals(yesil,buttonRenk);
    }

    @Then("girilen adedin sag tarafta ezme biten bolumune islendigi dogrulanir")
    public void girilenAdedinSagTaraftaEzmeBitenBolumuneIslendigiDogrulanir() {
        waitForVisibility(talasligorev.ezmeBitenButton,10);
        Assert.assertEquals(Integer.parseInt(talasligorev.ezmeBitenButton.getText()),Integer.parseInt(talasligorev.siparisAdedi.getText()));
    }

    @Then("sag taraftaki ezme kalan bolumundeki rakam dogrulanir")
    public void sagTaraftakiEzmeKalanBolumundekiRakamDogrulanir() {
        int siparisAdedi= Integer.parseInt(talasligorev.siparisAdedi.getText());
        waitFor(2000);
        int kalan= Integer.parseInt(talasligorev.ezmeKalanText.getText());
        int biten = Integer.parseInt(talasligorev.ezmeBitenButton.getText());
        Assert.assertTrue(kalan>=siparisAdedi-biten);
    }

    @And("Ezme sonrasi butona tiklar")
    public void ezmeSonrasiButonaTiklar() {
        clickWithJS(talasligorev.EzmeSonrasiSatirButton);
    }
}
