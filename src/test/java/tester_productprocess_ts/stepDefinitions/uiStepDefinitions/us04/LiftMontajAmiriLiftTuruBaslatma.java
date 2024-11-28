package tester_productprocess_ts.stepDefinitions.uiStepDefinitions.us04;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import lombok.Getter;
import org.testng.Assert;
import tester_productprocess_ts.pages.Anamenu;
import tester_productprocess_ts.pages.TalasliImalatAmiriGorevleri;
import tester_productprocess_ts.stepDefinitions.uiStepDefinitions.us02.SiparisOlusturmaStepDefs;

import static tester_productprocess_ts.utilities.uiUtilities.ReusableMethods.*;

public class LiftMontajAmiriLiftTuruBaslatma {

    String token="";
    TalasliImalatAmiriGorevleri talasligorev = new TalasliImalatAmiriGorevleri();
    Anamenu anamenu = new Anamenu();

    SiparisOlusturmaStepDefs hazirmil = new SiparisOlusturmaStepDefs();
    String sari ="rgba(255, 255, 0, 1)";
    String gri ="rgba(180, 177, 177, 1)";
    String yesil="rgba(0, 128, 0, 1)";
    @Getter
    private int onaylandiAdet;
    @Getter
    private int hurdaAdet;
    @Getter
    private int milTaslamaAdet;
    @Getter
    private int isilIslemAdet;

    int kalan;

    @Then("Lift Montaj Amiri ekrandaki datalari dogrular")
    public void lift_montaj_amiri_ekrandaki_datalari_dogrular() {
        Assert.assertTrue(talasligorev.liftSatirButton.isDisplayed());
    }

    @Then("Boru Kapama Butonunun sari renk oldugu dogrulanir")
    public void boru_kapama_butonunun_sari_renk_oldugu_dogrulanir() {
        waitFor(1000);
        String buttonRenk=talasligorev.boruKapamaButon.getCssValue("background-color");
        Assert.assertEquals(sari,buttonRenk);
    }

    @Then("Boru Kaynak Butonunun gri renk oldugu dogrulanir")
    public void boru_kaynak_butonunun_gri_renk_oldugu_dogrulanir() {
       waitFor(1000);
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
        waitFor(500);
       clickWithJS(talasligorev.boruKapamaButon);
    }

    @Then("girilen adedin sag tarafta boru kapama biten bolumune islendigi dogrulanir")
    public void girilen_adedin_sag_tarafta_boru_kapama_biten_bolumune_islendigi_dogrulanir() {
        waitFor(1000);
        waitForVisibility(talasligorev.boruKapamaBitenButton1,10);
        Assert.assertEquals(Integer.parseInt(talasligorev.boruKapamaBitenButton1.getText()),Integer.parseInt(talasligorev.siparisAdedi.getText()));
    }

    @Then("sag taraftaki boru kapama kalan bolumundeki rakam dogrulanir")
    public void sag_taraftaki_boru_kapama_kalan_bolumundeki_rakam_dogrulanir() {
        int siparisAdedi= Integer.parseInt(talasligorev.siparisAdedi.getText());
        waitFor(1000);
        int actualBoruKapamaKalanText= Integer.parseInt(talasligorev.boruKapamaKalanText1.getText());
        Assert.assertTrue(siparisAdedi>actualBoruKapamaKalanText);
    }

    @Then("Boru Kapama Butonunun yesil renk oldugu dogrulanir")
    public void boru_kapama_butonunun_yesil_renk_oldugu_dogrulanir() {
        waitFor(1750);
        String buttonRenk=talasligorev.boruKapamaButon.getCssValue("background-color");
        Assert.assertEquals(yesil,buttonRenk);
    }

    @Then("Boru Kaynak Butonunun sari renk oldugu dogrulanir")
    public void boru_kaynak_butonunun_sari_renk_oldugu_dogrulanir() {
        waitFor(500);
        String buttonRenk=talasligorev.boruKaynakButon.getCssValue("background-color");
        Assert.assertEquals(sari,buttonRenk);
    }

    @Then("Boru Kaynak butonuna tiklanir")
    public void boru_kaynak_butonuna_tiklanir() {
        waitFor(500);
        clickWithJS(talasligorev.boruKaynakButon);
    }

    @Then("girilen adedin sag tarafta boru kaynak biten bolumune islendigi dogrulanir")
    public void girilen_adedin_sag_tarafta_boru_kaynak_biten_bolumune_islendigi_dogrulanir() {
        waitFor(1000);
        waitForVisibility(talasligorev.boruKaynakBitenButton1,10);
        Assert.assertEquals(Integer.parseInt(talasligorev.boruKaynakBitenButton1.getText()),Integer.parseInt(talasligorev.siparisAdedi.getText()));
    }

