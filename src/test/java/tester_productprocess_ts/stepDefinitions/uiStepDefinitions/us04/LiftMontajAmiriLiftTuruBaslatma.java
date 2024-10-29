package tester_productprocess_ts.stepDefinitions.uiStepDefinitions.us04;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import tester_productprocess_ts.pages.Anamenu;
import tester_productprocess_ts.pages.TalasliImalatAmiriGorevleri;

import static tester_productprocess_ts.utilities.uiUtilities.ReusableMethods.*;

public class LiftMontajAmiriLiftTuruBaslatma {

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

    @Then("Lift Montaj Amiri ekrandaki datalari dogrular")
    public void lift_montaj_amiri_ekrandaki_datalari_dogrular() {
        Assert.assertTrue(talasligorev.liftSatirButton.isDisplayed());
        //Assert.assertTrue(talasligorev.paslanmazSatirButton.isDisplayed());
    }

    @Then("Boru Kapama Butonunun sari renk oldugu dogrulanir")
    public void boru_kapama_butonunun_sari_renk_oldugu_dogrulanir() {
        waitFor(1500);
        String buttonRenk=talasligorev.boruKapamaButon.getCssValue("background-color");
        Assert.assertEquals(sari,buttonRenk);
    }

    @Then("Boru Kaynak Butonunun gri renk oldugu dogrulanir")
    public void boru_kaynak_butonunun_gri_renk_oldugu_dogrulanir() {
       waitFor(1500);
        String buttonRenk=talasligorev.boruKaynakButon.getCssValue("background-color");
        Assert.assertEquals(gri,buttonRenk);
    }

    @Then("Lift Montaj Butonunu gri renk oldugu dogrulanir")
    public void lift_montaj_butonunu_gri_renk_oldugu_dogrulanir() {
        waitForVisibility(talasligorev.liftMontajButon,10);
        String buttonRenk=talasligorev.liftMontajButon.getCssValue("background-color");
       Assert.assertEquals(gri,buttonRenk);
    }

    @Then("Gaz Dolum Butonunu gri renk oldugu dogrulanir")
    public void gaz_dolum_butonunu_gri_renk_oldugu_dogrulanir() {
        waitForVisibility(talasligorev.gazDolumButon,10);
        String buttonRenk=talasligorev.gazDolumButon.getCssValue("background-color");
        Assert.assertEquals(gri,buttonRenk);
    }

    @Then("Baslik Takma Butonunu gri renk oldugu dogrulanir")
    public void baslik_takma_butonunu_gri_renk_oldugu_dogrulanir() {
        waitForVisibility(talasligorev.baslikTakmaButon,10);
        String buttonRenk=talasligorev.baslikTakmaButon.getCssValue("background-color");
        Assert.assertEquals(gri,buttonRenk);
    }

    @Then("Boru Kapama butonuna tiklanir")
    public void boru_kapama_butonuna_tiklanir() {
        waitFor(1500);
       clickWithJS(talasligorev.boruKapamaButon);
    }

    @Then("girilen adedin sag tarafta boru kapama biten bolumune islendigi dogrulanir")
    public void girilen_adedin_sag_tarafta_boru_kapama_biten_bolumune_islendigi_dogrulanir() {
        waitFor(2000);
        waitForVisibility(talasligorev.boruKapamaBitenButton,10);
        Assert.assertEquals(Integer.parseInt(talasligorev.boruKapamaBitenButton.getText()),Integer.parseInt(talasligorev.siparisAdedi.getText()));
    }

    @Then("sag taraftaki boru kapama kalan bolumundeki rakam dogrulanir")
    public void sag_taraftaki_boru_kapama_kalan_bolumundeki_rakam_dogrulanir() {
        int siparisAdedi= Integer.parseInt(talasligorev.siparisAdedi.getText());
        waitFor(2000);
        int actualBoruKapamaKalanText= Integer.parseInt(talasligorev.boruKapamaKalanText.getText());
        Assert.assertTrue(siparisAdedi>actualBoruKapamaKalanText);
    }

    @Then("Boru Kapama Butonunun yesil renk oldugu dogrulanir")
    public void boru_kapama_butonunun_yesil_renk_oldugu_dogrulanir() {
        waitForVisibility(talasligorev.boruKapamaButon,10);
        String buttonRenk=talasligorev.boruKapamaButon.getCssValue("background-color");
        Assert.assertEquals(yesil,buttonRenk);
    }

