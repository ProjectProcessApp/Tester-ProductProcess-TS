package tester_productprocess_ts.stepDefinitions.uiStepDefinitions.us03;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import tester_productprocess_ts.pages.TalasliImalatAmiriGorevleri;
import tester_productprocess_ts.pages.Anamenu;
import tester_productprocess_ts.utilities.apiUtilities.Authentication;
import tester_productprocess_ts.utilities.uiUtilities.Driver;
import java.util.Map;
import static io.restassured.RestAssured.given;
import static tester_productprocess_ts.utilities.uiUtilities.ReusableMethods.*;

public class TalasliImalatAmiriLiftTuruBaslatma extends Authentication {

    String token="";
    TalasliImalatAmiriGorevleri talasligorev = new TalasliImalatAmiriGorevleri();
    String sari ="rgba(255, 255, 0, 1)";
    String gri ="rgba(158, 156, 156, 1)";
    String yesil="rgba(0, 128, 0, 1)";
    int uretilecekAdet;

    @Then("Talasli Imalat Amiri ekrandaki datalari dogrular")
    public void talasli_imalat_amiri_ekrandaki_datalari_dogrular() {
        waitFor(2000);
        token=token();
        int satirSayisi =talasligorev.satirSayisi.size();
        int id;
        String url="";
        WebElement hucre;
        int satirHucreSayisi;
        String[] jsonKeys = {
                "id", "customerName", "gasanNo", "orderNumber", "orderDate",
                "deliveryDate", "orderType", "orderQuantity", "orderStatus", "readyMilCount" };

        for (int i = 0; i <satirSayisi ; i++) {
            id= Integer.parseInt(talasligorev.siparisNo.get(i).getText());
            url = "http://localhost:8080/orders/getOrderById/" + id;
            Response response=given().header("Authorization", "Bearer " + token).when().get(url).then().statusCode(200).extract().response();
            Map<String, Object> json = response.jsonPath().getMap("returnBody");
            satirHucreSayisi=talasligorev.hucre.size()/satirSayisi;
            for (int j = 1; j <satirHucreSayisi ; j++) {
                hucre=Driver.getDriver().findElement(By.xpath("//tr[@class='talasli_table_body__Msmho']["+(i+1)+"]/td["+j+"]"));
                Assert.assertEquals(hucre.getText(),json.get(jsonKeys[(j-1)]).toString());
            }
            System.out.println(i+1+". satir eslesiyor");
        }
    }
    @Then("Lift siparis turundeki siparisin basla butonuna tiklar")
    public void lift_siparis_turundeki_siparisin_basla_butonuna_tiklar() {
            if (!talasligorev.liftBaslaButton.isEmpty() & !talasligorev.liftBaslaButton.getFirst().getText().equals("Durdur")) {
                clickWithJS(talasligorev.liftBaslaButton.getFirst());
                waitFor(1000);
                clickWithJS(talasligorev.liftSatirButton);
            }else if(talasligorev.liftBaslaButton.getFirst().getText().equals("Durdur")){
            waitForVisibility(talasligorev.liftSatirButton, 10);
            clickWithJS(talasligorev.liftSatirButton);
            }
    }
    @Then("Lift siparis turundeki siparisin bulundugu satira tiklar")
    public void lift_siparis_turundeki_siparisin_bulundugu_satira_tiklar() {
        waitForVisibility(talasligorev.liftSatirButton,10);
        clickWithJS(talasligorev.liftSatirButton);
    }
    @Then("Mil Koparma Butonunun sari renk oldugu dogrulanir")
    public void mil_koparma_butonunun_sari_renk_oldugu_dogrulanir() {
        waitFor(1000);
        waitForVisibility(talasligorev.milKoparmaButton,10);
        String buttonRenk=talasligorev.milKoparmaButton.getCssValue("background-color");
        Assert.assertEquals(sari,buttonRenk);
    }
    @Then("Mil Tornalama Butonunun gri renk oldugu dogrulanir")
    public void mil_tornalama_butonunun_gri_renk_oldugu_dogrulanir() {
        waitForVisibility(talasligorev.milTornalamaButton,10);
        String buttonRenk=talasligorev.milTornalamaButton.getCssValue("background-color");
        Assert.assertEquals(gri,buttonRenk);
    }
    @Then("Mil Taslama Butonunu gri renk oldugu dogrulanir")
    public void mil_taslama_butonunu_gri_renk_oldugu_dogrulanir() {
        waitForVisibility(talasligorev.milTaslamaButton,10);
        String buttonRenk=talasligorev.milTaslamaButton.getCssValue("background-color");
        Assert.assertEquals(gri,buttonRenk);
    }
    @Then("Isil Islem Butonunu gri renk oldugu dogrulanir")
    public void isil_islem_butonunu_gri_renk_oldugu_dogrulanir() {
        waitForVisibility(talasligorev.isilIslemButton,10);
        String buttonRenk=talasligorev.isilIslemButton.getCssValue("background-color");
        Assert.assertEquals(gri,buttonRenk);
    }
    @Then("Mil Koparma butonuna tiklanir")
    public void mil_koparma_butonuna_tiklanir() {
        waitForVisibility(talasligorev.milKoparmaButton,10);
        waitFor(1000);
        clickWithJS(talasligorev.milKoparmaButton);
    }
    @Then("uretilen adedi giriniz yazisi dogrulanir")
    public void uretilen_adedi_giriniz_yazisi_dogrulanir() {
        String expectedUretilenAdetText="Üretilen Adedi Giriniz";
        String actualUretilenAdetText=talasligorev.uretilenAdetText.getText();
        Assert.assertEquals(expectedUretilenAdetText,actualUretilenAdetText);
    }
    @And("LIFT siparis turu icin uretilecek adet girilir")
    public void liftSiparisTuruIcinUretilecekAdetGirilir() {
        waitForVisibility(talasligorev.uretilenAdetTextBox,10);
        talasligorev.uretilenAdetTextBox.sendKeys("1500");
        uretilecekAdet= 1500;
    }
    @Then("onayla butonuna tiklanir")
    public void onayla_butonuna_tiklanir() {
        clickWithJS(talasligorev.onaylaButton);
        waitFor(1000);
    }
    @Then("girilen adedin sag tarafta mil koparma biten bolumune islendigi dogrulanir")
    public void girilen_adedin_sag_tarafta_mil_koparma_biten_bolumune_islendigi_dogrulanir() {
        waitFor(1000);
        waitForVisibility(talasligorev.milKoparmaBitenButton,10);
        Assert.assertEquals(Integer.parseInt(talasligorev.milKoparmaBitenButton.getText()),Integer.parseInt(talasligorev.siparisAdedi.getText()));
    }
    @Then("sag taraftaki mil koparma kalan bolumundeki rakam dogrulanir")
    public void sag_taraftaki_mil_koparma_kalan_bolumundeki_rakam_dogrulanir() {
        int siparisAdedi= Integer.parseInt(talasligorev.siparisAdedi.getText());
        waitFor(1000);
        int actualMilKoparmaKalanText= Integer.parseInt(talasligorev.milKoparmaKalanText.getText());
        Assert.assertTrue(siparisAdedi>actualMilKoparmaKalanText);
    }
    @Then("Mil Koparma Butonunun yesil renk oldugu dogrulanir")
    public void mil_koparma_butonunun_yesil_renk_oldugu_dogrulanir() {
        waitForVisibility(talasligorev.milKoparmaButton,10);
        String buttonRenk=talasligorev.milKoparmaButton.getCssValue("background-color");
        Assert.assertEquals(yesil,buttonRenk);
    }
    @Then("Mil Tornalama Butonunun sari renk oldugu dogrulanir")
    public void mil_tornalama_butonunun_sari_renk_oldugu_dogrulanir() {
        waitForVisibility(talasligorev.milTornalamaButton,10);
        String buttonRenk=talasligorev.milTornalamaButton.getCssValue("background-color");
        Assert.assertEquals(sari,buttonRenk);
    }
    @Then("Mil tornalama butonuna tiklanir")
    public void mil_tornalama_butonuna_tiklanir() {
        waitForVisibility(talasligorev.milTornalamaButton,10);
        clickWithJS(talasligorev.milTornalamaButton);
    }
    @Then("girilen adedin sag tarafta mil tornalama biten bolumune islendigi dogrulanir")
    public void girilen_adedin_sag_tarafta_mil_tornalama_biten_bolumune_islendigi_dogrulanir() {
        waitFor(1000);
        waitForVisibility(talasligorev.milTornalamaBitenButton,10);
        Assert.assertEquals(Integer.parseInt(talasligorev.milTornalamaBitenButton.getText()),Integer.parseInt(talasligorev.siparisAdedi.getText()));
    }
    @Then("sag taraftaki mil tornalama kalan bolumundeki rakam dogrulanir")
    public void sag_taraftaki_mil_tornalama_kalan_bolumundeki_rakam_dogrulanir() {
        int siparisAdedi= Integer.parseInt(talasligorev.siparisAdedi.getText());
        waitFor(1000);
        int actualMilTornalamaKalanText= Integer.parseInt(talasligorev.milTornalamaKalanText.getText());
        Assert.assertTrue(siparisAdedi>actualMilTornalamaKalanText);
    }
    @Then("Mil Tornalama Butonunun yesil renk oldugu dogrulanir")
    public void mil_tornalama_butonunun_yesil_renk_oldugu_dogrulanir() {
        waitForVisibility(talasligorev.milTornalamaButton,10);
        String buttonRenk=talasligorev.milTornalamaButton.getCssValue("background-color");
        Assert.assertEquals(yesil,buttonRenk);
    }
    @Then("Mil Taslama Butonunu sari renk oldugu dogrulanir")
    public void mil_taslama_butonunu_sari_renk_oldugu_dogrulanir() {
        waitFor(1000);
        String buttonRenk=talasligorev.milTaslamaButton.getCssValue("background-color");
        Assert.assertEquals(sari,buttonRenk);
    }
    @Then("Mil taslama butonuna tiklanir")
    public void mil_taslama_butonuna_tiklanir() {
        waitFor(1000);
        clickWithJS(talasligorev.milTaslamaButton);
    }

