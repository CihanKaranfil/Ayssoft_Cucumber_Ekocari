@sayimeksigifisi
Feature:Yeni Sayım Eksigi Fisi Olusturma
  Scenario: Kullanici Stok Hareketlerde Sayım Eksigi Fisi Olustrur
    Given Kullanici "ekocariUrl" sayfasına gider
    When Kullanici e pota ve sifre girer
    Then Kullanici giris butonuna tiklar
    Then Firmalar bolumunden firma sec
    When Kullanici stok menusune tıklar
    Then Kullanici stok hareketleri menusune tıklar
    Then Kullanici yeni stok harekete tıklar
    Then Kullanici Sayım Eksigi Fisine tıklar
    When Kullanici fis no girer
    Then Satır ekle butonuna tıkla
    Then Kaydet butonuna tıklar
    And Kayıt Basarıyla Kaydedildi yazısını dogrula
    ##bu test sıkıntısız calışıyor