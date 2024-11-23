package tester_productprocess_ts.stepDefinitions.uiStepDefinitions.us03;

import io.cucumber.java.en.And;
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
        waitFor(1500);
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
        waitFor(2500);
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
        waitForVisibility(talasligorev.kaliteKontrolOnaylandiBitenButton,10);
        Assert.assertEquals(uretilecekAdet,Integer.parseInt(talasligorev.siparisAdedi.getText()));
    }

    @Then("Bloklift Siparis turu sag taraftaki kalan bolumundeki rakam dogrulanir")
    public void bloklift_siparis_turu_sag_taraftaki_kalan_bolumundeki_rakam_dogrulanir() {
        int siparisAdedi= Integer.parseInt(talasligorev.siparisAdedi.getText());
        waitFor(1500);
        int kalan= Integer.parseInt(talasligorev.kaliteKontrolKalanText.getText());
        int biten = Integer.parseInt(talasligorev.kaliteKontrolOnaylandiBitenButton.getText());
        Assert.assertTrue(kalan>=siparisAdedi-biten);
    }

    @Then("Bloklift Mil Taslama Butonunu sari renk oldugu dogrulanir")
    public void blokliftMilTaslamaButonunuSariRenkOlduguDogrulanir() {
        waitFor(1000);
        String buttonRenk=talasligorev.milTaslamaButton1.getCssValue("background-color");
        Assert.assertEquals(sari,buttonRenk);
    }

    @And("Bloklift Mil taslama butonuna tiklanir")
    public void blokliftMilTaslamaButonunaTiklanir() {
        waitFor(1000);
        clickWithJS(talasligorev.milTaslamaButton1);
    }

    @Then("Bloklift Isil Islem Butonunu sari renk oldugu dogrulanir")
    public void blokliftIsilIslemButonunuSariRenkOlduguDogrulanir() {
        waitForVisibility(talasligorev.isilIslemButton1,10);
        String buttonRenk=talasligorev.isilIslemButton1.getCssValue("background-color");
        Assert.assertEquals(sari,buttonRenk);
    }

    @And("Bloklift Isil Islem butonuna tiklanir")
    public void blokliftIsilIslemButonunaTiklanir() {
        clickWithJS(talasligorev.isilIslemButton1);
    }

    @Then("Bloklift Isil Islem Butonunu gri renk oldugu dogrulanir")
    public void blokliftIsilIslemButonunuGriRenkOlduguDogrulanir() {
        waitFor(1000);
        String buttonRenk=talasligorev.isilIslemButton1.getCssValue("background-color");
        Assert.assertEquals(gri,buttonRenk);
    }

    @Then("Bloklift Mil Taslama Butonunu yesil renk oldugu dogrulanir")
    public void blokliftMilTaslamaButonunuYesilRenkOlduguDogrulanir() {
        waitForVisibility(talasligorev.milTaslamaButton1,10);
        String buttonRenk=talasligorev.milTaslamaButton1.getCssValue("background-color");
        Assert.assertEquals(yesil,buttonRenk);
    }

    @Then("Bloklift Isil Islem Butonunu yesil renk oldugu dogrulanir")
    public void blokliftIsilIslemButonunuYesilRenkOlduguDogrulanir() {
        waitForVisibility(talasligorev.isilIslemButton1,10);
        String buttonRenk=talasligorev.isilIslemButton1.getCssValue("background-color");
        Assert.assertEquals(yesil,buttonRenk);
    }

    @Then("Bloklift turu girilen adedin sag tarafta boru kapama biten bolumune islendigi dogrulanir")
    public void blokliftTuruGirilenAdedinSagTaraftaBoruKapamaBitenBolumuneIslendigiDogrulanir() {
        waitFor(1000);
        waitForVisibility(talasligorev.boruKapamaBitenButton1,10);
        org.testng.Assert.assertEquals(Integer.parseInt(talasligorev.boruKapamaBitenButton1.getText()),Integer.parseInt(talasligorev.siparisAdedi.getText()));
    }

    @Then("Blok lift turu sag taraftaki boru kapama kalan bolumundeki rakam dogrulanir")
    public void blokLiftTuruSagTaraftakiBoruKapamaKalanBolumundekiRakamDogrulanir() {
        int siparisAdedi= Integer.parseInt(talasligorev.siparisAdedi.getText());
        waitFor(1000);
        int actualBoruKapamaKalanText= Integer.parseInt(talasligorev.boruKapamaKalanText1.getText());
        org.testng.Assert.assertTrue(siparisAdedi>actualBoruKapamaKalanText);
    }

    @Then("Blok lift turu girilen adedin sag tarafta gaz dolum biten bolumune islendigi dogrulanir")
    public void blokLiftTuruGirilenAdedinSagTaraftaGazDolumBitenBolumuneIslendigiDogrulanir() {
        waitFor(1000);
        waitForVisibility(talasligorev.gazDolumBitenButton1,10);
        org.testng.Assert.assertEquals(Integer.parseInt(talasligorev.gazDolumBitenButton1.getText()),Integer.parseInt(talasligorev.siparisAdedi.getText()));
    }

    @Then("Blok lift turu sag taraftaki gaz dolum kalan bolumundeki rakam dogrulanir")
    public void blokLiftTuruSagTaraftakiGazDolumKalanBolumundekiRakamDogrulanir() {
        int siparisAdedi= Integer.parseInt(talasligorev.siparisAdedi.getText());
        waitFor(1000);
        int actualGazDolumKalanText= Integer.parseInt(talasligorev.gazDolumKalanText1.getText());
        org.testng.Assert.assertTrue(siparisAdedi>actualGazDolumKalanText);
    }
}
