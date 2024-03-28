package stepDefination.ekocari;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.ekocari.EBelgePages;
import utilities.ReusableMethods;

public class eBelgeStepdefs extends ReusableMethods {
    EBelgePages eBelgePages =new EBelgePages();
    @Then("Olusan satıs faturasında göz ikonuna tıklar")
    public void olusanSatısFaturasındaGözIkonunaTıklar() {
        click(eBelgePages.gozİkonu);
    }

    @And("e-Belge ye tıklar")
    public void eBelgeYeTıklar() {
        eBelgePages.eBelge.click();
    }

    @And("e-Belge Göndere tıklar")
    public void eBelgeGöndereTıklar() {
        eBelgePages.eBelgeGonder.click();
    }

    @And("Evet ikonuna tıklar")
    public void evetIkonunaTıklar() {
        eBelgePages.evetButton.click();
    }

    @And("Belge Basarıyla Sisteme Gonderildi yazısını dogrula")
    public void belgeBasarıylaSistemeGonderildiYazısınıDogrula() {
    }
}
