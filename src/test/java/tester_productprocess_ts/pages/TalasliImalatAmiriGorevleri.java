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

    @FindBy (xpath="//a[@class='page-link']")
    public List<WebElement> sayfaNumaralari;

    @FindBy (xpath="//table/tbody//button[contains(@class, 'talasli_btn_container__5y2Kl') and @type='button']")
    public List<WebElement> baslaButton;

    @FindBy (xpath="//table//tr[td[contains(text(), 'omer')] and td[contains(text(), 'Lift')] and td[contains(text(), 'İşlenmekte')]]")
    public WebElement liftSatirButton;

    @FindBy (xpath="//table//tr[td[contains(text(), 'omer')] and td[contains(text(), 'Lift')]]//button[text()= 'Tekrar Başlat' or 'Başla']")
    public List<WebElement> liftBaslaButton;

    @FindBy (xpath="//table//tr[td[contains(text(), 'alican')] and td[contains(text(), 'Blok Lift')] and td[contains(text(), 'İşlenmekte')]]")
    public WebElement blokliftSatirButton;

    @FindBy (xpath="//table//tr[td[contains(text(), 'alican')] and td[contains(text(), 'Blok Lift')]]//button[text()= 'Tekrar Başlat' or 'Başla']")
    public List<WebElement> blokliftBaslaButton;

    @FindBy (xpath="//table//tr[td[contains(text(), 'ramo')] and td[contains(text(), 'Paslanmaz')]]//button[text()= 'Tekrar Başlat' or 'Başla']")
    public List<WebElement> paslanmazBaslaButton;

    @FindBy (xpath="//table//tr[td[contains(text(), 'ramo')] and td[contains(text(), 'Paslanmaz')] and td[contains(text(), 'İşlenmekte')]]")
    public WebElement paslanmazSatirButton;

    @FindBy (xpath="//table//tr[td[contains(text(), 'hasan')] and td[contains(text(), 'Damper')] and td[contains(text(), 'İşlenmekte')]]")
    public WebElement damperSatirButton;

    @FindBy (xpath="//table//tr[td[contains(text(), 'hasan')] and td[contains(text(), 'Damper')]]//button[text()= 'Tekrar Başlat' or 'Başla']")
    public List<WebElement> damperBaslaButton;

    @FindBy (xpath="//div/button[@data-operation-type='POLISAJ']")
    public WebElement polisajButton;

    @FindBy (xpath="//div/button[@data-operation-type='MIL_KOPARMA']")
    public WebElement milKoparmaButton;

    @FindBy (xpath = "//button[text()='BORU KAPAMA']")
    public WebElement boruKapamaButon;

    @FindBy (xpath="//tr[td[text()='BORU_KAPAMA']]/td/button")
    public WebElement boruKapamaBitenButton;

    @FindBy (xpath="//tr[td[text()='Boru Kapama']]/td/button")
    public WebElement boruKapamaBitenButton1;

    @FindBy (xpath="//tr[td[text()='BORU_KAPAMA']]/td[3]")
    public WebElement boruKapamaKalanText;

    @FindBy (xpath="//tr[td[text()='Boru Kapama']]/td[3]")
    public WebElement boruKapamaKalanText1;

    @FindBy (xpath = "//button[text()='BORU KAYNAK']")
    public WebElement boruKaynakButon;

    @FindBy (xpath="//tr[td[text()='BORU_KAYNAK']]/td/button")
    public WebElement boruKaynakBitenButton;

    @FindBy (xpath="//tr[td[text()='Boru Kaynak']]/td/button")
    public WebElement boruKaynakBitenButton1;

    @FindBy (xpath="//tr[td[text()='BORU_KAYNAK']]/td[3]")
    public WebElement boruKaynakKalanText;

    @FindBy (xpath="//tr[td[text()='Boru Kaynak']]/td[3]")
    public WebElement boruKaynakKalanText1;

    @FindBy (xpath = "//button[text()='LİFT MONTAJ']")
    public WebElement liftMontajButon;

    @FindBy (xpath="//tr[td[text()='LIFT_MONTAJ']]/td/button")
    public WebElement liftMontajBitenButton;

    @FindBy (xpath="//tr[td[text()='LIFT_MONTAJ']]/td[3]")
    public WebElement liftMontajKalanText;

    @FindBy (xpath = "//button[text()='BLOK LİFT MONTAJ']")
    public WebElement blokliftMontajButon;

    @FindBy (xpath="//tr[td[text()='Blok Lift Montaj']]/td/button")
    public WebElement blokliftMontajBitenButton;

    @FindBy (xpath="//tr[td[text()='Blok Lift Montaj']]/td[3]")
    public WebElement blokliftMontajKalanText;

    @FindBy (xpath = "//button[text()='TEST']")
    public WebElement testButon;

    @FindBy (xpath="//tr[td[text()='Test']]/td/button")
    public WebElement testBitenButton;

    @FindBy (xpath="//tr[td[text()='Test']]/td[3]")
    public WebElement testKalanText;

    @FindBy (xpath = "//button[text()='GAZ DOLUM']")
    public WebElement gazDolumButon;

    @FindBy (xpath="//tr[td[text()='GAZ_DOLUM']]/td/button")
    public WebElement gazDolumBitenButton;

    @FindBy (xpath="//tr[td[text()='Gaz Dolum']]/td/button")
    public WebElement gazDolumBitenButton1;

    @FindBy (xpath="//tr[td[text()='GAZ_DOLUM']]/td[3]")
    public WebElement gazDolumKalanText;

    @FindBy (xpath="//tr[td[text()='Gaz Dolum']]/td[3]")
    public WebElement gazDolumKalanText1;

    @FindBy (xpath = "//button[text()='BAŞLIK TAKMA']")
    public WebElement baslikTakmaButon;

    @FindBy (xpath="//tr[td[text()='BASLIK_TAKMA']]/td/button")
    public WebElement baslikTakmaBitenButton;

    @FindBy (xpath="//tr[td[text()='BASLIK_TAKMA']]/td[3]")
    public WebElement baslikTakmaKalanText;

    @FindBy (xpath="//tr[td[text()='Mil Koparma']]/td/button")
    public WebElement milKoparmaBitenButton;

    @FindBy (xpath="//tr[td[text()='Mil Koparma']]/td[3]")
    public WebElement milKoparmaKalanText;

    @FindBy (xpath="//div/button[@class='buttons-for-each-operation_polygon_button__LbXcI buttons-for-each-operation_index-1__jYNkE btn btn-primary']")
    public WebElement milTornalamaButton;

    @FindBy (xpath="//tr[td[text()='Mil Tornalama']]/td/button")
    public WebElement milTornalamaBitenButton;

    @FindBy (xpath="//tr[td[text()='Mil Tornalama']]/td[3]")
    public WebElement milTornalamaKalanText;

    @FindBy (xpath="//div/button[@class='buttons-for-each-operation_polygon_button__LbXcI buttons-for-each-operation_index-2__WKMUY btn btn-primary']")
    public WebElement milTaslamaButton;

    @FindBy (xpath="//div/button[@data-operation-type='MIL_TASLAMA']")
    public WebElement milTaslamaButton1;

    @FindBy (xpath="//tr[td[text()='Mil Taşlama']]/td/button")
    public WebElement milTaslalamaBitenButton;

    @FindBy (xpath="//tr[td[text()='Mil Taşlama']]/td[3]")
    public WebElement milTaslamaKalanText;

    @FindBy (xpath="//div/button[@class='buttons-for-each-operation_polygon_button__LbXcI buttons-for-each-operation_index-3__86dJM btn btn-primary']")
    public WebElement isilIslemButton;

    @FindBy (xpath="//div/button[@class='buttons-for-each-operation_polygon_button__LbXcI buttons-for-each-operation_index-1__jYNkE btn btn-primary']")
    public WebElement isilIslemButton1;

    @FindBy (xpath="//tr[td[text()='Isıl İşlem']]/td/button")
    public WebElement isilIslemBitenButton;

    @FindBy (xpath="//tr[td[text()='Isıl İşlem']]/td[3]")
    public WebElement isilIslemKalanText;

    @FindBy (xpath="//div/button[@data-operation-type='EZME']")
    public WebElement ezmeButton;

    @FindBy (xpath="//tr[td[text()='Ezme']]/td/button")
    public WebElement ezmeBitenButton;

    @FindBy (xpath="//tr[td[text()='Ezme']]/td[3]")
    public WebElement ezmeKalanText;

    @FindBy (xpath="//div/button[@data-operation-type='BORU_KESME_HAVSA']")
    public WebElement boruKesmeHavsaButton;

    @FindBy (xpath="//tr[td[text()='Boru Kesme']]/td/button")
    public WebElement boruKesmeHavsaBitenButton;

    @FindBy (xpath="//tr[td[text()='Boru Kesme']]/td[3]")
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

    @FindBy (xpath = "(//tr[@class='update-buttons_mil__d5MYX'])[1]/td[3]")
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

    @FindBy (xpath = "//table//tr[td[contains(text(), 'omer')] and td[contains(text(), 'Lift')]]//button//div[@class='order-toolbar_inner_check__fDRhb']")
    public  WebElement liftTamamlaButon;

    @FindBy (xpath = "//table//tr[td[contains(text(), 'omer')] and td[contains(text(), 'Lift')]]//td[contains(text(), 'Tamamlandı')]")
    public WebElement liftTamamlandiText;

    @FindBy (xpath = "//table//tr[td[contains(text(), 'omer')] and td[contains(text(), 'Lift')]]//button[@class='btn-link btn btn-danger']")
    public WebElement liftSiparisSil;

    @FindBy (xpath = "//table//tr[td[contains(text(), 'ramo')] and td[contains(text(), 'Paslanmaz')]]//button//div[@class='order-toolbar_inner_check__fDRhb']")
    public  WebElement paslanmazTamamlaButon;

    @FindBy (xpath = "//table//tr[td[contains(text(), 'ramo')] and td[contains(text(), 'Paslanmaz')]]//td[contains(text(), 'Tamamlandı')]")
    public WebElement paslanmazTamamlandiText;

    @FindBy (xpath = "//table//tr[td[contains(text(), 'ramo')] and td[contains(text(), 'Paslanmaz')]]//button[@class='btn-link btn btn-danger']")
    public WebElement paslanmazSiparisSil;

    @FindBy (xpath = "//table//tr[td[contains(text(), 'hasan')] and td[contains(text(), 'Damper')]]//button//div[@class='order-toolbar_inner_check__fDRhb']")
    public  WebElement damperTamamlaButon;

    @FindBy (xpath = "//table//tr[td[contains(text(), 'hasan')] and td[contains(text(), 'Damper')]]//td[contains(text(), 'Tamamlandı')]")
    public WebElement damperTamamlandiText;

    @FindBy (xpath = "//table//tr[td[contains(text(), 'hasan')] and td[contains(text(), 'Damper')]]//button[@class='btn-link btn btn-danger']")
    public WebElement damperSiparisSil;

    @FindBy (xpath = "//table//tr[td[contains(text(), 'alican')] and td[contains(text(), 'Blok Lift')]]//button//div[@class='order-toolbar_inner_check__fDRhb']")
    public  WebElement blokliftTamamlaButon;

    @FindBy (xpath = "//table//tr[td[contains(text(), 'alican')] and td[contains(text(), 'Blok Lift')]]//td[contains(text(), 'Tamamlandı')]")
    public WebElement blokliftTamamlandiText;

    @FindBy (xpath = "//table//tr[td[contains(text(), 'alican')] and td[contains(text(), 'Blok Lift')]]//button[@class='btn-link btn btn-danger']")
    public WebElement blokliftSiparisSil;
}
