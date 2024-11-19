Feature: US2
  Background:  Anasayfa ve dogrulama
    When Anasayfaya gidilir
    Then Anasayfada oldugu dogrulanir

  Scenario Outline: Kullanici yeni siparis olusturur (Positif Test)
    And Uretim Planlama butonuna tiklanir
    Then Uretim Planlama ekraninda oldugu dogrulanir
    And Uretim Planlama sifre kutucuguna gecerli bir "data" girilir
    And Giris yap butonuna tiklanir
    And siparis Olustur butonunun ekranda gorundugu kontrol edilir
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
      | musteri adi | Gasan No      | Siparis No | Siparis turu | Siparis miktari  | Hazir mil miktari  |
      |nuri         |2000 ABC 200000|2000-00000  |Lift          |1500              |100                 |
      |nurullah     |2000 ABC 200001|2000.00001  |Paslanmaz     |1000              |                    |
      |kemal        |2000 ABC 200002|2000_0002a  |Damper        |1000              |                    |
      |kamuran      |2000 ABC 200003|abcdefghij  |Blok Lift     |1500              |                    |
      |erhan        |2000 ABC 200008|abcde00008  |Lift          |1500              |100                 |
      |beytullah    |2000 ABC 200009|2000000009  |Damper        |1000              |                    |

  Scenario Outline: Kullanici yeni siparis olusturur (Negatif Test)
    Then Uretim Planlama butonunun gorunur oldugu dogrulanir
    And Uretim Planlama butonuna tiklanir
    Then Uretim Planlama ekraninda oldugu dogrulanir
    And Uretim Planlama sifre kutucuguna gecerli bir "data" girilir
    And Giris yap butonuna tiklanir
    And siparis Olustur butonunun ekranda gorundugu kontrol edilir
    And siparis olustur butonuna tiklanir
    And yeni siparis ekraninin geldigi dogrulanir
    And "<musteri adi>" musteri adina gecersiz bir data girilir
    And "<Gasan No>" Gasan Nosuna gecersiz bir data girilir
    And "<Siparis No>" Siparis Noya gecersiz bir data girilir
    And Teslim Tarihine gecersiz bir data girilir
    And "<Siparis turu>" Siparis turune gecersiz bir data girilir
    And "<Siparis miktari>" Siparis miktarina gecersiz bir data girilir
    And "<Hazir mil miktari>" Hazir mil miktarina gecersiz bir data girilir
    And Kaydet butonunun aktif olmadigi kontrol edilir
    And Kullanici logout yapar

    Examples:
      | musteri adi | Gasan No      | Siparis No | Siparis turu | Siparis miktari  | Hazir mil miktari |
      |ali          |1111 A 123450  |1234567891  |Lift          |1000              |100                |
      |ramazan      |111 AB 123450  |1234567891  |Damper        |1000              |100                |
      |halil        |1113 AB 123450 |123456789   |Blok Lift     |1000              |100                |
      |cemal        |1113 AB 123450 |ABC#@%FGHI  |Blok Lift     |1000              |100                |
      |kerim        |1113 AB 123450 |123//*FGHI  |Blok Lift     |1000              |100                |
      |beytullah    |1115 AB 123450 |1234567891  |Lift          |-1000             |-100               |


    Scenario: Amirlerin Ortak ekrani
      Then Talasli Imalat Amiri Butonu gorunur oldugu dogrulanir
      And Talasli Imalat Amiri Butonuna tiklanir
      Then Talasli Imalat Amiri Sifre ekraninda oldugu dogrulanir
      And Talasli imalat amiri sifre kutucuguna gecerli bir "data" girilir
      And Giris yap butonuna tiklanir
      Then Talasli Imalat Amirinin kendi sorumluluk sayfasina gectigi dogrulanir
      Then siparis durumu tamamlanmis siparislerin gozukmedigi dogrulanir
      Then Basla butonu varligi dogrulanir
      And Kullanici logout yapar
      Then Polisaj amiri butonunun gorunur oldugu dogrulanir
      And Polisaj amiri butonuna tiklanir
      Then Polisaj amiri ekraninda oldugu dogrulanir
      And Polisaj amiri sifre kutucuguna gecerli bir "data" girilir
      And Giris yap butonuna tiklanir
      Then Polisaj amirinin kendi sorumluluk sayfasina gectigi dogrulanir
      Then Paslanmaz siparis turu listelenmedigi dogrulanir
      And Kullanici logout yapar
      Then Lift montaj amiri butonunun gorunur oldugu dogrulanir
      And Lift montaj amiri butonuna tiklanir
      Then Lift montaj amiri ekraninda oldugu dogrulanir
      And Lift montaj amiri sifre kutucuguna gecerli bir "data" girilir
      And Giris yap butonuna tiklanir
      Then Lift montaj amirinin kendi sorumluluk sayfasina gectigi dogrulanir
      Then Bloklift ve Damper siparis turlerinin listelenmedigi dogrulanir
      And Kullanici logout yapar
      Then Bloklift Montaj Amiri butonunun gorunur oldugu dogrulanir
      And Bloklift Montaj Amiri butonuna tiklanir
      Then Bloklift Montaj Amiri ekraninda oldugu dogrulanir
      And Bloklift Montaj Amiri sifre kutucuguna gecerli bir "data" girilir
      And Giris yap butonuna tiklanir
      Then Bloklift Montaj Amirinin kendi sorumluluk sayfasina gectigi dogrulanir
      Then lift ve Paslanmaz siparis turlerinin listelenmedigi dogrulanir
      And Kullanici logout yapar
      Then Uretim Planlama butonunun gorunur oldugu dogrulanir
      And Uretim Planlama butonuna tiklanir
      Then Uretim Planlama ekraninda oldugu dogrulanir
      And Uretim Planlama sifre kutucuguna gecerli bir "data" girilir
      And Giris yap butonuna tiklanir
      Then Uretim Planlama sayfasina gectigi dogrulanir
      Then her turde siparisin listelendigi dogrulanir
      And Kullanici logout yapar
      Then Boyama ve Paketleme Amiri butonunun gorunur oldugu dogrulanir
      And Boyama ve Paketleme Amiri butonuna tiklanir
      Then Boyama ve Paketleme Amiri ekraninda oldugu dogrulanir
      And Boyama ve Paketleme Amiri sifre kutucuguna gecerli bir "data" girilir
      And Giris yap butonuna tiklanir
      Then Boyama ve Paketleme Amirinin kendi sorumluluk sayfasina gectigi dogrulanir
      And Kullanici logout yapar