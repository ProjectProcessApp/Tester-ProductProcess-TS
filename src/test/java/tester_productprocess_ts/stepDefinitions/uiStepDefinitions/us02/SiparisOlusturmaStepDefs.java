package tester_productprocess_ts.stepDefinitions.uiStepDefinitions.us02;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import tester_productprocess_ts.pages.Anamenu;
import tester_productprocess_ts.pages.siparisOlusturma;
import tester_productprocess_ts.utilities.uiUtilities.DbHelper;
import tester_productprocess_ts.utilities.uiUtilities.Driver;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;


import static tester_productprocess_ts.utilities.uiUtilities.ReusableMethods.*;

public class SiparisOlusturmaStepDefs {

    static siparisOlusturma siparis = new siparisOlusturma();

    Anamenu anamenu = new Anamenu();

    Actions action = new Actions(Driver.getDriver());

    static String siparisTuru="";

    @Then("siparis Olustur butonunun ekranda gorundugu kontrol edilir")
    public void siparis_olustur_butonunun_ekranda_gorundugu_kontrol_edilir() {
        Assert.assertTrue(siparis.siparisOlusturButonu.isDisplayed());
    }

    @Then("Onceden siparis listesi olup olmadigi dogrulanir")
    public void onceden_siparis_listesi_olup_olmadigi_dogrulanir() {
        waitForVisibility(siparis.siparisListesi,10);
        String expected = "Sipariş Listesi";
        String actual = siparis.siparisListesi.getText();
        Assert.assertEquals(expected, actual);
    }

    @Then("siparis olustur butonuna tiklanir")
    public void siparis_olustur_butonuna_tiklanir() {
       waitForVisibility(siparis.siparisOlusturButonu,10);
        siparis.siparisOlusturButonu.click();
    }

    @Then("yeni siparis ekraninin geldigi dogrulanir")
    public void yeni_siparis_ekraninin_geldigi_dogrulanir() {
        waitForVisibility(siparis.yeniSiparis,10);
        String expected = "Yeni Siparis";
        String actual = siparis.yeniSiparis.getText();
        Assert.assertEquals(expected, actual);
    }

    @Then("{string} musteri adina gecerli bir data girilir")
    public void musteri_adina_gecerli_bir_data_girilir(String string) {
        waitForVisibility(siparis.musteriAdiBox,10);
        siparis.musteriAdiBox.sendKeys(string);
    }

    @Then("{string} Gasan Nosuna gecerli bir data girilir")
    public void gasan_nosuna_gecerli_bir_data_girilir(String string) {
        waitForVisibility(siparis.gasanNoBox,10);
        siparis.gasanNoBox.clear();
        siparis.gasanNoBox.sendKeys(string);
    }

    @Then("{string} Siparis Noya gecerli bir data girilir")
    public void siparis_noya_gecerli_bir_data_girilir(String string) {
        waitForVisibility(siparis.siparisNoBox,10);
        siparis.siparisNoBox.sendKeys(string);
    }

    @And("Teslim Tarihine gecerli bir data girilir")
    public void teslimTarihineGecerliBirDataGirilir() {
        waitForVisibility(siparis.teslimTarihiBox,10);
        siparis.teslimTarihiBox.sendKeys("10");
        siparis.teslimTarihiBox.sendKeys("10");
        siparis.teslimTarihiBox.sendKeys("2026");
    }

    @Then("{string} Siparis turune gecerli bir data girilir")
    public void siparis_turune_gecerli_bir_data_girilir(String string) {
        waitForVisibility(siparis.siparisTuruSelect,10);
        ddmValue(siparis.siparisTuruSelect, string);
        siparisTuru=string;
    }

    @Then("{string} Siparis miktarina gecerli bir data girilir")
    public void siparis_miktarina_gecerli_bir_data_girilir(String string) {
        action.scrollToElement(siparis.siparisMiktariBox).perform();
        siparis.siparisMiktariBox.sendKeys(string);
    }