    @Then("sag taraftaki boru kaynak kalan bolumundeki rakam dogrulanir")
    public void sag_taraftaki_boru_kaynak_kalan_bolumundeki_rakam_dogrulanir() {
        int siparisAdedi= Integer.parseInt(talasligorev.siparisAdedi.getText());
        waitFor(1000);
        int actualBoruKaynakKalanText= Integer.parseInt(talasligorev.boruKaynakKalanText1.getText());
        Assert.assertTrue(siparisAdedi>actualBoruKaynakKalanText);
    }

    @Then("Boru Kaynak Butonunun yesil renk oldugu dogrulanir")
    public void boru_kaynak_butonunun_yesil_renk_oldugu_dogrulanir() {
        waitFor(1000);
        String buttonRenk=talasligorev.boruKaynakButon.getCssValue("background-color");
        Assert.assertEquals(yesil,buttonRenk);
    }

    @Then("Lift Montaj Butonunu sari renk oldugu dogrulanir")
    public void lift_montaj_butonunu_sari_renk_oldugu_dogrulanir() {
       waitFor(500);
        String buttonRenk=talasligorev.liftMontajButon.getCssValue("background-color");
        Assert.assertEquals(sari,buttonRenk);
    }

    @Then("Lift Montaj butonuna tiklanir")
    public void lift_montaj_butonuna_tiklanir() {
        waitFor(500);
        clickWithJS(talasligorev.liftMontajButon);
    }

    @Then("girilen adedin sag tarafta lift montaj biten bolumune islendigi dogrulanir")
    public void girilen_adedin_sag_tarafta_lift_montaj_biten_bolumune_islendigi_dogrulanir() {
        waitFor(1000);
        waitForVisibility(talasligorev.liftMontajBitenButton1,10);
        Assert.assertEquals(Integer.parseInt(talasligorev.liftMontajBitenButton1.getText()),Integer.parseInt(talasligorev.siparisAdedi.getText()));
    }

    @Then("sag taraftaki lift montaj kalan bolumundeki rakam dogrulanir")
    public void sag_taraftaki_lift_montaj_kalan_bolumundeki_rakam_dogrulanir() {
        int siparisAdedi= Integer.parseInt(talasligorev.siparisAdedi.getText());
        waitFor(1000);
        int actualLiftMontajKalanText= Integer.parseInt(talasligorev.liftMontajKalanText1.getText());
        Assert.assertTrue(siparisAdedi>actualLiftMontajKalanText);
    }

    @Then("Lift Montaj Butonunu yesil renk oldugu dogrulanir")
    public void lift_montaj_butonunu_yesil_renk_oldugu_dogrulanir() {
        waitFor(1000);
        String buttonRenk=talasligorev.liftMontajButon.getCssValue("background-color");
        Assert.assertEquals(yesil,buttonRenk);
    }

    @Then("Montaj sonrasi satir butonuna tiklar")
    public void montaj_sonrasi_satir_butonuna_tiklar() {
         waitFor(1000);
         clickWithJS(talasligorev.montajSonrasiSatirButton);
    }

    @Then("Montaj sonrasi Kalite kontrol Onayla butona tiklanir")
    public void montaj_sonrasi_kalite_kontrol_onayla_butona_tiklanir() {
        waitFor(1000);
        clickWithJS(talasligorev.kaliteKontrolOnaylaButton);
    }

    @Then("Gaz Dolum butonuna tiklanir")
    public void gaz_dolum_butonuna_tiklanir() {
        waitFor(500);
        clickWithJS(talasligorev.gazDolumButon);
    }

    @Then("girilen adedin sag tarafta gaz dolum biten bolumune islendigi dogrulanir")
    public void girilen_adedin_sag_tarafta_gaz_dolum_biten_bolumune_islendigi_dogrulanir() {
        waitFor(1000);
        waitForVisibility(talasligorev.gazDolumBitenButton1,10);
        Assert.assertEquals(Integer.parseInt(talasligorev.gazDolumBitenButton1.getText()),Integer.parseInt(talasligorev.siparisAdedi.getText()));
    }

