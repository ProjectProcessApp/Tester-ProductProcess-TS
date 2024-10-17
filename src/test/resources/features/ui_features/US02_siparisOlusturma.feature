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
    And kaydet butonuna tiklanir
    And "Sipariş oluşturuldu" yazisi dogrulanir ve ok tusuna basilir
    And Kullanici logout yapar

    Examples:
      | musteri adi | Gasan No      | Siparis No | Siparis turu | Siparis miktari  | Hazir mil miktari |
      |omer         |1000 ABC 100000|100000      |Lift          |1500              |100                 |
      |hasan        |1000 ABC 100001|100001      |Damper        |1000              |200                 |
      |alican       |1000 ABC 100002|100002      |Blok Lift     |1500              |1000                |
      |ramo         |1000 ABC 100003|100003      |Paslanmaz     |1500              |10000               |


  Scenario Outline: Kullanici yeni siparis olusturur (Negatif Test)
    Then Uretim Planlama butonunun gorunur oldugu dogrulanir
    And Uretim Planlama butonuna tiklanir
    Then Uretim Planlama ekraninda oldugu dogrulanir
    And Uretim Planlama sifre kutucuguna gecerli bir "data" girilir
    And Giris yap butonuna tiklanir
    And siparis Olustur butonunun ekranda gorundugu kontrol edilir
    And Onceden siparis listesi olup olmadigi dogrulanir
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
      |ali          |1111 A 123450  |123450      |30.09.2024     |Lift          |1000              |100                |
      |ramazan      |111 AB 123450  |123458      |30.09.2024     |Damper        |1000              |100                |
      |halil        |1113 AB 123450 |12345       |30.09.2024     |Blok Lift     |1000              |100                |
      |beytullah    |1115 AB 123450 |123460      |30.09.2024     |Paslanmaz     |-1000             |100                |
      |hakki        |1116 AB 123450 |123461      |30.09.2024     |Paslanmaz     |1000              |-100               |



    Scenario: Amirlerin Ortak ekrani
      Then Talasli Imalat Amiri Butonu gorunur oldugu dogrulanir
      And Talasli Imalat Amiri Butonuna tiklanir
      Then Talasli Imalat Amiri Sifre ekraninda oldugu dogrulanir
      And Talasli imalat amiri sifre kutucuguna gecerli bir "data" girilir
      And Giris yap butonuna tiklanir
      Then Talasli Imalat Amirinin kendi sorumluluk sayfasina gectigi dogrulanir
      And Database connection yapilir
      And Databasedeki veriler ve karsilastirilir
      Then Basla butonu varligi dogrulanir
      And Kullanici logout yapar
      Then Polisaj amiri butonunun gorunur oldugu dogrulanir
      And Polisaj amiri butonuna tiklanir
      Then Polisaj amiri ekraninda oldugu dogrulanir
      And Polisaj amiri sifre kutucuguna gecerli bir "data" girilir
      And Giris yap butonuna tiklanir
      Then Polisaj amirinin kendi sorumluluk sayfasina gectigi dogrulanir
      And Database connection yapilir
      And Databasedeki veriler ve karsilastirilir
      Then Basla butonu varligi dogrulanir
      And Kullanici logout yapar
      Then Lift montaj amiri butonunun gorunur oldugu dogrulanir
      And Lift montaj amiri butonuna tiklanir
      Then Lift montaj amiri ekraninda oldugu dogrulanir
      And Lift montaj amiri sifre kutucuguna gecerli bir "data" girilir
      And Giris yap butonuna tiklanir
      Then Lift montaj amirinin kendi sorumluluk sayfasina gectigi dogrulanir
      And Database connection yapilir
      And Databasedeki veriler ve karsilastirilir
      Then Basla butonu varligi dogrulanir
      And Kullanici logout yapar
      Then Bloklift Montaj Amiri butonunun gorunur oldugu dogrulanir
      And Bloklift Montaj Amiri butonuna tiklanir
      Then Bloklift Montaj Amiri ekraninda oldugu dogrulanir
      And Bloklift Montaj Amiri sifre kutucuguna gecerli bir "data" girilir
      And Giris yap butonuna tiklanir
      Then Bloklift Montaj Amirinin kendi sorumluluk sayfasina gectigi dogrulanir
      And Database connection yapilir
      And Databasedeki veriler ve karsilastirilir
      Then Basla butonu varligi dogrulanir
      And Kullanici logout yapar
      Then Boyama ve Paketleme Amiri butonunun gorunur oldugu dogrulanir
      And Boyama ve Paketleme Amiri butonuna tiklanir
      Then Boyama ve Paketleme Amiri ekraninda oldugu dogrulanir
      And Boyama ve Paketleme Amiri sifre kutucuguna gecerli bir "data" girilir
      And Giris yap butonuna tiklanir
      Then Boyama ve Paketleme Amirinin kendi sorumluluk sayfasina gectigi dogrulanir
      And Database connection yapilir
      And Databasedeki veriler ve karsilastirilir
      Then Basla butonu varligi dogrulanir
      And Kullanici logout yapar

