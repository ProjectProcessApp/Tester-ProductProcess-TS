package tester_productprocess_ts.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tester_productprocess_ts.utilities.uiUtilities.Driver;

import java.util.List;

public class Amazon {

    public Amazon(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//select[@class='nav-search-dropdown searchSelect nav-progressive-attrubute nav-progressive-search-dropdown']")
    public WebElement dropdownmenu;
    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchbox;
    @FindBy(id = "sp-cc-accept")
    public WebElement akzeptieren;

    @FindBy(xpath = "//div[@class='a-section a-spacing-base']")
    public List<WebElement> urunler;// sirali tum urunleri listelemk icin kullanilir.

    @FindBy(xpath = "(//span[@class='a-price-whole'])[1]")
    public WebElement onikiurunFiyat;
    @FindBy(xpath = "(//span[@class='a-price-whole'])[1]")
    public WebElement onucurunFiyat;
    @FindBy(xpath = "(//input[@id='add-to-cart-button'])[1]")
    public WebElement sepeteAt;
    @FindBy(xpath = "//a[@class='nav-a nav-a-2 nav-progressive-attribute']")
    public WebElement sepet;
    @FindBy(id = "nav-search-submit-button")
    public WebElement submitbutton;

}