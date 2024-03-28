@ortaktag112
Feature:Satış Faturasını eBelge Olarak Gönderme
  Scenario: Satış Faturasını eBelge Olarak Gönderme
    Given Kullanici "ekocariUrl" sayfasına gider
    When Kullanici e pota ve sifre girer
    And Kullanici giris butonuna tiklar
    And Firmalar bolumunden firma sec
    And Kullanici satis menusune tıklar
    And Kullanici Satıs Faturaları na tıklar
    And Yeni Fatura butonuna tıkla
    Then Yeni Satıs Faturasına tıklar
    When Cari seçimini yap2
    And Fatura no gir
    And Satır ekle butonuna tıkla
    And Ürün seçimi yap
    And Kaydet butonuna tıklar
    Then Olusan satıs faturasında göz ikonuna tıklar  # burda patlıyor
    And  e-Belge ye tıklar
    And e-Belge Göndere tıklar
    And Evet ikonuna tıklar
    And Belge Basarıyla Sisteme Gonderildi yazısını dogrula
    #bu test calışıyor.