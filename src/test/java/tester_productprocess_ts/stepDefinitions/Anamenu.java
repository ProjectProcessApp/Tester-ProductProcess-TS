package tester_productprocess_ts.stepDefinitions;


import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import jdk.javadoc.doclet.Reporter;
import org.apache.poi.ss.formula.functions.T;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import tester_productprocess_ts.utilities.uiUtilities.ConfigReader;
import tester_productprocess_ts.utilities.uiUtilities.Driver;
import tester_productprocess_ts.utilities.uiUtilities.ReusableMethods;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import static org.junit.Assert.assertEquals;
import static tester_productprocess_ts.utilities.uiUtilities.ReusableMethods.*;

public class Anamenu {

    String header = "ANA SAYFA";
    tester_productprocess_ts.pages.Anamenu anamenu = new tester_productprocess_ts.pages.Anamenu();
    Actions action=new Actions(Driver.getDriver());

    @When("Anasayfaya gidilir")
    public void anasayfaya_gidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @Then("Anasayfada oldugu dogrulanir")
    public void anasayfada_oldugu_dogrulanir() {
        String anasayfaHeaderText = anamenu.AnasayfaHeader.getText();
        String Header = "ANA SAYFA";
        assertEquals("Kullanici anasayfada",header, anasayfaHeaderText);
        ExtentCucumberAdapter.addTestStepLog("Anasayfa aciliyor.");
    }

    @When("Ana giris ekraninda hicbir kullanici unvanina tiklamadan sifre giris ekranina erisememelidir")
    public void ana_giris_ekraninda_hicbir_kullanici_unvanina_tiklamadan_sifre_giris_ekranina_erisememelidir() throws InterruptedException {
        anamenu.AnasayfaHeader.click();
        assertEquals("Gasan Üretim Yönetim Sistemi", Driver.getDriver().getTitle());
        anamenu.herhangibiryer.click();
        assertEquals("Gasan Üretim Yönetim Sistemi", Driver.getDriver().getTitle());
    }

    @Then("Talasli Imalat Amiri Butonu gorunur oldugu dogrulanir")
    public void talasli_imalat_amiri_butonu_gorunur_oldugu_dogrulanir() throws InterruptedException {
        action.scrollToElement(anamenu.talasliImalatAmiri).perform();
        Assert.assertTrue(anamenu.talasliImalatAmiri.isDisplayed());
        ExtentCucumberAdapter.addTestStepLog("Talasli Amiri butonu gorunuyor");
    }

    @Then("Talasli Imalat Amiri Butonuna tiklanir")
    public void talasli_imalat_amiri_butonuna_tiklanir() throws InterruptedException {
        action.scrollToElement(anamenu.talasliImalatAmiri).click(anamenu.talasliImalatAmiri).perform();
        ExtentCucumberAdapter.addTestStepLog("Talasli Amiri butonu tiklanabilir");
    }

    @Then("Talasli Imalat Amiri Sifre ekraninda oldugu dogrulanir")
    public void talasliImalatAmiriSifreEkranindaOlduguDogrulanir() {
        String sifreTextActual = "TALAŞLI İMALAT AMİRİ";
        waitForVisibility(anamenu.amirBaslikYazisi,10);
        String sifreTextresult = anamenu.amirBaslikYazisi.getText();
        assertEquals(sifreTextresult, sifreTextActual);
        ExtentCucumberAdapter.addTestStepLog("Talasli Amiri sifre girme ekrani aciliyor");
    }

    @And("Giris yap butonuna tiklanir")
    public void girisYapButonunaTiklanir() throws InterruptedException {
        waitForVisibility(anamenu.girisButonu,10);
        action.click(anamenu.girisButonu).perform();
        ExtentCucumberAdapter.addTestStepLog("Giris butonu tiklanabilir");
    }

    @And("Talasli imalat amiri sifre kutucuguna gecerli bir {string} girilir")
    public void talasliImalatAmiriSifreKutucugunaGecerliBirGirilir(String arg0) {
        anamenu.sifreKutusu.sendKeys(ConfigReader.getProperty("TalasliImalatAmiri"));
    }

