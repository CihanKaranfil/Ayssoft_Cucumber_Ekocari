package stepDefination.ekocari;

import io.cucumber.java.en.Then;
import pages.ekocari.SatısIrsaliyesiPages;

public class SatısİrsaliyesiStepdefs {
    SatısIrsaliyesiPages satısIrsaliyesi = new SatısIrsaliyesiPages();

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
    public void satışİadeİrsaliyesineTıkla() {
        satısIrsaliyesi.yenisatisİadeIrsaliye.click();

    }

    @Then("Kullanici Satıs Siparislerine tıklar")
    public void kullaniciSatısSiparislerineTıklar() {
        satısIrsaliyesi.satisSiparisleri.click();

    }

    @Then("Kullanici Satıs Tekliflerine tıklar")
    public void kullaniciSatısTekliflerineTıklar() {
        satısIrsaliyesi.satisTeklifleri.click();

    }
}
