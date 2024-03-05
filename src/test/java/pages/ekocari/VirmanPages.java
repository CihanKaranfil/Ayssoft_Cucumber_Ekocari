package pages.ekocari;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class VirmanPages {
    public VirmanPages(){PageFactory.initElements(Driver.getDriver(), this);}
    @FindBy(xpath = "//*[@id=\"gelecekDeger\"]/div[1]/div[4]/div/div/a[3]") public WebElement yeniVirmanFisi;
    @FindBy(xpath = "//*[@id=\"customerForm\"]/wt-tab-container/wt-tab-content/div[1]/div/div/div[2]/div/div[3]/div/button") public WebElement borcluCari;
    @FindBy(xpath = "//*[@id=\"row0grid\"]") public WebElement cariSecme;
    @FindBy(xpath = "//*[@id=\"customerForm\"]/wt-tab-container/wt-tab-content/div[1]/div/div/div[2]/div/div[4]/div/button") public WebElement alacaklıCari;
    @FindBy(xpath = "//*[@type='submit']") public WebElement kaydetButton;

}