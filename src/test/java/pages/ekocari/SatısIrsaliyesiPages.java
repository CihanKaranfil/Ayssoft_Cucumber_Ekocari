package pages.ekocari;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SatısIrsaliyesiPages {
    public SatısIrsaliyesiPages(){PageFactory.initElements(Driver.getDriver(), this);}
    @FindBy(xpath = "//*[@id=\"main-menu-navigation\"]/li[5]/ul/li[2]") public WebElement satisIrsaliyesi ;
    @FindBy(xpath = "//*[@id=\"gelecekDeger\"]/div[1]/div[4]/div/div/button") public WebElement yeniIrsaliye ;
    @FindBy(xpath = "//*[@id=\"gelecekDeger\"]/div[1]/div[4]/div/div/div/a[1]") public WebElement yenisatisIrsaliye ;
    @FindBy(xpath = "//*[@id=\"gelecekDeger\"]/div[1]/div[4]/div/div/div/a[2]") public WebElement yenisatisİadeIrsaliye ;
    @FindBy(xpath = "//*[@id=\"main-menu-navigation\"]/li[5]/ul/li[3]") public WebElement satisSiparisleri ;
    @FindBy(xpath = "//*[@id=\"main-menu-navigation\"]/li[5]/ul/li[4]/a") public WebElement satisTeklifleri ;



}
