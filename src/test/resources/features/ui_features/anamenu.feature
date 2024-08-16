Feature: US1
    Background: Anasayfa ve dogrulama
      When Anasayfaya gidilir
      Then Anasayfada oldugu dogrulanir

    Scenario: "Anasayfa" ya girilebilir olmalidir (Negativ Test)
      When Ana giris ekraninda hicbir kullanici unvanina tiklamadan sifre giris ekranina erisememelidir

    Scenario: "TALASLI IMALAT AMIRI"  butonu Anasayfada gorunur ve tiklanir olmalidir. (Positif Test)
      Then Talasli Imalat Amiri Butonu gorunur oldugu dogrulanir
      And Talasli Imalat Amiri Butonuna tiklanir
      Then Sifre ekraninda oldugu dogrulanir
      And sifre kutucuguna gecerli bir data girilir
      And Giris yap butonuna tiklanir