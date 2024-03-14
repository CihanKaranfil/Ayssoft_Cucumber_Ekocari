@ortaktag
Feature: Cariye Acılıs Fişi Oluşturma
  Scenario: Kullanici cariye Acılıs fisi olusturur
    Given Kullanici "ekocariUrl" sayfasına gider
    When Kullanici e pota ve sifre girer
    Then Kullanici giris butonuna tiklar
    Then Firmalar bolumunden firma sec
    When Cari ye tıklar
    Then Kullanici Cari hareketlere tıklar
    Then Kullanici Yeni Cari Hareketlerine tıklar
    Then Kullanici Acılıs Fisine tıklar
    When Kullanici fis no girer
    Then Kullanici Cari seçimini yapar
    Then Kullanici Tl Tutar girer
    Then Kullanici yeni acılıs fisini kaydeder
