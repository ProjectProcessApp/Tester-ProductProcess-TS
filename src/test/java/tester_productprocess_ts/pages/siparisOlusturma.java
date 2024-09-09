package tester_productprocess_ts.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tester_productprocess_ts.utilities.uiUtilities.Driver;

public class siparisOlusturma {

    public siparisOlusturma() {
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

    @FindBy(xpath="//div[@data-nextjs-toast='true']//span[contains(text(), 'error')]")
    public WebElement errorText;
    @FindBy(xpath="//h2[@id='swal2-title']")
    public WebElement siparisBasariylaOlusturulduYazisi;

    @FindBy(xpath="//div[contains(@class, 'swal2-actions')]//button[contains(@class, 'swal2-confirm')]")
    public WebElement oKbutonu;

    @FindBy(xpath="//[name()='path' and contains(@d,'M15.529 2.')]")
    public WebElement guncelleButonu;

    @FindBy(xpath="//h2[@id='swal2-title']")
    public WebElement siparisBasariylaGuncellendiYazisi;





}