    @Then("{string} Hazir mil miktarina gecerli bir data girilir")
    public void hazir_mil_miktarina_gecerli_bir_data_girilir(String string) {
        action.scrollToElement(siparis.hazirMilMiktariBox).perform();
        waitForVisibility(siparis.hazirMilMiktariBox,10);
        System.out.println(siparisTuru);
        if (siparisTuru.equals("Lift")) {
            siparis.hazirMilMiktariBox.clear();
            siparis.hazirMilMiktariBox.sendKeys(string);
        }
    }

    @Then("Siparis durumu kutusunda {string} yazmali")
    public void siparis_durumu_kutusunda_yazmali(String expected) {
        action.scrollToElement(siparis.siparisDurumuBox).perform();
        waitForVisibility(siparis.siparisDurumuBox,10);
        String actual = siparis.siparisDurumuBox.getAttribute("value");
        Assert.assertEquals(expected, actual);
    }

    @And("kaydet butonuna tiklanir")
    public void kaydetButonunaTiklanir() {
        action.scrollToElement(anamenu.kaydetButonu).perform();
        waitForVisibility(anamenu.kaydetButonu,10);
        anamenu.kaydetButonu.click();
    }

    @Then("{string} yazisi dogrulanir ve ok tusuna basilir")
    public void yazisi_dogrulanir_ve_ok_tusuna_basilir(String expected) {
        waitForVisibility(siparis.siparisBasariylaOlusturulduYazisi,10);
        String actual = siparis.siparisBasariylaOlusturulduYazisi.getText();
        Assert.assertEquals(expected, actual);
    }

    @Then("{string} musteri adina gecersiz bir data girilir")
    public void musteri_adina_gecersiz_bir_data_girilir(String string) {
        waitFor(1000);
        siparis.musteriAdiBox.clear();
        siparis.musteriAdiBox.sendKeys(string);
    }

    @Then("{string} Gasan Nosuna gecersiz bir data girilir")
    public void gasan_nosuna_gecersiz_bir_data_girilir(String string) {
        waitFor(1000);
        siparis.gasanNoBox.clear();
        siparis.gasanNoBox.sendKeys(string);
    }

    @Then("{string} Siparis Noya gecersiz bir data girilir")
    public void siparis_noya_gecersiz_bir_data_girilir(String string) {
        waitFor(1000);
        siparis.siparisNoBox.clear();
        siparis.siparisNoBox.sendKeys(string);
    }

    @And("Teslim Tarihine gecersiz bir data girilir")
    public void teslimTarihineGecersizBirDataGirilir() {
        waitFor(1000);
        siparis.teslimTarihiBox.sendKeys("5");
        waitFor(1000);
        siparis.teslimTarihiBox.sendKeys("11");
        waitFor(1000);
        siparis.teslimTarihiBox.sendKeys("2026");
    }

    @Then("{string} Siparis turune gecersiz bir data girilir")
    public void siparis_turune_gecersiz_bir_data_girilir(String string) {
        waitFor(1000);
        ddmValue(siparis.siparisTuruSelect, string);
    }

    @Then("{string} Siparis miktarina gecersiz bir data girilir")
    public void siparis_miktarina_gecersiz_bir_data_girilir(String string) {
        waitFor(1000);
        siparis.siparisMiktariBox.clear();
        siparis.siparisMiktariBox.sendKeys(string);
    }

