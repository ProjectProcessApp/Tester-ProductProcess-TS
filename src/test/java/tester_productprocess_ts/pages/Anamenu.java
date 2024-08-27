package tester_productprocess_ts.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tester_productprocess_ts.utilities.uiUtilities.Driver;

import java.util.List;

public class Anamenu {
    public Anamenu(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath="//div[@class='menuDiv']")
    public List<WebElement> menulinkleri;

    @FindBy(xpath="//h1[@class='page-header']")
    public WebElement AnasayfaHeader;

    @FindBy(xpath="//h1[@class='page-header']")
    public WebElement girisHeader;

    @FindBy(xpath="//div[@style='height:50px']")
    public WebElement herhangibiryer;

    @FindBy(xpath="//label[@class='text-start w-100 fs-4 form-label']")
    public WebElement sifreText;

    @FindBy(xpath ="//div[contains(text(),'TALAŞLI İMALAT AMİRİ')]" )
    public WebElement talasliImalatAmiri;

    @FindBy(xpath ="//div[contains(text(),'POLİSAJ AMİRİ')]" )
    public WebElement polisajAmiri;

    @FindBy(xpath ="//div[contains(text(),'LİFT MONTAJ AMİRİ')]" )
    public WebElement liftmontajAmiri;

    @FindBy(xpath ="//div[contains(text(),'BLOKLİFT MONTAJ AMİRİ')]" )
    public WebElement blokliftMontajAmiri;

    @FindBy(xpath ="//div[contains(text(),'BOYAMA VE PAKETLEME AMİRİ')]" )
    public WebElement boyamaVePaketlemeAmiri;

    @FindBy(xpath ="//div[contains(text(),'KALİTE KONTROL AMİRİ')]" )
    public WebElement kaliteKontrolAmiri;

    @FindBy(xpath ="//div[text()='ÜRETİM PLANLAMA']" )
    public WebElement uretimPlanlama;

    @FindBy(xpath ="//div[text()='YÖNETİM']" )
    public WebElement yonetim;

     @FindBy(xpath ="(//div/label[@class='form-label'])[1]" )
    public WebElement amirBaslikYazisi;

    @FindBy(xpath ="//label[text()='POLİSAJ AMİRİ']" )
    public WebElement polisajAmiriSifreEkranText;
    @FindBy(xpath ="(//*[@id='password'])[1]" )
    public WebElement sifreKutusu;
    @FindBy(xpath ="(//*[@id='password'])[2]" )
    public WebElement goz;

    @FindBy(xpath ="//div[@class='d-flex justify-content-center']" )
    public WebElement girisButonu;

    @FindBy(xpath ="//h1[@class='page-header']" )
    public WebElement amirHeader;

    @FindBy(xpath ="//button[@class='btn btn-primary']" )
    public WebElement logout;
    @FindBy(xpath ="//body/div[3]" )
    public WebElement girisSayfasiHerhangiBirYer;
    @FindBy(xpath = "//div[text()='Giriş']")
    public WebElement yonetimGirisButonu;

    @FindBy(xpath ="//span[@class='input-group-text']" )
    public WebElement yoneticiGoz;

    @FindBy(xpath="//h1[@class='page-header']")
    public WebElement yoneticiGirisSayfasiHeader;

    @FindBy(xpath="//a[text()='Kulanıcıya Şifre Atama']")
    public WebElement kullaniciyaSifreAtama;

    @FindBy(xpath ="//h1[text()='Şıfre Atama Ekranı ']" )
    public WebElement sifreAtamaEkraniText;

    @FindBy(xpath ="//button[@class='btn btn-secondary']" )
    public WebElement returnback;
    @FindBy(xpath ="//select[@class='form-control']" )
    public WebElement sifreAtamaSelectMenu;

    @FindBy(xpath ="//select[@id='userSelect']" )
    public List<WebElement> sifreAtamaSelectListMenu;

    @FindBy(xpath ="//input[@placeholder='Yeni Şifreyi Giriniz']" )
    public WebElement yeniSifreKutusu;

    @FindBy(xpath ="(//span[@class='input-group-text'])[1]" )
    public WebElement sifreAtamaEkraniGoz;

    @FindBy(xpath ="(//span[@class='input-group-text'])[2]" )
    public WebElement sifreAtamaEkraniTik;
}
