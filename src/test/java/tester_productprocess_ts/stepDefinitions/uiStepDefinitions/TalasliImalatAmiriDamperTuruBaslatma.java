package tester_productprocess_ts.stepDefinitions.uiStepDefinitions;

import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import tester_productprocess_ts.pages.Anamenu;
import tester_productprocess_ts.pages.TalasliImalatAmiriGorevleri;
import tester_productprocess_ts.utilities.uiUtilities.Driver;

import static tester_productprocess_ts.utilities.uiUtilities.ReusableMethods.*;
import static tester_productprocess_ts.utilities.uiUtilities.ReusableMethods.clickWithJS;

public class TalasliImalatAmiriDamperTuruBaslatma {
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

    @Then("Damper siparis turundeki siparisin basla butonuna tiklar")
    public void damper_siparis_turundeki_siparisin_basla_butonuna_tiklar() {
        Driver.getDriver().navigate().refresh();
        waitFor(3000);
        if (!talasligorev.damperBaslaButton.isEmpty() & !talasligorev.damperBaslaButton.getFirst().getText().equals("Durdur")) {
            clickWithJS(talasligorev.damperBaslaButton.getFirst());
            waitFor(3000);
            //Driver.getDriver().navigate().refresh();
            waitForVisibility(talasligorev.damperSatirButton, 10);
            clickWithJS(talasligorev.damperSatirButton);
            waitFor(3000);
            weiter = true;
        }else if(talasligorev.damperBaslaButton.getFirst().getText().equals("Durdur")){
            waitForVisibility(talasligorev.damperSatirButton, 10);
            clickWithJS(talasligorev.damperSatirButton);
            weiter = true;
        }
    }
    @Then("Damper siparis turundeki siparisin bulundugu satira tiklar")
    public void damper_siparis_turundeki_siparisin_bulundugu_satira_tiklar() {
        if(weiter=false)
            waitForVisibility(talasligorev.damperSatirButton,10);
            clickWithJS(talasligorev.damperSatirButton);
    }
    @Then("uretilecek damper adet girilir")
    public void uretilecek_damper_adet_girilir() {
        waitForVisibility(talasligorev.uretilenAdetTextBox,10);
        talasligorev.uretilenAdetTextBox.sendKeys("1000");
        uretilecekAdet= 1000;
    }
    @Then("Damper Siparis turu girilen adedin sag tarafta mil koparma biten bolumune islendigi dogrulanir")
    public void damper_siparis_turu_girilen_adedin_sag_tarafta_mil_koparma_biten_bolumune_islendigi_dogrulanir() {
        waitFor(3000);
        Assert.assertEquals(uretilecekAdet,Integer.parseInt(talasligorev.siparisAdedi.getText()));
    }
    @Then("Damper Siparis turu sag taraftaki mil koparma kalan bolumundeki rakam dogrulanir")
    public void damper_siparis_turu_sag_taraftaki_mil_koparma_kalan_bolumundeki_rakam_dogrulanir() {
        int siparisAdedi= Integer.parseInt(talasligorev.siparisAdedi.getText());
        waitFor(2000);
        int kalan= Integer.parseInt(talasligorev.milKoparmaKalanText.getText());
        int biten = Integer.parseInt(talasligorev.milKoparmaBitenButton.getText());
        Assert.assertTrue(kalan>=siparisAdedi-biten);
    }
    @Then("Damper Siparis turu girilen adedin sag tarafta mil tornalama biten bolumune islendigi dogrulanir")
    public void damper_siparis_turu_girilen_adedin_sag_tarafta_mil_tornalama_biten_bolumune_islendigi_dogrulanir() {
        waitForVisibility(talasligorev.milTornalamaBitenButton,10);
        Assert.assertEquals(uretilecekAdet,Integer.parseInt(talasligorev.siparisAdedi.getText()));
    }
    @Then("Damper Siparis turu sag taraftaki mil tornalama kalan bolumundeki rakam dogrulanir")
    public void damper_siparis_turu_sag_taraftaki_mil_tornalama_kalan_bolumundeki_rakam_dogrulanir() {
        int siparisAdedi= Integer.parseInt(talasligorev.siparisAdedi.getText());
        waitFor(2000);
        int kalan= Integer.parseInt(talasligorev.milTornalamaKalanText.getText());
        int biten = Integer.parseInt(talasligorev.milTornalamaBitenButton.getText());
        Assert.assertTrue(kalan>=siparisAdedi-biten);
    }
    @Then("Damper Siparis turu girilen adedin sag tarafta mil taslama biten bolumune islendigi dogrulanir")
    public void damper_siparis_turu_girilen_adedin_sag_tarafta_mil_taslama_biten_bolumune_islendigi_dogrulanir() {
        waitForVisibility(talasligorev.milTaslalamaBitenButton,10);
        Assert.assertEquals(uretilecekAdet,Integer.parseInt(talasligorev.siparisAdedi.getText()));
    }
    @Then("Damper Siparis turu sag taraftaki mil taslama kalan bolumundeki rakam dogrulanir")
    public void damper_siparis_turu_sag_taraftaki_mil_taslama_kalan_bolumundeki_rakam_dogrulanir() {
        int siparisAdedi= Integer.parseInt(talasligorev.siparisAdedi.getText());
        waitFor(2000);
        int kalan= Integer.parseInt(talasligorev.milTaslamaKalanText.getText());
        int biten = Integer.parseInt(talasligorev.milTaslalamaBitenButton.getText());
        Assert.assertTrue(kalan>=siparisAdedi-biten);
    }
    @Then("Damper Siparis turu girilen adedin sag tarafta Isil Islem biten bolumune islendigi dogrulanir")
    public void damper_siparis_turu_girilen_adedin_sag_tarafta_isil_islem_biten_bolumune_islendigi_dogrulanir() {
        waitForVisibility(talasligorev.isilIslemBitenButton,10);
        Assert.assertEquals(uretilecekAdet,Integer.parseInt(talasligorev.siparisAdedi.getText()));
    }
    @Then("Damper Siparis turu sag taraftaki Isil Islem kalan bolumundeki rakam dogrulanir")
    public void damper_siparis_turu_sag_taraftaki_isil_islem_kalan_bolumundeki_rakam_dogrulanir() {
        int siparisAdedi= Integer.parseInt(talasligorev.siparisAdedi.getText());
        waitFor(2000);
        int kalan= Integer.parseInt(talasligorev.isilIslemKalanText.getText());
        int biten = Integer.parseInt(talasligorev.isilIslemBitenButton.getText());
        Assert.assertTrue(kalan>=siparisAdedi-biten);
    }
    @Then("Polisaj Amirindeki Damper siparis turundeki siparisin bulundugu satira tiklar")
    public void polisaj_amirindeki_damper_siparis_turundeki_siparisin_bulundugu_satira_tiklar() {
        clickWithJS(talasligorev.damperSatirButton);
    }
    @Then("Kalite kontrol Amirindeki Damper siparis turundeki siparisin bulundugu satira tiklar")
    public void kalite_kontrol_amirindeki_damper_siparis_turundeki_siparisin_bulundugu_satira_tiklar() {
        clickWithJS(talasligorev.damperSatirButton);
    }
    @Then("Damper Siparis turu girilen adedin sag tarafta biten bolumune islendigi dogrulanir")
    public void damper_siparis_turu_girilen_adedin_sag_tarafta_biten_bolumune_islendigi_dogrulanir() {
        waitForVisibility(talasligorev.kaliteKontrolBitenButton,10);
        Assert.assertEquals(uretilecekAdet,Integer.parseInt(talasligorev.siparisAdedi.getText()));
    }
    @Then("Damper Siparis turu sag taraftaki kalan bolumundeki rakam dogrulanir")
    public void damper_siparis_turu_sag_taraftaki_kalan_bolumundeki_rakam_dogrulanir() {
        int siparisAdedi= Integer.parseInt(talasligorev.siparisAdedi.getText());
        waitFor(2000);
        int actualMilTaslamaKalanText= Integer.parseInt(talasligorev.kaliteKontrolKalanText.getText());
        Assert.assertTrue(siparisAdedi<=actualMilTaslamaKalanText);
    }

    @Then("Boru Kese Havsa Butonunun sari renk oldugu dogrulanir")
    public void boruKeseHavsaButonununSariRenkOlduguDogrulanir() {
        waitForVisibility(talasligorev.boruKesmeHavsaButton,10);
        String buttonRenk=talasligorev.boruKesmeHavsaButton.getCssValue("background-color");
        Assert.assertEquals(sari,buttonRenk);
    }

    @Then("Boru Kese Havsa Butonunun yesil renk oldugu dogrulanir")
    public void boruKeseHavsaButonununYesilRenkOlduguDogrulanir() {
        waitFor(4000);
        String buttonRenk=talasligorev.boruKesmeHavsaButton.getCssValue("background-color");
        Assert.assertEquals(yesil,buttonRenk);
    }
}
