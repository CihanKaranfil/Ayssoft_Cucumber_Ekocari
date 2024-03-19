@ortaktag
Feature: Kullanıcı Sifresini Yanlıs Girerek Login Olmamalı

  Background:Kullanıcı Ekocari sayfasına giris yapamaz
    Given Kullanici "ekocariUrl" sayfasına gider

  Scenario:Kullanıcı Sifre bolumunu bos bırakarak giris yapamaz
    When Kullanici ePosta girer
    And Kullanici sifre kısmını bos bırakır
    And Giris Yap butonuna tıklar
    Then Kullanıcı Adı veya Parola Hatalı yazısını görür

  Scenario:Kullanıcı Sifreyi yanlıs girerek giris yapamaz
    When Kullanici ePosta girer
    And Kullanici sifreyi yanlıs girer
    And Giris Yap butonuna tıklar
    Then Kullanıcı Adı veya Parola Hatalı yazısını görür
    #bu test çalışıyor