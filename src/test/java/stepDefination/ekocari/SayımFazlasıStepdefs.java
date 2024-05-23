package stepDefination.ekocari;

import io.cucumber.java.en.Then;
import pages.ekocari.SayımFazlasıFisiPages;

public class SayımFazlasıStepdefs {
    SayımFazlasıFisiPages sayimFazlasiFisi = new SayımFazlasıFisiPages();
    @Then("Kullanici Sayım Fazlası Fisine tıklar")
    public void kullaniciSayımFazlasıFisineTıklar() {
        sayimFazlasiFisi.sayimFazlasiFisi.click();

    }
}