    @And("Sifre gizleme butonunun sifreyi gizledigi kontrol edllir")
    public void sifreGizlemeButonununSifreyiGizledigiKontrolEdllir() {
        anamenu.goz.click();
        ExtentCucumberAdapter.addTestStepLog("Sifre gorulebiliyor.");
    }

    @And("Sifre gizleme butonunun sifreyi tekrar gorunur hale getirdigi kontrol edllir")
    public void sifreGizlemeButonununSifreyiTekrarGorunurHaleGetirdigiKontrolEdllir() throws InterruptedException {
        waitForVisibility(anamenu.goz,10);
        anamenu.goz.click();
        ExtentCucumberAdapter.addTestStepLog("Sifre gizlenebiliyor.");
    }

    @Then("Talasli Imalat Amirinin kendi sorumluluk sayfasina gectigi dogrulanir")
    public void talasliImalatAmirininKendiSorumlulukSayfasinaGectigiDogrulanir() {
        waitForVisibility(anamenu.amirBaslikYazisi,10);
        String anasayfa = anamenu.amirBaslikYazisi.getText();
        String talasliHeader = "TALAŞLI İMALAT AMİRİ";
        assertEquals(talasliHeader, anasayfa);
        ExtentCucumberAdapter.addTestStepLog("Talasli imalat Amirinin sayfasina gecebiliyor.");
    }

    @And("sifre kutucuguna gecersiz bir {string} girilir")
    public void sifreKutucugunaGecersizBirGirilir(String arg0) throws InterruptedException {
        waitForVisibility(anamenu.sifreKutusu,10);
        anamenu.sifreKutusu.sendKeys(arg0);
    }

    @Then("uygun hata mesajinin goruntulendigi dogrulanir {string}")
    public void uygunHataMesajininGoruntulendigiDogrulanir(String errorMessage) {
        waitForVisibility(anamenu.ilkGirisHataMesaji,10);
        String actualErrorMessage = anamenu.ilkGirisHataMesaji.getText();
        assertEquals("Beklenen hata mesajı görüntülenmedi", errorMessage, actualErrorMessage);
    }

    @Then("Polisaj amiri butonunun gorunur oldugu dogrulanir")
    public void polisajAmiriButonununGorunurOlduguDogrulanir() throws InterruptedException {
        action.scrollToElement(anamenu.polisajAmiri).perform();
        anamenu.polisajAmiri.isDisplayed();
        ExtentCucumberAdapter.addTestStepLog("Polisaj Amiri Butonu gorulebiliyor");
    }

    @And("Polisaj amiri butonuna tiklanir")
    public void polisajAmiriButonunaTiklanir() throws InterruptedException {
        action.click(anamenu.polisajAmiri).perform();
        ExtentCucumberAdapter.addTestStepLog("Polisaj Amiri Butonu tiklanabiliyor");
    }

    @Then("Polisaj amiri ekraninda oldugu dogrulanir")
    public void polisajAmiriEkranindaOlduguDogrulanir() throws InterruptedException {
        String sifreTextActual = "POLİSAJ AMİRİ";
        waitForVisibility(anamenu.polisajAmiriSifreEkranText,10);
        String sifreTextresult = anamenu.polisajAmiriSifreEkranText.getText();
        assertEquals(sifreTextresult, sifreTextActual);
        ExtentCucumberAdapter.addTestStepLog("Polisaj amirinin sifre giris ekrani aciliyor");
    }

    @And("Polisaj amiri sifre kutucuguna gecerli bir {string} girilir")
    public void polisajAmiriSifreKutucugunaGecerliBirGirilir(String arg0) {
        anamenu.sifreKutusu.sendKeys(ConfigReader.getProperty("PolisajAmiri"));
    }

    @Then("Polisaj amirinin kendi sorumluluk sayfasina gectigi dogrulanir")
    public void polisajAmirininKendiSorumlulukSayfasinaGectigiDogrulanir() {
        waitForVisibility(anamenu.amirBaslikYazisi,10);
        String anasayfa = anamenu.amirBaslikYazisi.getText();
        String polisajHeader = "POLİSAJ AMİRİ";
        assertEquals(polisajHeader, anasayfa);
        ExtentCucumberAdapter.addTestStepLog("Polisaj Amiri kendi sorumluluk sayfasina geciyor");
    }

