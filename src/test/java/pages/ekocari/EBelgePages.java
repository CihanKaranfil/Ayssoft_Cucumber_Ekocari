package pages.ekocari;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EBelgePages {
    public EBelgePages(){PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "//*[@id=\"gridList_active_cell\"]/button") public WebElement gozİkonu;
    @FindBy(xpath = "//*[@id=\"divBtneInvoice\"]/button") public WebElement eBelge;
    @FindBy(xpath = "//*[@id=\"btneBelgeGonder\"]") public WebElement eBelgeGonder;
    @FindBy(xpath = "/html/body/div[92]/div/div[6]/button[1]") public WebElement evetButton;




}
