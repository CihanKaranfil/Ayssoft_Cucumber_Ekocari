@ortaktag
Feature:Alis Siparisi Oluşturma
  Scenario: Kullanici Alis Siparisi Oluşturur
    Given Kullanici "ekocariUrl" sayfasına gider
    When Kullanici e pota ve sifre girer
    Then Kullanici giris butonuna tiklar
    Then Firmalar bolumunden firma sec
    Then Alış menusune tıkla
    Then Alış siparişlerine tıkla
    When Yeni Sipariş Oluştura tıkla
    When Alıs faturasında Cari seçimini yap
    Then Fatura no gir
    Then Satır ekle butonuna tıkla
    Then Yeni Alıs İrsaliye Kaydet butonuna tıklar
    # bu test çalışıyor

