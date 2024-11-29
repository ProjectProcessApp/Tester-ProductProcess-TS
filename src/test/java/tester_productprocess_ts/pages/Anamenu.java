package tester_productprocess_ts.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tester_productprocess_ts.utilities.uiUtilities.Driver;

import java.util.List;

public class Anamenu {
    public Anamenu() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//table//tr/td[count(//table//th[text()='Durumu']/preceding-sibling::th)+1]")
    public List<WebElement> talasliAmirdurumSutunu;

    @FindBy(xpath = "//table//tr/td[count(//table//th[text()='Sipariş Türü']/preceding-sibling::th)+1]")
    public List<WebElement> polisajAmirSiparisTuruSutunu;

    @FindBy(xpath = "//table//tr/td[count(//table//th[text()='Sipariş Türü']/preceding-sibling::th)+1]")
    public List<WebElement> liftMontajAmirSiparisTuruSutunu;

    @FindBy(xpath = "//h1[@class='page-header_page_header__pY9yF']")
    public WebElement AnasayfaHeader;

    @FindBy(xpath = "//div[@style='height:25px']")
    public WebElement herhangibiryer;

    @FindBy(xpath = "//div[contains(text(), 'Girdiğiniz şifre eksik veya hatalı') or contains(text(), 'Şifre alanı boş bırakılamaz')]")
    public WebElement ilkGirisHataMesaji;

    @FindBy(xpath = "//div[text()='Müşteri adı en az 4 karakter olmalı' or text()='Gasan No formatı hatalı' or text()='Sipariş numarası 6 haneli olmalı' or text()='Sipariş adedi en az 1 olmalıdır' or text()='Hazır Mil Miktarı negatif olamaz' or text()='Sipariş numarası 10 haneli olmalı' or text()='Geçersiz sipariş numarası formatı']")
    public List<WebElement> musteriAdiHata;

    @FindBy(xpath = "//div[contains(text(),'TALAŞLI İMALAT AMİRİ')]")
    public WebElement talasliImalatAmiri;

    @FindBy(xpath = "//div[contains(text(),'POLİSAJ AMİRİ')]")
    public WebElement polisajAmiri;

    @FindBy(xpath = "//div[contains(text(),'LİFT MONTAJ AMİRİ')]")
    public WebElement liftmontajAmiri;

    @FindBy(xpath = "//div[contains(text(),'BLOKLİFT MONTAJ AMİRİ')]")
    public WebElement blokliftMontajAmiri;

    @FindBy(xpath = "//div[contains(text(),'BOYAMA VE PAKETLEME AMİRİ')]")
    public WebElement boyamaVePaketlemeAmiri;

    @FindBy(xpath = "//div[contains(text(),'KALİTE KONTROL AMİRİ')]")
    public WebElement kaliteKontrolAmiri;

    @FindBy(xpath = "//div[text()='ÜRETİM PLANLAMA']")
    public WebElement uretimPlanlama;

    @FindBy(xpath = "//div[text()='YÖNETİM']")
    public WebElement yonetim;

    @FindBy(xpath = "//label[@for='user']")
    public WebElement amirBaslikYazisi;

    @FindBy(xpath = "//label[text()='POLİSAJ AMİRİ']")
    public WebElement polisajAmiriSifreEkranText;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement sifreKutusu;

    @FindBy(xpath = "(//*[@id='password'])[2]")
    public WebElement goz;

    @FindBy(css = "button[type='submit']")
    public WebElement girisButonu;

    @FindBy(css = "button[type='submit']")
    public WebElement kaydetButonu;

    @FindBy(xpath = "//h1[@class='page-header_page_header__pY9yF']")
    public WebElement amirHeader;

    @FindBy(xpath = "//div/button[text()='Çıkış']")
    public WebElement logout;

    @FindBy(xpath = "//div[text()='Giriş']")
    public WebElement yonetimGirisButonu;

    @FindBy(xpath = "//span[@class='input-group-text']")
    public WebElement yoneticiGoz;

    @FindBy(xpath = "//a[text()='Kulanıcıya Şifre Atama']")
    public WebElement kullaniciyaSifreAtama;

    @FindBy(xpath = "//a[text()='Müşteri İşleri Görüntüle']")
    public WebElement musteriIsleriGoruntule;

    @FindBy(xpath = "//tbody/tr[1]")
    public WebElement musteriIsleriMusteriSatirButon;

    @FindBy(xpath = "//h2[@class= 'customer-page_h2__0n4Xk']")
    public WebElement hurdaSayisi;

    @FindBy(xpath = "//tr[@class='other-orders_table_body__HOtS_ undefined']/td[text()='3000 ABC 300004']")
    public WebElement omer2;

    @FindBy(xpath = "//h1[text()='Şİfre Atama Ekranı']")
    public WebElement sifreAtamaEkraniText;

    @FindBy(xpath = "//button[text()='Geri']")
    public WebElement returnback;

    @FindBy(className = "select")
    public WebElement userSelectElement;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(css = "button[type='submit']")
    public WebElement guncelle;

    @FindBy(xpath = "(//span[@class='input-group-text'])[1]")
    public WebElement sifreAtamaEkraniGoz;

    @FindBy(xpath = "(//span[@class='input-group-text'])[2]")
    public WebElement sifreAtamaEkraniTik;

    @FindBy(xpath = "//h2[@id='swal2-title' and text()='Şifre Güncellendi']")
    public WebElement sifreGuncellendiText;

}
