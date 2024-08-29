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

    @FindBy(xpath = "//div[@class='menuDiv']")
    public List<WebElement> menulinkleri;

    @FindBy(xpath = "//h1[@class='page-header']")
    public WebElement AnasayfaHeader;

    @FindBy(xpath = "//h1[@class='page-header']")
    public WebElement girisHeader;

    @FindBy(xpath = "//div[@style='height:50px']")
    public WebElement herhangibiryer;

    @FindBy(xpath = "//div[contains(text(), 'Girdiğiniz şifre eksik veya hatalı') or contains(text(), 'Şifre alanı boş bırakılamaz')]")
    public WebElement ilkGirisHataMesaji;

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

    @FindBy(xpath = "(//div/label[@class='form-label'])[1]")
    public WebElement amirBaslikYazisi;

    @FindBy(xpath = "//label[text()='POLİSAJ AMİRİ']")
    public WebElement polisajAmiriSifreEkranText;

    @FindBy(xpath = "(//*[@id='password'])[1]")
    public WebElement sifreKutusu;

    @FindBy(xpath = "(//*[@id='password'])[2]")
    public WebElement goz;

    @FindBy(xpath = "//div[@class='d-flex justify-content-center']")
    public WebElement girisButonu;

    @FindBy(xpath = "//h1[@class='page-header']")
    public WebElement amirHeader;

    @FindBy(xpath = "//button[text()='Logout']")
    public WebElement logout;
    @FindBy(xpath = "//body/div[3]")
    public WebElement girisSayfasiHerhangiBirYer;
    @FindBy(xpath = "//div[text()='Giriş']")
    public WebElement yonetimGirisButonu;

    @FindBy(xpath = "//span[@class='input-group-text']")
    public WebElement yoneticiGoz;

    @FindBy(xpath = "//a[text()='Kulanıcıya Şifre Atama']")
    public WebElement kullaniciyaSifreAtama;

    @FindBy(xpath = "//h1[text()='Şıfre Atama Ekranı ']")
    public WebElement sifreAtamaEkraniText;

    @FindBy(xpath = "//button[@class='btn btn-secondary']")
    public WebElement returnback;
    @FindBy(id = "userSelect")
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
    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled' and text()='OK']")
    public WebElement guncellemaPopupOk;
}