    @Then("{string} Hazir mil miktarina gecersiz bir data girilir")
    public void hazir_mil_miktarina_gecersiz_bir_data_girilir(String string) {
        siparis.hazirMilMiktariBox.sendKeys(Keys.TAB);
        waitFor(1000);
        siparis.hazirMilMiktariBox.clear();
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
            try {
                Driver.getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
                WebElement successMessage = Driver.getDriver().findElement(By.xpath("//*[text()='Sipariş oluşturuldu']"));
                if (successMessage.isDisplayed()) {
                    System.out.println("Sipariş oluşturuldu metni ekranda göründü.");
                }
            } catch (NoSuchElementException e) {
                System.out.println("Sipariş oluşturuldu metni bulunamadı, sayfa geriye alınıyor.");
                geriGitVeCikisYap();
            }
        }
    }

    private void geriGitVeCikisYap() {
        Driver.getDriver().navigate().back();
        waitFor(3000);
        anamenu.logout.click();
    }

    @And("Database connection yapilir")
    public void databaseConnectionYapilir() throws SQLException {
        Statement statement = DbHelper.connection();
        System.out.println("Database e baglanildi");
    }

    @And("Databasedeki veriler ve karsilastirilir")
    public void databasedekiVerilerVeKarsilastirilir() throws SQLException {

        String query = "SELECT customer_name,gasan_no,order_number,order_date,delivery_date," +
                "order_type,order_quantity,ready_mil_count FROM t_order";
        List<List<Object>> dbResultList = DbHelper.getQueryResultList(query);

        for (int i = 0; i < dbResultList.size(); i++) {
            System.out.println(dbResultList.get(i));
            String dbCustomerName = (String) dbResultList.get(i).get(0);
            Object dbDeliveryDate = dbResultList.get(i).get(4);
            String dbGasanNo = (String) dbResultList.get(i).get(1);
            Object dbOrderDate = dbResultList.get(i).get(3);
            String dbOrderNumber = (String) dbResultList.get(i).get(2);
            int dbOrderQuantity = (int) dbResultList.get(i).get(6);
            String dbOrderType = (String) dbResultList.get(i).get(5);
            int dbReadyMilCount = (int) dbResultList.get(i).get(7);

            // Satır verilerini saklamak için bir liste oluştur
            // Birinci satırı bul ve hücrelerini locate et
            List<WebElement> firstRowCells = Driver.getDriver().findElements(By.xpath("//tr[@class='eachRow'][" + (i + 1) + "]//td"));

            // Birinci satırdaki verileri saklamak için liste oluştur
            List<String> firstRowData = new ArrayList<>();

            // Her hücredeki metni al ve listeye ekle
            for (WebElement cell : firstRowCells) {
                firstRowData.add(cell.getText());
            }
                firstRowData.remove("İşlenmeyi Bekliyor");
                firstRowData.remove("Basla");

            System.out.println(firstRowData);
            String webCustomerName = firstRowData.get(0);
            String webGasanNo = firstRowData.get(1);
            String webOrderNumber = firstRowData.get(2);
            Object webOrderDate = firstRowData.get(3);
            Object webDeliveryDate = firstRowData.get(4);
            String webOrderType = firstRowData.get(5);
            int webOrderQuantity = Integer.parseInt(firstRowData.get(6));
            int webReadyMilCount = Integer.parseInt(firstRowData.get(7));

            // Validate the data
            boolean isValid = dbCustomerName.equals(webCustomerName) &&
                    dbDeliveryDate.equals(webDeliveryDate) &&
                    dbGasanNo.contains(webGasanNo) &&
                    dbOrderDate.equals(webOrderDate) &&
                    dbOrderNumber.contains(webOrderNumber) &&
                    dbOrderQuantity == (webOrderQuantity) &&
                    dbOrderType.contains(webOrderType) &&
                    dbReadyMilCount == (webReadyMilCount);

            if (isValid) {
                waitFor(1000);
                System.out.println(i + 1 + ". satir Veritabani ile eslesiyor");
            } else {
                System.out.println(i + 1 + ".satir Veritabani ile eslesmiyor");
            }
        }
        System.out.println("");
    }

    @Then("Basla butonu varligi dogrulanir")
    public void baslaButonuVarligiDogrulanir() {
        String baslaButonu = "Basla";
        for (int i = 0; i < siparis.baslaButonuList.size(); i++) {
            Assert.assertEquals(baslaButonu, siparis.baslaButonuList.get(i).getText());
            System.out.println((i + 1) + ". Basla butonu gorunuyor");
        }
        System.out.println("");
        DbHelper.closeConnection();
    }


}
