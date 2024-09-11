package tester_productprocess_ts.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tester_productprocess_ts.utilities.uiUtilities.Driver;

public class siparisGuncelleme {

    public siparisGuncelleme() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath ="//a[contains(text(),'Sipariş Oluştur')]")
    public WebElement siparisOlusturButonu;

    @FindBy(xpath="//h3[contains(text(),'Sipariş Listesi')]")
    public WebElement siparisListesi;

    @FindBy(xpath="//div[@class='card-title h5']")
    public WebElement yeniSiparis;

    @FindBy(xpath="//input[@id='customerName']")
    public WebElement musteriAdiBox;

    @FindBy(xpath ="//input[@id='gasanNo']")
    public WebElement gasanNoBox;

    @FindBy(xpath = "//input[@id='orderNumber']")
    public WebElement siparisNoBox;

    @FindBy(xpath="//input[@id='deliveryDate']")
    public WebElement teslimTarihiBox;

    @FindBy(xpath="//input[@id='orderType']")
    public WebElement siparisTuruBox;

    @FindBy(xpath="//input[@id='orderQuantity']")
    public WebElement siparisMiktariBox;

    @FindBy(xpath="//input[@id='readyMilCount']")
    public WebElement hazirMilMiktariBox;

    @FindBy(css="input#orderStatus[value='İşlenmeyi Bekliyor']")
    public WebElement siparisDurumuBox; //Box icindeki yazi dogrulanacak

    @FindBy(xpath="//h2[@id='swal2-title']")
    public WebElement siparisBasariylaOlusturulduYazisi;

    @FindBy(xpath="//div[contains(@class, 'swal2-actions')]//button[contains(@class, 'swal2-confirm')]")
    public WebElement oKbutonu;

    @FindBy(xpath="//h2[@id='swal2-title']")
    public WebElement siparisBasariylaGuncellendiYazisi;

    @FindBy(css = "button[type='submit']")
    public WebElement girisButonu;

    @FindBy(xpath ="//h1[contains(text(),'SİPARİŞİ GÜNCELLE')]")
    public WebElement siparisiGuncelleBasligi;

    @FindBy(xpath = "//div[contains(text(),'ÜRETİM PLANLAMA')]")
    public WebElement uretimPlanlamaButonu;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement uretimPlanmaPassword;

    @FindBy(xpath = "//a[@class='btn-link text-info btn btn-warning' and @href='/dashboard/uretim/86']")
    public WebElement guncellemeButonu;

    @FindBy(xpath = "//input[@id='orderStatus']")
    public WebElement islenmiyorBekliyorBox;

    @FindBy(xpath = "//tbody/tr[1]/td[11]/button[1]")
    public WebElement silButonu;

    @FindBy(xpath = "//h2[@id='swal2-title']")
    public WebElement siparisiSilmekIstediginizdenEminMisinizYazisi;

    @FindBy(xpath = "//button[normalize-space()='Yes']")
    public WebElement yesButonu;

    @FindBy(xpath = "//h2[@id='swal2-title']")
    public WebElement siparisBasariIleSilindYazisi;


}