    @Then("Boru Kaynak Butonunun sari renk oldugu dogrulanir")
    public void boru_kaynak_butonunun_sari_renk_oldugu_dogrulanir() {
        waitFor(2000);
        String buttonRenk=talasligorev.boruKaynakButon.getCssValue("background-color");
        Assert.assertEquals(sari,buttonRenk);
    }

    @Then("Boru Kaynak butonuna tiklanir")
    public void boru_kaynak_butonuna_tiklanir() {
        waitFor(1500);
      clickWithJS(talasligorev.boruKaynakButon);
    }

    @Then("girilen adedin sag tarafta boru kaynak biten bolumune islendigi dogrulanir")
    public void girilen_adedin_sag_tarafta_boru_kaynak_biten_bolumune_islendigi_dogrulanir() {
        waitFor(2000);
        waitForVisibility(talasligorev.boruKaynakBitenButton,10);
        Assert.assertEquals(Integer.parseInt(talasligorev.boruKaynakBitenButton.getText()),Integer.parseInt(talasligorev.siparisAdedi.getText()));
    }

    @Then("sag taraftaki boru kaynak kalan bolumundeki rakam dogrulanir")
    public void sag_taraftaki_boru_kaynak_kalan_bolumundeki_rakam_dogrulanir() {
        int siparisAdedi= Integer.parseInt(talasligorev.siparisAdedi.getText());
        waitFor(2000);
        int actualBoruKaynakKalanText= Integer.parseInt(talasligorev.boruKaynakKalanText.getText());
       Assert.assertTrue(siparisAdedi>actualBoruKaynakKalanText);
    }

    @Then("Boru Kaynak Butonunun yesil renk oldugu dogrulanir")
    public void boru_kaynak_butonunun_yesil_renk_oldugu_dogrulanir() {
      waitFor(1500);
        String buttonRenk=talasligorev.boruKaynakButon.getCssValue("background-color");
       Assert.assertEquals(yesil,buttonRenk);
    }

    @Then("Lift Montaj Butonunu sari renk oldugu dogrulanir")
    public void lift_montaj_butonunu_sari_renk_oldugu_dogrulanir() {
       waitFor(1500);
        String buttonRenk=talasligorev.liftMontajButon.getCssValue("background-color");
        Assert.assertEquals(sari,buttonRenk);
    }

    @Then("Lift Montaj butonuna tiklanir")
    public void lift_montaj_butonuna_tiklanir() {
        waitFor(1500);
        clickWithJS(talasligorev.liftMontajButon);
    }

    @Then("girilen adedin sag tarafta lift montaj biten bolumune islendigi dogrulanir")
    public void girilen_adedin_sag_tarafta_lift_montaj_biten_bolumune_islendigi_dogrulanir() {
        waitFor(2000);
        waitForVisibility(talasligorev.liftMontajBitenButton,10);
        Assert.assertEquals(Integer.parseInt(talasligorev.liftMontajBitenButton.getText()),Integer.parseInt(talasligorev.siparisAdedi.getText()));
    }

    @Then("sag taraftaki lift montaj kalan bolumundeki rakam dogrulanir")
    public void sag_taraftaki_lift_montaj_kalan_bolumundeki_rakam_dogrulanir() {
        int siparisAdedi= Integer.parseInt(talasligorev.siparisAdedi.getText());
        waitFor(2000);
        int actualLiftMontajKalanText= Integer.parseInt(talasligorev.liftMontajKalanText.getText());
        Assert.assertTrue(siparisAdedi>actualLiftMontajKalanText);
    }

    @Then("Lift Montaj Butonunu yesil renk oldugu dogrulanir")
    public void lift_montaj_butonunu_yesil_renk_oldugu_dogrulanir() {
        waitFor(1500);
        String buttonRenk=talasligorev.liftMontajButon.getCssValue("background-color");
        Assert.assertEquals(yesil,buttonRenk);
    }

    @Then("Montaj sonrasi satir butonuna tiklar")
    public void montaj_sonrasi_satir_butonuna_tiklar() {
         waitFor(1500);
         clickWithJS(talasligorev.montajSonrasiSatirButton);
    }

    @Then("Montaj sonrasi Kalite kontrol Onayla butona tiklanir")
    public void montaj_sonrasi_kalite_kontrol_onayla_butona_tiklanir() {
        waitFor(1500);
        clickWithJS(talasligorev.kaliteKontrolOnaylaButton);
    }

    @Then("Gaz Dolum butonuna tiklanir")
    public void gaz_dolum_butonuna_tiklanir() {
        waitFor(1500);
        clickWithJS(talasligorev.gazDolumButon);
    }

