package stepDefination.ekocari;

import io.cucumber.java.en.Then;
import pages.ekocari.SarfFisiPages;

public class SarfFisiStepdefs {
    SarfFisiPages sarfFisi = new SarfFisiPages();

    @Then("Kullanici Sarf Fisi olustura tıklar")
    public void kullaniciSarfFisiOlusturaTıklar() {
        sarfFisi.sarfFisi.click();
    }
}
