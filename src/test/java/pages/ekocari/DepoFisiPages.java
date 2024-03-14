package pages.ekocari;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DepoFisiPages {
    public DepoFisiPages(){PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath ="//*[@id=\"gelecekDeger\"]/div[1]/div[4]/div/div/a[4]") public  WebElement depoFisi;



}
