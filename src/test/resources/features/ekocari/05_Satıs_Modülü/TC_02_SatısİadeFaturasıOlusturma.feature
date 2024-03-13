@ortaktag
Feature:Satış İade Faturası Olusturma
  Scenario: Kullanici Satış İade Faturası Oluşturur
    Given Kullanici "ekocariUrl" sayfasına gider
    When Kullanici e pota ve sifre girer
    Then Kullanici giris butonuna tiklar
    Then Firmalar bolumunden firma sec
    Then Kullanici satis menusune tıklar
    Then Kullanici Satıs Faturaları na tıklar
    When Yeni Fatura butonuna tıkla
    Then Yeni Satıs iade Faturasına tıklar
    When Cari seçimini yap
    Then Fatura no gir
    Then Satır ekle butonuna tıkla
    And Kaydet butonuna tıklar
    #bu test calışıyor.