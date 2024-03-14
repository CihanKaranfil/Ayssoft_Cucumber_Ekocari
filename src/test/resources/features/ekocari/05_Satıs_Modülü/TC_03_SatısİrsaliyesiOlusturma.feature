@ortaktag
Feature:Satış İrsaliyesi Olusturma
  Scenario: Kullanici Satış İade Faturası Oluşturur
    Given Kullanici "ekocariUrl" sayfasına gider
    When Kullanici e pota ve sifre girer
    Then Kullanici giris butonuna tiklar
    Then Firmalar bolumunden firma sec
    Then Kullanici satis menusune tıklar
    Then Kullanici Satis İrsaliyelerine tıklar
    Then Yeni İrsaliye ye tıkla
    Then Satıs İrsaliyesine tıkla
    When Cari seçimini yap yeni irsaliyede
    Then Fatura no gir
    Then Satır ekle butonuna tıkla
    And Kaydet butonuna tıklar
    #bu test çalısıyor

