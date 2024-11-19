@endtoend
Feature: Bloklift turu siparis EndtoEnd Test

  Scenario Outline: Kullanici Bloklift turunde yeni siparis olusturur
    When Anasayfaya gidilir
    Then Anasayfada oldugu dogrulanir
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
      | musteri adi | Gasan No      | Siparis No | Siparis turu | Siparis miktari  | Hazir mil miktari |
      |alican       |3000 ABC 100003|3000000003  |Blok Lift     |1500              |1000               |

  Scenario: Talasli Imalat Amiri kendine gelen BLOKLIFT siparis turundeki gorevi baslatir
    Then Talasli Imalat Amiri Butonu gorunur oldugu dogrulanir
    And Talasli Imalat Amiri Butonuna tiklanir
    Then Talasli Imalat Amiri Sifre ekraninda oldugu dogrulanir
    And Talasli imalat amiri sifre kutucuguna gecerli bir "data" girilir
    And Sifre gizleme butonunun sifreyi gizledigi kontrol edllir
    And Sifre gizleme butonunun sifreyi tekrar gorunur hale getirdigi kontrol edllir
    And Giris yap butonuna tiklanir
    And Bloklift siparis turundeki siparisin basla butonuna tiklar
    Then Bloklift Mil Taslama Butonunu sari renk oldugu dogrulanir
    Then Bloklift Isil Islem Butonunu gri renk oldugu dogrulanir
    And Bloklift Mil taslama butonuna tiklanir
    Then uretilen adedi giriniz yazisi dogrulanir
    And Bloklift uretilecek adet girilir
    And onayla butonuna tiklanir
    Then Bloklift siparis turu girilen adedin sag tarafta mil taslama biten bolumune islendigi dogrulanir
    Then Bloklift siparis turu sag taraftaki mil taslama kalan bolumundeki rakam dogrulanir
    Then Bloklift Mil Taslama Butonunu yesil renk oldugu dogrulanir
    Then Bloklift Isil Islem Butonunu sari renk oldugu dogrulanir
    And Bloklift Isil Islem butonuna tiklanir
    Then uretilen adedi giriniz yazisi dogrulanir
    And Bloklift uretilecek adet girilir
    And onayla butonuna tiklanir
    Then Bloklift girilen adedin sag tarafta Isil Islem biten bolumune islendigi dogrulanir
    Then Bloklift sag taraftaki Isil Islem kalan bolumundeki rakam dogrulanir
    Then Bloklift Mil Taslama Butonunu yesil renk oldugu dogrulanir
    Then Bloklift Isil Islem Butonunu yesil renk oldugu dogrulanir
    And sag taraftaki Boru Kesme Havsa butonuna tiklanir
    Then uretilen adedi giriniz yazisi dogrulanir
    And Bloklift uretilecek adet girilir
    And onayla butonuna tiklanir
    Then girilen adedin sag tarafta Boru Kesme Havsa biten bolumune islendigi dogrulanir
    And Kullanici logout yapar
    And Polisaj amiri butonuna tiklanir
    Then Polisaj amiri ekraninda oldugu dogrulanir
    And Polisaj amiri sifre kutucuguna gecerli bir "data" girilir
    And Giris yap butonuna tiklanir
    And Polisaj Amirindeki Bloklift siparis turundeki siparisin bulundugu satira tiklar
    Then Polisaj butonunun sari renk oldugu dogrulanir
    And Polisaj ok butonuna tiklanir
    Then uretilen adedi giriniz yazisi dogrulanir
    And Bloklift uretilecek adet girilir
    And onayla butonuna tiklanir
    Then Polisaj butonunun yesil renk oldugu dogrulanir
    Then Bloklift Siparis turu girilen adedin sag tarafta mil koparma biten bolumune islendigi dogrulanir
    Then Bloklift Siparis turu sag taraftaki mil koparma kalan bolumundeki rakam dogrulanir
    Then Kullanici logout yapar
    And Kalite Kontrol butonuna tiklanir
    And Kalite Kontrol sifre kutucuguna gecerli bir "data" girilir
    And Giris yap butonuna tiklanir
    And Kalite kontrol Amirindeki Bloklift siparis turundeki siparisin bulundugu satira tiklar
    And Bloklift Polisaj sonrasi butona tiklar
    And Polisaj sonrasi Kalite kontrol Onayla butona tiklanir
    And Bloklift uretilecek adet girilir
    And onayla butonuna tiklanir
    Then Bloklift Siparis turu girilen adedin sag tarafta biten bolumune islendigi dogrulanir
    Then Bloklift Siparis turu sag taraftaki kalan bolumundeki rakam dogrulanir
    Then Kullanici logout yapar
    Then Bloklift Montaj Amiri butonunun gorunur oldugu dogrulanir
    And Bloklift Montaj Amiri butonuna tiklanir
    And Bloklift Montaj Amiri sifre kutucuguna gecerli bir "data" girilir
    And  Sifre gizleme butonunun sifreyi gizledigi kontrol edllir
    And Sifre gizleme butonunun sifreyi tekrar gorunur hale getirdigi kontrol edllir
    And Giris yap butonuna tiklanir
    And Bloklift siparis turundeki siparisin bulundugu satira tiklar
    Then Bloklift Montaj Butonunu sari renk oldugu dogrulanir
    Then Boru Kapama Butonunun gri renk oldugu dogrulanir
    Then Gaz Dolum Butonunu gri renk oldugu dogrulanir
    Then Test Butonunun gri renk oldugu dogrulanir
    And Bloklift Montaj butonuna tiklanir
    Then uretilen adedi giriniz yazisi dogrulanir
    And BLOKLIFT siparis turu icin uretilecek adet girilir
    And onayla butonuna tiklanir
    Then girilen adedin sag tarafta bloklift montaj biten bolumune islendigi dogrulanir
    Then sag taraftaki bloklift montaj kalan bolumundeki rakam dogrulanir
    Then Bloklift Montaj Butonunu yesil renk oldugu dogrulanir
    Then Boru Kapama Butonunun sari renk oldugu dogrulanir
    Then Gaz Dolum Butonunu gri renk oldugu dogrulanir
    Then Test Butonunun gri renk oldugu dogrulanir
    Then uretilen toplam boru miktari dogrulanir
    And Boru Kapama butonuna tiklanir
    Then uretilen adedi giriniz yazisi dogrulanir
    And BLOKLIFT siparis turu icin uretilecek adet girilir
    And onayla butonuna tiklanir
    Then Bloklift Montaj Butonunu yesil renk oldugu dogrulanir
    Then Boru Kapama Butonunun yesil renk oldugu dogrulanir
    Then Gaz Dolum Butonunu sari renk oldugu dogrulanir
    Then Test Butonunun gri renk oldugu dogrulanir
    Then Bloklift turu girilen adedin sag tarafta boru kapama biten bolumune islendigi dogrulanir
    Then Blok lift turu sag taraftaki boru kapama kalan bolumundeki rakam dogrulanir
    And Gaz Dolum butonuna tiklanir
    Then uretilen adedi giriniz yazisi dogrulanir
    And BLOKLIFT siparis turu icin uretilecek adet girilir
    And onayla butonuna tiklanir
    Then Blok lift turu girilen adedin sag tarafta gaz dolum biten bolumune islendigi dogrulanir
    Then Blok lift turu sag taraftaki gaz dolum kalan bolumundeki rakam dogrulanir
    Then Bloklift Montaj Butonunu yesil renk oldugu dogrulanir
    Then Boru Kapama Butonunun yesil renk oldugu dogrulanir
    Then Gaz Dolum Butonunu yesil renk oldugu dogrulanir
    Then Test Butonunun sari renk oldugu dogrulanir
    And Test butonuna tiklanir
    Then uretilen adedi giriniz yazisi dogrulanir
    And BLOKLIFT siparis turu icin uretilecek adet girilir
    And onayla butonuna tiklanir
    Then girilen adedin sag tarafta test biten bolumune islendigi dogrulanir
    Then sag taraftaki test kalan bolumundeki rakam dogrulanir
    Then Bloklift Montaj Butonunu yesil renk oldugu dogrulanir
    Then Boru Kapama Butonunun yesil renk oldugu dogrulanir
    Then Gaz Dolum Butonunu yesil renk oldugu dogrulanir
    Then Test butonunun yesil renk oldugu dogrulanir
    Then Kullanici logout yapar
    Then Boyama ve Paketleme Amiri butonunun gorunur oldugu dogrulanir
    And Boyama ve Paketleme Amiri butonuna tiklanir
    And Boyama ve Paketleme Amiri sifre kutucuguna gecerli bir "data" girilir
    And Sifre gizleme butonunun sifreyi gizledigi kontrol edllir
    And Sifre gizleme butonunun sifreyi tekrar gorunur hale getirdigi kontrol edllir
    And Giris yap butonuna tiklanir
    And Bloklift siparis turundeki siparisin bulundugu satira tiklar
    Then sag taraftaki kalan bolumu dogrulanir
    Then Boya butonunun sari renk oldugu dogrulanir
    Then Paketleme butonunun gri renk oldugu dogrulanir
    And Boya butonuna tiklanir
    And uretilen adedi giriniz yazisi dogrulanir
    And BLOKLIFT siparis turu icin uretilecek adet girilir
    And onayla butonuna tiklanir
    Then Boya butonunun yesil renk oldugu dogrulanir
    Then Paketleme butonunun sari renk oldugu dogrulanir
    Then girilen adedin sag tarafta boya biten bolumune islendigi dogrulanir
    Then sag taraftaki boya kalan bolumundeki rakam dogrulanir
    And Paketleme butonuna tiklanir
    And uretilen adedi giriniz yazisi dogrulanir
    And BLOKLIFT siparis turu icin uretilecek adet girilir
    And onayla butonuna tiklanir
    Then Boya butonunun yesil renk oldugu dogrulanir
    Then Paketleme butonunun yesil renk oldugu dogrulanir
    Then girilen adedin sag tarafta paketleme biten bolumune islendigi dogrulanir
    Then sag taraftaki paketleme kalan bolumundeki rakam dogrulanir
    And Kullanici logout yapar
    Then Uretim Planlama butonunun gorunur oldugu dogrulanir
    And Uretim Planlama butonuna tiklanir
    And Uretim Planlama sifre kutucuguna gecerli bir "data" girilir
    And Giris yap butonuna tiklanir
    And Bloklift turu icin nihai uretimi tamamla butonuna tiklanir
    And onayla butonuna tiklanir
    Then Bloklift turu siparisin tamamlandi durumuna gectigi dogrulanir
    #And Bloklift siparisi silinir
    And Kullanici logout yapar