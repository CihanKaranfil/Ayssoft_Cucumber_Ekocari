package stepDefination.ekocari;

import io.cucumber.java.en.Then;
import pages.ekocari.SayımEksigiFisiPages;

public class SayımEksigiFisiStepdefs {
    SayımEksigiFisiPages sayımEksigiFisi = new SayımEksigiFisiPages();

    @Then("Kullanici Sayım Eksigi Fisine tıklar")
    public void kullaniciSayımEksigiFisineTıklar() {
        sayımEksigiFisi.sayımEksigiFisi.click();
    }
}
