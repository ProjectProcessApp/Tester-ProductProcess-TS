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
    And "<Teslim Tarihi>" Teslim Tarihine gecerli bir data girilir
    And "<Siparis turu>" Siparis turune gecerli bir data girilir
    And "<Siparis miktari>" Siparis miktarina gecerli bir data girilir
    And "<Hazir mil miktari>" Hazir mil miktarina gecerli bir data girilir
    And Siparis durumu kutusunda "İşlenmeyi Bekliyor" yazmali
    And Giris yap butonuna tiklanir
    And "Sipariş başarıyla oluşturuldu" yazisi dogrulanir ve ok tusuna basilir

    Examples:
      | musteri adi | Gasan No      | Siparis No | Teslim Tarihi | Siparis turu | Siparis miktari  | Hazir mil miktari |
      |onur         |1111 A 123456  |123456      |10.10.2024     |  paslanmaz   |500               |500                |
      |beyt         |1111 AB 123456 |123457      |11.11.2025     |  paslanmaz   |1000              |500                |
      |mikail       |1111 ABC 123456|123458      |12.12.2026     |  paslanmaz   |1500              |1000               |
  @US2
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
    And "<Teslim Tarihi>" Teslim Tarihine gecersiz bir data girilir
    And "<Siparis turu>" Siparis turune gecersiz bir data girilir
    And "<Siparis miktari>" Siparis miktarina gecersiz bir data girilir
    And "<Hazir mil miktari>" Hazir mil miktarina gecersiz bir data girilir
    And Giris butonunun aktif olmadigi kontrol edilir

    Examples:
      | musteri adi | Gasan No      | Siparis No | Teslim Tarihi | Siparis turu | Siparis miktari  | Hazir mil miktari |
      |             |               |            |               |              |                  |                   |
      |.            |1111 AB 123450  |123450     |30.09.2024     |  paslanmaz   |1000              |100                |
      |1            |1111 AB 123450  |123450     |30.09.2024     |  paslanmaz   |1000              |100                |
      |[            |1111 AB 123450  |123450     |30.09.2024     |  paslanmaz   |1000              |100                |
      |onur         |                |123450     |30.09.2024     |  paslanmaz   |1000              |100                |
      |onur         |111 12345       |123450     |30.09.2024     |  paslanmaz   |1000              |100                |
      |onur         |111 ABCD 12345  |123450     |30.09.2024     |  paslanmaz   |1000              |100                |
      |onur         |111 ABCD 123456 |123450     |30.09.2024     |  paslanmaz   |1000              |100                |
      |onur         |111 ABC  123456 |123450     |30.09.2024     |  paslanmaz   |1000              |100                |
      |onur         |111 ABC  1234567|123450     |30.09.2024     |  paslanmaz   |1000              |100                |
      |onur         |1114 ABC  123456|           |30.09.2024     |  paslanmaz   |1000              |100                |
      |onur         |1114 ABC  123456|12345      |30.09.2024     |  paslanmaz   |1000              |100                |
      |onur         |1114 ABC  123456|1234567    |30.09.2024     |  paslanmaz   |1000              |100                |
      |onur         |1114 ABC  123456|1234567    |               |  paslanmaz   |1000              |100                |
      |onur         |1114 ABC  123456|1234567    |01.08.2024     |  paslanmaz   |1000              |100                |
      |onur         |1114 ABC  123456|1234567    |01.08.2024     |  paslanmaz   |                  |100                |
      |onur         |1114 ABC  123456|1234567    |01.08.2024     |  paslanmaz   |-1000             |100                |
      |onur         |1114 ABC  123456|1234567    |01.08.2024     |  paslanmaz   |1000              |-100               |