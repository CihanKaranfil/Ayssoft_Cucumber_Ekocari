package pages.ekocari;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FireFisiPages {
    public FireFisiPages(){PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath ="//*[@id=\"main-menu-navigation\"]/li[3]/ul/li[2]") public  WebElement stokHareketleri ;
    @FindBy(xpath ="//*[@id=\"gelecekDeger\"]/div[1]/div[4]/div/button") public  WebElement yenistokHareketi ;
    @FindBy(xpath ="//*[@id=\"gelecekDeger\"]/div[1]/div[4]/div/div/a[1]") public  WebElement fireFisi ;



}
