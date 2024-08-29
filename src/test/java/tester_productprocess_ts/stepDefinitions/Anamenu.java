package tester_productprocess_ts.stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.ss.formula.functions.T;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import tester_productprocess_ts.utilities.uiUtilities.ConfigReader;
import tester_productprocess_ts.utilities.uiUtilities.Driver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Anamenu {

    String header = "ANA SAYFA";
    String yoneticiGirisHeader = "ANA SAYFA";
    tester_productprocess_ts.pages.Anamenu anamenu = new tester_productprocess_ts.pages.Anamenu();
    String title = "Gasan Üretim Yönetim Sistemi";
    String girisUrl = "https://10daabbc-c0d4-4ba0-a253-f147f6b9d61e-00-35cytuuj5k6x.janeway.replit.dev/login";

    Select select;

    List<String> list = new ArrayList<>();

    public void scroll(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void scrollclick(WebElement element) {
        try {
            element.click();
        } catch (Exception e) {
            JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
            js.executeScript("arguments[0].click();", element);
        }
    }

    @When("Anasayfaya gidilir")
    public void anasayfaya_gidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));

    }

    @Then("Anasayfada oldugu dogrulanir")
    public void anasayfada_oldugu_dogrulanir() {
        String anasayfaHeaderText = anamenu.AnasayfaHeader.getText();
        String Header = "ANA SAYFA";
        Assert.assertEquals(header, anasayfaHeaderText);
    }

    @When("Ana giris ekraninda hicbir kullanici unvanina tiklamadan sifre giris ekranina erisememelidir")
    public void ana_giris_ekraninda_hicbir_kullanici_unvanina_tiklamadan_sifre_giris_ekranina_erisememelidir() throws InterruptedException {
        anamenu.AnasayfaHeader.click();
        Assert.assertEquals("Gasan Üretim Yönetim Sistemi", Driver.getDriver().getTitle());
        anamenu.herhangibiryer.click();
        Assert.assertEquals("Gasan Üretim Yönetim Sistemi", Driver.getDriver().getTitle());
    }

    @Then("Talasli Imalat Amiri Butonu gorunur oldugu dogrulanir")
    public void talasli_imalat_amiri_butonu_gorunur_oldugu_dogrulanir() throws InterruptedException {
        Actions action = new Actions(Driver.getDriver());
        action.scrollToElement(anamenu.talasliImalatAmiri);
        action.perform();
        anamenu.talasliImalatAmiri.isDisplayed();
    }

    @Then("Talasli Imalat Amiri Butonuna tiklanir")
    public void talasli_imalat_amiri_butonuna_tiklanir() throws InterruptedException {
        Actions action = new Actions(Driver.getDriver());
        action.scrollToElement(anamenu.talasliImalatAmiri);
        action.click(anamenu.talasliImalatAmiri);
        action.perform();
    }

    @Then("Talasli Imalat Amiri Sifre ekraninda oldugu dogrulanir")
    public void talasliImalatAmiriSifreEkranindaOlduguDogrulanir() {
        String sifreTextActual = "TALAŞLI İMALAT AMİRİ";
        String sifreTextresult = anamenu.amirBaslikYazisi.getText();
        Assert.assertEquals(sifreTextresult, sifreTextActual);
    }

    @And("Giris yap butonuna tiklanir")
    public void girisYapButonunaTiklanir() throws InterruptedException {
        Actions action = new Actions(Driver.getDriver());
        Thread.sleep(500);
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
        Thread.sleep(1000);
        anamenu.goz.click();
    }

    @Then("Talasli Imalat Amirinin kendi sorumluluk sayfasina gectigi dogrulanir")
    public void talasliImalatAmirininKendiSorumlulukSayfasinaGectigiDogrulanir() {
        String anasayfa = anamenu.amirBaslikYazisi.getText();
        String talasliHeader = "TALAŞLI İMALAT AMİRİ";
        Assert.assertEquals(talasliHeader, anasayfa);
    }

    @And("sifre kutucuguna gecersiz bir {string} girilir")
    public void sifreKutucugunaGecersizBirGirilir(String arg0) throws InterruptedException {
        Thread.sleep(500);
        anamenu.sifreKutusu.sendKeys(arg0);
    }

    @Then("Talasli Imalat Amirinin kendi sorumluluk sayfasina gecemedigi dogrulanir")
    public void talasliImalatAmirininKendiSorumlulukSayfasinaGecemedigiDogrulanir() throws InterruptedException {
        Thread.sleep(1000);
        if (anamenu.sifreKutusu.equals("")){
            anamenu.ilkGirisHataBosMesaji.isDisplayed();
        }else {
            anamenu.ilkGirisHataMesaji.isDisplayed();
        }
    }
    @Then("Polisaj amiri butonunun gorunur oldugu dogrulanir")
    public void polisajAmiriButonununGorunurOlduguDogrulanir() throws InterruptedException {
        Actions action = new Actions(Driver.getDriver());
        action.scrollToElement(anamenu.polisajAmiri);
        action.perform();
        anamenu.polisajAmiri.isDisplayed();
    }

    @And("Polisaj amiri butonuna tiklanir")
    public void polisajAmiriButonunaTiklanir() throws InterruptedException {
        Actions action = new Actions(Driver.getDriver());
        action.click(anamenu.polisajAmiri);
        action.perform();
    }

    @Then("Polisaj amiri ekraninda oldugu dogrulanir")
    public void polisajAmiriEkranindaOlduguDogrulanir() throws InterruptedException {
        String sifreTextActual = "POLİSAJ AMİRİ";
        Thread.sleep(2000);
        String sifreTextresult = anamenu.polisajAmiriSifreEkranText.getText();
        Thread.sleep(2000);
        Assert.assertEquals(sifreTextresult, sifreTextActual);
    }

    @And("Polisaj amiri sifre kutucuguna gecerli bir {string} girilir")
    public void polisajAmiriSifreKutucugunaGecerliBirGirilir(String arg0) {
        anamenu.sifreKutusu.sendKeys(ConfigReader.getProperty("PolisajAmiri"));
    }

    @Then("Polisaj amirinin kendi sorumluluk sayfasina gectigi dogrulanir")
    public void polisajAmirininKendiSorumlulukSayfasinaGectigiDogrulanir() {
        String anasayfa = anamenu.amirBaslikYazisi.getText();
        String polisajHeader = "POLİSAJ AMİRİ";
        Assert.assertEquals(polisajHeader, anasayfa);
    }

    @Then("Polisaj amirinin kendi sorumluluk sayfasina gecemedigi dogrulanir")
    public void polisajAmirininKendiSorumlulukSayfasinaGecemedigiDogrulanir() {

    }

    @Then("Lift montaj amiri butonunun gorunur oldugu dogrulanir")
    public void liftMontajAmiriButonununGorunurOlduguDogrulanir() throws InterruptedException {
        Actions action = new Actions(Driver.getDriver());
        action.scrollToElement(anamenu.liftmontajAmiri);
        anamenu.liftmontajAmiri.isDisplayed();
        action.perform();
    }

    @And("Lift montaj amiri butonuna tiklanir")
    public void liftMontajAmiriButonunaTiklanir() throws InterruptedException {
        Actions action = new Actions(Driver.getDriver());
        action.click(anamenu.liftmontajAmiri);
        action.perform();
    }

    @Then("Lift montaj amiri ekraninda oldugu dogrulanir")
    public void liftMontajAmiriEkranindaOlduguDogrulanir() {
        String sifreTextActual = "LİFT MONTAJ AMİRİ";
        String sifreTextresult = anamenu.amirBaslikYazisi.getText();
        Assert.assertEquals(sifreTextresult, sifreTextActual);
    }

    @And("Lift montaj amiri sifre kutucuguna gecerli bir {string} girilir")
    public void liftMontajAmiriSifreKutucugunaGecerliBirGirilir(String arg0) {
        anamenu.sifreKutusu.sendKeys(ConfigReader.getProperty("LiftMontajAmiri"));
    }

    @Then("Lift montaj amirinin kendi sorumluluk sayfasina gectigi dogrulanir")
    public void liftMontajAmirininKendiSorumlulukSayfasinaGectigiDogrulanir() {
        String anasayfa = anamenu.amirBaslikYazisi.getText();
        String talasliHeader = "LİFT MONTAJ AMİRİ";
        Assert.assertEquals(talasliHeader, anasayfa);
    }

    @Then("Lift montaj amirinin kendi sorumluluk sayfasina gecemedigi dogrulanir")
    public void liftMontajAmirininKendiSorumlulukSayfasinaGecemedigiDogrulanir() {

    }

    @Then("Bloklift Montaj Amiri butonunun gorunur oldugu dogrulanir")
    public void blokliftMontajAmiriButonununGorunurOlduguDogrulanir() throws InterruptedException {
        Actions action = new Actions(Driver.getDriver());
        action.scrollToElement(anamenu.blokliftMontajAmiri);
        anamenu.blokliftMontajAmiri.isDisplayed();
        action.perform();
    }

    @And("Bloklift Montaj Amiri butonuna tiklanir")
    public void blokliftMontajAmiriButonunaTiklanir() throws InterruptedException {
        Actions action = new Actions(Driver.getDriver());
        action.click(anamenu.blokliftMontajAmiri);
        action.perform();
    }

    @Then("Bloklift Montaj Amiri ekraninda oldugu dogrulanir")
    public void blokliftMontajAmiriEkranindaOlduguDogrulanir() {
        String sifreTextActual = "BLOKLİFT MONTAJ AMİRİ";
        String sifreTextresult = anamenu.amirBaslikYazisi.getText();
        Assert.assertEquals(sifreTextresult, sifreTextActual);
    }

    @Then("Bloklift Montaj Amirinin kendi sorumluluk sayfasina gectigi dogrulanir")
    public void blokliftMontajAmirininKendiSorumlulukSayfasinaGectigiDogrulanir() {
        String anasayfa = anamenu.amirBaslikYazisi.getText();
        String blokliftHeader = "BLOKLİFT MONTAJ AMİRİ";
        Assert.assertEquals(blokliftHeader, anasayfa);
    }

    @Then("Bloklift Montaj Amirinin kendi sorumluluk sayfasina gecemedigi dogrulanir")
    public void blokliftMontajAmirininKendiSorumlulukSayfasinaGecemedigiDogrulanir() {
    }

    @And("Bloklift Montaj Amiri sifre kutucuguna gecerli bir {string} girilir")
    public void blokliftMontajAmiriSifreKutucugunaGecerliBirGirilir(String arg0) {
        anamenu.sifreKutusu.sendKeys(ConfigReader.getProperty("BlMontajAmiri"));
    }

    @Then("Boyama ve Paketleme Amiri butonunun gorunur oldugu dogrulanir")
    public void boyamaVePaketlemeAmiriButonununGorunurOlduguDogrulanir() throws InterruptedException {
        Actions action = new Actions(Driver.getDriver());
        action.scrollToElement(anamenu.boyamaVePaketlemeAmiri);
        anamenu.boyamaVePaketlemeAmiri.isDisplayed();
        action.perform();
    }

    @And("Boyama ve Paketleme Amiri butonuna tiklanir")
    public void boyamaVePaketlemeAmiriButonunaTiklanir() throws InterruptedException {
        Actions action = new Actions(Driver.getDriver());
        action.click(anamenu.boyamaVePaketlemeAmiri);
        action.perform();
    }

    @And("Boyama ve Paketleme Amiri sifre kutucuguna gecerli bir {string} girilir")
    public void boyamaVePaketlemeAmiriSifreKutucugunaGecerliBirGirilir(String arg0) {
        anamenu.sifreKutusu.sendKeys(ConfigReader.getProperty("BoyamaPaketlemeAmiri"));
    }

    @Then("Boyama ve Paketleme Amiri ekraninda oldugu dogrulanir")
    public void boyamaVePaketlemeAmiriEkranindaOlduguDogrulanir() {
        String sifreTextActual = "BOYAMA VE PAKETLEME AMİRİ";
        String sifreTextresult = anamenu.amirBaslikYazisi.getText();
        Assert.assertEquals(sifreTextresult, sifreTextActual);
    }

    @Then("Boyama ve Paketleme Amirinin kendi sorumluluk sayfasina gectigi dogrulanir")
    public void boyamaVePaketlemeAmirininKendiSorumlulukSayfasinaGectigiDogrulanir() {
        String anasayfa = anamenu.amirBaslikYazisi.getText();
        String blokliftHeader = "BOYAMA VE PAKETLEME AMİRİ";
        Assert.assertEquals(blokliftHeader, anasayfa);
    }

    @Then("Boyama ve Paketleme Amirinin kendi sorumluluk sayfasina gecemedigi dogrulanir")
    public void boyamaVePaketlemeAmirininKendiSorumlulukSayfasinaGecemedigiDogrulanir() {
    }

    @Then("Kalite Kontrol butonunun gorunur oldugu dogrulanir")
    public void kaliteKontrolButonununGorunurOlduguDogrulanir() throws InterruptedException {
        Actions action = new Actions(Driver.getDriver());
        action.scrollToElement(anamenu.kaliteKontrolAmiri);
        anamenu.kaliteKontrolAmiri.isDisplayed();
        action.perform();
    }

    @And("Kalite Kontrol butonuna tiklanir")
    public void kaliteKontrolButonunaTiklanir() throws InterruptedException {
        Actions action = new Actions(Driver.getDriver());
        action.click(anamenu.kaliteKontrolAmiri);
        action.perform();
    }

    @Then("Kalite Kontrol ekraninda oldugu dogrulanir")
    public void kaliteKontrolEkranindaOlduguDogrulanir() {
        String sifreTextActual = "KALİTE KONTROL AMİRİ";
        String sifreTextresult = anamenu.amirBaslikYazisi.getText();
        Assert.assertEquals(sifreTextresult, sifreTextActual);
    }

    @Then("Kalite Kontrol sayfasina gectigi dogrulanir")
    public void kaliteKontrolSayfasinaGectigiDogrulanir() {
        String anasayfa = anamenu.amirBaslikYazisi.getText();
        String blokliftHeader = "KALİTE KONTROL AMİRİ";
        Assert.assertEquals(blokliftHeader, anasayfa);
    }

    @Then("Kalite Kontrol sayfasina gecemedigi dogrulanir")
    public void kaliteKontrolSayfasinaGecemedigiDogrulanir() {
    }

    @And("Kalite Kontrol sifre kutucuguna gecerli bir {string} girilir")
    public void kaliteKontrolSifreKutucugunaGecerliBirGirilir(String arg0) {
        anamenu.sifreKutusu.sendKeys(ConfigReader.getProperty("KaliteKontrol"));
    }

    @Then("Uretim Planlama butonunun gorunur oldugu dogrulanir")
    public void uretimPlanlamaButonununGorunurOlduguDogrulanir() throws InterruptedException {
        Actions action = new Actions(Driver.getDriver());
        action.scrollToElement(anamenu.menulinkleri.get(6));
        action.perform();
        anamenu.uretimPlanlama.isDisplayed();
    }

    @And("Uretim Planlama butonuna tiklanir")
    public void uretimPlanlamaButonunaTiklanir() throws InterruptedException {
        Thread.sleep(1000);
        scrollclick(anamenu.menulinkleri.get(6));
    }

    @Then("Uretim Planlama ekraninda oldugu dogrulanir")
    public void uretimPlanlamaEkranindaOlduguDogrulanir() {
        String sifreTextActual = "ÜRETİM PLANLAMA";
        String sifreTextresult = anamenu.amirBaslikYazisi.getText();
        Assert.assertEquals(sifreTextresult, sifreTextActual);
    }

    @Then("Uretim Planlama sayfasina gectigi dogrulanir")
    public void uretimPlanlamaSayfasinaGectigiDogrulanir() {
        String anasayfa = anamenu.amirBaslikYazisi.getText();
        String blokliftHeader = "ÜRETİM PLANLAMA";
        Assert.assertEquals(blokliftHeader, anasayfa);
    }

    @Then("Uretim Planlama sayfasina gecemedigi dogrulanir")
    public void uretimPlanlamaSayfasinaGecemedigiDogrulanir() {
    }

    @And("Uretim Planlama sifre kutucuguna gecerli bir {string} girilir")
    public void uretimPlanlamaSifreKutucugunaGecerliBirGirilir(String arg0) {
        anamenu.sifreKutusu.sendKeys(ConfigReader.getProperty("UretimPlanlama"));
    }

    @Then("Yonetim butonunun gorunur oldugu dogrulanir")
    public void yonetimButonununGorunurOlduguDogrulanir() throws InterruptedException {
        Actions action = new Actions(Driver.getDriver());
        action.scrollToElement(anamenu.menulinkleri.get(7));
        action.perform();
        anamenu.yonetim.isDisplayed();
    }

    @And("Yonetim butonuna tiklanir")
    public void yonetimButonunaTiklanir() throws InterruptedException {
        Thread.sleep(1000);
        scrollclick(anamenu.menulinkleri.get(7));
    }

    @And("yonetici sifre kutucuguna gecerli bir {string} girilir")
    public void yoneticiSifreKutucugunaGecerliBirGirilir(String arg0) {
        anamenu.sifreKutusu.sendKeys(ConfigReader.getProperty("yonetici"));
    }

    @And("Yonetici Sifre gizleme butonunun sifreyi gizledigi kontrol edllir")
    public void yoneticiSifreGizlemeButonununSifreyiGizledigiKontrolEdllir() throws InterruptedException {
        Thread.sleep(2000);
        anamenu.yoneticiGoz.click();
    }

    @And("Yonetici Sifre gizleme butonunun sifreyi tekrar gorunur hale getirdigi kontrol edllir")
    public void yoneticiSifreGizlemeButonununSifreyiTekrarGorunurHaleGetirdigiKontrolEdllir() throws InterruptedException {
        Thread.sleep(1000);
        anamenu.yoneticiGoz.click();
    }

    @And("yonetim Giris yap butonuna tiklanir")
    public void yonetimGirisYapButonunaTiklanir() throws InterruptedException {
        Actions action = new Actions(Driver.getDriver());
        action.click(anamenu.yonetimGirisButonu);
        action.perform();
    }

    @Then("Yonetim Sifre ekraninda oldugu dogrulanir")
    public void yonetimSifreEkranindaOlduguDogrulanir() throws InterruptedException {
        String sifreTextActual = "YÖNETİM";
        String sifreTextresult = anamenu.amirBaslikYazisi.getText();
        Assert.assertEquals(sifreTextresult, sifreTextActual);
    }

    @And("yonetici sifre kutucuguna gecersiz bir {string} girilir")
    public void yoneticiSifreKutucugunaGecersizBirGirilir(String arg0) throws InterruptedException {
        anamenu.sifreKutusu.sendKeys(arg0);
        Thread.sleep(1000);
    }

    @Then("yonetim sayfasina gectigi dogrulanir")
    public void yonetimSayfasinaGectigiDogrulanir() {
        String anasayfa = anamenu.amirBaslikYazisi.getText();
        String yonetimHeader = "YÖNETİM";
        Assert.assertEquals(yonetimHeader, anasayfa);
    }

    @Then("yonetim sayfasina gecemedigi dogrulanir")
    public void yonetimSayfasinaGecemedigiDogrulanir() {
    }

    @And("Kullanici logout yapar")
    public void kullaniciLogoutYapar() throws InterruptedException {
        Thread.sleep(2000);
        anamenu.logout.click();
        Thread.sleep(2000);
    }


    @And("yonetici kullaniciya sifre atama butonuna tiklar")
    public void yoneticiKullaniciyaSifreAtamaButonunaTiklar() throws InterruptedException {
        anamenu.kullaniciyaSifreAtama.click();

    }

    @And("yonetici kullaniciya sifre atama ekranina gectigini dogrular")
    public void yoneticiKullaniciyaSifreAtamaEkraninaGectiginiDogrular() throws InterruptedException {
        String sifreTextActual = "Return backŞIFRE ATAMA EKRANI Logout";
        String sifreTextresult = anamenu.sifreAtamaEkraniText.getText();
        Assert.assertEquals(sifreTextresult, sifreTextActual);

    }

    @And("yonetici return back butonuna tiklar")
    public void yoneticiReturnBackButonunaTiklar() throws InterruptedException {
        anamenu.returnback.click();
        Thread.sleep(1000);
        anamenu.kullaniciyaSifreAtama.click();
    }

    @And("yonetici guncelle butonunu tiklar")
    public void yoneticiGuncelleButonunuTiklar() throws InterruptedException {
        Thread.sleep(1000);
        anamenu.girisButonu.click();
    }

    @And("yonetici kullanici secer, yeni sifre atar, guncelle butonunu tiklar ve guncellendigini kontrol eder")
    public void yoneticiKullaniciSecerYeniSifreAtarGuncelleButonunuTiklarVeGuncellendiginiKontrolEder() throws InterruptedException {
        Properties properties = new Properties();
        try {
            FileInputStream configStream = new FileInputStream("configuration1.properties");
            properties.load(configStream);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        for (String userKey : properties.stringPropertyNames()) {
            String newPassword = properties.getProperty(userKey);

            // Kullanıcıyı seçme

            Select userSelect = new Select(anamenu.userSelectElement);
            userSelect.selectByValue(userKey);
            Thread.sleep(1500);
            // Yeni şifreyi girme

            anamenu.passwordInput.clear();
            anamenu.passwordInput.sendKeys(newPassword);

            anamenu.sifreAtamaEkraniGoz.click();
            Thread.sleep(1500);
            anamenu.sifreAtamaEkraniGoz.click();
            Thread.sleep(1500);

            anamenu.sifreAtamaEkraniTik.isDisplayed();

            // "Güncelle" butonuna tıklama
            anamenu.guncelle.click();

            Thread.sleep(1000);

            //"guncellendi popup"
            anamenu.sifreGuncellendiText.isDisplayed();
            Thread.sleep(1000);
            anamenu.guncellemaPopupOk.click();
            Thread.sleep(1000);
            anamenu.kullaniciyaSifreAtama.click();
        }
    }
}

