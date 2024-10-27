Feature: US05
  Background:  Anasayfa ve dogrulama
    When Anasayfaya gidilir
    Then Anasayfada oldugu dogrulanir

  Scenario: Boya ve Paketleme Amiri kendine gelen PASLANMAZ siparis turundeki gorevi baslatir
    Then Boyama ve Paketleme Amiri butonunun gorunur oldugu dogrulanir
    And Boyama ve Paketleme Amiri butonuna tiklanir
    And Boyama ve Paketleme Amiri sifre kutucuguna gecerli bir "data" girilir
    And Sifre gizleme butonunun sifreyi gizledigi kontrol edllir
    And Sifre gizleme butonunun sifreyi tekrar gorunur hale getirdigi kontrol edllir
    And Giris yap butonuna tiklanir
    #Then Boyama ve Paketleme Amiri ekrandaki datalari dogrular
    And Paslanmaz siparis turundeki siparisin bulundugu satira tiklar
    Then sag taraftaki kalan bolumu dogrulanir
    Then Boya butonunun sari renk oldugu dogrulanir
    Then Paketleme butonunun gri renk oldugu dogrulanir
    And Boya butonuna tiklanir
    And uretilen adedi giriniz yazisi dogrulanir
    And PASLANMAZ siparis turu icin uretilecek adet girilir
    And onayla butonuna tiklanir
    Then Boya butonunun yesil renk oldugu dogrulanir
    Then Paketleme butonunun sari renk oldugu dogrulanir
    Then girilen adedin sag tarafta boya biten bolumune islendigi dogrulanir
    Then sag taraftaki boya kalan bolumundeki rakam dogrulanir
    And Paketleme butonuna tiklanir
    And uretilen adedi giriniz yazisi dogrulanir
    And PASLANMAZ siparis turu icin uretilecek adet girilir
    And onayla butonuna tiklanir
    Then Boya butonunun yesil renk oldugu dogrulanir
    Then girilen adedin sag tarafta paketleme biten bolumune islendigi dogrulanir
    Then sag taraftaki paketleme kalan bolumundeki rakam dogrulanir
    And Kullanici logout yapar

