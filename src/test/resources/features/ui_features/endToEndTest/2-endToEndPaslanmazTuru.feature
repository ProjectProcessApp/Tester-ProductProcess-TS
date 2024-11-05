@endtoend
Feature: Paslanmaz turu siparis EndtoEnd Test

  Scenario Outline: Kullanici Paslanmaz turunde yeni siparis olusturur
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
      |ramo         |2000 ABC 100003|200003      |Paslanmaz     |1000              |1000              |

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
    #Then Talasli Imalat Amiri ekrandaki datalari dogrular
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
    Then Lift montaj amiri butonunun gorunur oldugu dogrulanir
    And Lift montaj amiri butonuna tiklanir
    And Lift montaj amiri sifre kutucuguna gecerli bir "data" girilir
    And Sifre gizleme butonunun sifreyi gizledigi kontrol edllir
    And Sifre gizleme butonunun sifreyi tekrar gorunur hale getirdigi kontrol edllir
    And Giris yap butonuna tiklanir
    #Then Lift Montaj Amiri ekrandaki datalari dogrular
    And Paslanmaz siparis turundeki siparisin bulundugu satira tiklar
    Then Paslanmaz turunde uretilen toplam mil miktarini dogrular
    Then Boru Kapama Butonunun sari renk oldugu dogrulanir
    Then Boru Kaynak Butonunun gri renk oldugu dogrulanir
    Then Lift Montaj Butonunu gri renk oldugu dogrulanir
    Then Gaz Dolum Butonunu gri renk oldugu dogrulanir
    Then Baslik Takma Butonunu gri renk oldugu dogrulanir
    And Boru Kapama butonuna tiklanir
    Then uretilen adedi giriniz yazisi dogrulanir
    And PASLANMAZ siparis turu icin uretilecek adet girilir
    And onayla butonuna tiklanir
    Then girilen adedin sag tarafta boru kapama biten bolumune islendigi dogrulanir
    Then sag taraftaki boru kapama kalan bolumundeki rakam dogrulanir
    Then Boru Kapama Butonunun yesil renk oldugu dogrulanir
    Then Lift Montaj Butonunu gri renk oldugu dogrulanir
    Then Gaz Dolum Butonunu gri renk oldugu dogrulanir
    Then Baslik Takma Butonunu gri renk oldugu dogrulanir
    And Boru Kaynak butonuna tiklanir
    Then uretilen adedi giriniz yazisi dogrulanir
    And PASLANMAZ siparis turu icin uretilecek adet girilir
    And onayla butonuna tiklanir
    Then girilen adedin sag tarafta boru kaynak biten bolumune islendigi dogrulanir
    Then sag taraftaki boru kaynak kalan bolumundeki rakam dogrulanir
    Then uretilen toplam boru miktari dogrulanir
    Then Boru Kapama Butonunun yesil renk oldugu dogrulanir
    Then Boru Kaynak Butonunun yesil renk oldugu dogrulanir
    Then Lift Montaj Butonunu sari renk oldugu dogrulanir
    Then Gaz Dolum Butonunu gri renk oldugu dogrulanir
    Then Baslik Takma Butonunu gri renk oldugu dogrulanir
    And Lift Montaj butonuna tiklanir
    Then uretilen adedi giriniz yazisi dogrulanir
    And PASLANMAZ siparis turu icin uretilecek adet girilir
    And onayla butonuna tiklanir
    Then girilen adedin sag tarafta lift montaj biten bolumune islendigi dogrulanir
    Then sag taraftaki lift montaj kalan bolumundeki rakam dogrulanir
    Then Boru Kapama Butonunun yesil renk oldugu dogrulanir
    Then Boru Kaynak Butonunun yesil renk oldugu dogrulanir
    Then Lift Montaj Butonunu yesil renk oldugu dogrulanir
    Then Gaz Dolum Butonunu gri renk oldugu dogrulanir
    Then Baslik Takma Butonunu gri renk oldugu dogrulanir
    Then Kullanici logout yapar
    And Kalite Kontrol butonuna tiklanir
    And Kalite Kontrol sifre kutucuguna gecerli bir "data" girilir
    And Giris yap butonuna tiklanir
    And Kalite kontrol Amirindeki Paslanmaz siparis turundeki siparisin bulundugu satira tiklar
    And Montaj sonrasi satir butonuna tiklar
    And Montaj sonrasi Kalite kontrol Onayla butona tiklanir
    And PASLANMAZ siparis turu icin uretilecek adet girilir
    And onayla butonuna tiklanir
    Then girilen adedin sag tarafta biten bolumune islendigi dogrulanir
    Then Kalite kontrol sag taraftaki kalan bolumundeki rakam dogrulanir
    Then Kullanici logout yapar
    And Lift montaj amiri butonuna tiklanir
    Then Lift montaj amiri ekraninda oldugu dogrulanir
    And Lift montaj amiri sifre kutucuguna gecerli bir "data" girilir
    And Giris yap butonuna tiklanir
    Then Lift montaj amirinin kendi sorumluluk sayfasina gectigi dogrulanir
    #Then Lift Montaj Amiri ekrandaki datalari dogrular
    And Paslanmaz siparis turundeki siparisin bulundugu satira tiklar
    And Gaz Dolum butonuna tiklanir
    Then uretilen adedi giriniz yazisi dogrulanir
    And PASLANMAZ siparis turu icin uretilecek adet girilir
    And onayla butonuna tiklanir
    Then girilen adedin sag tarafta gaz dolum biten bolumune islendigi dogrulanir
    Then sag taraftaki gaz dolum kalan bolumundeki rakam dogrulanir
    Then Boru Kapama Butonunun yesil renk oldugu dogrulanir
    Then Boru Kaynak Butonunun yesil renk oldugu dogrulanir
    Then Lift Montaj Butonunu yesil renk oldugu dogrulanir
    Then Gaz Dolum Butonunu yesil renk oldugu dogrulanir
    Then Baslik Takma Butonunu sari renk oldugu dogrulanir
    And Baslik Takma butonuna tiklanir
    Then uretilen adedi giriniz yazisi dogrulanir
    And PASLANMAZ siparis turu icin uretilecek adet girilir
    And onayla butonuna tiklanir
    Then girilen adedin sag tarafta baslik takma biten bolumune islendigi dogrulanir
    Then sag taraftaki baslik takma kalan bolumundeki rakam dogrulanir
    Then Boru Kapama Butonunun yesil renk oldugu dogrulanir
    Then Boru Kaynak Butonunun yesil renk oldugu dogrulanir
    Then Lift Montaj Butonunu yesil renk oldugu dogrulanir
    Then Gaz Dolum Butonunu yesil renk oldugu dogrulanir
    Then Baslik Takma Butonunu yesil renk oldugu dogrulanir
    And Kullanici logout yapar
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
    Then Uretim Planlama butonunun gorunur oldugu dogrulanir
    And Uretim Planlama butonuna tiklanir
    And Uretim Planlama sifre kutucuguna gecerli bir "data" girilir
    And Giris yap butonuna tiklanir
    And Paslanmaz turu icin nihai uretimi tamamla butonuna tiklanir
    And onayla butonuna tiklanir
    Then Paslanmaz turu siparisin tamamlandi durumuna gectigi dogrulanir
    And Paslanmaz siparisi silinir
    And Kullanici logout yapar