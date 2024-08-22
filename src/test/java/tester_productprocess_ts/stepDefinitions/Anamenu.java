package tester_productprocess_ts.stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import tester_productprocess_ts.utilities.uiUtilities.ConfigReader;
import tester_productprocess_ts.utilities.uiUtilities.Driver;

public class Anamenu {

    String header = "ANA SAYFA";

    String yoneticiGirisHeader = "YÖNETİCİ GİRİŞ SAYFASI";
    tester_productprocess_ts.pages.Anamenu anamenu = new tester_productprocess_ts.pages.Anamenu();
    String title="Gasan Üretim Yönetim Sistemi";
    String girisUrl = "https://10daabbc-c0d4-4ba0-a253-f147f6b9d61e-00-35cytuuj5k6x.janeway.replit.dev/login";
    @When("Anasayfaya gidilir")
    public void anasayfaya_gidilir() {
       Driver.getDriver().get(ConfigReader.getProperty("url"));
    }
    @Then("Anasayfada oldugu dogrulanir")
    public void anasayfada_oldugu_dogrulanir() {
        String anasayfa =anamenu.AnasayfaHeader.getText();
        Assert.assertEquals(header,anasayfa);
    }
    @When("Ana giris ekraninda hicbir kullanici unvanina tiklamadan sifre giris ekranina erisememelidir")
    public void ana_giris_ekraninda_hicbir_kullanici_unvanina_tiklamadan_sifre_giris_ekranina_erisememelidir() throws InterruptedException {
        anamenu.AnasayfaHeader.click();
        Thread.sleep(1000);
        Assert.assertEquals("Gasan Üretim Yönetim Sistemi",Driver.getDriver().getTitle());

        anamenu.herhangibiryer.click();
        Thread.sleep(1000);
        Assert.assertEquals("Gasan Üretim Yönetim Sistemi",Driver.getDriver().getTitle());
    }

    @Then("Talasli Imalat Amiri Butonu gorunur oldugu dogrulanir")
    public void talasli_imalat_amiri_butonu_gorunur_oldugu_dogrulanir() {
        anamenu.menulinkleri.get(0).isDisplayed();
    }
    @Then("Talasli Imalat Amiri Butonuna tiklanir")
    public void talasli_imalat_amiri_butonuna_tiklanir() {
        anamenu.menulinkleri.get(0).click();
    }
    @Then("Sifre ekraninda oldugu dogrulanir")
    public void sifre_ekraninda_oldugu_dogrulanir() {
        String sifreTextActual ="Şifre";
        String sifreTextresult=anamenu.sifreText.getText();
        Assert.assertEquals(sifreTextresult,sifreTextActual);
    }


    @And("sifre kutucuguna gecerli bir data girilir")
    public void sifreKutucugunaGecerliBirDataGirilir() {
    }

    @And("Giris yap butonuna tiklanir")
    public void girisYapButonunaTiklanir() {
        anamenu.girisButonu.click();
    }

    @And("Talasli imalat amiri sifre kutucuguna gecerli bir {string} girilir")
    public void talasliImalatAmiriSifreKutucugunaGecerliBirGirilir(String arg0) {
    }

    @And("Sifre gizleme butonunun sifreyi gizledigi kontrol edllir")
    public void sifreGizlemeButonununSifreyiGizledigiKontrolEdllir() {
        anamenu.goz.click();
    }

    @And("Sifre gizleme butonunun sifreyi tekrar gorunur hale getirdigi kontrol edllir")
    public void sifreGizlemeButonununSifreyiTekrarGorunurHaleGetirdigiKontrolEdllir() {
        anamenu.goz.click();
    }

    @Then("Kullanicinin kendi sorumluluk sayfasina gectigi dogrulanir")
    public void kullanicininKendiSorumlulukSayfasinaGectigiDogrulanir() {
    }


    @And("sifre kutucu bos birakilir")
    public void sifreKutucuBosBirakilir() {
    }

    @Then("Kullanicinin kendi sorumluluk sayfasina gecemedigi dogrulanir")
    public void kullanicininKendiSorumlulukSayfasinaGecemedigiDogrulanir() {
    }

    @And("sifre kutucuguna gecersiz bir <data> girilir")
    public void sifreKutucugunaGecersizBirDataGirilir() {
    }

    @Then("Polisaj amiri butonunun gorunur oldugu dogrulanir")
    public void polisajAmiriButonununGorunurOlduguDogrulanir() {
        anamenu.menulinkleri.get(1).isDisplayed();
    }

    @And("Polisaj amiri butonuna tiklanir")
    public void polisajAmiriButonunaTiklanir() {
        anamenu.menulinkleri.get(1).click();
    }

    @And("Polisaj amiri sifre kutucuguna gecerli bir data girilir")
    public void polisajAmiriSifreKutucugunaGecerliBirDataGirilir() {
    }

    @And("sifre kutucugu bos birakilir")
    public void sifreKutucuguBosBirakilir() {
    }

    @Then("Lift montaj amiri butonunun gorunur oldugu dogrulanir")
    public void liftMontajAmiriButonununGorunurOlduguDogrulanir() {
        anamenu.menulinkleri.get(2).isDisplayed();
    }

    @And("Lift montaj amiri butonuna tiklanir")
    public void liftMontajAmiriButonunaTiklanir() {
        anamenu.menulinkleri.get(2).click();
    }

