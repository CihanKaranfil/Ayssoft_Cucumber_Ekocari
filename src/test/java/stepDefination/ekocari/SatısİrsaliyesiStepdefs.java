package stepDefination.ekocari;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import pages.ekocari.AlisPages;
import pages.ekocari.SatısIrsaliyesiPages;
import utilities.Driver;

public class SatısİrsaliyesiStepdefs {
    SatısIrsaliyesiPages satısIrsaliyesi = new SatısIrsaliyesiPages();
    AlisPages alisPages = new AlisPages();
    Actions actions = new Actions(Driver.getDriver());

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
    public void satışİadeİrsaliyesineTıkla() throws InterruptedException {
        satısIrsaliyesi.yenisatisİadeIrsaliye.click();
        Thread.sleep(1000);

    }

    @Then("Kullanici Satıs Siparislerine tıklar")
    public void kullaniciSatısSiparislerineTıklar() throws InterruptedException {
        satısIrsaliyesi.satisSiparisleri.click();
        Thread.sleep(1000);
    }

    @Then("Kullanici Satıs Tekliflerine tıklar")
    public void kullaniciSatısTekliflerineTıklar() {
        satısIrsaliyesi.satisTeklifleri.click();

    }

    @When("Satıs İade de Cari seçimini yap")
    public void satısİadeDeCariSeçiminiYap() throws InterruptedException {
        alisPages.caributton.click();Thread.sleep(1000);
        actions.doubleClick(alisPages.listedencarisec3).perform();


    }
}
