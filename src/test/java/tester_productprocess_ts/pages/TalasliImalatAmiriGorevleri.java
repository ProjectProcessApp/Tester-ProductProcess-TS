package tester_productprocess_ts.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tester_productprocess_ts.utilities.uiUtilities.Driver;

import java.util.List;

public class TalasliImalatAmiriGorevleri {

    public TalasliImalatAmiriGorevleri(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "/html/body/main/div[2]/table/tbody")
    public WebElement table;

    @FindBy (xpath="//tr[@class='talasli_table_body__Msmho']/td[1]")
    public List<WebElement> siparisNo;

    @FindBy (xpath="//tr[@class='talasli_table_body__Msmho']")
    public List<WebElement> satirSayisi;

    @FindBy (xpath="//tr[@class='talasli_table_body__Msmho']/td")
    public List<WebElement> hucre;

    @FindBy (xpath="//thead/tr/th")
    public List<WebElement> tabloBasliklari;

    @FindBy (xpath="//div/table/tbody/tr/td[text()='LIFT']")
    public WebElement liftSatirButton;

    @FindBy (xpath="//div/table/tbody/tr/td[text()='BLOKLIFT']")
    public WebElement blokliftSatirButton;

    @FindBy (xpath="//tr[td[text()='PASLANMAZ']]//button[contains(@class, 'btn-primary')]")
    public WebElement paslanmazBaslaButton;

    @FindBy (xpath="//tr[td[text()='BLOKLIFT']]//button[contains(@class, 'btn-primary')]")
    public WebElement blokliftBaslaButton;

    @FindBy (xpath="//tr[td[text()='LIFT']]//button[(text()= 'Tekrar Başlat' or 'Başla')]")
    public List<WebElement> liftBaslaButton;

    @FindBy (xpath="//div/button[@data-operation-type='POLISAJ']")
    public WebElement polisajButton;

    @FindBy (xpath="//div/button[@data-operation-type='MIL_KOPARMA']")
    public WebElement milKoparmaButton;

    @FindBy (xpath="//tr[td[text()='MIL_KOPARMA']]/td/button")
    public WebElement milKoparmaBitenButton;

    @FindBy (xpath="//tr[td[text()='MIL_KOPARMA']]/td[3]")
    public WebElement milKoparmaKalanText;

    @FindBy (xpath="//div/button[@data-operation-type='MIL_TORNALAMA']")
    public WebElement milTornalamaButton;

    @FindBy (xpath="//tr[td[text()='MIL_TORNALAMA']]/td/button")
    public WebElement milTornalamaBitenButton;

    @FindBy (xpath="//tr[td[text()='MIL_TORNALAMA']]/td[3]")
    public WebElement milTornalamaKalanText;

    @FindBy (xpath="//div/button[@data-operation-type='MIL_TASLAMA']")
    public WebElement milTaslamaButton;

    @FindBy (xpath="//tr[td[text()='MIL_TASLAMA']]/td/button")
    public WebElement milTaslalamaBitenButton;

    @FindBy (xpath="//tr[td[text()='MIL_TASLAMA']]/td[3]")
    public WebElement milTaslamaKalanText;

    @FindBy (xpath="//div/button[@data-operation-type='ISIL_ISLEM']")
    public WebElement isilIslemButton;

    @FindBy (xpath="//tr[td[text()='ISIL_ISLEM']]/td/button")
    public WebElement isilIslemBitenButton;

    @FindBy (xpath="//tr[td[text()='ISIL_ISLEM']]/td[3]")
    public WebElement isilIslemKalanText;

    @FindBy (xpath="//div/button[@data-operation-type='BORU_KESME_HAVSA']")
    public WebElement boruKesmeHavsaButton;

    @FindBy (xpath="//tr[td[text()='BORU_KESME_HAVSA']]/td/button")
    public WebElement boruKesmeHavsaBitenButton;

    @FindBy (xpath="//tr[td[text()='BORU_KESME_HAVSA']]/td[3]")
    public WebElement boruKesmeHavsKalanText;

    @FindBy (xpath="//div[@class='popup-inner']/h2")
    public WebElement uretilenAdetText;

    @FindBy (xpath="//input[@type='number']")
    public WebElement uretilenAdetTextBox;

    @FindBy (xpath="//button[text()='Onayla']")
    public WebElement onaylaButton;

    @FindBy (xpath="//tbody/tr/th[5]")
    public WebElement siparisAdedi;

    @FindBy (xpath="//tbody/tr/th[7]")
    public WebElement hazirMilAdedi;

    @FindBy (xpath = "//tr/td[2]")
    public  WebElement polisajBitenButton;

    @FindBy (xpath = "//tr/td[3]")
    public  WebElement polisajKalanText;

    @FindBy (xpath = "//tr/td[text()='Polisaj Sonrası']")
    public  WebElement polisajSonrasiSatirButton;

    @FindBy (xpath = "(//button[@name='approveCount'])[1]")
    public  WebElement kaliteKontrolOnaylaButton;

    @FindBy (xpath = "(//button[@name='approveCount'])[2]")
    public  WebElement kaliteKontrolBitenButton;

    @FindBy (xpath = "//div/table[2]/tbody/tr/td")
    public  WebElement kaliteKontrolKalanText;
}
