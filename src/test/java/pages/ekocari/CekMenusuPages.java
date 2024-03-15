package pages.ekocari;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CekMenusuPages {
    public CekMenusuPages(){PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "//*[@id=\"main-menu-navigation\"]/li[8]/a/span") public WebElement cekSenetMenusu;
    @FindBy(xpath = "//*[@id=\"main-menu-navigation\"]/li[8]/ul/li[1]/a") public WebElement cekMenusu;
    @FindBy(xpath = "//*[@id=\"gelecekDeger\"]/div[1]/div[4]/div/button") public WebElement yeniCekbuton;
    @FindBy(xpath = "//*[@id=\"gelecekDeger\"]/div[1]/div[4]/div/div/a[1]") public WebElement cekGirisbuton;
    @FindBy(xpath = "//*[@id=\"gelecekDeger\"]/div[1]/div[4]/div/div/a[2]") public WebElement cekCıkıskendibuton;
    @FindBy(xpath = "//*[@id=\"gelecekDeger\"]/div[1]/div[4]/div/div/a[3]") public WebElement cekCıkısCirobuton;
    @FindBy(xpath = "//*[@id=\"gelecekDeger\"]/div[1]/div[4]/div/div/a[4]") public WebElement cekCıkısBankabuton;
    @FindBy(xpath = "//*[@id=\"gelecekDeger\"]/div[1]/div[4]/div/div/a[5]") public WebElement cekCıkısDigerbuton;
    @FindBy(xpath = "//*[@id=\"txtROLLNO\"]") public WebElement bordroNo;
    @FindBy(xpath = "//*[@id=\"customerForm\"]/wt-tab-container/wt-tab-content/div[1]/div/div/div[2]/div/div[1]/div[3]/div/button") public WebElement cariucnokta;
    @FindBy(xpath = "(//*[@id=\"row2grid\"])[1]") public WebElement listedenCarisecimi;
    @FindBy(xpath = "//*[@id=\"txtCREDIT\"]") public WebElement tlTutar;
    @FindBy(xpath = "//*[@title=\" [F2]\"]") public WebElement kaydetbuton;



}