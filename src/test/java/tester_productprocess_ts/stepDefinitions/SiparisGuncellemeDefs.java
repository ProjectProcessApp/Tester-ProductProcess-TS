package tester_productprocess_ts.stepDefinitions;

import io.cucumber.java.en.And;
import org.junit.Assert;
import tester_productprocess_ts.pages.siparisGuncelleme;

import static tester_productprocess_ts.utilities.uiUtilities.ReusableMethods.click;
import static tester_productprocess_ts.utilities.uiUtilities.ReusableMethods.clickWithJS;

public class SiparisGuncellemeDefs {

    siparisGuncelleme siparis = new siparisGuncelleme();
    Anamenu anamenu = new Anamenu();

    @And("Guncelleme butonuna tiklanir")
    public void guncellemeButonunaTiklanir() {

        clickWithJS(siparis.girisButonu);
    }

    @And("siparis guncelle yazisinin ekranda gorundugu kontrol edilir")
    public void siparisGuncelleYazisininEkrandaGorunduguKontrolEdilir() {

    }

    @And("Musteri Adi kutucugundaki data silinir")
    public void musteriAdiKutucugundakiDataSilinir1() {
        siparis.musteriAdiBox.clear();
    }


    @And("{string} butonuna tiklanir")
    public void butonunaTiklanir(String arg0) {
    }

    @And("{string} ekranininda oldugu dogrulanir")
    public void ekraninindaOlduguDogrulanir(String arg0) {
    }

    @And("Musteri Adi Kutucugundaki data silinir")
    public void musteriAdiKutucugundakiDataSilinir() {

        siparis.musteriAdiBox.clear();
    }

    @And("{string} kutucugundaki data silinir")
    public void kutucugundakiDataSilinir(String arg0) {
    }

    @And("musteri adi musteri adina gecerli bir data girilir")
    public void musteriAdiMusteriAdinaGecerliBirDataGirilir() {

        siparis.musteriAdiBox.sendKeys("Mercedes");
    }

    @And("Gasan No kutucugundaki data silinir")
    public void gasanNoKutucugundakiDataSilinir() {
        siparis.gasanNoBox.clear();
    }

    @And("Gasan No Gasan Nosuna gecerli bir data girilir")
    public void gasanNoGasanNosunaGecerliBirDataGirilir() {

        siparis.gasanNoBox.sendKeys("1122 AB 112233");
    }

    @And("Soparis No kutucugundaki data silinir")
    public void soparisNoKutucugundakiDataSilinir() {

        siparis.siparisNoBox.clear();
    }

    @And("<Siparis No Siparis Noya gecerli bir data girilir")
    public void siparisNoSiparisNoyaGecerliBirDataGirilir() {

        siparis.siparisNoBox.sendKeys("998877");
    }

    @And("Siparis Turu kutucugundaki data silinir")
    public void siparisTuruKutucugundakiDataSilinir() {

        siparis.siparisTuruBox.clear();
    }

    @And("Siparis turu Siparis turune gecerli bir data girilir")
    public void siparisTuruSiparisTuruneGecerliBirDataGirilir() {

        siparis.siparisTuruBox.sendKeys("Lift");
    }

    @And("siparis Miktari kutucugundaki data silinir")
    public void siparisMiktariKutucugundakiDataSilinir() {

        siparis.siparisMiktariBox.clear();
    }

    @And("Siparis miktari Siparis miktarina gecerli bir data girilir")
    public void siparisMiktariSiparisMiktarinaGecerliBirDataGirilir() {
        siparis.siparisMiktariBox.sendKeys("100");
    }

    @And("Hazir Mil Miktari kutucugundaki data silinir")
    public void hazirMilMiktariKutucugundakiDataSilinir() {

        siparis.hazirMilMiktariBox.clear();
    }

    @And("Hazir mil miktari Hazir mil miktarina gecerli bir data girilir")
    public void hazirMilMiktariHazirMilMiktarinaGecerliBirDataGirilir() {
        siparis.hazirMilMiktariBox.sendKeys("0");
    }

    @And("Siparis durumu kutusunda İşlenmeyi Bekliyor yazmali")
    public void siparisDurumuKutusundaİşlenmeyiBekliyorYazmali() {
        String expected = siparis.siparisDurumuBox.getAttribute("islenmeyi bekliyor");
        String actual=siparis.siparisDurumuBox.getAttribute("value");
        Assert.assertEquals(expected,actual);;


    }
    @And("Sipariş başarıyla guncellendi yazisi dogrulanir ve ok tusuna basilir")
    public void siparişBaşarıylaGuncellendiYazisiDogrulanirVeOkTusunaBasilir() {

        click(siparis.oKbutonu);
        assert siparis.siparisBasariylaOlusturulduYazisi.isDisplayed();
        click(siparis.oKbutonu);
    }
}
