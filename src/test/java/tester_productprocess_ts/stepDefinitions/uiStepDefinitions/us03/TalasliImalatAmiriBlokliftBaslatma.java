package tester_productprocess_ts.stepDefinitions.uiStepDefinitions.us03;

import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import tester_productprocess_ts.pages.Anamenu;
import tester_productprocess_ts.pages.TalasliImalatAmiriGorevleri;
import tester_productprocess_ts.utilities.uiUtilities.Driver;

import static tester_productprocess_ts.utilities.uiUtilities.ReusableMethods.*;

public class TalasliImalatAmiriBlokliftBaslatma {

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

    @Then("Bloklift siparis turundeki siparisin basla butonuna tiklar")
    public void bloklift_siparis_turundeki_siparisin_basla_butonuna_tiklar() {
        if (!talasligorev.blokliftBaslaButton.isEmpty() & !talasligorev.blokliftBaslaButton.getFirst().getText().equals("Durdur")) {
            clickWithJS(talasligorev.blokliftBaslaButton.getFirst());
            waitForVisibility(talasligorev.blokliftSatirButton, 10);
            weiter = true;
            clickWithJS(talasligorev.blokliftSatirButton);
            waitFor(2000);
        }else if(talasligorev.blokliftBaslaButton.getFirst().getText().equals("Durdur")){
            waitForVisibility(talasligorev.blokliftSatirButton, 10);
            weiter = true;
            clickWithJS(talasligorev.blokliftSatirButton);
        }
    }
    @Then("Bloklift siparis turundeki siparisin bulundugu satira tiklar")
    public void bloklift_siparis_turundeki_siparisin_bulundugu_satira_tiklar() {
        if(!weiter)
            waitForVisibility(talasligorev.blokliftSatirButton,10);
        clickWithJS(talasligorev.blokliftSatirButton);
        waitFor(1000);
    }
    @Then("Bloklift uretilecek adet girilir")
    public void bloklift_uretilecek_adet_girilir() {
        waitForVisibility(talasligorev.uretilenAdetTextBox,10);
        talasligorev.uretilenAdetTextBox.sendKeys("1500");
        uretilecekAdet= 1500;
    }
    @Then("Bloklift siparis turu girilen adedin sag tarafta mil taslama biten bolumune islendigi dogrulanir")
    public void bloklift_siparis_turu_girilen_adedin_sag_tarafta_mil_taslama_biten_bolumune_islendigi_dogrulanir() {
        waitFor(3000);
        Assert.assertEquals(uretilecekAdet,Integer.parseInt(talasligorev.siparisAdedi.getText()));
    }
    @Then("Bloklift siparis turu sag taraftaki mil taslama kalan bolumundeki rakam dogrulanir")
    public void bloklift_siparis_turu_sag_taraftaki_mil_taslama_kalan_bolumundeki_rakam_dogrulanir() {
        int siparisAdedi= Integer.parseInt(talasligorev.siparisAdedi.getText());
        waitFor(2000);
        int kalan= Integer.parseInt(talasligorev.milTaslamaKalanText.getText());
        int biten = Integer.parseInt(talasligorev.milTaslalamaBitenButton.getText());
        Assert.assertTrue(kalan>=siparisAdedi-biten);
    }
    @Then("Bloklift girilen adedin sag tarafta Isil Islem biten bolumune islendigi dogrulanir")
    public void bloklift_girilen_adedin_sag_tarafta_isil_islem_biten_bolumune_islendigi_dogrulanir() {
        waitForVisibility(talasligorev.isilIslemBitenButton,10);
        Assert.assertEquals(uretilecekAdet,Integer.parseInt(talasligorev.siparisAdedi.getText()));
    }
    @Then("Bloklift sag taraftaki Isil Islem kalan bolumundeki rakam dogrulanir")
    public void bloklift_sag_taraftaki_isil_islem_kalan_bolumundeki_rakam_dogrulanir() {
        int siparisAdedi= Integer.parseInt(talasligorev.siparisAdedi.getText());
        waitFor(2000);
        int kalan= Integer.parseInt(talasligorev.isilIslemKalanText.getText());
        int biten = Integer.parseInt(talasligorev.isilIslemBitenButton.getText());
        Assert.assertTrue(kalan>=siparisAdedi-biten);
    }
    @Then("Isil Islem Butonunu yesil renk oldugu dogrulanir")
    public void isil_islem_butonunu_yesil_renk_oldugu_dogrulanir() {
        waitForVisibility(talasligorev.isilIslemButton,10);
        String buttonRenk=talasligorev.isilIslemButton.getCssValue("background-color");
        Assert.assertEquals(yesil,buttonRenk);
    }
    @Then("Polisaj Amirindeki Bloklift siparis turundeki siparisin bulundugu satira tiklar")
    public void polisaj_amirindeki_bloklift_siparis_turundeki_siparisin_bulundugu_satira_tiklar() {
        clickWithJS(talasligorev.blokliftSatirButton);
    }
    @Then("Bloklift Siparis turu girilen adedin sag tarafta mil koparma biten bolumune islendigi dogrulanir")
    public void bloklift_siparis_turu_girilen_adedin_sag_tarafta_mil_koparma_biten_bolumune_islendigi_dogrulanir() {
       Assert.assertEquals(uretilecekAdet,Integer.parseInt(talasligorev.polisajBitenButton.getText()));
    }
    @Then("Bloklift Siparis turu sag taraftaki mil koparma kalan bolumundeki rakam dogrulanir")
    public void bloklift_siparis_turu_sag_taraftaki_mil_koparma_kalan_bolumundeki_rakam_dogrulanir() {

    }
    @Then("Kalite kontrol Amirindeki Bloklift siparis turundeki siparisin bulundugu satira tiklar")
    public void kalite_kontrol_amirindeki_bloklift_siparis_turundeki_siparisin_bulundugu_satira_tiklar() {
        waitFor(2000);
        Driver.getDriver().navigate().refresh();
        clickWithJS(talasligorev.blokliftSatirButton);
    }
    @Then("Bloklift Polisaj sonrasi butona tiklar")
    public void bloklift_polisaj_sonrasi_butona_tiklar() {
        clickWithJS(talasligorev.polisajSonrasiSatirButton);
    }
    @Then("Bloklift Siparis turu girilen adedin sag tarafta biten bolumune islendigi dogrulanir")
    public void bloklift_siparis_turu_girilen_adedin_sag_tarafta_biten_bolumune_islendigi_dogrulanir() {
        waitForVisibility(talasligorev.kaliteKontrolBitenButton,10);
        Assert.assertEquals(uretilecekAdet,Integer.parseInt(talasligorev.siparisAdedi.getText()));
    }
    @Then("Bloklift Siparis turu sag taraftaki kalan bolumundeki rakam dogrulanir")
    public void bloklift_siparis_turu_sag_taraftaki_kalan_bolumundeki_rakam_dogrulanir() {
        int siparisAdedi= Integer.parseInt(talasligorev.siparisAdedi.getText());
        waitFor(2000);
        int kalan= Integer.parseInt(talasligorev.kaliteKontrolKalanText.getText());
        int biten = Integer.parseInt(talasligorev.kaliteKontrolBitenButton.getText());
        Assert.assertTrue(kalan>=siparisAdedi-biten);
    }

}
