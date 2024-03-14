package stepDefination.ekocari;

import io.cucumber.java.en.Then;
import pages.ekocari.SayımFazlasıFisiPages;

public class SayımFazlasıStepdefs {
    SayımFazlasıFisiPages sayımFazlasıFisi = new SayımFazlasıFisiPages();
    @Then("Kullanici Sayım Fazlası Fisine tıklar")
    public void kullaniciSayımFazlasıFisineTıklar() {
        sayımFazlasıFisi.sayımFazlasıFisi.click();

    }
}
