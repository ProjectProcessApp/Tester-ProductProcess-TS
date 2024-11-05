package tester_productprocess_ts.stepDefinitions.apiStepDefinitions;

import io.cucumber.java.en.And;

public class GetRequest1 extends GetRequest {

    @And("{int} id numarali siparis Api ile GET edilir")
    public void idNumaraliSiparisApiIleGETEdilir(int arg0) {
        get01(arg0);
    }

    @And("{int} order numarali siparis API ile GET edilir")
    public void orderNumaraliSiparisAPIIleGETEdilir(int arg0) {
        get02(arg0);
    }

    @And("bir siparis POST edilir ve Apiden test edilir")
    public void birSiparisPOSTEdilirVeApidenTestEdilir() {
        post();
    }

    @And("idsi {int} olan siparise PUT yapilir")
    public void idsiOlanSiparisePUTYapilir(int arg0) {
        put(arg0);
    }

    @And("{int} order numarali siparis DELETE edilir ve apiden test edilir")
    public void orderNumaraliSiparisDELETEEdilirVeApidenTestEdilir(int arg0) {
        delete(arg0);
    }
}
