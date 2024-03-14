@ortaktag
Feature:Satış Teklifleri Olusturma
  Scenario: Kullanici Satış Teklifleri Oluşturur
    Given Kullanici "ekocariUrl" sayfasına gider
    When Kullanici e pota ve sifre girer
    Then Kullanici giris butonuna tiklar
    Then Firmalar bolumunden firma sec
    Then Kullanici satis menusune tıklar
    Then Kullanici Satıs Tekliflerine tıklar
    Then Yeni Teklife tıkla
    When Cari seçimini yap yeni irsaliyede
    Then Fatura no gir
    Then Satır ekle butonuna tıkla
    And Kaydet butonuna tıklar
    #bu test çalısıyor
