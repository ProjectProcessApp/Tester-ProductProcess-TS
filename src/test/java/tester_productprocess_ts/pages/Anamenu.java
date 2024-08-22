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

    @FindBy(xpath="//div[@style='height:50px']")
    public WebElement herhangibiryer;

    @FindBy(xpath="//label[@class='text-start w-100 fs-4 form-label']")
    public WebElement sifreText;

    @FindBy(xpath ="//div[contains(text(),'TALASLI IMALAT AMIRI')]" )
    public WebElement talasliImalatAmiri;

    @FindBy(xpath ="//div[contains(text(),'POLISAJ AMIRI')]" )
    public WebElement polisajAmiri;

    @FindBy(xpath ="//div[@class='menuDiv'][normalize-space()='LIFT MONTAJ AMIRI']" )
    public WebElement liftmontajAmiri;

    @FindBy(xpath ="//div[contains(text(),'BLOKLIFT MONTAJ AMIRI')]" )
    public WebElement blokliftMontajAmiri;

    @FindBy(xpath ="//div[contains(text(),'BOYAMA VE PAKETLEME AMIRI')]" )
    public WebElement boyamaVePaketlemeAmiri;

    @FindBy(xpath ="//div[contains(text(),'KALITE KONTROL AMIRI')]" )
    public WebElement kaliteKontrolAmiri;

    @FindBy(xpath ="//div[contains(text(),'ÜRETIM PLANLAMA')]" )
    public WebElement uretimPlanlama;

    @FindBy(xpath ="//div[contains(text(),'YÖNETIM')]" )
    public WebElement yonetim;

    @FindBy(xpath ="//h1[@class='page-header']" )
    public WebElement girisAnabaslik;

    @FindBy(xpath ="//label[@for='password']" )
    public WebElement sifreYazisi;
    @FindBy(xpath ="//input[@id='password']" )
    public WebElement sifreKutusu;
    @FindBy(xpath ="//div[@class='d-flex justify-content-center']" )
    public WebElement girisButonu;
    @FindBy(xpath ="//body/div[3]" )
    public WebElement girisSayfasiHerhangiBirYer;
}
