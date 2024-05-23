package stepDefination.ekocari;

import io.cucumber.java.en.Then;
import pages.ekocari.AlisTeklifPages;

public class AlisTeklifStepdefs {
    AlisTeklifPages alisTeklif = new AlisTeklifPages();

    @Then("Alış Tekliflerine tikla")
    public void alışTekliflerineTikla() {
        alisTeklif.alisTeklif.click();
    }

    @Then("Yeni Teklife tıkla")
    public void yeniTeklifeTıkla() {
        alisTeklif.yeniTeklif.click();
    }
}
