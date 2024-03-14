package stepDefination.ekocari;

import io.cucumber.java.en.Then;
import pages.ekocari.DevirFisiPages;

public class DevirFisitepdefs {
    DevirFisiPages devirFisi = new DevirFisiPages();

    @Then("Kullanici Devir Fisine tıklar")
    public void kullaniciDevirFisineTıklar() {
        devirFisi.devirFisi.click();

    }
}
