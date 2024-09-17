package tester_productprocess_ts.stepDefinitions.apiStepDefinitions;

import io.cucumber.java.en.And;

public class GetRequest1 extends GetRequest {

    @And("id numara ile siparis Apiden test edilir")
    public void idNumaraIleSiparisApidenTestEdilir() {
        get01();
    }

    @And("ordernummer ile siparis API den test edilir")
    public void ordernummerIleSiparisAPIDenTestEdilir() {
        get02();
    }


    @And("bir siparis eklenir ve Apiden test edilir")
    public void birSiparisEklenirVeApidenTestEdilir() {
          post();
    }

    @And("idsi {int} olan siparis APIden guncellendi")
    public void idsiOlanSiparisAPIdenGuncellendi(int arg0) {
        put(arg0);
    }

    @And("{int} ordernummer siparis silinir ve apiden test edilir")
    public void ordernummerSiparisSilinirVeApidenTestEdilir(int arg0) {
          delete(arg0);
    }


}
