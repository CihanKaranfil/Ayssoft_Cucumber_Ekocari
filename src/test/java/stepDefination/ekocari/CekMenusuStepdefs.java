package stepDefination.ekocari;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.ekocari.CekMenusuPages;

public class CekMenusuStepdefs {
    CekMenusuPages cekMenusu = new CekMenusuPages();
    Faker faker = new Faker();

    @And("Cek Senet menusune tıkla")
    public void cekSenetMenusuneTıkla() {
        cekMenusu.cekSenetMenusu.click();
    }

    @And("Cek menusune tıkla")
    public void cekMenusuneTıkla() {
        cekMenusu.cekMenusu.click();
    }

    @And("Yeni Cek butonuna tıkla")
    public void yeniCekButonunaTıkla() {
        cekMenusu.yeniCekbuton.click();
    }

    @And("Cek Giris butonuna tıkla")
    public void cekGirisButonunaTıkla() {
        cekMenusu.cekGirisbuton.click();
    }

    @Then("Bodro No gir")
    public void bodroNoGir() {
        cekMenusu.bordroNo.clear();
        cekMenusu.bordroNo.sendKeys(faker.number().digits(3));
    }

    @And("Cek menüsünde Cari Seç")
    public void cekMenüsündeCariSeç() throws InterruptedException {
        cekMenusu.cariucnokta.click();Thread.sleep(2000);
        cekMenusu.listedenCarisecimi.click();
        cekMenusu.listedenCarisecimi.click();
    }

    @And("Tl Tutar gir")
    public void tlTutarGir() {
        cekMenusu.tlTutar.clear();
        cekMenusu.tlTutar.sendKeys(faker.number().digits(4));
    }

    @And("Cek kaydet butonuna tıkla")
    public void cekKaydetButonunaTıkla() {
        try {
            cekMenusu.kaydetbuton.click();
        } catch (Exception e) {
            cekMenusu.kaydetbuton.click();
        }
    }

    @Then("Cekin kaydedildigini dogrula")
    public void cekinKaydedildiginiDogrula() {
    }

    @And("Cek Cıkıs Kendi Cekimiz butonuna tıkla")
    public void cekCıkısKendiCekimizButonunaTıkla() {
        cekMenusu.cekCıkıskendibuton.click();
    }

    @And("Cek Cıkıs Ciro butonuna tıkla")
    public void cekCıkısCiroButonunaTıkla() {
        cekMenusu.cekCıkısCirobuton.click();
    }
}
