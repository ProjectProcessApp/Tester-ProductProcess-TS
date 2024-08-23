package tester_productprocess_ts.stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import tester_productprocess_ts.utilities.uiUtilities.ConfigReader;
import tester_productprocess_ts.utilities.uiUtilities.Driver;

import javax.swing.*;

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
        Thread.sleep(500);
        Assert.assertEquals("Gasan Üretim Yönetim Sistemi",Driver.getDriver().getTitle());

        anamenu.herhangibiryer.click();
        Thread.sleep(500);
        Assert.assertEquals("Gasan Üretim Yönetim Sistemi",Driver.getDriver().getTitle());
    }

    @Then("Talasli Imalat Amiri Butonu gorunur oldugu dogrulanir")
    public void talasli_imalat_amiri_butonu_gorunur_oldugu_dogrulanir() throws InterruptedException {
        Thread.sleep(300);
        Actions action=new Actions(Driver.getDriver());
        action.scrollToElement(anamenu.talasliImalatAmiri);
        action.perform();
        anamenu.talasliImalatAmiri.isDisplayed();
    }
    @Then("Talasli Imalat Amiri Butonuna tiklanir")
    public void talasli_imalat_amiri_butonuna_tiklanir() throws InterruptedException {
        Thread.sleep(300);
        Actions action= new Actions(Driver.getDriver());
        action.scrollToElement(anamenu.talasliImalatAmiri);
        action.click(anamenu.talasliImalatAmiri);
        action.perform();
    }
    @Then("Sifre ekraninda oldugu dogrulanir")
    public void sifre_ekraninda_oldugu_dogrulanir() {
        String sifreTextActual ="Şifre";
        String sifreTextresult=anamenu.sifreYazisi.getText();
        Assert.assertEquals(sifreTextresult,sifreTextActual);
    }

    @And("Giris yap butonuna tiklanir")
    public void girisYapButonunaTiklanir() throws InterruptedException {
        Thread.sleep(500);
       Actions action= new Actions(Driver.getDriver());
        action.click(anamenu.girisButonu);
        action.perform();

    }

    @And("Talasli imalat amiri sifre kutucuguna gecerli bir {string} girilir")
    public void talasliImalatAmiriSifreKutucugunaGecerliBirGirilir(String arg0) {
        anamenu.sifreKutusu.sendKeys(ConfigReader.getProperty("TalasliImalatAmiri"));
    }

    @And("Sifre gizleme butonunun sifreyi gizledigi kontrol edllir")
    public void sifreGizlemeButonununSifreyiGizledigiKontrolEdllir() {
        anamenu.goz.click();
    }

    @And("Sifre gizleme butonunun sifreyi tekrar gorunur hale getirdigi kontrol edllir")
    public void sifreGizlemeButonununSifreyiTekrarGorunurHaleGetirdigiKontrolEdllir() throws InterruptedException {
        Thread.sleep(1500);
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

    @And("sifre kutucuguna gecersiz bir {string} girilir")
    public void sifreKutucugunaGecersizBirGirilir(String arg0) throws InterruptedException {
        Thread.sleep(500);
        anamenu.sifreKutusu.sendKeys(arg0);
    }

    @Then("Polisaj amiri butonunun gorunur oldugu dogrulanir")
    public void polisajAmiriButonununGorunurOlduguDogrulanir() throws InterruptedException {
        Thread.sleep(300);
        Actions action=new Actions(Driver.getDriver());
        action.scrollToElement(anamenu.polisajAmiri);
        action.perform();
        anamenu.polisajAmiri.isDisplayed();
    }

    @And("Polisaj amiri butonuna tiklanir")
    public void polisajAmiriButonunaTiklanir() throws InterruptedException {
        Thread.sleep(300);
       Actions action= new Actions(Driver.getDriver());
        action.click(anamenu.polisajAmiri);
        action.perform();

    }

    @And("Polisaj amiri sifre kutucuguna gecerli bir data girilir")
    public void polisajAmiriSifreKutucugunaGecerliBirDataGirilir() {
        anamenu.sifreKutusu.sendKeys(ConfigReader.getProperty("PolisajAmiri"));
    }

    @And("sifre kutucugu bos birakilir")
    public void sifreKutucuguBosBirakilir() {
        anamenu.sifreKutusu.sendKeys("");
    }

    @Then("Lift montaj amiri butonunun gorunur oldugu dogrulanir")
    public void liftMontajAmiriButonununGorunurOlduguDogrulanir() throws InterruptedException {
        Thread.sleep(300);
        Actions action= new Actions(Driver.getDriver());
        action.scrollToElement(anamenu.liftmontajAmiri);
        anamenu.liftmontajAmiri.isDisplayed();
        action.perform();
    }

    @And("Lift montaj amiri butonuna tiklanir")
    public void liftMontajAmiriButonunaTiklanir() throws InterruptedException {

        Thread.sleep(300);
        Actions action= new Actions(Driver.getDriver());
        action.click(anamenu.liftmontajAmiri);
        action.perform();
    }

    @And("Lift montaj amiri sifre kutucuguna gecerli bir {string} girilir")
    public void liftMontajAmiriSifreKutucugunaGecerliBirGirilir(String arg0) {
        anamenu.sifreKutusu.sendKeys(ConfigReader.getProperty("LiftMontajAmiri"));
    }
    @Then("Lift Montaj Amiributonunun gorunur oldugu dogrulanir")
    public void liftMontajAmiributonununGorunurOlduguDogrulanir() throws InterruptedException {
        Thread.sleep(300);
        Actions action= new Actions(Driver.getDriver());
        action.scrollToElement(anamenu.liftmontajAmiri);
        action.perform();
        anamenu.liftmontajAmiri.isDisplayed();
    }

    @Then("Bloklift Montaj Amiri butonunun gorunur oldugu dogrulanir")
    public void blokliftMontajAmiriButonununGorunurOlduguDogrulanir() throws InterruptedException {

        Thread.sleep(300);
        Actions action= new Actions(Driver.getDriver());
        action.scrollToElement(anamenu.blokliftMontajAmiri);
        anamenu.blokliftMontajAmiri.isDisplayed();
        action.perform();
    }

    @And("Bloklift Montaj Amiri butonuna tiklanir")
    public void blokliftMontajAmiriButonunaTiklanir() throws InterruptedException {
        Thread.sleep(300);
        Actions action= new Actions(Driver.getDriver());
        action.click(anamenu.blokliftMontajAmiri);
        action.perform();
    }

    @And("Bloklift Montaj Amiri sifre kutucuguna gecerli bir {string} girilir")
    public void blokliftMontajAmiriSifreKutucugunaGecerliBirGirilir(String arg0) {
        anamenu.sifreKutusu.sendKeys(ConfigReader.getProperty("BlMontajAmiri"));
    }

    @Then("Boyama ve Paketleme Amiri butonunun gorunur oldugu dogrulanir")
    public void boyamaVePaketlemeAmiriButonununGorunurOlduguDogrulanir() throws InterruptedException {
        Thread.sleep(300);
        Actions action= new Actions(Driver.getDriver());
        action.scrollToElement(anamenu.boyamaVePaketlemeAmiri);
        anamenu.boyamaVePaketlemeAmiri.isDisplayed();
        action.perform();
    }

    @And("Boyama ve Paketleme Amiri butonuna tiklanir")
    public void boyamaVePaketlemeAmiriButonunaTiklanir() throws InterruptedException {
        Thread.sleep(1000);
        Actions action= new Actions(Driver.getDriver());
        action.click(anamenu.boyamaVePaketlemeAmiri);
        action.perform();
    }

    @And("Boyama ve Paketleme Amiri sifre kutucuguna gecerli bir {string} girilir")
    public void boyamaVePaketlemeAmiriSifreKutucugunaGecerliBirGirilir(String arg0) {
        anamenu.sifreKutusu.sendKeys("BoyamaPaketlemeAmiri");
    }

    @Then("Kalite Kontrol butonunun gorunur oldugu dogrulanir")
    public void kaliteKontrolButonununGorunurOlduguDogrulanir() throws InterruptedException {
        Thread.sleep(300);
        Actions action= new Actions(Driver.getDriver());
        action.scrollToElement(anamenu.kaliteKontrolAmiri);
        anamenu.kaliteKontrolAmiri.isDisplayed();
        action.perform();
    }

    @And("Kalite Kontrol butonuna tiklanir")
    public void kaliteKontrolButonunaTiklanir() throws InterruptedException {
        Thread.sleep(300);
        Actions action= new Actions(Driver.getDriver());
        action.click(anamenu.kaliteKontrolAmiri);
        action.perform();
    }

    @And("Kalite Kontrol sifre kutucuguna gecerli bir {string} girilir")
    public void kaliteKontrolSifreKutucugunaGecerliBirGirilir(String arg0) {
        anamenu.sifreKutusu.sendKeys("KaliteKontrol");
    }

    @And("Uretim Planlama sifre kutucuguna gecerli bir {string} girilir")
    public void uretimPlanlamaSifreKutucugunaGecerliBirGirilir(String arg0) {
        anamenu.sifreKutusu.sendKeys("UretimPlanlama");
    }

    @Then("Uretim Planlama butonunun gorunur oldugu dogrulanir")
    public void uretimPlanlamaButonununGorunurOlduguDogrulanir() throws InterruptedException {
        Thread.sleep(500);
        Actions action= new Actions(Driver.getDriver());
        action.scrollToElement(anamenu.uretimPlanlama);
        action.perform();
        anamenu.uretimPlanlama.isDisplayed();
    }

    @And("Uretim Planlama butonuna tiklanir")
    public void uretimPlanlamaButonunaTiklanir() throws InterruptedException {
        Thread.sleep(1000);
        Actions action= new Actions(Driver.getDriver());
        action.click(anamenu.uretimPlanlama);
        action.perform();
    }
    @Then("Yonetim butonunun gorunur oldugu dogrulanir")
    public void yonetimButonununGorunurOlduguDogrulanir() throws InterruptedException {
        Thread.sleep(300);
        Actions action= new Actions(Driver.getDriver());
        action.scrollToElement(anamenu.yonetim);
        action.perform();
        anamenu.yonetim.isDisplayed();
    }

    @And("Yonetim butonuna tiklanir")
    public void yonetimButonunaTiklanir() throws InterruptedException {
        Thread.sleep(1000);
        Actions action= new Actions(Driver.getDriver());
        action.click(anamenu.yonetim);
        action.perform();
    }
    @And("gecerli bir email adresi {string} girilir")
    public void gecerliBirEmailAdresiGirilir(String arg0) {
    }

    @And("sifre kutucuguna gecerli bir {string} girilir")
    public void sifreKutucugunaGecerliBirGirilir(String arg0) {
    }

    @And("yonetim Giris yap butonuna tiklanir")
    public void yonetimGirisYapButonunaTiklanir() throws InterruptedException {
        Thread.sleep(300);
        Actions action = new Actions(Driver.getDriver());
        action.click(anamenu.yonetimGirisButonu);
        action.perform();
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
    public void yonetimSifreEkranindaOlduguDogrulanir() throws InterruptedException {
        Thread.sleep(1000);
        String yoneticiAnasayfa =anamenu.yoneticiGirisSayfasiHeader.getText();
        Assert.assertEquals(yoneticiGirisHeader,yoneticiAnasayfa);
    }
    @And("email kutucuguna gecersiz bir <Dataemail> yazilir")
    public void emailKutucugunaGecersizBirDataemailYazilir() {
        
    }

    @And("sifre kutucuguna gecersiz bir <Datasifre> girilir")
    public void sifreKutucugunaGecersizBirDatasifreGirilir() {
    }



}
