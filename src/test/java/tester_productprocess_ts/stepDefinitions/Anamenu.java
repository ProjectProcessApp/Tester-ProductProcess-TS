package tester_productprocess_ts.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import tester_productprocess_ts.utilities.uiUtilities.ConfigReader;
import tester_productprocess_ts.utilities.uiUtilities.Driver;

public class Anamenu {

    String header = "ANA SAYFA";
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
    @Then("sifre kutucuguna gecerli bir data girilir")
    public void sifre_kutucuguna_gecerli_bir_data_girilir() {

    }
    @Then("Giris yap butonuna tiklanir")
    public void giris_yap_butonuna_tiklanir() {

    }

    @And("talasli imalat amiri butonuna tiklanir")
    public void talasliImalatAmiriButonunaTiklanir() {
    }

    @Then("sifre ekraninda olundugu dogrulanir")
    public void sifreEkranindaOlunduguDogrulanir() {
    }

    @And("sifre kutucu bos birakilir")
    public void sifreKutucuBosBirakilir() {
    }

    @And("giris yap butonuna tiklanir")
    public void girisYapButonunaTiklanir() {
    }

    @Then("Kullanicinin kendi sorumluluk sayfasina gecemedigi dogrulanir")
    public void kullanicininKendiSorumlulukSayfasinaGecemedigiDogrulanir() {
    }

    @And("sifre kutucuna gecersiz bir data girilir")
    public void sifreKutucunaGecersizBirDataGirilir() {
    }

    @Then("Polisaj amiri butonunun gorunur oldugu dogrulanir")
    public void polisajAmiriButonununGorunurOlduguDogrulanir() {
    }

    @And("Polisaj amiri butonuna tiklanir")
    public void polisajAmiriButonunaTiklanir() {
    }

    @And("sifre kutucugu bos birakilir")
    public void sifreKutucuguBosBirakilir() {
    }

    @And("sifre kutucuguna gecersiz bir data girillir")
    public void sifreKutucugunaGecersizBirDataGirillir() {
    }

    @Then("Lift montaj amiri butonunun gorunur oldugu dogrulanir")
    public void liftMontajAmiriButonununGorunurOlduguDogrulanir() {
    }

    @And("Lift montaj amiri butonuna tiklanir")
    public void liftMontajAmiriButonunaTiklanir() {
    }

    @Then("Lift Montaj Amiributonunun gorunur oldugu dogrulanir")
    public void liftMontajAmiributonununGorunurOlduguDogrulanir() {
    }

   @And("Lift Montaj Amiri butonuna tiklanir")
    public void liftMontajAmiriButonunaTiklanir() {
    }

    @And("sifre kutucuguna gecersiz bir data girilir")
    public void sifreKutucugunaGecersizBirDataGirilir() {
    }

    @Then("Bloklift Montaj Amiri butonunun gorunur oldugu dogrulanir")
    public void blokliftMontajAmiriButonununGorunurOlduguDogrulanir() {
    }

    @And("Bloklift Montaj Amiri butonuna tiklanir")
    public void blokliftMontajAmiriButonunaTiklanir() {
    }

    @Then("Boyama ve Paketleme Amiri butonunun gorunur oldugu dogrulanir")
    public void boyamaVePaketlemeAmiriButonununGorunurOlduguDogrulanir() {
    }

    @And("Boyama ve Paketleme Amiri butonuna tiklanir")
    public void boyamaVePaketlemeAmiriButonunaTiklanir() {
    }

    @And("BBoyama ve Paketleme Amiri butonuna tiklanir")
    public void bboyamaVePaketlemeAmiriButonunaTiklanir() {
    }

    @Then("Kalite Kontrol butonunun gorunur oldugu dogrulanir")
    public void kaliteKontrolButonununGorunurOlduguDogrulanir() {
    }

    @And("BKalite Kontrol butonuna tiklanir")
    public void bkaliteKontrolButonunaTiklanir() {
    }

    @And("Kalite Kontrol butonuna tiklanir")
    public void kaliteKontrolButonunaTiklanir() {
    }

    @Then("Kalite Kontrol  butonunun gorunur oldugu dogrulanir")
    public void kaliteKontrolButonununGorunurOlduguDogrulanir() {
    }


    @Then("Uterim Planlama butonunun gorunur oldugu dogrulanir")
    public void uterimPlanlamaButonununGorunurOlduguDogrulanir() {
    }

    @And("Uterim Planlama butonuna tiklanir")
    public void uterimPlanlamaButonunaTiklanir() {
    }

    @Then("Uretim Planlama butonunun gorunur oldugu dogrulanir")
    public void uretimPlanlamaButonununGorunurOlduguDogrulanir() {
    }

    @And("Uretim Planlama butonuna tiklanir")
    public void uretimPlanlamaButonunaTiklanir() {
    }

    @Then("Uretim Planlama  butonunun gorunur oldugu dogrulanir")
    public void uretimPlanlamaButonununGorunurOlduguDogrulanir() {
    }

    @Then("Yonetim butonunun gorunur oldugu dogrulanir")
    public void yonetimButonununGorunurOlduguDogrulanir() {
    }

    @And("Yonetim Planlama butonuna tiklanir")
    public void yonetimPlanlamaButonunaTiklanir() {
    }

    @And("Yonetim  butonuna tiklanir")
    public void yonetimButonunaTiklanir() {

    }
    @And("Sifre gizleme butonunun sifreyi gizledigi kontrol edllir")
    public void sifreGizlemeButonununSifreyiGizledigiKontrolEdllir() {
    }
    @And("Sifre gizleme butonunun sifreyi tekrar gorunur hale getirdigi kontrol edllir")
    public void sifreGizlemeButonununSifreyiTekrarGorunurHaleGetirdigiKontrolEdllir() {
    }



    @Then("Kullanicinin kendi sorumluluk sayfasina gectiigi dogrulanir")
    public void kullanicininKendiSorumlulukSayfasinaGectiigiDogrulanir() {
    }

    @Then("Kullanicinin kendi sorumluluk sayfasina gectigi dogrulanir")
    public void kullanicininKendiSorumlulukSayfasinaGectigiDogrulanir() {
    }

    @And("Lift Montaj Amiri butonuna tiklanir")
    public void liftMontajAmiriButonunaTiklanir() {
    }

    @Then("Kalite Kontrol  butonunun gorunur oldugu dogrulanir")
    public void kaliteKontrolButonununGorunurOlduguDogrulanir() {
    }

    @Then("Uretim Planlama  butonunun gorunur oldugu dogrulanir")
    public void uretimPlanlamaButonununGorunurOlduguDogrulanir() {
    }
}
