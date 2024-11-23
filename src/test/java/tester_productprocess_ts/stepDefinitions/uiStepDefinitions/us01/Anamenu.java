package tester_productprocess_ts.stepDefinitions.uiStepDefinitions.us01;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import tester_productprocess_ts.utilities.uiUtilities.ConfigReader;
import tester_productprocess_ts.utilities.uiUtilities.Driver;

import java.io.FileInputStream;
import java.io.IOException;
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
        waitForVisibility(anamenu.AnasayfaHeader,10);
        String anasayfaHeaderText = anamenu.AnasayfaHeader.getText();
        String Header = "ANA SAYFA";
        assertEquals(header, anasayfaHeaderText);

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
        waitForVisibility(anamenu.talasliImalatAmiri,10);
        Assert.assertTrue(anamenu.talasliImalatAmiri.isDisplayed());
    }

    @Then("Talasli Imalat Amiri Butonuna tiklanir")
    public void talasli_imalat_amiri_butonuna_tiklanir() throws InterruptedException {
        clickWithJS(anamenu.talasliImalatAmiri);
    }

    @Then("Talasli Imalat Amiri Sifre ekraninda oldugu dogrulanir")
    public void talasliImalatAmiriSifreEkranindaOlduguDogrulanir() {
        String sifreTextActual = "TALAŞLI İMALAT AMİRİ";
       waitForVisibility(anamenu.amirBaslikYazisi,10);
        String sifreTextresult = anamenu.amirBaslikYazisi.getText();
        assertEquals(sifreTextActual,sifreTextresult );
    }

    @And("Giris yap butonuna tiklanir")
    public void girisYapButonunaTiklanir() throws InterruptedException {
        waitForVisibility(anamenu.girisButonu,10);
        clickWithJS(anamenu.girisButonu);
        waitFor(1000);
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
        waitForVisibility(anamenu.goz,10);
        anamenu.goz.click();
    }

    @Then("Talasli Imalat Amirinin kendi sorumluluk sayfasina gectigi dogrulanir")
    public void talasliImalatAmirininKendiSorumlulukSayfasinaGectigiDogrulanir() {
        waitFor(1000);
        String anasayfa = anamenu.amirHeader.getText();
        String talasliHeader = "TALAŞLI İMALAT AMİRİ";
        assertEquals(talasliHeader, anasayfa);
    }

    @And("sifre kutucuguna gecersiz bir {string} girilir")
    public void sifreKutucugunaGecersizBirGirilir(String arg0) throws InterruptedException {
        waitFor(1000);
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
        waitForVisibility(anamenu.polisajAmiri,10);
        anamenu.polisajAmiri.isDisplayed();
    }

    @And("Polisaj amiri butonuna tiklanir")
    public void polisajAmiriButonunaTiklanir() throws InterruptedException {
        waitFor(500);
        waitForVisibility(anamenu.polisajAmiri,10);
        clickWithJS(anamenu.polisajAmiri);
    }

    @Then("Polisaj amiri ekraninda oldugu dogrulanir")
    public void polisajAmiriEkranindaOlduguDogrulanir() throws InterruptedException {
        String sifreTextActual = "POLİSAJ AMİRİ";
        waitFor(1000);
        waitForVisibility(anamenu.polisajAmiriSifreEkranText,10);
        String sifreTextresult = anamenu.polisajAmiriSifreEkranText.getText();
        assertEquals(sifreTextresult, sifreTextActual);
    }

    @And("Polisaj amiri sifre kutucuguna gecerli bir {string} girilir")
    public void polisajAmiriSifreKutucugunaGecerliBirGirilir(String arg0) {
     waitForVisibility(anamenu.sifreKutusu,10);
        anamenu.sifreKutusu.sendKeys(ConfigReader.getProperty("PolisajAmiri"));
    }

    @Then("Polisaj amirinin kendi sorumluluk sayfasina gectigi dogrulanir")
    public void polisajAmirininKendiSorumlulukSayfasinaGectigiDogrulanir() {
        waitFor(1000);
        String anasayfa = anamenu.amirHeader.getText();
        String polisajHeader = "POLİSAJ AMİRİ";
        assertEquals(polisajHeader, anasayfa);
    }

    @Then("Lift montaj amiri butonunun gorunur oldugu dogrulanir")
    public void liftMontajAmiriButonununGorunurOlduguDogrulanir() throws InterruptedException {
        waitFor(500);
      waitForVisibility(anamenu.liftmontajAmiri,10);
        Assert.assertTrue(anamenu.liftmontajAmiri.isDisplayed());
    }

    @And("Lift montaj amiri butonuna tiklanir")
    public void liftMontajAmiriButonunaTiklanir() throws InterruptedException {
        waitFor(500);
        clickWithJS(anamenu.liftmontajAmiri);
    }

    @Then("Lift montaj amiri ekraninda oldugu dogrulanir")
    public void liftMontajAmiriEkranindaOlduguDogrulanir() {
        String sifreTextActual = "LİFT MONTAJ AMİRİ";
        waitForVisibility(anamenu.amirBaslikYazisi,10);
        String sifreTextresult = anamenu.amirBaslikYazisi.getText();
        assertEquals(sifreTextresult, sifreTextActual);
    }

    @And("Lift montaj amiri sifre kutucuguna gecerli bir {string} girilir")
    public void liftMontajAmiriSifreKutucugunaGecerliBirGirilir(String arg0) {
        anamenu.sifreKutusu.sendKeys(ConfigReader.getProperty("LiftMontajAmiri"));
    }

    @Then("Lift montaj amirinin kendi sorumluluk sayfasina gectigi dogrulanir")
    public void liftMontajAmirininKendiSorumlulukSayfasinaGectigiDogrulanir() {
        waitForVisibility(anamenu.amirHeader,10);
        String anasayfa = anamenu.amirHeader.getText();
        String talasliHeader = "LİFT MONTAJ AMİRİ";
        assertEquals(talasliHeader, anasayfa);
    }

    @Then("Bloklift Montaj Amiri butonunun gorunur oldugu dogrulanir")
    public void blokliftMontajAmiriButonununGorunurOlduguDogrulanir() throws InterruptedException {
        waitForVisibility(anamenu.blokliftMontajAmiri,10);
        anamenu.blokliftMontajAmiri.isDisplayed();
    }

    @And("Bloklift Montaj Amiri butonuna tiklanir")
    public void blokliftMontajAmiriButonunaTiklanir() throws InterruptedException {
        action.click(anamenu.blokliftMontajAmiri).perform();
    }

    @Then("Bloklift Montaj Amiri ekraninda oldugu dogrulanir")
    public void blokliftMontajAmiriEkranindaOlduguDogrulanir() {
        String sifreTextActual = "BLOKLİFT MONTAJ AMİRİ";
        waitFor(500);
        String sifreTextresult = anamenu.amirBaslikYazisi.getText();
        assertEquals(sifreTextresult, sifreTextActual);
    }

    @Then("Bloklift Montaj Amirinin kendi sorumluluk sayfasina gectigi dogrulanir")
    public void blokliftMontajAmirininKendiSorumlulukSayfasinaGectigiDogrulanir() {
        String anasayfa = anamenu.AnasayfaHeader.getText();
        String blokliftHeader = "BLOK LİFT AMİRİ";
        assertEquals(blokliftHeader, anasayfa);
    }

    @And("Bloklift Montaj Amiri sifre kutucuguna gecerli bir {string} girilir")
    public void blokliftMontajAmiriSifreKutucugunaGecerliBirGirilir(String arg0) {
        anamenu.sifreKutusu.sendKeys(ConfigReader.getProperty("BlMontajAmiri"));
    }

    @Then("Boyama ve Paketleme Amiri butonunun gorunur oldugu dogrulanir")
    public void boyamaVePaketlemeAmiriButonununGorunurOlduguDogrulanir() throws InterruptedException {
        waitFor(500);
        action.scrollToElement(anamenu.boyamaVePaketlemeAmiri).perform();
        anamenu.boyamaVePaketlemeAmiri.isDisplayed();
    }

    @And("Boyama ve Paketleme Amiri butonuna tiklanir")
    public void boyamaVePaketlemeAmiriButonunaTiklanir() throws InterruptedException {
        action.click(anamenu.boyamaVePaketlemeAmiri).perform();
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
    }

    @Then("Boyama ve Paketleme Amirinin kendi sorumluluk sayfasina gectigi dogrulanir")
    public void boyamaVePaketlemeAmirininKendiSorumlulukSayfasinaGectigiDogrulanir() {
        waitForVisibility(anamenu.amirHeader,10);
        String anasayfa = anamenu.amirHeader.getText();
        String blokliftHeader = "BOYA VE PAKETLEME AMİRİ";
        assertEquals(blokliftHeader, anasayfa);
    }

    @Then("Kalite Kontrol butonunun gorunur oldugu dogrulanir")
    public void kaliteKontrolButonununGorunurOlduguDogrulanir() throws InterruptedException {
        action.scrollToElement(anamenu.kaliteKontrolAmiri).perform();
        anamenu.kaliteKontrolAmiri.isDisplayed();
    }

    @And("Kalite Kontrol butonuna tiklanir")
    public void kaliteKontrolButonunaTiklanir() throws InterruptedException {
        waitFor(500);
        action.click(anamenu.kaliteKontrolAmiri).perform();
    }

    @Then("Kalite Kontrol ekraninda oldugu dogrulanir")
    public void kaliteKontrolEkranindaOlduguDogrulanir() {
        String sifreTextActual = "KALİTE KONTROL AMİRİ";
        waitForVisibility(anamenu.amirBaslikYazisi,10);
        String sifreTextresult = anamenu.amirBaslikYazisi.getText();
        assertEquals(sifreTextresult, sifreTextActual);
    }

    @Then("Kalite Kontrol sayfasina gectigi dogrulanir")
    public void kaliteKontrolSayfasinaGectigiDogrulanir() {
        waitForVisibility(anamenu.amirHeader,10);
        String anasayfa = anamenu.amirHeader.getText();
        String blokliftHeader = "KALİTE KONTROL AMİRİ";
        assertEquals(blokliftHeader, anasayfa);
    }

    @And("Kalite Kontrol sifre kutucuguna gecerli bir {string} girilir")
    public void kaliteKontrolSifreKutucugunaGecerliBirGirilir(String arg0) {
        anamenu.sifreKutusu.sendKeys(ConfigReader.getProperty("KaliteKontrol"));
    }

    @Then("Uretim Planlama butonunun gorunur oldugu dogrulanir")
    public void uretimPlanlamaButonununGorunurOlduguDogrulanir() throws InterruptedException {
        waitFor(500);
        action.scrollToElement(anamenu.uretimPlanlama).perform();
        anamenu.uretimPlanlama.isDisplayed();
    }

    @And("Uretim Planlama butonuna tiklanir")
    public void uretimPlanlamaButonunaTiklanir() throws InterruptedException {
        waitFor(500);
        clickWithJS(anamenu.uretimPlanlama);
    }

    @Then("Uretim Planlama ekraninda oldugu dogrulanir")
    public void uretimPlanlamaEkranindaOlduguDogrulanir() {
        waitFor(1000);
        String sifreTextActual = "ÜRETİM PLANLAMA";
        String sifreTextresult = anamenu.amirBaslikYazisi.getText();
        assertEquals(sifreTextresult, sifreTextActual);
    }

    @Then("Uretim Planlama sayfasina gectigi dogrulanir")
    public void uretimPlanlamaSayfasinaGectigiDogrulanir() {
        waitForVisibility(anamenu.amirHeader,10);
        String anasayfa = anamenu.amirHeader.getText();
        String blokliftHeader = "ÜRETİM PLANLAMA";
        assertEquals(blokliftHeader, anasayfa);
    }

    @And("Uretim Planlama sifre kutucuguna gecerli bir {string} girilir")
    public void uretimPlanlamaSifreKutucugunaGecerliBirGirilir(String arg0) {
        anamenu.sifreKutusu.sendKeys(ConfigReader.getProperty("UretimPlanlama"));
    }

    @Then("Yonetim butonunun gorunur oldugu dogrulanir")
    public void yonetimButonununGorunurOlduguDogrulanir() throws InterruptedException {
        action.scrollToElement(anamenu.yonetim).perform();
        anamenu.yonetim.isDisplayed();
    }

    @And("Yonetim butonuna tiklanir")
    public void yonetimButonunaTiklanir() throws InterruptedException {
        clickWithJS(anamenu.yonetim);
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
        String anasayfa = anamenu.amirHeader.getText();
        waitFor(1000);
        String yonetimHeader = "GİRİŞ";
        assertEquals(yonetimHeader, anasayfa);
    }

    @And("Kullanici logout yapar")
    public void kullaniciLogoutYapar() throws InterruptedException {
         waitFor(750);
        clickWithJS(anamenu.logout);
        waitFor(1000);
    }

    @And("yonetici kullaniciya sifre atama butonuna tiklar")
    public void yoneticiKullaniciyaSifreAtamaButonunaTiklar() throws InterruptedException {
        anamenu.kullaniciyaSifreAtama.click();
    }

    @And("yonetici kullaniciya sifre atama ekranina gectigini dogrular")
    public void yoneticiKullaniciyaSifreAtamaEkraninaGectiginiDogrular() throws InterruptedException {
        String sifreTextActual = "ŞİFRE ATAMA EKRANI";
        waitForVisibility(anamenu.sifreAtamaEkraniText,10);
        String sifreTextresult = anamenu.sifreAtamaEkraniText.getText();
        assertEquals(sifreTextresult, sifreTextActual);
    }

    @And("yonetici return back butonuna tiklar")
    public void yoneticiReturnBackButonunaTiklar() throws InterruptedException {
        waitForVisibility(anamenu.returnback,10);
        anamenu.returnback.click();
        waitFor(500);
        anamenu.kullaniciyaSifreAtama.click();
    }

    @And("yonetici guncelle butonunu tiklar")
    public void yoneticiGuncelleButonunuTiklar() throws InterruptedException {
        waitForVisibility(anamenu.girisButonu,10);
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
            anamenu.kullaniciyaSifreAtama.click();
        }
    }

    @Then("siparis durumu tamamlanmis siparislerin gozukmedigi dogrulanir")
    public void siparisDurumuTamamlanmisSiparislerinGozukmedigiDogrulanir() {
        for (WebElement durum : anamenu.talasliAmirdurumSutunu) {
            String durumText = durum.getText();
            Assert.assertFalse(durumText.contains("Tamamlandı"));
        }
    }

    @Then("Paslanmaz siparis turu listelenmedigi dogrulanir")
    public void paslanmazSiparisTuruListelenmedigiDogrulanir() {
        for (WebElement durum : anamenu.polisajAmirSiparisTuruSutunu) {
            String durumText = durum.getText();
            Assert.assertFalse(durumText.contains("PASLANMAZ"));
        }
    }

    @Then("Bloklift ve Damper siparis turlerinin listelenmedigi dogrulanir")
    public void blokliftVeDamperSiparisTurlerininListelenmedigiDogrulanir() {
        for (WebElement durum : anamenu.liftMontajAmirSiparisTuruSutunu) {
            String durumText = durum.getText();
            Assert.assertFalse(durumText.contains("BLOKLIFT"));
            Assert.assertFalse(durumText.contains("DAMPER"));
        }
    }

    @Then("lift ve Paslanmaz siparis turlerinin listelenmedigi dogrulanir")
    public void liftVePaslanmazSiparisTurlerininListelenmedigiDogrulanir() {
        for (WebElement durum : anamenu.liftMontajAmirSiparisTuruSutunu) {
            String durumText = durum.getText();
            Assert.assertNotEquals("LIFT", durumText);
            Assert.assertFalse(durumText.contains("PASLANMAZ"));
        }
    }

    @Then("her turde siparisin listelendigi dogrulanir")
    public void herTurdeSiparisinListelendigiDogrulanir() {
        for (WebElement durum : anamenu.liftMontajAmirSiparisTuruSutunu) {
            String durumText = durum.getText();
            Assert.assertTrue(durumText.contains("Lift")||durumText.contains("Paslanmaz")||durumText.contains("Damper")||durumText.contains("Blok Lift"));
        }
    }
}