    @Then("Lift montaj amiri butonunun gorunur oldugu dogrulanir")
    public void liftMontajAmiriButonununGorunurOlduguDogrulanir() throws InterruptedException {
        action.scrollToElement(anamenu.liftmontajAmiri).perform();
        Assert.assertTrue(anamenu.liftmontajAmiri.isDisplayed());
        ExtentCucumberAdapter.addTestStepLog("Lift Montaj Amiri Butonu gorulebiliyor");
    }

    @And("Lift montaj amiri butonuna tiklanir")
    public void liftMontajAmiriButonunaTiklanir() throws InterruptedException {
        action.click(anamenu.liftmontajAmiri).perform();
        ExtentCucumberAdapter.addTestStepLog("Lift Montaj Amiri Butonu tiklanabiliyor");
    }

    @Then("Lift montaj amiri ekraninda oldugu dogrulanir")
    public void liftMontajAmiriEkranindaOlduguDogrulanir() {
        String sifreTextActual = "LİFT MONTAJ AMİRİ";
        waitForVisibility(anamenu.amirBaslikYazisi,10);
        String sifreTextresult = anamenu.amirBaslikYazisi.getText();
        assertEquals(sifreTextresult, sifreTextActual);
        ExtentCucumberAdapter.addTestStepLog("Lift Montaj Amiri sifre giris ekrani aciliyor");
    }

    @And("Lift montaj amiri sifre kutucuguna gecerli bir {string} girilir")
    public void liftMontajAmiriSifreKutucugunaGecerliBirGirilir(String arg0) {
        anamenu.sifreKutusu.sendKeys(ConfigReader.getProperty("LiftMontajAmiri"));
    }

    @Then("Lift montaj amirinin kendi sorumluluk sayfasina gectigi dogrulanir")
    public void liftMontajAmirininKendiSorumlulukSayfasinaGectigiDogrulanir() {
        waitForVisibility(anamenu.amirBaslikYazisi,10);
        String anasayfa = anamenu.amirBaslikYazisi.getText();
        String talasliHeader = "LİFT MONTAJ AMİRİ";
        assertEquals(talasliHeader, anasayfa);
        ExtentCucumberAdapter.addTestStepLog("Lift Montaj Amiri kendi sorumluluk ekrani aciliyor");
    }

    @Then("Bloklift Montaj Amiri butonunun gorunur oldugu dogrulanir")
    public void blokliftMontajAmiriButonununGorunurOlduguDogrulanir() throws InterruptedException {
        action.scrollToElement(anamenu.blokliftMontajAmiri).perform();
        anamenu.blokliftMontajAmiri.isDisplayed();
        ExtentCucumberAdapter.addTestStepLog("BlokLift Montaj Amiri butonu goruluyor");
    }

    @And("Bloklift Montaj Amiri butonuna tiklanir")
    public void blokliftMontajAmiriButonunaTiklanir() throws InterruptedException {
        action.click(anamenu.blokliftMontajAmiri).perform();
        ExtentCucumberAdapter.addTestStepLog("BlokLift Montaj Amiri butonu tiklaniyor");
    }

    @Then("Bloklift Montaj Amiri ekraninda oldugu dogrulanir")
    public void blokliftMontajAmiriEkranindaOlduguDogrulanir() {
        waitForVisibility(anamenu.amirBaslikYazisi,10);
        String sifreTextActual = "BLOKLİFT MONTAJ AMİRİ";
        String sifreTextresult = anamenu.amirBaslikYazisi.getText();
        assertEquals(sifreTextresult, sifreTextActual);
        ExtentCucumberAdapter.addTestStepLog("BlokLift Montaj Amiri sifre giris sayfasi aciliyor");
    }

    @Then("Bloklift Montaj Amirinin kendi sorumluluk sayfasina gectigi dogrulanir")
    public void blokliftMontajAmirininKendiSorumlulukSayfasinaGectigiDogrulanir() {
        waitForVisibility(anamenu.amirBaslikYazisi,10);
        String anasayfa = anamenu.amirBaslikYazisi.getText();
        String blokliftHeader = "BLOKLİFT MONTAJ AMİRİ";
        assertEquals(blokliftHeader, anasayfa);
        ExtentCucumberAdapter.addTestStepLog("BlokLift Montaj Amiri sorumluluk sayfasi aciliyor");
    }

