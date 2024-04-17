@ortaktag
Feature:Satış Faturasını eBelge Olarak Gönderme
  Scenario: Satış Faturasını eBelge Olarak Gönderme
    Given Kullanici "ekocariUrl" sayfasına gider
    When Kullanici e pota ve sifre girer (yedek)
    And Kullanici giris butonuna tiklar
    And Firmalar bolumunden firma sec
    And Kullanici satis menusune tıklar
    And Satıs İrsaliyesine tıkla
