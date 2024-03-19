package stepDefination.ekocari;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import pages.ekocari.HomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class EkocariStepDefinotions {
    HomePage ekocariPage = new HomePage();
    @Given("Kullanıcı ekocari sitesine gider")
    public void kullanıcı_ekocari_sitesine_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("ekocariUrl"));

    }
    @When("Kullanıcı e pota ve sifre girer")
    public void kullanıcı_e_pota_ve_sifre_girer() {

        ekocariPage.eposta.sendKeys(ConfigReader.getProperty("eposta"));
        ekocariPage.sifre.sendKeys(ConfigReader.getProperty("sifre"), Keys.ENTER);

    }
    @Then("Kullanici giris butonuna tıklar")
    public void kullanici_giris_butonuna_tıklar() {

    }

    @And("Sayfayı kapar")
    public void sayfayıKapar() {
        Driver.closeDriver();
    }

    @And("Kullanici ePosta bolumunu bos birakir")
    public void kullaniciEPostaBolumunuBosBirakir() {
        ekocariPage.eposta.sendKeys("");

    }

    @And("Kullanici sifre girer")
    public void kullaniciSifreGirer() {
        ekocariPage.sifre.sendKeys(ConfigReader.getProperty("sifre"), Keys.ENTER);
    }

    @And("Giris Yap butonuna tıklar")
    public void girisYapButonunaTıklar() {
    }

    @Then("Kullanıcı Adı veya Parola Hatalı yazısını görür")
    public void kullanıcıAdıVeyaParolaHatalıYazısınıGörür() {
        ekocariPage.hataYazısı.isDisplayed();

    }

    @When("Kullanici ePosta yanlis girer")
    public void kullaniciEPostaYanlisGirer() {
        ekocariPage.eposta.sendKeys("enes.karakus@ayssoft.comm");
    }

    @When("Kullanici ePosta girer")
    public void kullaniciEPostaGirer() {
        ekocariPage.eposta.sendKeys(ConfigReader.getProperty("eposta"));
    }

    @And("Kullanici sifre kısmını bos bırakır")
    public void kullaniciSifreKısmınıBosBırakır() {
        ekocariPage.sifre.sendKeys("", Keys.ENTER);
    }

    @And("Kullanici sifreyi yanlıs girer")
    public void kullaniciSifreyiYanlısGirer() {
        ekocariPage.sifre.sendKeys("555555", Keys.ENTER);
    }
}