    @Then("girilen adedin sag tarafta mil taslama biten bolumune islendigi dogrulanir")
    public void girilen_adedin_sag_tarafta_mil_taslama_biten_bolumune_islendigi_dogrulanir() {
        waitFor(1000);
        waitForVisibility(talasligorev.milTaslalamaBitenButton,10);
        Assert.assertEquals(Integer.parseInt(talasligorev.milTaslalamaBitenButton.getText()),Integer.parseInt(talasligorev.siparisAdedi.getText()));
    }

    @Then("sag taraftaki mil taslama kalan bolumundeki rakam dogrulanir")
    public void sag_taraftaki_mil_taslama_kalan_bolumundeki_rakam_dogrulanir() {
        int siparisAdedi= Integer.parseInt(talasligorev.siparisAdedi.getText());
        waitFor(1000);
        int actualMilTaslamaKalanText= Integer.parseInt(talasligorev.milTaslamaKalanText.getText());
        Assert.assertTrue(siparisAdedi>actualMilTaslamaKalanText);
    }

    @Then("Mil Taslama Butonunu yesil renk oldugu dogrulanir")
    public void mil_taslama_butonunu_yesil_renk_oldugu_dogrulanir() {
        waitForVisibility(talasligorev.milTaslamaButton,10);
        String buttonRenk=talasligorev.milTaslamaButton.getCssValue("background-color");
        Assert.assertEquals(yesil,buttonRenk);
    }

