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
    And Damper siparis turundeki siparisin basla butonuna tiklar
    Then Mil Koparma Butonunun sari renk oldugu dogrulanir
    Then Mil Tornalama Butonunun gri renk oldugu dogrulanir
    Then Mil Taslama Butonunu gri renk oldugu dogrulanir
    Then Isil Islem Butonunu gri renk oldugu dogrulanir
    And Mil Koparma butonuna tiklanir
    Then uretilen adedi giriniz yazisi dogrulanir
    And uretilecek damper adet girilir
    And onayla butonuna tiklanir
    Then Damper Siparis turu girilen adedin sag tarafta mil koparma biten bolumune islendigi dogrulanir
    Then Damper Siparis turu sag taraftaki mil koparma kalan bolumundeki rakam dogrulanir
    Then Mil Koparma Butonunun yesil renk oldugu dogrulanir
    Then Mil Tornalama Butonunun sari renk oldugu dogrulanir
    Then Mil Taslama Butonunu gri renk oldugu dogrulanir
    Then Isil Islem Butonunu gri renk oldugu dogrulanir
    And Mil tornalama butonuna tiklanir
    Then uretilen adedi giriniz yazisi dogrulanir
    And uretilecek damper adet girilir
    And onayla butonuna tiklanir
    Then Damper Siparis turu girilen adedin sag tarafta mil tornalama biten bolumune islendigi dogrulanir
    Then Damper Siparis turu sag taraftaki mil tornalama kalan bolumundeki rakam dogrulanir
    Then Mil Koparma Butonunun yesil renk oldugu dogrulanir
    Then Mil Tornalama Butonunun yesil renk oldugu dogrulanir
    Then Mil Taslama Butonunu sari renk oldugu dogrulanir
    Then Isil Islem Butonunu gri renk oldugu dogrulanir
    And Mil taslama butonuna tiklanir
    Then uretilen adedi giriniz yazisi dogrulanir
    And uretilecek damper adet girilir
    And onayla butonuna tiklanir
    Then Damper Siparis turu girilen adedin sag tarafta mil taslama biten bolumune islendigi dogrulanir
    Then Damper Siparis turu sag taraftaki mil taslama kalan bolumundeki rakam dogrulanir
    Then Mil Koparma Butonunun yesil renk oldugu dogrulanir
    Then Mil Tornalama Butonunun yesil renk oldugu dogrulanir
    Then Mil Taslama Butonunu yesil renk oldugu dogrulanir
    Then Isil Islem Butonunu sari renk oldugu dogrulanir
    And Isil Islem butonuna tiklanir
    Then uretilen adedi giriniz yazisi dogrulanir
    And uretilecek damper adet girilir
    And onayla butonuna tiklanir
    Then Damper Siparis turu girilen adedin sag tarafta Isil Islem biten bolumune islendigi dogrulanir
    Then Damper Siparis turu sag taraftaki Isil Islem kalan bolumundeki rakam dogrulanir
    Then Boru Kese Havsa Butonunun sari renk oldugu dogrulanir
    And sag taraftaki Boru Kesme Havsa butonuna tiklanir
    Then uretilen adedi giriniz yazisi dogrulanir
    And uretilecek damper adet girilir
    And onayla butonuna tiklanir
    Then Boru Kese Havsa Butonunun yesil renk oldugu dogrulanir
    And Kullanici logout yapar
    And Polisaj amiri butonuna tiklanir
    Then Polisaj amiri ekraninda oldugu dogrulanir
    And Polisaj amiri sifre kutucuguna gecerli bir "data" girilir
    And Giris yap butonuna tiklanir
    And Polisaj Amirindeki Damper siparis turundeki siparisin bulundugu satira tiklar
    Then Polisaj butonunun sari renk oldugu dogrulanir
    And Polisaj ok butonuna tiklanir
    Then uretilen adedi giriniz yazisi dogrulanir
    And uretilecek damper adet girilir
    And onayla butonuna tiklanir
    Then Polisaj butonunun yesil renk oldugu dogrulanir
    Then girilen adedin Polisaj biten bolumune islendigi dogrulanir
    Then Kullanici logout yapar
    And Kalite Kontrol butonuna tiklanir
    And Kalite Kontrol sifre kutucuguna gecerli bir "data" girilir
    And Giris yap butonuna tiklanir
    And Kalite kontrol Amirindeki Damper siparis turundeki siparisin bulundugu satira tiklar
    And Polisaj sonrasi butona tiklar
    And Polisaj sonrasi Kalite kontrol Onayla butona tiklanir
    And uretilecek damper adet girilir
    And onayla butonuna tiklanir
    Then Damper Siparis turu girilen adedin sag tarafta biten bolumune islendigi dogrulanir
    Then Damper Siparis turu sag taraftaki kalan bolumundeki rakam dogrulanir
    Then Kullanici logout yapar