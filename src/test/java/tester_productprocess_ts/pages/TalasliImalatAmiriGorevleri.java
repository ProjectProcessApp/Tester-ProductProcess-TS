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

    @FindBy (xpath="//tr[@class='boyama-paketleme_table_body__jVDL8']/td")
    public List<WebElement> boyaPaketlemehucre;

    @FindBy (xpath="//thead/tr/th")
    public List<WebElement> tabloBasliklari;

    @FindBy (xpath="//div/table/tbody/tr/td[text()='LIFT']")
    public WebElement liftSatirButton;

    @FindBy (xpath="//tr[td[text()='LIFT']]//button[text()= 'Tekrar Başlat' or 'Başla']")
    public List<WebElement> liftBaslaButton;

    @FindBy (xpath="//div/table/tbody/tr/td[text()='BLOKLIFT']")
    public WebElement blokliftSatirButton;

    @FindBy (xpath="//tr[td[text()='BLOKLIFT']]//button[text()= 'Tekrar Başlat' or 'Başla']")
    public List<WebElement> blokliftBaslaButton;

    @FindBy (xpath="//tr[td[text()='PASLANMAZ']]//button[text()= 'Tekrar Başlat' or 'Başla']")
    public List<WebElement> paslanmazBaslaButton;

    @FindBy (xpath="//div/table/tbody/tr/td[text()='PASLANMAZ']")
    public WebElement paslanmazSatirButton;

    @FindBy (xpath="//div/table/tbody/tr/td[text()='DAMPER']")
    public WebElement damperSatirButton;

    @FindBy (xpath="//tr[td[text()='DAMPER']]//button[text()= 'Tekrar Başlat' or 'Başla']")
    public List<WebElement> damperBaslaButton;

    @FindBy (xpath="//div/button[@data-operation-type='POLISAJ']")
    public WebElement polisajButton;

    @FindBy (xpath="//div/button[@data-operation-type='MIL_KOPARMA']")
    public WebElement milKoparmaButton;

    @FindBy (xpath = "//button[text()='BORU KAPAMA']")
    public WebElement boruKapamaButon;

    @FindBy (xpath="//tr[td[text()='BORU_KAPAMA']]/td/button")
    public WebElement boruKapamaBitenButton;

    @FindBy (xpath="//tr[td[text()='BORU_KAPAMA']]/td[3]")
    public WebElement boruKapamaKalanText;

    @FindBy (xpath = "//button[text()='BORU KAYNAK']")
    public WebElement boruKaynakButon;

    @FindBy (xpath="//tr[td[text()='BORU_KAYNAK']]/td/button")
    public WebElement boruKaynakBitenButton;

    @FindBy (xpath="//tr[td[text()='BORU_KAYNAK']]/td[3]")
    public WebElement boruKaynakKalanText;

    @FindBy (xpath = "//button[text()='LİFT MONTAJ']")
    public WebElement liftMontajButon;

    @FindBy (xpath="//tr[td[text()='LIFT_MONTAJ']]/td/button")
    public WebElement liftMontajBitenButton;

    @FindBy (xpath="//tr[td[text()='LIFT_MONTAJ']]/td[3]")
    public WebElement liftMontajKalanText;

    @FindBy (xpath = "//button[text()='GAZ DOLUM']")
    public WebElement gazDolumButon;

    @FindBy (xpath="//tr[td[text()='GAZ_DOLUM']]/td/button")
    public WebElement gazDolumBitenButton;

    @FindBy (xpath="//tr[td[text()='GAZ_DOLUM']]/td[3]")
    public WebElement gazDolumKalanText;

    @FindBy (xpath = "//button[text()='BAŞLIK TAKMA']")
    public WebElement baslikTakmaButon;

    @FindBy (xpath="//tr[td[text()='BASLIK_TAKMA']]/td/button")
    public WebElement baslikTakmaBitenButton;

    @FindBy (xpath="//tr[td[text()='BASLIK_TAKMA']]/td[3]")
    public WebElement baslikTakmaKalanText;

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

    @FindBy (xpath="//div/button[@data-operation-type='EZME']")
    public WebElement ezmeButton;

    @FindBy (xpath="//tr[td[text()='EZME']]/td/button")
    public WebElement ezmeBitenButton;

    @FindBy (xpath="//tr[td[text()='EZME']]/td[3]")
    public WebElement ezmeKalanText;

    @FindBy (xpath="//div/button[@data-operation-type='BORU_KESME_HAVSA']")
    public WebElement boruKesmeHavsaButton;

    @FindBy (xpath="//tr[td[text()='BORU_KESME_HAVSA']]/td/button")
    public WebElement boruKesmeHavsaBitenButton;

    @FindBy (xpath="//tr[td[text()='BORU_KESME_HAVSA']]/td[3]")
    public WebElement boruKesmeHavsKalanText;

    @FindBy (xpath="//h2[text()='Üretilen Adedi Giriniz']")
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

    @FindBy (xpath = "//tr/td[text()='Montaj Sonrası']")
    public  WebElement montajSonrasiSatirButton;

    @FindBy (xpath = "//tr/td[text()='Mil Taşlama Sonrası']")
    public  WebElement milTaslamaSonrasiSatirButton;

    @FindBy (xpath = "//tr/td[text()='Ezme Sonrası']")
    public  WebElement EzmeSonrasiSatirButton;

    @FindBy (xpath = "(//button[@name='approveCount'])[1]")
    public  WebElement kaliteKontrolOnaylaButton;

    @FindBy (xpath = "(//button[@name='approveCount'])[2]")
    public  WebElement kaliteKontrolBitenButton;

    @FindBy (xpath = "//div/table[2]/tbody/tr/td")
    public  WebElement kaliteKontrolKalanText;

    @FindBy (xpath = "(//tr/td[3])[1]")
    public  WebElement uretilenToplamMil;

    @FindBy (xpath = "//tr[2]/td[3]")
    public  WebElement uretilenToplamBoru;

    @FindBy (xpath = "//button[text()='BOYA']")
    public WebElement boyaButon;

    @FindBy (xpath="//tr[td[text()='BOYA']]/td/button")
    public WebElement boyaBitenButton;

    @FindBy (xpath="//tr[td[text()='BOYA']]/td[3]")
    public WebElement boyaKalanText;

    @FindBy (xpath = "//button[text()='PAKETLEME']")
    public WebElement paketlemeButon;

    @FindBy (xpath="//tr[td[text()='PAKETLEME']]/td/button")
    public WebElement paketlemeBitenButton;

    @FindBy (xpath="//tr[td[text()='PAKETLEME']]/td[3]")
    public WebElement paketlemeKalanText;

    @FindBy(xpath = "//tr[@class='boyama-paketleme_table_body__jVDL8']/td[3]")
    public  List<WebElement> boyaPaketlemesiparisNo;

    @FindBy (xpath = "//tr[td[text()='LIFT']]//button//div[@class='order-toolbar_inner_check__fDRhb']")
    public  WebElement liftTamamlaButon;

    @FindBy (xpath = "//table//tr[td[contains(text(), 'omer')] and td[contains(text(), 'LIFT')]]//td[contains(text(), 'Tamamlandı')]")
    public WebElement liftTamamlandiText;

    @FindBy (xpath = "//table//tr[td[contains(text(), 'omer')] and td[contains(text(), 'LIFT')]]//button[@class='btn-link btn btn-danger']")
    public WebElement liftSiparisSil;


}
