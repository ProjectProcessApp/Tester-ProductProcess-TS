package tester_productprocess_ts.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;
import tester_productprocess_ts.pages.siparisGuncelleme;
import tester_productprocess_ts.utilities.uiUtilities.ConfigReader;
import tester_productprocess_ts.utilities.uiUtilities.Driver;

import static tester_productprocess_ts.utilities.uiUtilities.ReusableMethods.waitFor;

public class SiparisiGuncellemeStep {

 siparisGuncelleme siparis =new siparisGuncelleme();

    Anamenu anamenu = new Anamenu();

    SoftAssert softAssert=new SoftAssert();
    JavascriptExecutor jsExecutor = (JavascriptExecutor) Driver.getDriver();

    public static void clickWithJS(WebElement element) {

        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click();", element);
    }


    @And("Uretim Planlama sifre kutucuguna gecerli bir data girilir")
    public void uretimPlanlamaSifreKutucugunaGecerliBirDataGirilir() {

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        clickWithJS(siparis.uretimPlanlamaButonu);
        siparis.uretimPlanmaPassword.sendKeys(ConfigReader.getProperty("UretimPlanlama"));
        clickWithJS(anamenu.anamenu.girisButonu);
    }


    @And("Guncelleme butonuna tiklanir")
    public void guncellemeButonunaTiklanir() throws InterruptedException {
        waitFor(2000);

        clickWithJS(siparis.guncellemeButonu);
    }

    @And("Musteri Adi Kutucugundaki data silinir")
    public void musteriAdiKutucugundakiDataSilinir() {
      //  clickWithJS(siparis.musteriAdiBox);
        waitFor(2000);
        siparis.musteriAdiBox.clear();
    }

    @And("musteri adi musteri adina gecerli bir data girilir")
    public void musteriAdiMusteriAdinaGecerliBirDataGirilir() {

        siparis.musteriAdiBox.sendKeys("Ali Can");
    }

    @And("Gasan No kutucugundaki data silinir")
    public void gasanNoKutucugundakiDataSilinir() {

        clickWithJS(siparis.gasanNoBox);
        siparis.gasanNoBox.clear();
    }

    @And("Gasan No Gasan Nosuna gecerli bir data girilir")
    public void gasanNoGasanNosunaGecerliBirDataGirilir() {
        clickWithJS(siparis.gasanNoBox);
        siparis.gasanNoBox.sendKeys("1122 DN 112233");
    }

    @And("Soparis No kutucugundaki data silinir")
    public void soparisNoKutucugundakiDataSilinir() {

        clickWithJS(siparis.siparisNoBox);
        siparis.siparisNoBox.clear();
    }

    @And("<Siparis No Siparis Noya gecerli bir data girilir")
    public void siparisNoSiparisNoyaGecerliBirDataGirilir() {
        siparis.siparisNoBox.sendKeys("112233");
    }

    @And("Siparis Turu kutucugundaki data silinir")
    public void siparisTuruKutucugundakiDataSilinir() {

        clickWithJS(siparis.siparisTuruBox);
        siparis.siparisTuruBox.clear();
    }

    @And("Siparis turu Siparis turune gecerli bir data girilir")
    public void siparisTuruSiparisTuruneGecerliBirDataGirilir() {

        siparis.siparisTuruBox.sendKeys("Lift");
    }

    @And("siparis Miktari kutucugundaki data silinir")
    public void siparisMiktariKutucugundakiDataSilinir() {

        clickWithJS(siparis.siparisMiktariBox);
        siparis.siparisMiktariBox.clear();
    }

    @And("Siparis miktari Siparis miktarina gecerli bir data girilir")
    public void siparisMiktariSiparisMiktarinaGecerliBirDataGirilir() {

        siparis.siparisMiktariBox.sendKeys("98 ");
    }

    @And("Hazir Mil Miktari kutucugundaki data silinir")
    public void hazirMilMiktariKutucugundakiDataSilinir() {

        clickWithJS(siparis.hazirMilMiktariBox);
        siparis.siparisMiktariBox.clear();
    }

    @And("Hazir mil miktari Hazir mil miktarina gecerli bir data girilir")
    public void hazirMilMiktariHazirMilMiktarinaGecerliBirDataGirilir() {

        siparis.hazirMilMiktariBox.sendKeys("0");
    }

    @And("Siparis durumu kutusunda İşlenmeyi Bekliyor yazmali")
    public void siparisDurumuKutusundaİşlenmeyiBekliyorYazmali() {

        assert siparis.islenmiyorBekliyorBox.isDisplayed();
        clickWithJS(anamenu.anamenu.girisButonu);
    }

    @And("Sipariş başarıyla guncellendi yazisi dogrulanir ve ok tusuna basilir")
    public void siparişBaşarıylaGuncellendiYazisiDogrulanirVeOkTusunaBasilir() {

        assert siparis.siparisBasariylaGuncellendiYazisi.isDisplayed();
        clickWithJS(siparis.oKbutonu);
    }

    @And("sil butonuna tiklanir")
    public void silButonunaTiklanir() {
        clickWithJS(siparis.silButonu);
    }

    @And("siparisi silmek istediginizden emin misiniz sorusu ekranda gorunur.")
    public void siparisiSilmekIstediginizdenEminMisinizSorusuEkrandaGorunur() {
        assert siparis.siparisiSilmekIstediginizdenEminMisinizYazisi.isDisplayed();
    }

    @And("yes butouna tiklanir")
    public void yesButounaTiklanir() {
        clickWithJS(siparis.yesButonu);
    }

    @And("siparis basariyla silindi yazisi dogrulanir")
    public void siparisBasariylaSilindiYazisiDogrulanir() {

        assert siparis.siparisBasariIleSilindYazisi.isDisplayed();
    }

    @And("ok butonuna tiklanir")
    public void okButonunaTiklanir() {

        clickWithJS(siparis.oKbutonu);
    }
}