    @Then("Isil Islem Butonunu sari renk oldugu dogrulanir")
    public void isil_islem_butonunu_sari_renk_oldugu_dogrulanir() {
        waitForVisibility(talasligorev.isilIslemButton,10);
        String buttonRenk=talasligorev.isilIslemButton.getCssValue("background-color");
        Assert.assertEquals(sari,buttonRenk);
    }

    @Then("Isil Islem butonuna tiklanir")
    public void isil_islem_butonuna_tiklanir() {
        clickWithJS(talasligorev.isilIslemButton);
    }

    @Then("girilen adedin sag tarafta Isil Islem biten bolumune islendigi dogrulanir")
    public void girilen_adedin_sag_tarafta_isil_islem_biten_bolumune_islendigi_dogrulanir() {
        waitForVisibility(talasligorev.isilIslemBitenButton,10);
        Assert.assertEquals(uretilecekAdet,Integer.parseInt(talasligorev.siparisAdedi.getText()));
    }

    @Then("sag taraftaki Isil Islem kalan bolumundeki rakam dogrulanir")
    public void sag_taraftaki_isil_islem_kalan_bolumundeki_rakam_dogrulanir() {
        int siparisAdedi= Integer.parseInt(talasligorev.siparisAdedi.getText());
        waitFor(1000);
        int actualIsilIslemKalanText= Integer.parseInt(talasligorev.isilIslemKalanText.getText());
        Assert.assertTrue(siparisAdedi>actualIsilIslemKalanText);
    }

    @And("sag taraftaki Boru Kesme Havsa butonuna tiklanir")
    public void sagTaraftakiBoruKesmeHavsaButonunaTiklanir() {
        clickWithJS(talasligorev.boruKesmeHavsaButton);
    }

    @Then("girilen adedin sag tarafta Boru Kesme Havsa biten bolumune islendigi dogrulanir")
    public void girilenAdedinSagTaraftaBoruKesmeHavsaBitenBolumuneIslendigiDogrulanir() {
        waitFor(1000);
        Assert.assertEquals(Integer.parseInt(talasligorev.boruKesmeHavsaBitenButton.getText()),Integer.parseInt(talasligorev.siparisAdedi.getText()));
    }

