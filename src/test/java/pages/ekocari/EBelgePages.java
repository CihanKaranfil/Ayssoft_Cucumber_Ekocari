package pages.ekocari;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EBelgePages {
    public EBelgePages(){PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "//*[@id=\"gridList\"]/div[2]/table/tbody/tr[1]/td[1]/button") public WebElement gozİkonu;
    @FindBy(xpath = "//*[@id=\"divBtneInvoice\"]/button") public WebElement eBelge;
    @FindBy(xpath = "//*[@id=\"btneBelgeGonder\"]") public WebElement eBelgeGonder;
    @FindBy(xpath = "//*[@class='swal2-confirm swal2-styled swal2-default-outline']") public WebElement evetButton;
    @FindBy(xpath = "//*[@id=\"toast-container\"]/div/div[2]") public WebElement basarılıYazısı;




}