    @And("Bloklift Montaj Amiri sifre kutucuguna gecerli bir {string} girilir")
    public void blokliftMontajAmiriSifreKutucugunaGecerliBirGirilir(String arg0) {
        anamenu.sifreKutusu.sendKeys(ConfigReader.getProperty("BlMontajAmiri"));
    }

    @Then("Boyama ve Paketleme Amiri butonunun gorunur oldugu dogrulanir")
    public void boyamaVePaketlemeAmiriButonununGorunurOlduguDogrulanir() throws InterruptedException {
        action.scrollToElement(anamenu.boyamaVePaketlemeAmiri).perform();
        anamenu.boyamaVePaketlemeAmiri.isDisplayed();
        ExtentCucumberAdapter.addTestStepLog("Boyama ve Paketleme Amiri butonu goruluyor");
    }

    @And("Boyama ve Paketleme Amiri butonuna tiklanir")
    public void boyamaVePaketlemeAmiriButonunaTiklanir() throws InterruptedException {
        action.click(anamenu.boyamaVePaketlemeAmiri).perform();
        ExtentCucumberAdapter.addTestStepLog("Boyama ve Paketleme Amiri butonu tiklanabiliyor");
    }

    @And("Boyama ve Paketleme Amiri sifre kutucuguna gecerli bir {string} girilir")
    public void boyamaVePaketlemeAmiriSifreKutucugunaGecerliBirGirilir(String arg0) {
        anamenu.sifreKutusu.sendKeys(ConfigReader.getProperty("BoyamaPaketlemeAmiri"));
    }

    @Then("Boyama ve Paketleme Amiri ekraninda oldugu dogrulanir")
    public void boyamaVePaketlemeAmiriEkranindaOlduguDogrulanir() {
        String sifreTextActual = "BOYAMA VE PAKETLEME AMİRİ";
        waitForVisibility(anamenu.amirBaslikYazisi,10);
        String sifreTextresult = anamenu.amirBaslikYazisi.getText();
        assertEquals(sifreTextresult, sifreTextActual);
        ExtentCucumberAdapter.addTestStepLog("Boyama ve Paketleme Amiri sifre giris sayfasi aciliyor");
    }

    @Then("Boyama ve Paketleme Amirinin kendi sorumluluk sayfasina gectigi dogrulanir")
    public void boyamaVePaketlemeAmirininKendiSorumlulukSayfasinaGectigiDogrulanir() {
        waitForVisibility(anamenu.amirBaslikYazisi,10);
        String anasayfa = anamenu.amirBaslikYazisi.getText();
        String blokliftHeader = "BOYAMA VE PAKETLEME AMİRİ";
        assertEquals(blokliftHeader, anasayfa);
        ExtentCucumberAdapter.addTestStepLog("Boyama ve Paketleme Amiri kendi sorumluluk sayfasi aciliyor");
    }

    @Then("Kalite Kontrol butonunun gorunur oldugu dogrulanir")
    public void kaliteKontrolButonununGorunurOlduguDogrulanir() throws InterruptedException {
        action.scrollToElement(anamenu.kaliteKontrolAmiri).perform();
        anamenu.kaliteKontrolAmiri.isDisplayed();
        ExtentCucumberAdapter.addTestStepLog("kalite kontrol Amiri butonu goruluyor");
    }

    @And("Kalite Kontrol butonuna tiklanir")
    public void kaliteKontrolButonunaTiklanir() throws InterruptedException {
        action.click(anamenu.kaliteKontrolAmiri).perform();
        ExtentCucumberAdapter.addTestStepLog("kalite kontrol Amiri butonu tiklaniyor");
    }

    @Then("Kalite Kontrol ekraninda oldugu dogrulanir")
    public void kaliteKontrolEkranindaOlduguDogrulanir() {
        String sifreTextActual = "KALİTE KONTROL AMİRİ";
        waitForVisibility(anamenu.amirBaslikYazisi,10);
        String sifreTextresult = anamenu.amirBaslikYazisi.getText();
        assertEquals(sifreTextresult, sifreTextActual);
        ExtentCucumberAdapter.addTestStepLog("kalite kontrol Amiri sifre giris sayfasi aciliyor");
    }

