Feature: US03
  Background:  Anasayfa ve dogrulama
    When Anasayfaya gidilir
    Then Anasayfada oldugu dogrulanir
  Scenario: Talasli Imalat Amiri kendine gelen PASLANMAZ siparis turundeki gorevi baslatir
    Then Talasli Imalat Amiri Butonu gorunur oldugu dogrulanir
    And Talasli Imalat Amiri Butonuna tiklanir
    Then Talasli Imalat Amiri Sifre ekraninda oldugu dogrulanir
    And Talasli imalat amiri sifre kutucuguna gecerli bir "data" girilir
    And Sifre gizleme butonunun sifreyi gizledigi kontrol edllir
    And Sifre gizleme butonunun sifreyi tekrar gorunur hale getirdigi kontrol edllir
    And Giris yap butonuna tiklanir
    Then Talasli Imalat Amiri ekrandaki datalari dogrular
    And Paslanmaz siparis turundeki siparisin basla butonuna tiklar
    Then Mil Koparma Butonunun sari renk oldugu dogrulanir
    Then Mil Tornalama Butonunun gri renk oldugu dogrulanir
    Then Mil Taslama Butonunu gri renk oldugu dogrulanir
    Then Ezme Butonunu gri renk oldugu dogrulanir
    And Mil Koparma butonuna tiklanir
    Then uretilen adedi giriniz yazisi dogrulanir
    And Paslanmaz siparis turu icin uretilecek adet girilir
    And onayla butonuna tiklanir
    Then girilen adedin sag tarafta mil koparma biten bolumune islendigi dogrulanir
    Then sag taraftaki mil koparma kalan bolumundeki rakam dogrulanir
    Then Mil Koparma Butonunun yesil renk oldugu dogrulanir
    Then Mil Tornalama Butonunun sari renk oldugu dogrulanir
    Then Mil Taslama Butonunu gri renk oldugu dogrulanir
    Then Ezme Butonunu gri renk oldugu dogrulanir
    And Mil tornalama butonuna tiklanir
    Then uretilen adedi giriniz yazisi dogrulanir
    And Paslanmaz siparis turu icin uretilecek adet girilir
    And onayla butonuna tiklanir
    Then girilen adedin sag tarafta mil tornalama biten bolumune islendigi dogrulanir
    Then sag taraftaki mil tornalama kalan bolumundeki rakam dogrulanir
    Then Mil Koparma Butonunun yesil renk oldugu dogrulanir
    Then Mil Tornalama Butonunun yesil renk oldugu dogrulanir
    Then Mil Taslama Butonunu sari renk oldugu dogrulanir
    Then Ezme Butonunu gri renk oldugu dogrulanir
    And Mil taslama butonuna tiklanir
    Then uretilen adedi giriniz yazisi dogrulanir
    And Paslanmaz siparis turu icin uretilecek adet girilir
    And onayla butonuna tiklanir
    Then girilen adedin sag tarafta mil taslama biten bolumune islendigi dogrulanir
    Then sag taraftaki mil taslama kalan bolumundeki rakam dogrulanir
    Then Mil Koparma Butonunun yesil renk oldugu dogrulanir
    Then Mil Tornalama Butonunun yesil renk oldugu dogrulanir
    Then Mil Taslama Butonunu yesil renk oldugu dogrulanir
    Then Ezme Butonunu gri renk oldugu dogrulanir
    And sag taraftaki Boru Kesme Havsa butonuna tiklanir
    Then uretilen adedi giriniz yazisi dogrulanir
    And Paslanmaz siparis turu icin uretilecek adet girilir
    And onayla butonuna tiklanir
    Then girilen adedin sag tarafta Boru Kesme Havsa biten bolumune islendigi dogrulanir
    Then sag taraftaki Boru Kesme Havsa kalan bolumundeki rakam dogrulanir
    Then Kullanici logout yapar
    And Kalite Kontrol butonuna tiklanir
    And Kalite Kontrol sifre kutucuguna gecerli bir "data" girilir
    And Giris yap butonuna tiklanir
    And Kalite kontrol Amirindeki Paslanmaz siparis turundeki siparisin bulundugu satira tiklar
    And Mil Taslama sonrasi butona tiklar
    And Polisaj sonrasi Kalite kontrol Onayla butona tiklanir
    And Paslanmaz siparis turu icin uretilecek adet girilir
    And onayla butonuna tiklanir
    Then Kullanici logout yapar
    Then Talasli Imalat Amiri Butonu gorunur oldugu dogrulanir
    And Talasli Imalat Amiri Butonuna tiklanir
    Then Talasli Imalat Amiri Sifre ekraninda oldugu dogrulanir
    And Talasli imalat amiri sifre kutucuguna gecerli bir "data" girilir
    And Giris yap butonuna tiklanir
    Then Talasli Imalat Amiri ekrandaki datalari dogrular
    And Paslanmaz siparis turundeki siparisin basla butonuna tiklar
    And Ezme butonuna tiklanir
    Then uretilen adedi giriniz yazisi dogrulanir
    And Paslanmaz siparis turu icin uretilecek adet girilir
    And onayla butonuna tiklanir
    Then Mil Koparma Butonunun yesil renk oldugu dogrulanir
    Then Mil Tornalama Butonunun yesil renk oldugu dogrulanir
    Then Mil Taslama Butonunu yesil renk oldugu dogrulanir
    Then Ezme Butonunu yesil renk oldugu dogrulanir
    Then girilen adedin sag tarafta ezme biten bolumune islendigi dogrulanir
    Then sag taraftaki ezme kalan bolumundeki rakam dogrulanir
    Then Kullanici logout yapar
    And Kalite Kontrol butonuna tiklanir
    And Kalite Kontrol sifre kutucuguna gecerli bir "data" girilir
    And Giris yap butonuna tiklanir
    And Kalite kontrol Amirindeki Paslanmaz siparis turundeki siparisin bulundugu satira tiklar
    And Ezme sonrasi butona tiklar
    And Polisaj sonrasi Kalite kontrol Onayla butona tiklanir
    And Paslanmaz siparis turu icin uretilecek adet girilir
    And onayla butonuna tiklanir
    Then Paslanmaz Siparis turu girilen adedin sag tarafta biten bolumune islendigi dogrulanir
    Then Paslanmaz Siparis turu sag taraftaki kalan bolumundeki rakam dogrulanir
    Then Kullanici logout yapar
