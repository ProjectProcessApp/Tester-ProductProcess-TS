package tester_productprocess_ts.stepDefinitions.apiStepDefinitions;

import io.cucumber.java.en.And;

public class GetRequest1 extends GetRequest {

      @And("idsi {int} olan siparis Apiden test edilir")
    public void idsiOlanSiparisApidenTestEdilir(int arg0) {
        get01(arg0);
    }


    @And("bir siparis eklenir ve Apiden test edilir")
    public void birSiparisEklenirVeApidenTestEdilir() {
          post();
    }
}
