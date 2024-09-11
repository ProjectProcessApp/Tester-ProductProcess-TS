Feature:US02_Siparis Guncelleme-Silme

  Background:  Anasayfa ve dogrulama


    When Anasayfaya gidilir
    Then Anasayfada oldugu dogrulanir

  Scenario: Verilen siparisi guncelleme


    Then Uretim Planlama butonunun gorunur oldugu dogrulanir
    And Uretim Planlama butonuna tiklanir
    Then Uretim Planlama ekraninda oldugu dogrulanir
    And Uretim Planlama sifre kutucuguna gecerli bir data girilir
    And Giris yap butonuna tiklanir
    And siparis Olustur butonunun ekranda gorundugu kontrol edilir
    And Guncelleme butonuna tiklanir
    And Musteri Adi Kutucugundaki data silinir
    And musteri adi musteri adina gecerli bir data girilir
    And Gasan No kutucugundaki data silinir
    And Gasan No Gasan Nosuna gecerli bir data girilir
    And Soparis No kutucugundaki data silinir
    And <Siparis No Siparis Noya gecerli bir data girilir
    And Teslim Tarihine gecerli bir data girilir
    And Siparis Turu kutucugundaki data silinir
    And Siparis turu Siparis turune gecerli bir data girilir
    And siparis Miktari kutucugundaki data silinir
    And Siparis miktari Siparis miktarina gecerli bir data girilir
    And Hazir Mil Miktari kutucugundaki data silinir
    And Hazir mil miktari Hazir mil miktarina gecerli bir data girilir
    And Siparis durumu kutusunda İşlenmeyi Bekliyor yazmali
    And Giris yap butonuna tiklanir
    And Sipariş başarıyla guncellendi yazisi dogrulanir ve ok tusuna basilir
    And sayfa kapatilir....