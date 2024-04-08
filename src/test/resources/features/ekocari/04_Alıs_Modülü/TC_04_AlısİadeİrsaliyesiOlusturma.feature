@ortaktag
Feature:Alis İade İrsaliyesi Oluşturma
  Scenario: Kullanici Alis İade İrsaliyesi Oluşturur
    Given Kullanici "ekocariUrl" sayfasına gider
    When Kullanici e pota ve sifre girer
    Then Kullanici giris butonuna tiklar
    Then Firmalar bolumunden firma sec
    Then Alış menusune tıkla
    Then Alış İrsaliyelerine tıkla
    When Yeni İrsaliye oluştura tıkla
    Then Alış iade İrsaliyesi oluştur
    When Alıs faturasında Cari seçimini yap
    Then Fatura no gir
    Then Satır ekle butonuna tıkla
    Then Yeni Alıs İrsaliye Kaydet butonuna tıklar

    # bu test calışıyor


