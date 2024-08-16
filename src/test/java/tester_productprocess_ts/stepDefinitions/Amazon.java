package tester_productprocess_ts.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.asm.Advice;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import tester_productprocess_ts.utilities.uiUtilities.ConfigReader;
import tester_productprocess_ts.utilities.uiUtilities.Driver;


import static org.openqa.selenium.Keys.ENTER;

public class Amazon {

    tester_productprocess_ts.pages.Amazon amazonpage = new tester_productprocess_ts.pages.Amazon();
    Double onikinciurunFiyat;
    Double onucuncuurunFiyat;
    Actions action;
    Select select;

    @When("amazon.com sitesine git -search box'a thermos gir")
    public void amazon_com_sitesine_git_search_box_a_thermos_gir() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("url1"));
        amazonpage.akzeptieren.click();
        Thread.sleep(1000);
    }
    @When("search box'un sol tarafindaki kategoriden Sports & Outdoor sec")
    public void search_box_un_sol_tarafindaki_kategoriden_sports_outdoor_sec() throws InterruptedException {
        select = new Select(amazonpage.dropdownmenu);
        select.selectByValue("search-alias=sports");
        Thread.sleep(1000);
        amazonpage.searchbox.sendKeys("stanley thermoskanne",ENTER);
    }
    @When("karsina cikan urunlerden soldan itibaren sayarak {int}. urune tikla -urunun fiyatini  al")
    public void karsina_cikan_urunlerden_soldan_itibaren_sayarak_urune_tikla_urunun_fiyatini_al(Integer int1) throws InterruptedException {
        amazonpage.urunler.get(12).click();
        Thread.sleep(1000);
        onikinciurunFiyat = Double.parseDouble(amazonpage.onikiurunFiyat.getText());
        Thread.sleep(1000);
        System.out.println(onikinciurunFiyat);

    }
    @When("bir onceki sayfaya geri don {int}. urune tikla  urun fiyatini al")
    public void bir_onceki_sayfaya_geri_don_urune_tikla_urun_fiyatini_al(Integer int1) throws InterruptedException {
        Driver.getDriver().navigate().back();
        amazonpage.urunler.get(13).click();
        Thread.sleep(1000);
        onucuncuurunFiyat = Double.parseDouble(amazonpage.onucurunFiyat.getText());
        Thread.sleep(1000);
        System.out.println(onucuncuurunFiyat);
        Driver.getDriver().navigate().back();
    }
    @When("{int}. ve {int}. urunlerin fiyatlarini karsilastir. ucuz olan urunu sepete at")
    public void ve_urunlerin_fiyatlarini_karsilastir_ucuz_olan_urunu_sepete_at(Integer int1, Integer int2) throws InterruptedException {
        if (onikinciurunFiyat>onucuncuurunFiyat){
            amazonpage.urunler.get(13).click();
            Thread.sleep(1000);
            amazonpage.sepeteAt.click();
        }else {
            amazonpage.urunler.get(12).click();
            Thread.sleep(1000);
            amazonpage.sepeteAt.click();
        }
    }
    @When("sepeti yeni sekmede ac")
    public void sepeti_yeni_sekmede_ac() throws InterruptedException {
        Thread.sleep(1000);
        amazonpage.sepet.click();
        String url=  Driver.getDriver().getCurrentUrl();
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        Driver.getDriver().get(url);
    }
    @Then("proceed to check out tikla ve sign in sayfasina yonlendirildigini dogrula")
    public void proceed_to_check_out_tikla_ve_sign_in_sayfasina_yonlendirildigini_dogrula() {
        amazonpage.kasse.click();
        String a="Anmelden";
       String anmelden= amazonpage.anmelden.getText();
       Assert.assertEquals(a,anmelden);
    }
}
