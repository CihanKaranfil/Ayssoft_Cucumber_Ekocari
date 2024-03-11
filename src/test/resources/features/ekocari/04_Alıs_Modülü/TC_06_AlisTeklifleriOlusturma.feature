@alışmodulu0
Feature:Alis Teklifi Oluşturma
  Scenario: Kullanici Alis Teklifi Oluşturur
    Given Kullanici "ekocariUrl" sayfasına gider
    When Kullanici e pota ve sifre girer
    Then Kullanici giris butonuna tiklar
    Then Firmalar bolumunden firma sec
    Then Alış menusune tıkla
    Then Alış Tekliflerine tikla
    Then Yeni Teklife tıkla
    When Alıs faturasında Cari seçimini yap
    Then Fatura no gir
    Then Satır ekle butonuna tıkla
    Then Yeni Alıs İrsaliye Kaydet butonuna tıklar
    # bu test çalışıyor