    @Then("sag taraftaki Boru Kesme Havsa kalan bolumundeki rakam dogrulanir")
    public void sagTaraftakiBoruKesmeHavsaKalanBolumundekiRakamDogrulanir() {
        int siparisAdedi= Integer.parseInt(talasligorev.siparisAdedi.getText());
        waitFor(1000);
        int actualIsilIslemKalanText= Integer.parseInt(talasligorev.boruKesmeHavsKalanText.getText());
        Assert.assertTrue(siparisAdedi>actualIsilIslemKalanText);
    }

    @Then("Polisaj Amirindeki Lift siparis turundeki siparisin bulundugu satira tiklar")
    public void polisaj_amirindeki_lift_siparis_turundeki_siparisin_bulundugu_satira_tiklar() {
        waitFor(1000);
        clickWithJS(talasligorev.liftSatirButton);
    }

    @Then("Polisaj butonunun sari renk oldugu dogrulanir")
    public void polisaj_butonunun_sari_renk_oldugu_dogrulanir() {
        waitForVisibility(talasligorev.polisajButton,10);
        String buttonRenk=talasligorev.polisajButton.getCssValue("background-color");
        Assert.assertEquals(sari,buttonRenk);
    }

    @Then("Polisaj ok butonuna tiklanir")
    public void polisaj_ok_butonuna_tiklanir() {
        clickWithJS(talasligorev.polisajButton);
    }

    @Then("Polisaj butonunun yesil renk oldugu dogrulanir")
    public void polisaj_butonunun_yesil_renk_oldugu_dogrulanir() {
        waitFor(1000);
        String buttonRenk=talasligorev.polisajButton.getCssValue("background-color");
        Assert.assertEquals(yesil,buttonRenk);
    }

    @Then("girilen adedin Polisaj biten bolumune islendigi dogrulanir")
    public void girilenAdedinPolisajBitenBolumuneIslendigiDogrulanir() {
        waitForVisibility(talasligorev.polisajBitenButton,10);
        Assert.assertEquals(Integer.parseInt(talasligorev.polisajBitenButton.getText()),Integer.parseInt(talasligorev.siparisAdedi.getText()));
    }

    @Then("Polisaj kalan bolumundeki rakam dogrulanir")
    public void polisajKalanBolumundekiRakamDogrulanir() {
        int siparisAdedi= Integer.parseInt(talasligorev.siparisAdedi.getText());
        waitFor(1000);
        int actualIsilIslemKalanText= Integer.parseInt(talasligorev.polisajKalanText.getText());
        Assert.assertTrue(siparisAdedi>actualIsilIslemKalanText);
    }
    @Then("Kalite kontrol Amirindeki Lift siparis turundeki siparisin bulundugu satira tiklar")
    public void kalite_kontrol_amirindeki_lift_siparis_turundeki_siparisin_bulundugu_satira_tiklar() {
        waitFor(1000);
        clickWithJS(talasligorev.liftSatirButton);
    }
    @Then("Polisaj sonrasi butona tiklar")
    public void polisaj_sonrasi_butona_tiklar() {
        waitFor(500);
        clickWithJS(talasligorev.polisajSonrasiSatirButton);
    }

    @Then("Polisaj sonrasi Kalite kontrol Onayla butona tiklanir")
    public void polisaj_sonrasi_kalite_kontrol_onayla_butona_tiklanir() {
        waitFor(500);
        clickWithJS(talasligorev.kaliteKontrolOnaylaButton);
    }

    @Then("girilen adedin sag tarafta biten bolumune islendigi dogrulanir")
    public void girilen_adedin_sag_tarafta_biten_bolumune_islendigi_dogrulanir() {
        waitFor(1000);
        int biten= Integer.parseInt(talasligorev.kaliteKontrolOnaylandiBitenButton.getText());
        Assert.assertEquals(biten,Integer.parseInt(talasligorev.siparisAdedi.getText()));
    }

    @Then("Kalite kontrol sag taraftaki kalan bolumundeki rakam dogrulanir")
    public void kaliteKontrolSagTaraftakiKalanBolumundekiRakamDogrulanir() {
        int siparisAdedi= Integer.parseInt(talasligorev.siparisAdedi.getText());
        waitFor(1000);
        int actualKaliteKontrolOnaylandiKalanText= Integer.parseInt(talasligorev.kaliteKontrolKalanText.getText());
        Assert.assertTrue(siparisAdedi>=actualKaliteKontrolOnaylandiKalanText);
    }
}
