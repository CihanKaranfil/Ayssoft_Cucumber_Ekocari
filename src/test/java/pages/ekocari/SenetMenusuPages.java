package pages.ekocari;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SenetMenusuPages {
    public SenetMenusuPages(){PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "//*[@id=\"main-menu-navigation\"]/li[8]/ul/li[2]/a") public WebElement senetMenusu;
    @FindBy(xpath = "//*[@id=\"gelecekDeger\"]/div[1]/div[4]/div/button") public WebElement yeniSenetButton;
    @FindBy(xpath = "//*[@id=\"toast-container\"]/div/div[2]") public WebElement dogrulamaYazisi;
    @FindBy(xpath = "//*[@id=\"gelecekDeger\"]/div[1]/div[4]/div/div/a[1]") public WebElement senetGirisButton;
    @FindBy(xpath = "//*[@id=\"gelecekDeger\"]/div[1]/div[4]/div/div/a[2]") public WebElement senetCıkısButton;
    @FindBy(xpath = "//*[@id=\"gelecekDeger\"]/div[1]/div[4]/div/div/a[3]") public WebElement senetCıkısPortfoyden;
    @FindBy(xpath = "//*[@id=\"gelecekDeger\"]/div[1]/div[4]/div/div/a[4]") public WebElement senetCıkısBankaTahsil;
    @FindBy(xpath = "//*[@id=\"gelecekDeger\"]/div[1]/div[4]/div/div/a[5]") public WebElement senetCıkısDiger;
    @FindBy(xpath = "//*[@id=\"customerForm\"]/wt-tab-container/wt-tab-content/div[1]/div/div/div[2]/div/div[1]/div[4]/div/button/i") public WebElement ciroUcNokta;
    @FindBy(xpath = "//*[@id=\"row0grid\"]") public WebElement listedenSenetSec;
    @FindBy(xpath = "//*[@title=' [F2]']") public WebElement kaydetButton;




}