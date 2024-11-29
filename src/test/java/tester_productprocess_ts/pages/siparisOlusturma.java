package tester_productprocess_ts.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tester_productprocess_ts.utilities.uiUtilities.Driver;

import java.util.List;

public class siparisOlusturma {

    public siparisOlusturma() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[contains(text(),'Yeni Sipariş')]")
    public WebElement siparisOlusturButonu;
    @FindBy(xpath = "//div[@class='card-title h5']")
    public WebElement yeniSiparis;

    @FindBy(xpath = "//input[@id='customerName']")
    public WebElement musteriAdiBox;

    @FindBy(xpath = "//input[@id='gasanNo']")
    public WebElement gasanNoBox;

    @FindBy(xpath = "//input[@id='orderNumber']")
    public WebElement siparisNoBox;

    @FindBy(id = "deliveryDate")
    public WebElement teslimTarihiBox;

    @FindBy(xpath = "//input[@id='orderQuantity']")
    public WebElement siparisMiktariBox;

    @FindBy(xpath = "//input[@id='readyMilCount']")
    public WebElement hazirMilMiktariBox;

    @FindBy(css = "input#orderStatus[value='İşlenmeyi Bekliyor']")
    public WebElement siparisDurumuBox; //Box icindeki yazi dogrulanacak

    @FindBy(xpath = "//h2[@id='swal2-title']")
    public WebElement siparisBasariylaOlusturulduYazisi;

    @FindBy(xpath = "//h2[@id='swal2-title']")
    public WebElement siparisBasariylaGuncellendiYazisi;

    @FindBy(xpath = "//select[@id='orderType']")
    public WebElement siparisTuruSelect;

    @FindBy(xpath = "//tbody[1]//tr[1]//td[10]")
    public WebElement baslaButonu;

    @FindBy(xpath = "//button[text()='Basla']")
    public List<WebElement> baslaButonuList;

    @FindBy(xpath = "//tr[@class='eachRow'][1]//td")
    public List<WebElement> tabloHucreleri;

}
