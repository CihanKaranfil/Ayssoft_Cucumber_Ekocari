@sayimfazlasifisi
Feature:Yeni Sayım Fazlası Fisi Olusturma
  Scenario: Kullanici Stok Hareketlerde Sayım Fazlası Fisi Olustrur
    Given Kullanici "ekocariUrl" sayfasına gider
    When Kullanici e pota ve sifre girer
    Then Kullanici giris butonuna tiklar
    Then Firmalar bolumunden firma sec
    When Kullanici stok menusune tıklar
    Then Kullanici stok hareketleri menusune tıklar
    Then Kullanici yeni stok harekete tıklar
    Then Kullanici Sayım Fazlası Fisine tıklar
    When Kullanici fis no girer
    Then Satır ekle butonuna tıkla
    Then Kaydet butonuna tıklar
    And Kayıt Basarıyla Kaydedildi yazısını dogrula
    ##bu test sıkıntısız calışıyor