    @And("Lift montaj amiri sifre kutucuguna gecerli bir {string} girilir")
    public void liftMontajAmiriSifreKutucugunaGecerliBirGirilir(String arg0) {
    }

    @Then("Lift Montaj Amiributonunun gorunur oldugu dogrulanir")
    public void liftMontajAmiributonununGorunurOlduguDogrulanir() {
    }

    @Then("Bloklift Montaj Amiri butonunun gorunur oldugu dogrulanir")
    public void blokliftMontajAmiriButonununGorunurOlduguDogrulanir() {
        anamenu.menulinkleri.get(3).isDisplayed();
    }

    @And("Bloklift Montaj Amiri butonuna tiklanir")
    public void blokliftMontajAmiriButonunaTiklanir() {
        anamenu.menulinkleri.get(3).click();
    }

    @And("Bloklift Montaj Amiri sifre kutucuguna gecerli bir {string} girilir")
    public void blokliftMontajAmiriSifreKutucugunaGecerliBirGirilir(String arg0) {
    }

    @Then("Boyama ve Paketleme Amiri butonunun gorunur oldugu dogrulanir")
    public void boyamaVePaketlemeAmiriButonununGorunurOlduguDogrulanir() {
        anamenu.menulinkleri.get(4).isDisplayed();
    }

    @And("Boyama ve Paketleme Amiri butonuna tiklanir")
    public void boyamaVePaketlemeAmiriButonunaTiklanir() {
        anamenu.menulinkleri.get(4).click();
    }

    @And("Boyama ve Paketleme Amiri sifre kutucuguna gecerli bir {string} girilir")
    public void boyamaVePaketlemeAmiriSifreKutucugunaGecerliBirGirilir(String arg0) {
    }

    @Then("Kalite Kontrol butonunun gorunur oldugu dogrulanir")
    public void kaliteKontrolButonununGorunurOlduguDogrulanir() {
        anamenu.menulinkleri.get(5).isDisplayed();
    }

    @And("Kalite Kontrol butonuna tiklanir")
    public void kaliteKontrolButonunaTiklanir() {
        anamenu.menulinkleri.get(5).click();
    }

    @And("Kalite Kontrol sifre kutucuguna gecerli bir {string} girilir")
    public void kaliteKontrolSifreKutucugunaGecerliBirGirilir(String arg0) {
    }

    @Then("Uterim Planlama butonunun gorunur oldugu dogrulanir")
    public void uterimPlanlamaButonununGorunurOlduguDogrulanir() {
        anamenu.menulinkleri.get(6).isDisplayed();
    }

    @And("Uterim Planlama butonuna tiklanir")
    public void uterimPlanlamaButonunaTiklanir() {
        anamenu.menulinkleri.get(6).click();
    }

    @And("Uretim Planlama sifre kutucuguna gecerli bir {string} girilir")
    public void uretimPlanlamaSifreKutucugunaGecerliBirGirilir(String arg0) {
    }

    @Then("Uretim Planlama butonunun gorunur oldugu dogrulanir")
    public void uretimPlanlamaButonununGorunurOlduguDogrulanir() {
    }

    @And("Uretim Planlama butonuna tiklanir")
    public void uretimPlanlamaButonunaTiklanir() {
    }
    @Then("Yonetim butonunun gorunur oldugu dogrulanir")
    public void yonetimButonununGorunurOlduguDogrulanir() {
        anamenu.menulinkleri.get(7).isDisplayed();
    }

    @And("Yonetim butonuna tiklanir")
    public void yonetimButonunaTiklanir() {
        anamenu.menulinkleri.get(7).click();

    }

    @And("gecerli bir email adresi {string} girilir")
    public void gecerliBirEmailAdresiGirilir(String arg0) {
    }

    @And("sifre kutucuguna gecerli bir {string} girilir")
    public void sifreKutucugunaGecerliBirGirilir(String arg0) {
    }

    @And("yonetim Giris yap butonuna tiklanir")
    public void yonetimGirisYapButonunaTiklanir() {
    }


    @And("yonetim sifre kutucugu bos birakilir")
    public void yonetimSifreKutucuguBosBirakilir() {
    }

    @And("email kutucugu bos birakilir")
    public void emailKutucuguBosBirakilir() {
    }

    @And("yonetim sifre kutucuguna gecerli bir {string} girilir")
    public void yonetimSifreKutucugunaGecerliBirGirilir(String arg0) {
    }
    @Then("Yonetim butonunun gorunur olmadigi dogrulanir")
    public void yonetimButonununGorunurOlmadigiDogrulanir() {

    }

    @And("Yonetim butonunun tiklanir olmadigi dogrulanir")
    public void yonetimButonununTiklanirOlmadigiDogrulanir() {
    }
    @Then("Yonetim Sifre ekraninda oldugu dogrulanir")
    public void yonetimSifreEkranindaOlduguDogrulanir() {
        String anasayfa =anamenu.yoneticiGirisSayfasiHeader.getText();
        Assert.assertEquals(yoneticiGirisHeader,anasayfa);
    }
    @And("email kutucuguna gecersiz bir <Dataemail> yazilir")
    public void emailKutucugunaGecersizBirDataemailYazilir() {
        
    }

    @And("sifre kutucuguna gecersiz bir <Datasifre> girilir")
    public void sifreKutucugunaGecersizBirDatasifreGirilir() {
    }


}
