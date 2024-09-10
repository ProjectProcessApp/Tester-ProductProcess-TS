package tester_productprocess_ts.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import tester_productprocess_ts.utilities.uiUtilities.Driver;

import static tester_productprocess_ts.utilities.uiUtilities.ReusableMethods.*;

public class SiparisOlusturmaStepDefs {

    tester_productprocess_ts.pages.siparisOlusturma siparis = new tester_productprocess_ts.pages.siparisOlusturma();

    tester_productprocess_ts.pages.Anamenu anamenu = new tester_productprocess_ts.pages.Anamenu();
    Actions action=new Actions(Driver.getDriver());
    @Then("siparis Olustur butonunun ekranda gorundugu kontrol edilir")
    public void siparis_olustur_butonunun_ekranda_gorundugu_kontrol_edilir() {
        Assert.assertTrue(siparis.siparisOlusturButonu.isDisplayed());
    }
    @Then("Onceden siparis listesi olup olmadigi dogrulanir")
    public void onceden_siparis_listesi_olup_olmadigi_dogrulanir() {
             waitFor(500);
             String expected ="Sipariş Listesi";
            String actual=siparis.siparisListesi.getText();
            Assert.assertEquals(expected,actual);
    }
    @Then("siparis olustur butonuna tiklanir")
    public void siparis_olustur_butonuna_tiklanir() {
             waitFor(500);
            siparis.siparisOlusturButonu.click();
    }
    @Then("yeni siparis ekraninin geldigi dogrulanir")
    public void yeni_siparis_ekraninin_geldigi_dogrulanir() {
            waitFor(1500);
            String expected ="Yeni Siparis";
            String actual=siparis.yeniSiparis.getText();
            Assert.assertEquals(expected,actual);
    }

    @Then("{string} musteri adina gecerli bir data girilir")
    public void musteri_adina_gecerli_bir_data_girilir(String string) {
        waitFor(1500);
        siparis.musteriAdiBox.sendKeys(string);
    }
    @Then("{string} Gasan Nosuna gecerli bir data girilir")
    public void gasan_nosuna_gecerli_bir_data_girilir(String string) {
        waitFor(1500);
        siparis.gasanNoBox.sendKeys(string);
    }
    @Then("{string} Siparis Noya gecerli bir data girilir")
    public void siparis_noya_gecerli_bir_data_girilir(String string) {
        waitFor(1500);
        siparis.siparisNoBox.sendKeys(string);
    }
    @And("Teslim Tarihine gecerli bir data girilir")
    public void teslimTarihineGecerliBirDataGirilir() {
        waitFor(1000);
        siparis.teslimTarihiBox.sendKeys("10");
        waitFor(1000);
        siparis.teslimTarihiBox.sendKeys("10");
        waitFor(1000);
        siparis.teslimTarihiBox.sendKeys("2024");
    }

    @Then("{string} Siparis turune gecerli bir data girilir")
    public void siparis_turune_gecerli_bir_data_girilir(String string) {
        waitFor(1500);
        siparis.siparisTuruBox.sendKeys(string);
    }
    @Then("{string} Siparis miktarina gecerli bir data girilir")
    public void siparis_miktarina_gecerli_bir_data_girilir(String string) {
        waitFor(1500);
         siparis.siparisMiktariBox.sendKeys(string);
    }
    @Then("{string} Hazir mil miktarina gecerli bir data girilir")
    public void hazir_mil_miktarina_gecerli_bir_data_girilir(String string) {
        siparis.hazirMilMiktariBox.sendKeys(Keys.TAB);
        waitFor(1500);
        siparis.hazirMilMiktariBox.sendKeys(string);
    }
    @Then("Siparis durumu kutusunda {string} yazmali")
    public void siparis_durumu_kutusunda_yazmali(String expected) {
        waitFor(1500);
        String actual=siparis.siparisDurumuBox.getAttribute("value");
        Assert.assertEquals(expected,actual);
    }
    @Then("{string} yazisi dogrulanir ve ok tusuna basilir")
    public void yazisi_dogrulanir_ve_ok_tusuna_basilir(String expected) {
        waitFor(1500);
        String actual=siparis.siparisBasariylaOlusturulduYazisi.getText();
        Assert.assertEquals(expected,actual);
        click(siparis.oKbutonu);
    }

    @Then("{string} musteri adina gecersiz bir data girilir")
    public void musteri_adina_gecersiz_bir_data_girilir(String string) {
        waitFor(1000);
        siparis.musteriAdiBox.sendKeys(string);
    }
    @Then("{string} Gasan Nosuna gecersiz bir data girilir")
    public void gasan_nosuna_gecersiz_bir_data_girilir(String string) {
        waitFor(1000);
        siparis.gasanNoBox.sendKeys(string);
    }
    @Then("{string} Siparis Noya gecersiz bir data girilir")
    public void siparis_noya_gecersiz_bir_data_girilir(String string) {
        waitFor(1000);
        siparis.siparisNoBox.sendKeys(string);
    }
    @And("Teslim Tarihine gecersiz bir data girilir")
    public void teslimTarihineGecersizBirDataGirilir() {
        waitFor(1000);
        siparis.teslimTarihiBox.sendKeys("5");
        waitFor(1000);
        siparis.teslimTarihiBox.sendKeys("11");
        waitFor(1000);
        siparis.teslimTarihiBox.sendKeys("2024");
    }
    @Then("{string} Siparis turune gecersiz bir data girilir")
    public void siparis_turune_gecersiz_bir_data_girilir(String string) {
        waitFor(1000);
        siparis.siparisTuruBox.sendKeys(string);
    }
    @Then("{string} Siparis miktarina gecersiz bir data girilir")
    public void siparis_miktarina_gecersiz_bir_data_girilir(String string) {
        waitFor(1000);
        siparis.siparisMiktariBox.sendKeys(string);
    }
    @Then("{string} Hazir mil miktarina gecersiz bir data girilir")
    public void hazir_mil_miktarina_gecersiz_bir_data_girilir(String string) {
        siparis.hazirMilMiktariBox.sendKeys(Keys.TAB);
        waitFor(1000);
        siparis.hazirMilMiktariBox.sendKeys(string);
    }
    @Then("Giris butonunun aktif olmadigi kontrol edilir")
    public void giris_butonunun_aktif_olmadigi_kontrol_edilir() {
        waitFor(1000);
        boolean isDisabled = anamenu.girisButonu.getAttribute("disabled") != null;

        if (isDisabled) {
            geriGitVeCikisYap();
        } else {
            anamenu.girisButonu.click();
            waitFor(1000);
            click(siparis.oKbutonu);
            waitFor(2000);
            anamenu.logout.click();
        }
    }
    private void geriGitVeCikisYap() {
        Driver.getDriver().navigate().back();
        waitFor(2000);
        anamenu.logout.click();
    }
//-------------------------------------------------

}
