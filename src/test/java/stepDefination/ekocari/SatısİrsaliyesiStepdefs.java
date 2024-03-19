package stepDefination.ekocari;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ekocari.AlisPages;
import pages.ekocari.SatısIrsaliyesiPages;

public class SatısİrsaliyesiStepdefs {
    SatısIrsaliyesiPages satısIrsaliyesi = new SatısIrsaliyesiPages();
    AlisPages alisPages = new AlisPages();

    @Then("Kullanici Satis İrsaliyelerine tıklar")
    public void kullaniciSatisİrsaliyelerineTıklar() {
        satısIrsaliyesi.satisIrsaliyesi.click();

    }

    @Then("Yeni İrsaliye ye tıkla")
    public void yeniİrsaliyeYeTıkla() {
        satısIrsaliyesi.yeniIrsaliye.click();
    }

    @Then("Satıs İrsaliyesine tıkla")
    public void satısİrsaliyesineTıkla() {
        satısIrsaliyesi.yenisatisIrsaliye.click();
    }

    @Then("Satış İade İrsaliyesine tıkla")
    public void satışİadeİrsaliyesineTıkla() throws InterruptedException {
        satısIrsaliyesi.yenisatisİadeIrsaliye.click();
        Thread.sleep(1000);

    }

    @Then("Kullanici Satıs Siparislerine tıklar")
    public void kullaniciSatısSiparislerineTıklar() throws InterruptedException {
        satısIrsaliyesi.satisSiparisleri.click();
        Thread.sleep(1000);
    }

    @Then("Kullanici Satıs Tekliflerine tıklar")
    public void kullaniciSatısTekliflerineTıklar() {
        satısIrsaliyesi.satisTeklifleri.click();

    }

    @When("Satıs İade de Cari seçimini yap")
    public void satısİadeDeCariSeçiminiYap() throws InterruptedException {
        alisPages.caributton.click();Thread.sleep(1000);
        alisPages.listedencarisec3.click();
        alisPages.listedencarisec3.click();

    }
}
