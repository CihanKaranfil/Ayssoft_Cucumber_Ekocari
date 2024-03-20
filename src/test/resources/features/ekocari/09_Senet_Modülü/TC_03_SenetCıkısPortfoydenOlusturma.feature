@ortaktag11
Feature:Senet İşlemleri
  Scenario: Kullanici Senet Cıkıs(Portfoyden) oluşturur
    Given Kullanici "ekocariUrl" sayfasına gider
    When Kullanici e pota ve sifre girer
    And Kullanici giris butonuna tiklar
    Then Firmalar bolumunden firma sec
    And Cek Senet menusune tıkla
    And Senet menusune tıkla
    Then Yeni senete tıkla
    And Senet Cıkıs portfoyden e tıkla
    Then Bodro No gir
    And Senet menüsünde Cari Seç
    And Ciro edilecek senet sec
    And Senet Kaydet butonuna tıkla
    And Senetin kaydedildigini dogrula
    #bu test kayıt işlemi yapmıyor