    @Then("girilen adedin sag tarafta gaz dolum biten bolumune islendigi dogrulanir")
    public void girilen_adedin_sag_tarafta_gaz_dolum_biten_bolumune_islendigi_dogrulanir() {
        waitFor(2000);
        waitForVisibility(talasligorev.gazDolumBitenButton,10);
        Assert.assertEquals(Integer.parseInt(talasligorev.gazDolumBitenButton.getText()),Integer.parseInt(talasligorev.siparisAdedi.getText()));
    }

    @Then("sag taraftaki gaz dolum kalan bolumundeki rakam dogrulanir")
    public void sag_taraftaki_gaz_dolum_kalan_bolumundeki_rakam_dogrulanir() {
        int siparisAdedi= Integer.parseInt(talasligorev.siparisAdedi.getText());
        waitFor(2000);
        int actualGazDolumKalanText= Integer.parseInt(talasligorev.gazDolumKalanText.getText());
        Assert.assertTrue(siparisAdedi>actualGazDolumKalanText);
    }

    @Then("Gaz Dolum Butonunu yesil renk oldugu dogrulanir")
    public void gaz_dolum_butonunu_yesil_renk_oldugu_dogrulanir() {
        waitForVisibility(talasligorev.gazDolumButon,10);
        String buttonRenk=talasligorev.gazDolumButon.getCssValue("background-color");
        Assert.assertEquals(yesil,buttonRenk);
    }

    @Then("Baslik Takma Butonunu sari renk oldugu dogrulanir")
    public void baslik_takma_butonunu_sari_renk_oldugu_dogrulanir() {
        waitForVisibility(talasligorev.baslikTakmaButon,10);
        String buttonRenk=talasligorev.baslikTakmaButon.getCssValue("background-color");
        Assert.assertEquals(sari,buttonRenk);
    }

    @Then("Baslik Takma butonuna tiklanir")
    public void baslik_takma_butonuna_tiklanir() {
        waitFor(1500);
        clickWithJS(talasligorev.baslikTakmaButon);
    }

    @Then("girilen adedin sag tarafta baslik takma biten bolumune islendigi dogrulanir")
    public void girilen_adedin_sag_tarafta_baslik_takma_biten_bolumune_islendigi_dogrulanir() {
        waitFor(2000);
        waitForVisibility(talasligorev.baslikTakmaBitenButton,10);
        Assert.assertEquals(Integer.parseInt(talasligorev.baslikTakmaBitenButton.getText()),Integer.parseInt(talasligorev.siparisAdedi.getText()));
    }

    @Then("sag taraftaki baslik takma kalan bolumundeki rakam dogrulanir")
    public void sag_taraftaki_baslik_takma_kalan_bolumundeki_rakam_dogrulanir() {
        int siparisAdedi= Integer.parseInt(talasligorev.siparisAdedi.getText());
        waitFor(2000);
        int actualBaslikTakmaKalanText= Integer.parseInt(talasligorev.baslikTakmaKalanText.getText());
        Assert.assertTrue(siparisAdedi>actualBaslikTakmaKalanText);
    }

    @Then("Baslik Takma Butonunu yesil renk oldugu dogrulanir")
    public void baslik_takma_butonunu_yesil_renk_oldugu_dogrulanir() {
        waitForVisibility(talasligorev.baslikTakmaButon,10);
        String buttonRenk=talasligorev.baslikTakmaButon.getCssValue("background-color");
        Assert.assertEquals(yesil,buttonRenk);
    }

    @Then("uretilen toplam mil miktarini dogrular")
    public void uretilenToplamMilMiktariniDogrular() {
        waitFor(1500);
        int siparisAdedi = Integer.parseInt(talasligorev.siparisAdedi.getText());
        int hazirMilAdedi=Integer.parseInt(talasligorev.hazirMilAdedi.getText());
        int expectedUretilenToplamMil=siparisAdedi+hazirMilAdedi;
        int actualUretilenToplamMil=Integer.parseInt(talasligorev.uretilenToplamMil.getText());
        Assert.assertEquals(expectedUretilenToplamMil,actualUretilenToplamMil);
    }

    @Then("uretilen toplam boru miktari dogrulanir")
    public void uretilenToplamBoruMiktariDogrulanir() {
        int siparisAdedi = Integer.parseInt(talasligorev.siparisAdedi.getText());
        int actualUretilenToplamBoru=Integer.parseInt(talasligorev.uretilenToplamBoru.getText());
        Assert.assertEquals(siparisAdedi,actualUretilenToplamBoru);
    }

}
