package stepDefination.ekocari;

import io.cucumber.java.en.Then;
import pages.ekocari.DepoFisiPages;

public class DepoFisiStepdefs {
    DepoFisiPages depoFisi = new DepoFisiPages();

    @Then("Kullanici Depo Fisine tıklar")
    public void kullaniciDepoFisineTıklar() {
        depoFisi.depoFisi.click();
    }
}
