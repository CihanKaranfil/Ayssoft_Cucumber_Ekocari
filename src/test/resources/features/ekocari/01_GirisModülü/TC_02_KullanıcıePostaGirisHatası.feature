@ortaktag
Feature: Kullanıcı ePostsını Yanlıs Girerek Login Olmamalı

  Background:  Kullanıcı Ekocari sayfasına Giris yapamaz
    Given Kullanici "ekocariUrl" sayfasına gider

  Scenario:Kullanıcı ePosta bolumunu bos bırakarak giris yapamaz
    When Kullanici ePosta bolumunu bos birakir
    And Kullanici sifre girer
    And Giris Yap butonuna tıklar
    Then Kullanıcı Adı veya Parola Hatalı yazısını görür

  Scenario:Kullanıcı ePosta yanlış girer giris yapamaz
    When Kullanici ePosta yanlis girer
    And Kullanici sifre girer
    And Giris Yap butonuna tıklar
    Then Kullanıcı Adı veya Parola Hatalı yazısını görür
    And Sayfayı kapar
    #bu test çalışıyor

