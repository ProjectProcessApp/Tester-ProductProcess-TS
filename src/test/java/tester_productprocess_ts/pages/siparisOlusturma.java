package tester_productprocess_ts.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class siparisOlusturma {



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

    @FindBy(xpath="//input[@id='orderStatus']")
    public WebElement siparisDurumuBox; //Box icindeki yazi dogrulanacak

    @FindBy(xpath="//h2[@id='swal2-title']")
    public WebElement siparisBasariylaOlusturulduYazisi;

    @FindBy(xpath="//button[normalize-space()='OK']")
    public WebElement OKbutonu;


    @FindBy(xpath="//*[name()='path' and contains(@d,'M15.529 2.')]")
    public WebElement guncelleButonu;

    @FindBy(xpath="//h2[@id='swal2-title']")
    public WebElement siparisBasariylaGuncellendiYazisi;



    @FindBy(xpath="//button[@class='btn-link btn btn-danger']//*[name()='svg']")
    public WebElement silButonu;

    @FindBy(xpath="//h2[@id='swal2-title']")
    public WebElement siparisiSilmekIstedigindenEminMisinizYazisi;


    @FindBy(xpath="//button[normalize-space()='Yes']")
    public WebElement YESButonu;

    @FindBy(xpath="//button[normalize-space()='Cancel']")
    public WebElement CancelButonu;



    @FindBy(xpath="//h2[@id='swal2-title']")
    public WebElement siparisBasariylaSilindiYazisi;




}
