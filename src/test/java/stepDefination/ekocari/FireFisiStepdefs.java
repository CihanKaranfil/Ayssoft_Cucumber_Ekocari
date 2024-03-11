package stepDefination.ekocari;

import io.cucumber.java.en.Then;
import pages.ekocari.FireFisiPages;

public class FireFisiStepdefs {
    FireFisiPages fireFisi = new FireFisiPages();
    @Then("Kullanici stok hareketleri menusune tıklar")
    public void kullaniciStokHareketleriMenusuneTıklar() {
        fireFisi.stokHareketleri.click();

    }

    @Then("Kullanici yeni stok harekete tıklar")
    public void kullaniciYeniStokHareketeTıklar() {
        fireFisi.yenistokHareketi.click();
        
    }

    @Then("Kullanici fire fisi olustura tıklar")
    public void kullaniciFireFisiOlusturaTıklar() {
        fireFisi.fireFisi.click();
    }
}
