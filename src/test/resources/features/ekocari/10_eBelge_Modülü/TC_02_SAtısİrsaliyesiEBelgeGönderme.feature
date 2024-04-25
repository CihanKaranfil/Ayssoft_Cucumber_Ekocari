@ortaktag11
Feature:Satış Faturasını eBelge Olarak Gönderme
  Scenario: Satış Faturasını eBelge Olarak Gönderme
    Given Kullanici "ekocariUrl" sayfasına gider
    When Kullanici e pota ve sifre girer (yedek)
    And Kullanici giris butonuna tiklar
    And Firmalar bolumunden firma sec
    And Kullanici satis menusune tıklar
    And Kullanici Satis İrsaliyelerine tıklar
    Then Yeni İrsaliye ye tıkla
    And Satıs İrsaliyesine tıkla
    And Cari seçimini yap yeni irsaliyede
    And Fatura no gir
    And Satır ekle butonuna tıkla
    And Ürün seçimi yap
    And Kaydet butonuna tıklar
    #kaydetme işlemi uzun sürdügü için hata alıyoruz
    And İrsaliyenin oluşmasını bekle
    Then Olusan satıs faturasında göz ikonuna tıklar

    And e-Belge Göndere tıklar
    And Evet ikonuna tıklar
    And Belge Basarıyla Sisteme Gonderildi yazısını dogrula
    #bu test calışıyor.Assertions kısmı yapılacak
