package tester_productprocess_ts.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tester_productprocess_ts.utilities.uiUtilities.Driver;

import java.util.List;

public class Amazon {

    public Amazon() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//select[@class='nav-search-dropdown searchSelect nav-progressive-attrubute nav-progressive-search-dropdown']")
    public WebElement dropdownmenu;
    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchbox;
    @FindBy(id = "sp-cc-accept")
    public WebElement akzeptieren;

    @FindBy(xpath = "//div[@class='a-section aok-relative s-image-square-aspect']")
    public List<WebElement> urunler;

    @FindBy(xpath = "(//span[@class='a-price-whole'])[1]")
    public WebElement onikiurunFiyat;
    @FindBy(xpath = "(//span[@class='a-price-whole'])[1]")
    public WebElement onucurunFiyat;
    @FindBy(xpath = "(//input[@id='add-to-cart-button'])[1]")
    public WebElement sepeteAt;
    @FindBy(xpath = "//*[@id='sw-gtc']/span")
    public WebElement sepet;
    @FindBy(xpath = "//span[@id='desktop-ptc-button-celWidget']")
    public WebElement kasse;
    @FindBy(xpath = "//*[@id=\"authportal-main-section\"]/div[2]/div[2]/div[1]/form/div/div/div/h1")
    public WebElement anmelden;
}