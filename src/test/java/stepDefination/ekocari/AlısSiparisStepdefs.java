package stepDefination.ekocari;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ekocari.AlisSiparisPages;

public class AlısSiparisStepdefs {
    AlisSiparisPages alisSiparis = new AlisSiparisPages();
    @Then("Alış siparişlerine tıkla")
    public void alışSiparişlerineTıkla() {
        alisSiparis.alisSiparisleri.click();


    }

    @When("Yeni Sipariş Oluştura tıkla")
    public void yeniSiparişOluşturaTıkla() {
        alisSiparis.yeniSiparis.click();

    }
}
