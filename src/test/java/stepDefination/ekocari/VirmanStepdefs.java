package stepDefination.ekocari;

import io.cucumber.java.en.Then;
import org.openqa.selenium.interactions.Actions;
import pages.ekocari.VirmanPages;
import utilities.Driver;

public class VirmanStepdefs {
    VirmanPages virmanPages = new VirmanPages();
    Actions actions = new Actions(Driver.getDriver());

    @Then("Kullanici yeni virman fisi olustura tıklar")
    public void kullaniciYeniVirmanFisiOlusturaTıklar() {
        virmanPages.yeniVirmanFisi.click();

    }

    @Then("Kullanici borclu cari secer")
    public void kullaniciBorcluCariSecer() throws InterruptedException {
        virmanPages.borcluCari.click();Thread.sleep(1000);
        actions.doubleClick(virmanPages.cariSecme2).perform();
    }

    @Then("Kullanici alacakli cari secer")
    public void kullaniciAlacakliCariSecer() throws InterruptedException {
        virmanPages.alacaklıCari.click();Thread.sleep(1000);
        actions.doubleClick(virmanPages.cariSecme).perform();
    }

    @Then("Kullanici virman kaydet butonuna tıklar")
    public void kullaniciVirmanKaydetButonunaTıklar() throws InterruptedException {
        try {
            virmanPages.kaydetButton.click();
        } catch (Exception e) {
            virmanPages.kaydetButton.click();
        }
        Thread.sleep(3000);
    }
}
