package tester_productprocess_ts.stepDefinitions.uiStepDefinitions.us05;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import tester_productprocess_ts.pages.Anamenu;
import tester_productprocess_ts.pages.TalasliImalatAmiriGorevleri;
import tester_productprocess_ts.utilities.apiUtilities.Authentication;
import tester_productprocess_ts.utilities.uiUtilities.Driver;

import javax.swing.*;
import java.util.Map;
import static io.restassured.RestAssured.given;
import static tester_productprocess_ts.utilities.uiUtilities.ReusableMethods.*;

public class BoyaVePaketlemeLiftTuru extends Authentication {

    String token="";
    TalasliImalatAmiriGorevleri talasligorev = new TalasliImalatAmiriGorevleri();
    Anamenu anamenu = new Anamenu();
    Response response;
    String sari ="rgba(255, 255, 0, 1)";
    String gri ="rgba(180, 177, 177, 1)";
    String yesil="rgba(0, 128, 0, 1)";

    @Then("Boyama ve Paketleme Amiri ekrandaki datalari dogrular")
    public void boyama_ve_paketleme_amiri_ekrandaki_datalari_dogrular() {
        waitFor(1000);
        token=token();
        int satirSayisi =talasligorev.boyaPaketlemesiparisNo.size();
        int siparisNo;
        String url="";
        WebElement hucre;
        int satirHucreSayisi;
        String[] jsonKeys = {
                "customerName", "gasanNo", "orderNumber", "orderDate",
                "deliveryDate", "orderType", "orderQuantity", "orderStatus", "readyMilCount" };

        for (int i = 0; i <satirSayisi ; i++) {
            waitFor(300);
            siparisNo= Integer.parseInt(talasligorev.boyaPaketlemesiparisNo.get(i).getText());
            url = "http://localhost:8080/orders/getByOrderNumber/"+ siparisNo+"";
            response=given().header("Authorization", "Bearer " + token).when().get(url).then().statusCode(200).extract().response();
           // Map<String, Object> json = response.jsonPath().getMap("returnBody");
            satirHucreSayisi=talasligorev.boyaPaketlemehucre.size()/satirSayisi;
            for (int j = 1; j <=satirHucreSayisi ; j++) {
                hucre=Driver.getDriver().findElement(By.xpath("//tr[@class='boyama-paketleme_table_body__jVDL8']["+(i+1)+"]/td["+j+"]"));
                Assert.assertEquals(hucre.getText(), response.jsonPath().getString(jsonKeys[(j-1)]));
            }
            System.out.println(i+1+". satir eslesiyor");
        }
    }
    @Then("sag taraftaki kalan bolumu dogrulanir")
    public void sagTaraftakiKalanBolumuDogrulanir() {
        int siparisAdedi= Integer.parseInt(talasligorev.siparisAdedi.getText());
        int actualBoyaKalanText= Integer.parseInt(talasligorev.boyaKalanText.getText());
        Assert.assertEquals(siparisAdedi,actualBoyaKalanText);
    }
    @Then("Boya butonunun sari renk oldugu dogrulanir")
    public void boya_butonunun_sari_renk_oldugu_dogrulanir() {
        waitFor(1500);
        String buttonRenk=talasligorev.boyaButon.getCssValue("background-color");
        Assert.assertEquals(sari,buttonRenk);
    }
    @Then("Paketleme butonunun gri renk oldugu dogrulanir")
    public void paketleme_butonunun_gri_renk_oldugu_dogrulanir() {
        waitFor(1500);
        String buttonRenk=talasligorev.paketlemeButon.getCssValue("background-color");
        Assert.assertEquals(gri,buttonRenk);
    }
    @Then("Boya butonuna tiklanir")
    public void boya_butonuna_tiklanir() {
        waitFor(1500);
        clickWithJS(talasligorev.boyaButon);
    }
    @Then("Boya butonunun yesil renk oldugu dogrulanir")
    public void boya_butonunun_yesil_renk_oldugu_dogrulanir() {
        waitFor(2000);
        String buttonRenk=talasligorev.boyaButon.getCssValue("background-color");
        Assert.assertEquals(yesil,buttonRenk);
    }
    @Then("Paketleme butonunun sari renk oldugu dogrulanir")
    public void paketleme_butonunun_sari_renk_oldugu_dogrulanir() {
        waitFor(2000);
        String buttonRenk=talasligorev.paketlemeButon.getCssValue("background-color");
        Assert.assertEquals(sari,buttonRenk);
    }
    @Then("girilen adedin sag tarafta boya biten bolumune islendigi dogrulanir")
    public void girilen_adedin_sag_tarafta_boya_biten_bolumune_islendigi_dogrulanir() {
        waitFor(1500);
        waitForVisibility(talasligorev.boyaBitenButton,10);
        Assert.assertEquals(Integer.parseInt(talasligorev.boyaBitenButton.getText()),Integer.parseInt(talasligorev.siparisAdedi.getText()));
    }
    @Then("sag taraftaki boya kalan bolumundeki rakam dogrulanir")
    public void sag_taraftaki_boya_kalan_bolumundeki_rakam_dogrulanir() {
        int siparisAdedi= Integer.parseInt(talasligorev.siparisAdedi.getText());
        waitFor(2000);
        int actualBoyaKalanText= Integer.parseInt(talasligorev.boyaKalanText.getText());
        Assert.assertTrue(siparisAdedi>actualBoyaKalanText);
    }
    @Then("Paketleme butonuna tiklanir")
    public void paketleme_butonuna_tiklanir() {
       waitFor(1500);
       clickWithJS(talasligorev.paketlemeButon);
    }
    @Then("Paketleme butonunun yesil renk oldugu dogrulanir")
    public void paketleme_butonunun_yesil_renk_oldugu_dogrulanir() {
        waitFor(1500);
        String buttonRenk=talasligorev.paketlemeButon.getCssValue("background-color");
        Assert.assertEquals(yesil,buttonRenk);
    }
    @Then("girilen adedin sag tarafta paketleme biten bolumune islendigi dogrulanir")
    public void girilen_adedin_sag_tarafta_paketleme_biten_bolumune_islendigi_dogrulanir() {
        waitFor(2500);
        waitForVisibility(talasligorev.boyaBitenButton,10);
        Assert.assertEquals(Integer.parseInt(talasligorev.paketlemeBitenButton.getText()),Integer.parseInt(talasligorev.siparisAdedi.getText()));
    }
    @Then("sag taraftaki paketleme kalan bolumundeki rakam dogrulanir")
    public void sag_taraftaki_paketleme_kalan_bolumundeki_rakam_dogrulanir() {
        int siparisAdedi= Integer.parseInt(talasligorev.siparisAdedi.getText());
        waitFor(2000);
        int actualPaketlemeKalanText= Integer.parseInt(talasligorev.paketlemeKalanText.getText());
        Assert.assertTrue(siparisAdedi>actualPaketlemeKalanText);
    }

