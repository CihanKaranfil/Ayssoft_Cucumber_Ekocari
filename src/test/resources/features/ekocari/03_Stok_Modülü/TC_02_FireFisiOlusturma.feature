@ortaktag
  Feature:Yeni Fire Fisi Olusturma
    Scenario: Kullanici Stok Hareketlerde Fire Fisi Olustrur
      Given Kullanici "ekocariUrl" sayfasına gider
      When Kullanici e pota ve sifre girer
      Then Kullanici giris butonuna tiklar
      Then Firmalar bolumunden firma sec
      When Kullanici stok menusune tıklar
      Then Kullanici stok hareketleri menusune tıklar
      Then Kullanici yeni stok harekete tıklar
      Then Kullanici fire fisi olustura tıklar
      When Kullanici fis no girer
      Then Satır ekle butonuna tıkla
      ##7.03.24 şuan fire fişi kayıtta sıkıntı var. Kayıt işlemini yavaş ve birden fazla yapıyor