    @Then("Kalite Kontrol sayfasina gectigi dogrulanir")
    public void kaliteKontrolSayfasinaGectigiDogrulanir() {
        waitForVisibility(anamenu.amirBaslikYazisi,10);
        String anasayfa = anamenu.amirBaslikYazisi.getText();
        String blokliftHeader = "KALİTE KONTROL AMİRİ";
        assertEquals(blokliftHeader, anasayfa);
        ExtentCucumberAdapter.addTestStepLog("kalite kontrol Amiri kendi sorumluluk sayfasi aciliyor");
    }

    @And("Kalite Kontrol sifre kutucuguna gecerli bir {string} girilir")
    public void kaliteKontrolSifreKutucugunaGecerliBirGirilir(String arg0) {
        anamenu.sifreKutusu.sendKeys(ConfigReader.getProperty("KaliteKontrol"));
    }

    @Then("Uretim Planlama butonunun gorunur oldugu dogrulanir")
    public void uretimPlanlamaButonununGorunurOlduguDogrulanir() throws InterruptedException {
        action.scrollToElement(anamenu.menulinkleri.get(6)).perform();
        anamenu.uretimPlanlama.isDisplayed();
    }

    @And("Uretim Planlama butonuna tiklanir")
    public void uretimPlanlamaButonunaTiklanir() throws InterruptedException {
        clickWithJS(anamenu.menulinkleri.get(6));
    }

    @Then("Uretim Planlama ekraninda oldugu dogrulanir")
    public void uretimPlanlamaEkranindaOlduguDogrulanir() {
        String sifreTextActual = "ÜRETİM PLANLAMA";
        waitForVisibility(anamenu.amirBaslikYazisi,10);
        String sifreTextresult = anamenu.amirBaslikYazisi.getText();
        assertEquals(sifreTextresult, sifreTextActual);
    }

    @Then("Uretim Planlama sayfasina gectigi dogrulanir")
    public void uretimPlanlamaSayfasinaGectigiDogrulanir() {
        waitForVisibility(anamenu.amirBaslikYazisi,10);
        String anasayfa = anamenu.amirBaslikYazisi.getText();
        String blokliftHeader = "ÜRETİM PLANLAMA";
        assertEquals(blokliftHeader, anasayfa);
    }

    @And("Uretim Planlama sifre kutucuguna gecerli bir {string} girilir")
    public void uretimPlanlamaSifreKutucugunaGecerliBirGirilir(String arg0) {
        anamenu.sifreKutusu.sendKeys(ConfigReader.getProperty("UretimPlanlama"));
    }

    @Then("Yonetim butonunun gorunur oldugu dogrulanir")
    public void yonetimButonununGorunurOlduguDogrulanir() throws InterruptedException {
        action.scrollToElement(anamenu.menulinkleri.get(7)).perform();
        anamenu.yonetim.isDisplayed();
        ExtentCucumberAdapter.addTestStepLog("Yonetim butonu gorulebiliyor");
    }

    @And("Yonetim butonuna tiklanir")
    public void yonetimButonunaTiklanir() throws InterruptedException {
        clickWithJS(anamenu.menulinkleri.get(7));
    }

    @And("yonetici sifre kutucuguna gecerli bir {string} girilir")
    public void yoneticiSifreKutucugunaGecerliBirGirilir(String arg0) {
        anamenu.sifreKutusu.sendKeys(ConfigReader.getProperty("yonetici"));
    }

    @And("Yonetici Sifre gizleme butonunun sifreyi gizledigi kontrol edllir")
    public void yoneticiSifreGizlemeButonununSifreyiGizledigiKontrolEdllir() throws InterruptedException {
        waitForVisibility(anamenu.yoneticiGoz,10);
        anamenu.yoneticiGoz.click();
    }