    @And("Lift turu icin nihai uretimi tamamla butonuna tiklanir")
    public void liftTuruIcinNihaiUretimiTamamlaButonunaTiklanir() {
        waitFor(1500);
        Actions action = new Actions(Driver.getDriver());
        action.scrollToElement(talasligorev.liftTamamlaButon).click(talasligorev.liftTamamlaButon).perform();
        //clickWithJS(talasligorev.liftTamamlaButon);
    }

    @Then("Lift turu siparisin tamamlandi durumuna gectigi dogrulanir")
    public void liftTuruSiparisinTamamlandiDurumunaGectigiDogrulanir() {
        waitFor(1500);
        String expectedTamamlandiText="Tamamlandı";
        String actualTamamlandiText=talasligorev.liftTamamlandiText.getText();
        Assert.assertEquals(expectedTamamlandiText,actualTamamlandiText);
    }

    @And("Lift siparisi silinir")
    public void liftSiparisiSilinir() {
        waitFor(1500);
        clickWithJS(talasligorev.liftSiparisSil);
        waitFor(1000);
        clickWithJS(talasligorev.onaylaButton);
    }

    @And("Paslanmaz turu icin nihai uretimi tamamla butonuna tiklanir")
    public void paslanmazTuruIcinNihaiUretimiTamamlaButonunaTiklanir() {
        waitFor(1500);
        clickWithJS(talasligorev.paslanmazTamamlaButon);
    }

    @Then("Paslanmaz turu siparisin tamamlandi durumuna gectigi dogrulanir")
    public void paslanmazTuruSiparisinTamamlandiDurumunaGectigiDogrulanir() {
        waitFor(1500);
        String expectedTamamlandiText="Tamamlandı";
        String actualTamamlandiText=talasligorev.paslanmazTamamlandiText.getText();
        Assert.assertEquals(expectedTamamlandiText,actualTamamlandiText);
    }

    @And("Paslanmaz siparisi silinir")
    public void paslanmazSiparisiSilinir() {
        waitFor(1500);
        clickWithJS(talasligorev.paslanmazSiparisSil);
        waitFor(1000);
        clickWithJS(talasligorev.onaylaButton);
    }

    @And("Damper turu icin nihai uretimi tamamla butonuna tiklanir")
    public void damperTuruIcinNihaiUretimiTamamlaButonunaTiklanir() {
        waitFor(1500);
        clickWithJS(talasligorev.damperTamamlaButon);
    }

    @Then("Damper turu siparisin tamamlandi durumuna gectigi dogrulanir")
    public void damperTuruSiparisinTamamlandiDurumunaGectigiDogrulanir() {
        waitFor(1500);
        String expectedTamamlandiText="Tamamlandı";
        String actualTamamlandiText=talasligorev.damperTamamlandiText.getText();
        Assert.assertEquals(expectedTamamlandiText,actualTamamlandiText);
    }

    @And("Damper siparisi silinir")
    public void damperSiparisiSilinir() {
        waitFor(1500);
        clickWithJS(talasligorev.damperSiparisSil);
        waitFor(1000);
        clickWithJS(talasligorev.onaylaButton);
    }

    @And("Bloklift turu icin nihai uretimi tamamla butonuna tiklanir")
    public void blokliftTuruIcinNihaiUretimiTamamlaButonunaTiklanir() {
        waitFor(1500);
        clickWithJS(talasligorev.blokliftTamamlaButon);
    }

    @Then("Bloklift turu siparisin tamamlandi durumuna gectigi dogrulanir")
    public void blokliftTuruSiparisinTamamlandiDurumunaGectigiDogrulanir() {
        waitFor(1500);
        String expectedTamamlandiText="Tamamlandı";
        String actualTamamlandiText=talasligorev.blokliftTamamlandiText.getText();
        Assert.assertEquals(expectedTamamlandiText,actualTamamlandiText);
    }

    @And("Bloklift siparisi silinir")
    public void blokliftSiparisiSilinir() {
        waitFor(1500);
        clickWithJS(talasligorev.blokliftSiparisSil);
        waitFor(1000);
        clickWithJS(talasligorev.onaylaButton);
    }
}
