@ortaktag
Feature:Senet İşlemleri
  Scenario: Kullanici Senet Cıkıs oluşturur
    Given Kullanici "ekocariUrl" sayfasına gider
    When Kullanici e pota ve sifre girer
    And Kullanici giris butonuna tiklar
    Then Firmalar bolumunden firma sec
    And Cek Senet menusune tıkla
    And Senet menusune tıkla
    Then Yeni senete tıkla
    And Senet Cıkısa tıkla
    Then Bodro No gir
    And Senet menüsünde Cari Seç
    And Tl Tutar gir
    And Senet Kaydet butonuna tıkla
    And Senetin kaydedildigini dogrula
    #bu test çalışıyor