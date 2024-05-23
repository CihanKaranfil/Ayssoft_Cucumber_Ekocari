package stepDefination.ekocari;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.ekocari.AlisPages;
import utilities.Driver;

import java.util.List;

public class AlisFaturasiDef {
    AlisPages alisPages = new AlisPages();
    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());
    @When("Alış menusune tıkla")
    public void alışMenusuneTıkla() {
        alisPages.alis.click();
    }

    @When("Alış Faturalarına tıkla")
    public void alışFaturalarınaTıkla() throws InterruptedException {
        alisPages.alisFaturalari.click();Thread.sleep(1000);
    }

    @Then("Yeni Fatura butonuna tıkla")
    public void yeniFaturaButonunaTıkla() throws InterruptedException {
        alisPages.yeniFatura.click(); Thread.sleep(1000);
    }

    @Then("Alış Faturası oluştura tıkla")
    public void alışFaturasıOluşturaTıkla() {
        alisPages.alisfaturasi.click();
    }

    @When("Cari seçimini yap")
    public void cariSeçiminiYap() throws InterruptedException {
        alisPages.caributton.click();Thread.sleep(1000);
        alisPages.listedencarisec2.click();
        alisPages.listedencarisec2.click();

    }
    @When("Cari seçimini yap2")
    public void cariSeçiminiYap2() throws InterruptedException {
        alisPages.caributton.click();Thread.sleep(1000);
        actions.doubleClick(alisPages.listedencarisec2).perform();

    }

    @Then("Fatura no gir")
    public void faturaNoGir() {
        alisPages.faturaNo.sendKeys(faker.number().digits(5));
    }

    @Then("Satır ekle butonuna tıkla")
    public void satırEkleButonunaTıkla() throws InterruptedException {
        alisPages.satirEkle.click();
        Thread.sleep(3000);
    }

    @Then("Yeni Alıs Faturası Kaydet butonuna tıklar")
    public void yeniAlısFaturasıKaydetButonunaTıklar() {
        alisPages.kaydetButton.click();
    }

    @Then("Kayıt Basarıyla Kaydedildi yazısını dogrula")
    public void kayıtBasarıylaKaydedildiYazısınıDogrula() {
        alisPages.basariliyazisi.isEnabled();
        Assert.assertTrue(alisPages.basariliyazisi.isEnabled());
    }

    @When("Alıs faturasında Cari seçimini yap")
    public void alısFaturasındaCariSeçiminiYap() throws InterruptedException {
        alisPages.cariSec.click();Thread.sleep(1000);
      actions.doubleClick(alisPages.listedenCariSec).perform();

    }
}
