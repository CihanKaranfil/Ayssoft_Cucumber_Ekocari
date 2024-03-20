@ortaktag
Feature: Cek İşlemleri
  Scenario: Kullanici Cek Cıkıs Ciro oluşturur
    Given Kullanici "ekocariUrl" sayfasına gider
    When Kullanici e pota ve sifre girer
    Then Kullanici giris butonuna tiklar
    Then Firmalar bolumunden firma sec
    And Cek Senet menusune tıkla
    And Cek menusune tıkla
    And Yeni Cek butonuna tıkla
    #bu menü suan çalısmıyor