package pages.ekocari;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AlisTeklifPages {
    public AlisTeklifPages(){PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "//*[@id=\"main-menu-navigation\"]/li[4]/ul/li[4]/a") public WebElement alisTeklif;
    @FindBy(xpath = "//*[@id=\"gelecekDeger\"]/div[1]/div[4]/div/button") public WebElement yeniTeklif;

}
