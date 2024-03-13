@ortaktag
Feature:Satış Siparisi Olusturma
  Scenario: Kullanici Satış Siparisi Oluşturur
    Given Kullanici "ekocariUrl" sayfasına gider
    When Kullanici e pota ve sifre girer
    Then Kullanici giris butonuna tiklar
    Then Firmalar bolumunden firma sec
    Then Kullanici satis menusune tıklar
    Then Kullanici Satıs Siparislerine tıklar
    When Yeni Sipariş Oluştura tıkla
    When Cari seçimini yap yeni irsaliyede
    Then Fatura no gir
    Then Satır ekle butonuna tıkla
    And Kaydet butonuna tıklar
    #bu test çalısıyor


