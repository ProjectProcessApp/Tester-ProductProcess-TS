Feature: US03
  Background:  Anasayfa ve dogrulama
    When Anasayfaya gidilir
    Then Anasayfada oldugu dogrulanir
  Scenario: Talasli Imalat Amiri kendine gelen DAMPER siparis turundeki gorevi baslatir
    Then Talasli Imalat Amiri Butonu gorunur oldugu dogrulanir
    And Talasli Imalat Amiri Butonuna tiklanir
    Then Talasli Imalat Amiri Sifre ekraninda oldugu dogrulanir
    And Talasli imalat amiri sifre kutucuguna gecerli bir "data" girilir
    And Sifre gizleme butonunun sifreyi gizledigi kontrol edllir
    And Sifre gizleme butonunun sifreyi tekrar gorunur hale getirdigi kontrol edllir
    And Giris yap butonuna tiklanir
    Then Talasli Imalat Amiri ekrandaki datalari dogrular
    And Bloklift siparis turundeki siparisin basla butonuna tiklar
    And Bloklift siparis turundeki siparisin bulundugu satira tiklar
    Then Mil Taslama Butonunu sari renk oldugu dogrulanir
    Then Isil Islem Butonunu gri renk oldugu dogrulanir
    And Mil taslama butonuna tiklanir
    Then uretilen adedi giriniz yazisi dogrulanir
    And Bloklift uretilecek adet girilir
    And onayla butonuna tiklanir
    And Ok butonuna tiklanir
    Then Bloklift siparis turu girilen adedin sag tarafta mil taslama biten bolumune islendigi dogrulanir
    Then Bloklift siparis turu sag taraftaki mil taslama kalan bolumundeki rakam dogrulanir
    Then Mil Taslama Butonunu yesil renk oldugu dogrulanir
    Then Isil Islem Butonunu sari renk oldugu dogrulanir
    And Isil Islem butonuna tiklanir
    Then uretilen adedi giriniz yazisi dogrulanir
    And Bloklift uretilecek adet girilir
    And onayla butonuna tiklanir
    And Ok butonuna tiklanir
    Then Bloklift girilen adedin sag tarafta Isil Islem biten bolumune islendigi dogrulanir
    Then Bloklift sag taraftaki Isil Islem kalan bolumundeki rakam dogrulanir
    Then Mil Taslama Butonunu yesil renk oldugu dogrulanir
    Then Isil Islem Butonunu yesil renk oldugu dogrulanir
    And sag taraftaki Boru Kesme Havsa butonuna tiklanir
    Then uretilen adedi giriniz yazisi dogrulanir
    And Bloklift uretilecek adet girilir
    And onayla butonuna tiklanir
    And Ok butonuna tiklanir
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
    And Ok butonuna tiklanir
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