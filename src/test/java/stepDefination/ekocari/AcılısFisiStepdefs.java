package stepDefination.ekocari;

import io.cucumber.java.en.Then;
import pages.ekocari.AcılısFisiPages;

public class AcılısFisiStepdefs {
    AcılısFisiPages acılısFisi = new AcılısFisiPages();
    @Then("Kullanici Acılıs Fisine tıklar")
    public void kullaniciAcılısFisineTıklar() {
        acılısFisi.yeniAcılısFisi.click();
    }

    @Then("Kullanici yeni acılıs fisini kaydeder")
    public void kullaniciYeniAcılısFisiniKaydeder() {
        try {
            acılısFisi.kaydetButton.click();
        } catch (Exception e) {
            acılısFisi.kaydetButton.click();
        }
    }
}
