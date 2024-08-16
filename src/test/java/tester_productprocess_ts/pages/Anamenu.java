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


}
