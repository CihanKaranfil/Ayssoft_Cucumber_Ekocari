package stepDefination.ekocari;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.interactions.Actions;
import pages.ekocari.CekMenusuPages;
import pages.ekocari.SenetMenusuPages;
import utilities.Driver;

public class SenetStepdefs {
    CekMenusuPages cekMenusu = new CekMenusuPages();
    SenetMenusuPages senetMenusu = new SenetMenusuPages();
    Actions actions = new Actions(Driver.getDriver());

    @And("Senet menusune tıkla")
    public void senetMenusuneTıkla() {
        senetMenusu.senetMenusu.click();
    }

    @Then("Yeni senete tıkla")
    public void yeniSeneteTıkla() {
        senetMenusu.yeniSenetButton.click();
    }

    @And("Senet girise tıkla")
    public void senetGiriseTıkla() {
        senetMenusu.senetGirisButton.click();
    }

    @And("Senet menüsünde Cari Seç")
    public void senetMenüsündeCariSeç() throws InterruptedException {
        cekMenusu.cariucnokta.click();Thread.sleep(2000);
        cekMenusu.listedenCarisecimi.click();
        cekMenusu.listedenCarisecimi.click();
    }


    @And("Senetin kaydedildigini dogrula")
    public void senetinKaydedildiginiDogrula() {
        senetMenusu.dogrulamaYazisi.isDisplayed();
    }

    @And("Senet Cıkısa tıkla")
    public void senetCıkısaTıkla() {
        senetMenusu.senetCıkısButton.click();
    }

    @And("Senet Cıkıs portfoyden e tıkla")
    public void senetCıkısPortfoydenETıkla() {
        senetMenusu.senetCıkısPortfoyden.click();
    }

    @And("Ciro edilecek senet sec")
    public void ciroEdilecekSenetSec() throws InterruptedException {
        senetMenusu.ciroUcNokta.click();Thread.sleep(1000);
        senetMenusu.listedenSenetSec.click();
        senetMenusu.listedenSenetSec.click();


    }

    @And("Senet Kaydet butonuna tıkla")
    public void senetKaydetButonunaTıkla() {
        try {
           actions.click(senetMenusu.kaydetButton).perform();
        } catch (Exception e) {
            senetMenusu.kaydetButton.click();
        }
    }
}
