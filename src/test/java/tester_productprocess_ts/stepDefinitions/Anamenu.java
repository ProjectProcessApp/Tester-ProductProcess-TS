package tester_productprocess_ts.stepDefinitions;

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

    @Then("Sifre gizleme butonunun sifreyi gizledigi kontrol edllir")
    public void sifre_gizleme_butonunun_sifreyi_gizledigi_kontrol_edllir() {

    }
    @Then("Sifre gizleme butonunun sifreyi tekrar gorunur hale getirdigi kontrol edllir")
    public void sifre_gizleme_butonunun_sifreyi_tekrar_gorunur_hale_getirdigi_kontrol_edllir() {

    }
    @Then("Giris yap butonuna tiklanir")
    public void giris_yap_butonuna_tiklanir() {

    }

    @Then("Kullanicinin kendi sorumluluk sayfasina gectigi dogrulanir")
    public void kullanicinin_kendi_sorumluluk_sayfasina_gectigi_dogrulanir() {

    }

}
