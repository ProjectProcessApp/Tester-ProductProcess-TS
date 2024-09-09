Feature: US2

  Background:  Anasayfa ve dogrulama
    When Anasayfaya gidilir
    Then Anasayfada oldugu dogrulanir

  Scenario Outline: Kullanici yeni siparis olusturur (Positif Test)
    Then Uretim Planlama butonunun gorunur oldugu dogrulanir
    And Uretim Planlama butonuna tiklanir
    Then Uretim Planlama ekraninda oldugu dogrulanir
    And Uretim Planlama sifre kutucuguna gecerli bir "data" girilir
    And Giris yap butonuna tiklanir
    And siparis Olustur butonunun ekranda gorundugu kontrol edilir
    And Onceden siparis listesi olup olmadigi dogrulanir
    And siparis olustur butonuna tiklanir
    And yeni siparis ekraninin geldigi dogrulanir
    And "<musteri adi>" musteri adina gecerli bir data girilir
    And "<Gasan No>" Gasan Nosuna gecerli bir data girilir
    And "<Siparis No>" Siparis Noya gecerli bir data girilir
    And Teslim Tarihine gecerli bir data girilir
    And "<Siparis turu>" Siparis turune gecerli bir data girilir
    And "<Siparis miktari>" Siparis miktarina gecerli bir data girilir
    And "<Hazir mil miktari>" Hazir mil miktarina gecerli bir data girilir
    And Siparis durumu kutusunda "İşlenmeyi Bekliyor" yazmali
    And Giris yap butonuna tiklanir
    And "Sipariş başarıyla oluşturuldu" yazisi dogrulanir ve ok tusuna basilir
    And Kullanici logout yapar

    Examples:
      | musteri adi | Gasan No      | Siparis No | Siparis turu | Siparis miktari  | Hazir mil miktari |
      |omer         |1111 A 123456  |123451      |paslanmaz     |1500              |0                  |
      |hasan        |1111 AB 123456 |123452      |paslanmaz     |1000              |0                  |
      |ali          |1111 ABC 123456|123453      |paslanmaz     |1500              |0                  |

  @US2
  Scenario Outline: Kullanici yeni siparis olusturur (Negatif Test)
    Then Uretim Planlama butonunun gorunur oldugu dogrulanir
    And Uretim Planlama butonuna tiklanir
    Then Uretim Planlama ekraninda oldugu dogrulanir
    And Uretim Planlama sifre kutucuguna gecerli bir "data" girilir
    And Guncelleme butonuna tiklanir
    And siparis guncelle yazisinin ekranda gorundugu kontrol edilir
    And Musteri Adi kutucugundaki data silinir
    And siparis olustur butonuna tiklanir
    And yeni siparis ekraninin geldigi dogrulanir
    And "<musteri adi>" musteri adina gecersiz bir data girilir
    And "<Gasan No>" Gasan Nosuna gecersiz bir data girilir
    And "<Siparis No>" Siparis Noya gecersiz bir data girilir
    And Teslim Tarihine gecersiz bir data girilir
    And "<Siparis turu>" Siparis turune gecersiz bir data girilir
    And "<Siparis miktari>" Siparis miktarina gecersiz bir data girilir
    And "<Hazir mil miktari>" Hazir mil miktarina gecersiz bir data girilir
    And Giris butonunun aktif olmadigi kontrol edilir


    Examples:
      | musteri adi | Gasan No      | Siparis No | Teslim Tarihi | Siparis turu | Siparis miktari  | Hazir mil miktari |
      |             |               |            |               |              |                  |                   |
      |.            |1111 A 123450  |123450      |30.09.2024     |  paslanmaz   |1000              |100                |
      |1            |1112 AB 123450  |123458     |30.09.2024     |  paslanmaz   |1000              |100                |
      |[            |1113 AB 123450  |123459     |30.09.2024     |  paslanmaz   |1000              |100                |


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