@ortaktag55
Feature: Kullanıcı Login Olur ve Çıkış İslemi yapar

  Scenario: Kullanıcı Ekocari Sayfasında Cıkıs Yapar
    Given Kullanici "ekocariUrl" sayfasına gider
    When Kullanici e pota ve sifre girer
    And Kullanici giris butonuna tiklar
    And Sayfaya giris yapıldığı doğrulanır
    And Firmalar bolumunden firma sec
    When Keypad menusune tıklar
    And Cıkıs ikonuna tıklar