    @And("Yonetici Sifre gizleme butonunun sifreyi tekrar gorunur hale getirdigi kontrol edllir")
    public void yoneticiSifreGizlemeButonununSifreyiTekrarGorunurHaleGetirdigiKontrolEdllir() throws InterruptedException {
        waitForVisibility(anamenu.yoneticiGoz,10);
        anamenu.yoneticiGoz.click();
    }

    @And("yonetim Giris yap butonuna tiklanir")
    public void yonetimGirisYapButonunaTiklanir() throws InterruptedException {
        action.click(anamenu.yonetimGirisButonu).perform();
    }

    @Then("Yonetim Sifre ekraninda oldugu dogrulanir")
    public void yonetimSifreEkranindaOlduguDogrulanir() throws InterruptedException {
        String sifreTextActual = "YÖNETİM";
        waitForVisibility(anamenu.amirBaslikYazisi,30);
        String anasayfa = anamenu.amirBaslikYazisi.getText();
        assertEquals(anasayfa, sifreTextActual);
    }

    @And("yonetici sifre kutucuguna gecersiz bir {string} girilir")
    public void yoneticiSifreKutucugunaGecersizBirGirilir(String arg0) throws InterruptedException {
        anamenu.sifreKutusu.sendKeys(arg0);
    }

    @Then("yonetim sayfasina gectigi dogrulanir")
    public void yonetimSayfasinaGectigiDogrulanir() {
        String anasayfa = anamenu.amirBaslikYazisi.getText();
        waitForVisibility(anamenu.amirBaslikYazisi,10);
        String yonetimHeader = "YÖNETİM";
        assertEquals(yonetimHeader, anasayfa);
        ExtentCucumberAdapter.addTestStepLog("Yonetim sayfasini acabiliyor");
    }

    @And("Kullanici logout yapar")
    public void kullaniciLogoutYapar() throws InterruptedException {
        waitForVisibility(anamenu.logout,30);
        clickWithJS(anamenu.logout);
        ExtentCucumberAdapter.addTestStepLog("cikis yapilabiliyor");
    }

    @And("yonetici kullaniciya sifre atama butonuna tiklar")
    public void yoneticiKullaniciyaSifreAtamaButonunaTiklar() throws InterruptedException {
        anamenu.kullaniciyaSifreAtama.click();
    }

    @And("yonetici kullaniciya sifre atama ekranina gectigini dogrular")
    public void yoneticiKullaniciyaSifreAtamaEkraninaGectiginiDogrular() throws InterruptedException {
        String sifreTextActual = "Return backŞIFRE ATAMA EKRANI Logout";
        waitForVisibility(anamenu.sifreAtamaEkraniText,10);
        String sifreTextresult = anamenu.sifreAtamaEkraniText.getText();
        assertEquals(sifreTextresult, sifreTextActual);
    }

    @And("yonetici return back butonuna tiklar")
    public void yoneticiReturnBackButonunaTiklar() throws InterruptedException {
        waitForVisibility(anamenu.returnback,10);
        anamenu.returnback.click();
        waitForVisibility(anamenu.kullaniciyaSifreAtama,10);
        anamenu.kullaniciyaSifreAtama.click();
    }

    @And("yonetici guncelle butonunu tiklar")
    public void yoneticiGuncelleButonunuTiklar() throws InterruptedException {
        waitForVisibility(anamenu.girisButonu,10);
        anamenu.girisButonu.click();
        ExtentCucumberAdapter.addTestStepLog("Yonetim sifre guncelleyebiliyor");
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
            waitFor(1000);

            // Yeni şifreyi girme
            anamenu.passwordInput.clear();
            anamenu.passwordInput.sendKeys(newPassword);

            anamenu.sifreAtamaEkraniGoz.click();
            waitFor(1000);
            anamenu.sifreAtamaEkraniGoz.click();
            waitFor(1000);

            anamenu.sifreAtamaEkraniTik.isDisplayed();

            // "Güncelle" butonuna tıklama
            anamenu.guncelle.click();
            waitFor(1000);

            //"guncellendi popup"
            anamenu.sifreGuncellendiText.isDisplayed();
            waitFor(1000);
            anamenu.guncellemaPopupOk.click();
            waitFor(1000);
            anamenu.kullaniciyaSifreAtama.click();
        }
    }
}