    @Then("sag taraftaki gaz dolum kalan bolumundeki rakam dogrulanir")
    public void sag_taraftaki_gaz_dolum_kalan_bolumundeki_rakam_dogrulanir() {
        int siparisAdedi= Integer.parseInt(talasligorev.siparisAdedi.getText());
        waitFor(1000);
        int actualGazDolumKalanText= Integer.parseInt(talasligorev.gazDolumKalanText1.getText());
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
        waitFor(500);
        clickWithJS(talasligorev.baslikTakmaButon);
    }

    @Then("girilen adedin sag tarafta baslik takma biten bolumune islendigi dogrulanir")
    public void girilen_adedin_sag_tarafta_baslik_takma_biten_bolumune_islendigi_dogrulanir() {
        waitFor(1000);
        waitForVisibility(talasligorev.baslikTakmaBitenButton1,10);
        Assert.assertEquals(Integer.parseInt(talasligorev.baslikTakmaBitenButton1.getText()),Integer.parseInt(talasligorev.siparisAdedi.getText()));
    }

    @Then("sag taraftaki baslik takma kalan bolumundeki rakam dogrulanir")
    public void sag_taraftaki_baslik_takma_kalan_bolumundeki_rakam_dogrulanir() {
        int siparisAdedi= Integer.parseInt(talasligorev.siparisAdedi.getText());
        waitFor(1000);
        int actualBaslikTakmaKalanText= Integer.parseInt(talasligorev.baslikTakmaKalanText1.getText());
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
        waitFor(1000);
        int siparisAdedi = Integer.parseInt(talasligorev.siparisAdedi.getText());
        int hazirMilAdedi=hazirmil.getHazirMil();
        System.out.println(hazirMilAdedi);
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

    @And("LIFT siparis turu icin onaylanacak adet girilir")
    public void liftSiparisTuruIcinOnaylanacakAdetGirilir() {
        waitForVisibility(talasligorev.uretilenAdetTextBox,10);
        talasligorev.uretilenAdetTextBox.sendKeys("1200");
        onaylandiAdet= 1200;
    }

    @Then("girilen adedin sag tarafta onaylandi biten bolumune islendigi dogrulanir")
    public void girilenAdedinSagTaraftaOnaylandiBitenBolumuneIslendigiDogrulanir() {
        waitFor(1000);
        Assert.assertEquals(Integer.parseInt(talasligorev.kaliteKontrolOnaylandiBitenButton.getText()),onaylandiAdet);
    }

    @And("Polisaj sonrasi Kalite kontrol Hurda butonuna tiklanir")
    public void polisajSonrasiKaliteKontrolHurdaButonunaTiklanir() {
        waitFor(500);
        clickWithJS(talasligorev.kaliteKontrolHurdaButton);
    }

    @And("LIFT siparis turu icin Hurda adedi girilir")
    public void liftSiparisTuruIcinHurdaAdediGirilir() {
        waitForVisibility(talasligorev.uretilenAdetTextBox,10);
        talasligorev.uretilenAdetTextBox.sendKeys("100");
        hurdaAdet= 100;
    }

    @Then("girilen adedin sag tarafta Hurda biten bolumune islendigi dogrulanir")
    public void girilenAdedinSagTaraftaHurdaBitenBolumuneIslendigiDogrulanir() {
        waitFor(1000);
        Assert.assertEquals(Integer.parseInt(talasligorev.kaliteKontrolHurdaBitenButton.getText()),hurdaAdet);
    }

    @And("Polisaj sonrasi Kalite kontrol Mil taslamaya geri gidecek butonuna tiklanir")
    public void polisajSonrasiKaliteKontrolMilTaslamayaGeriGidecekButonunaTiklanir() {
        waitFor(500);
        clickWithJS(talasligorev.kaliteKontrolMilTaslamaButton);
    }

    @And("LIFT siparis turu icin Mil Taslama adedi girilir")
    public void liftSiparisTuruIcinMilTaslamaAdediGirilir() {
        waitForVisibility(talasligorev.uretilenAdetTextBox,10);
        talasligorev.uretilenAdetTextBox.sendKeys("100");
        milTaslamaAdet= 100;
    }

    @Then("girilen adedin sag tarafta Mil Taslama biten bolumune islendigi dogrulanir")
    public void girilenAdedinSagTaraftaMilTaslamaBitenBolumuneIslendigiDogrulanir() {
        waitFor(1000);
        Assert.assertEquals(Integer.parseInt(talasligorev.kaliteKontrolMilTaslamaBitenButton.getText()),milTaslamaAdet);
    }

    @And("Polisaj sonrasi Kalite kontrol isil isleme geri gidecek butonuna tiklanir")
    public void polisajSonrasiKaliteKontrolIsilIslemeGeriGidecekButonunaTiklanir() {
        waitFor(500);
        clickWithJS(talasligorev.kaliteKontrolIsilIslemButton);
    }

    @And("LIFT siparis turu icin isil islem adedi girilir")
    public void liftSiparisTuruIcinIsilIslemAdediGirilir() {
        waitForVisibility(talasligorev.uretilenAdetTextBox,10);
        talasligorev.uretilenAdetTextBox.sendKeys("100");
        isilIslemAdet= 100;
    }

    @Then("girilen adedin sag tarafta isil islem biten bolumune islendigi dogrulanir")
    public void girilenAdedinSagTaraftaIsilIslemBitenBolumuneIslendigiDogrulanir() {
        waitFor(1000);
        Assert.assertEquals(Integer.parseInt(talasligorev.kaliteKontrolIsilIslemBitenButton.getText()),isilIslemAdet);
    }

    @Then("sag taraftaki kalite kontrolden gelen mil taslama kalan bolumundeki rakam dogrulanir")
    public void sagTaraftakiKaliteKontroldenGelenMilTaslamaKalanBolumundekiRakamDogrulanir() {
        waitFor(1000);
        int actualMilTaslamaKalanText= Integer.parseInt(talasligorev.milTaslamaKalanText.getText());
        Assert.assertEquals(milTaslamaAdet,actualMilTaslamaKalanText);
    }

    @Then("sag taraftaki kalite kontrolden gelen isil islem kalan bolumundeki rakam dogrulanir")
    public void sagTaraftakiKaliteKontroldenGelenIsilIslemKalanBolumundekiRakamDogrulanir() {
        waitFor(1000);
        int actualIsilIslemKalanText= Integer.parseInt(talasligorev.isilIslemKalanText.getText());
        Assert.assertEquals(isilIslemAdet,actualIsilIslemKalanText);
    }

    @Then("girilen adedin sag tarafta kalite kontrolden gelenlerle mil taslama biten bolumune islendigi dogrulanir")
    public void girilenAdedinSagTaraftaKaliteKontroldenGelenlerleMilTaslamaBitenBolumuneIslendigiDogrulanir() {
        waitFor(1000);
        waitForVisibility(talasligorev.milTaslalamaBitenButton,10);
        Assert.assertEquals(Integer.parseInt(talasligorev.milTaslalamaBitenButton.getText()),Integer.parseInt(talasligorev.siparisAdedi.getText()));
    }

    @Then("sag taraftaki kalite kontrolden gelenlerle mil taslama kalan bolumundeki rakam dogrulanir")
    public void sagTaraftakiKaliteKontroldenGelenlerleMilTaslamaKalanBolumundekiRakamDogrulanir() {
        waitFor(1000);
        int actualMilTaslamaKalanText= Integer.parseInt(talasligorev.milTaslamaKalanText.getText());
        Assert.assertEquals(0,actualMilTaslamaKalanText);
    }

    @Then("sag taraftaki mil taslamadan sonra isil islem kalan bolumundeki rakam dogrulanir")
    public void sagTaraftakiMilTaslamadanSonraIsilIslemKalanBolumundekiRakamDogrulanir() {
        int siparisAdedi= Integer.parseInt(talasligorev.siparisAdedi.getText());
        int isilIslemBitenButon= Integer.parseInt(talasligorev.isilIslemBitenButton.getText());
        kalan=siparisAdedi-isilIslemBitenButon;
        waitFor(1000);
        int actualIsilIslemKalanText= Integer.parseInt(talasligorev.isilIslemKalanText.getText());
        Assert.assertEquals(kalan,actualIsilIslemKalanText);
    }

    @And("LIFT siparis turu icin  mil taslamadan sonra isil islem adedi girilir")
    public void liftSiparisTuruIcinMilTaslamadanSonraIsilIslemAdediGirilir() {
        waitForVisibility(talasligorev.uretilenAdetTextBox,10);
        String kalan1 = String.valueOf(kalan);
        talasligorev.uretilenAdetTextBox.sendKeys(kalan1);
    }

    @Then("girilen adedin sag tarafta isil islemden sonra Isil Islem biten bolumune islendigi dogrulanir")
    public void girilenAdedinSagTaraftaIsilIslemdenSonraIsilIslemBitenBolumuneIslendigiDogrulanir() {
        waitForVisibility(talasligorev.isilIslemBitenButton,10);
        Assert.assertEquals(Integer.parseInt(talasligorev.isilIslemBitenButton.getText()),Integer.parseInt(talasligorev.siparisAdedi.getText()));
    }

    @Then("Polisaj biten dogrulanir")
    public void polisajBitenDogrulanir() {
        waitForVisibility(talasligorev.polisajBitenButton,10);
        int kalanText = Integer.parseInt(talasligorev.polisajKalanText.getText());
        int siparisAdedi=Integer.parseInt(talasligorev.siparisAdedi.getText());
        int kalan=siparisAdedi-kalanText;
        Assert.assertEquals(Integer.parseInt(talasligorev.polisajBitenButton.getText()),kalan);
    }

    @Then("Polisaj isil islem ve mil taslamadan gelen kalan bolumundeki rakam dogrulanir")
    public void polisajIsilIslemVeMilTaslamadanGelenKalanBolumundekiRakamDogrulanir() {
        waitFor(1000);
        int expectedKalan=milTaslamaAdet+isilIslemAdet;
        int actualKalan= Integer.parseInt(talasligorev.polisajKalanText.getText());
        Assert.assertEquals(expectedKalan,actualKalan);
    }

    @Then("kalan miktar girilir")
    public void kalanMiktarGirilir() {
        waitForVisibility(talasligorev.uretilenAdetTextBox,10);
        int kalan=milTaslamaAdet+isilIslemAdet;
        String kalan1 = String.valueOf(kalan);
        talasligorev.uretilenAdetTextBox.sendKeys(kalan1);
    }

    @Then("Polisaj son kalan bolumundeki rakam dogrulanir")
    public void polisajSonKalanBolumundekiRakamDogrulanir() {
        waitFor(1000);
        int actualKalan= Integer.parseInt(talasligorev.polisajKalanText.getText());
        Assert.assertEquals(0,actualKalan);
    }

    @And("LIFT siparis turu icin Kalite Kontrol Amiri kalan bolumundeki rakam girilir")
    public void liftSiparisTuruIcinKaliteKontrolAmiriKalanBolumundekiRakamGirilir() {
        waitForVisibility(talasligorev.uretilenAdetTextBox,10);
        int kalan=milTaslamaAdet+isilIslemAdet;
        String kalan1 = String.valueOf(kalan);
        talasligorev.uretilenAdetTextBox.sendKeys(kalan1);
    }

    @Then("girilen adedin sag tarafta hurda dusuldukten sonra biten bolumune islendigi dogrulanir")
    public void girilenAdedinSagTaraftaHurdaDusulduktenSonraBitenBolumuneIslendigiDogrulanir() {
        waitForVisibility(talasligorev.kaliteKontrolOnaylandiBitenButton,10);
        int siparisAdedi=Integer.parseInt(talasligorev.siparisAdedi.getText());
        int kalan=siparisAdedi-hurdaAdet;
        Assert.assertEquals(Integer.parseInt(talasligorev.kaliteKontrolOnaylandiBitenButton.getText()),kalan);
    }

    @Then("Hurda dusuldukten sonra uretilen toplam mil miktarini dogrular")
    public void hurdaDusulduktenSonraUretilenToplamMilMiktariniDogrular() {
        waitFor(1000);
        int siparisAdedi = Integer.parseInt(talasligorev.siparisAdedi.getText());
        int hazirMilAdedi=hazirmil.getHazirMil();
        int expectedUretilenToplamMil=siparisAdedi+hazirMilAdedi-hurdaAdet;
        int actualUretilenToplamMil=Integer.parseInt(talasligorev.uretilenToplamMil.getText());
        Assert.assertEquals(expectedUretilenToplamMil,actualUretilenToplamMil);
    }

    @And("musteri isleri goruntule tiklanir")
    public void musteriIsleriGoruntuleTiklanir() {
        clickWithJS(anamenu.musteriIsleriGoruntule);
    }

    @And("siparis bulundugu satira tiklanir")
    public void siparisBulunduguSatiraTiklanir() {
        clickWithJS(anamenu.musteriIsleriMusteriSatirButon);
    }

    @Then("Kalite kontrolden gonderilen Hurda sayisi dogrulanir")
    public void kaliteKontroldenGonderilenHurdaSayisiDogrulanir() {
        waitFor(1000);
        clickWithJS(anamenu.omer2);
        waitFor(1000);
        String actualHurdaSayisi= anamenu.hurdaSayisi.getText();
        System.out.println(actualHurdaSayisi);
        String hurdaAdet1= String.valueOf(hurdaAdet);
        Assert.assertTrue(actualHurdaSayisi.contains(hurdaAdet1));
    }
}
