package tester_productprocess_ts.stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import tester_productprocess_ts.utilities.uiUtilities.ConfigReader;
import tester_productprocess_ts.utilities.uiUtilities.Driver;

public class Anamenu {

    String header = "ANA SAYFA";

    String yoneticiGirisHeader = "YÖNETİCİ GİRİŞ SAYFASI";
    tester_productprocess_ts.pages.Anamenu anamenu = new tester_productprocess_ts.pages.Anamenu();
    String title="Gasan Üretim Yönetim Sistemi";
    String girisUrl = "https://10daabbc-c0d4-4ba0-a253-f147f6b9d61e-00-35cytuuj5k6x.janeway.replit.dev/login";
    public  void scroll(WebElement element) throws InterruptedException {
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }
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
    public void girisYapButonunaTiklanir() throws InterruptedException {
        scroll(anamenu.girisButonu);
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
    public void polisajAmiriButonununGorunurOlduguDogrulanir() throws InterruptedException {
        scroll(anamenu.polisajAmiri);
        anamenu.polisajAmiri.isDisplayed();
    }

    @And("Polisaj amiri butonuna tiklanir")
    public void polisajAmiriButonunaTiklanir() throws InterruptedException {
        scroll(anamenu.polisajAmiri);
        anamenu.polisajAmiri.click();
    }

    @And("Polisaj amiri sifre kutucuguna gecerli bir data girilir")
    public void polisajAmiriSifreKutucugunaGecerliBirDataGirilir() {
    }

    @And("sifre kutucugu bos birakilir")
    public void sifreKutucuguBosBirakilir() {
    }

    @Then("Lift montaj amiri butonunun gorunur oldugu dogrulanir")
    public void liftMontajAmiriButonununGorunurOlduguDogrulanir() throws InterruptedException {
        scroll(anamenu.liftmontajAmiri);
        anamenu.liftmontajAmiri.isDisplayed();
    }

    @And("Lift montaj amiri butonuna tiklanir")
    public void liftMontajAmiriButonunaTiklanir() throws InterruptedException {

        scroll(anamenu.liftmontajAmiri);
        anamenu.liftmontajAmiri.click();
    }

    @And("Lift montaj amiri sifre kutucuguna gecerli bir {string} girilir")
    public void liftMontajAmiriSifreKutucugunaGecerliBirGirilir(String arg0) {
    }

    @Then("Lift Montaj Amiributonunun gorunur oldugu dogrulanir")
    public void liftMontajAmiributonununGorunurOlduguDogrulanir() {
    }

    @Then("Bloklift Montaj Amiri butonunun gorunur oldugu dogrulanir")
    public void blokliftMontajAmiriButonununGorunurOlduguDogrulanir() throws InterruptedException {

        scroll(anamenu.blokliftMontajAmiri);
        anamenu.blokliftMontajAmiri.isDisplayed();
    }

    @And("Bloklift Montaj Amiri butonuna tiklanir")
    public void blokliftMontajAmiriButonunaTiklanir() throws InterruptedException {

        scroll(anamenu.blokliftMontajAmiri);
        anamenu.blokliftMontajAmiri.click();
    }

    @And("Bloklift Montaj Amiri sifre kutucuguna gecerli bir {string} girilir")
    public void blokliftMontajAmiriSifreKutucugunaGecerliBirGirilir(String arg0) {
    }

    @Then("Boyama ve Paketleme Amiri butonunun gorunur oldugu dogrulanir")
    public void boyamaVePaketlemeAmiriButonununGorunurOlduguDogrulanir() throws InterruptedException {

        scroll(anamenu.boyamaVePaketlemeAmiri);
        anamenu.boyamaVePaketlemeAmiri.isDisplayed();
    }

    @And("Boyama ve Paketleme Amiri butonuna tiklanir")
    public void boyamaVePaketlemeAmiriButonunaTiklanir() throws InterruptedException {

        scroll(anamenu.boyamaVePaketlemeAmiri);
        anamenu.boyamaVePaketlemeAmiri.click();
    }

    @And("Boyama ve Paketleme Amiri sifre kutucuguna gecerli bir {string} girilir")
    public void boyamaVePaketlemeAmiriSifreKutucugunaGecerliBirGirilir(String arg0) {
    }

    @Then("Kalite Kontrol butonunun gorunur oldugu dogrulanir")
    public void kaliteKontrolButonununGorunurOlduguDogrulanir() throws InterruptedException {

        scroll(anamenu.kaliteKontrolAmiri);
        anamenu.kaliteKontrolAmiri.isDisplayed();
    }

    @And("Kalite Kontrol butonuna tiklanir")
    public void kaliteKontrolButonunaTiklanir() throws InterruptedException {

        scroll(anamenu.kaliteKontrolAmiri);
        anamenu.kaliteKontrolAmiri.click();
    }

    @And("Kalite Kontrol sifre kutucuguna gecerli bir {string} girilir")
    public void kaliteKontrolSifreKutucugunaGecerliBirGirilir(String arg0) {
    }

    @Then("Uterim Planlama butonunun gorunur oldugu dogrulanir")
    public void uterimPlanlamaButonununGorunurOlduguDogrulanir() throws InterruptedException {

        scroll(anamenu.uretimPlanlama);
        anamenu.uretimPlanlama.isDisplayed();
    }

    @And("Uterim Planlama butonuna tiklanir")
    public void uterimPlanlamaButonunaTiklanir() throws InterruptedException {
        scroll(anamenu.uretimPlanlama);
        anamenu.uretimPlanlama.click();
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
    public void yonetimButonununGorunurOlduguDogrulanir() throws InterruptedException {

        scroll(anamenu.yonetim);
        anamenu.yonetim.isDisplayed();
    }

    @And("Yonetim butonuna tiklanir")
    public void yonetimButonunaTiklanir() throws InterruptedException {

        scroll(anamenu.yonetim);
        anamenu.yonetim.click();

    }

    @And("gecerli bir email adresi {string} girilir")
    public void gecerliBirEmailAdresiGirilir(String arg0) {
    }

    @And("sifre kutucuguna gecerli bir {string} girilir")
    public void sifreKutucugunaGecerliBirGirilir(String arg0) {
    }

    @And("yonetim Giris yap butonuna tiklanir")
    public void yonetimGirisYapButonunaTiklanir() throws InterruptedException {

        scroll(anamenu.girisButonu);
        anamenu.girisButonu.click();
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
