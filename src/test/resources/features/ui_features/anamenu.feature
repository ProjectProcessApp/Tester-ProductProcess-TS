Feature: US1
Background: TC_01 Anasayfa ve dogrulama
When Anasayfaya gidilir
Then Anasayfada oldugu dogrulanir

    Scenario:TC_02 "Anasayfa" ya girilebilir olmalidir (Negativ Test)
    When Ana giris ekraninda hicbir kullanici unvanina tiklamadan sifre giris ekranina erisememelidir

Scenario:TC_03 "TALASLI IMALAT AMIRI"  butonu Anasayfada gorunur ve tiklanir olmalidir. (Positif Test)
          Then Talasli Imalat Amiri Butonu gorunur oldugu dogrulanir
          And Talasli Imalat Amiri Butonuna tiklanir
          Then Sifre ekraninda oldugu dogrulanir
          And Talasli imalat amiri sifre kutucuguna gecerli bir data girilir
          And Sifre gizleme butonunun sifreyi gizledigi kontrol edllir
          And Sifre gizleme butonunun sifreyi tekrar gorunur hale getirdigi kontrol edllir
          And Giris yap butonuna tiklanir
          Then Kullanicinin kendi sorumluluk sayfasina gectiigi dogrulanir

Scenario: TC_04 "Talasli imalat Amiri"  butonu Anasayfada gorulemez veya tiklanamaz olmalidir. (Negatif Test)
          Then Talasli Imalat Amiri Butonu gorunur oldugu dogrulanir
          And talasli imalat amiri butonuna tiklanir
          Then sifre ekraninda olundugu dogrulanir
          And sifre kutucu bos birakilir
          And giris yap butonuna tiklanir
          Then Kullanicinin kendi sorumluluk sayfasina gecemedigi dogrulanir

Scenario: TC_05 manuel olarak test edilecegi icin buraya yazilmadi

Scenario: TC_06 "TALASLI IMALAT AMIRI"  butonu Anasayfada gorulemez veya tiklanamaz olmalidir. (Negatif Test)

          Then Talasli Imalat Amiri Butonu gorunur oldugu dogrulanir
          And talasli imalat amiri butonuna tiklanir
          Then sifre ekraninda olundugu dogrulanir
          And sifre kutucuna gecersiz bir data girilir
          And Sifre gizleme butonunun sifreyi gizledigi kontrol edllir
          And Sifre gizleme butonunun sifreyi tekrar gorunur hale getirdigi kontrol edllir
          And giris yap butonuna tiklanir
          Then Kullanicinin kendi sorumluluk sayfasina gecemedigi dogrulanir

Scenario: TC_07 "Polisaj"  butonu Anasayfada gorunur ve tiklanir olmalidir. (Positif Test)
          Then Polisaj amiri butonunun gorunur oldugu dogrulanir
          And Polisaj amiri butonuna tiklanir
          Then sifre ekraninda olundugu dogrulanir
          And sifre kutucuguna gecerli bir data girilir
          And Sifre gizleme butonunun sifreyi gizledigi kontrol edllir
          And Sifre gizleme butonunun sifreyi tekrar gorunur hale getirdigi kontrol edllir
          And Giris yap butonuna tiklanir
          Then Kullanicinin kendi sorumluluk sayfasina gectigi dogrulanir

Scenario: TC_08 Manuel test

Scenario: TC_09 "Polisaj Amiri"  butonu Anasayfada gorulemez  veya tiklanamaz olmalidir. (Negatif Test)
          Then Polisaj amiri butonunun gorunur oldugu dogrulanir
          And Polisaj amiri butonuna tiklanir
          Then sifre ekraninda olundugu dogrulanir
          And sifre kutucugu bos birakilir
          And Giris yap butonuna tiklanir
          And Kullanicinin kendi sorumluluk sayfasina gecemedigi dogrulanir

Scenario: TC_10 "Polisaj Amiri"  butonu Anasayfada gorulemez veya tiklanamaz olmalidir. (Negatif Test)
          Then Polisaj amiri butonunun gorunur oldugu dogrulanir
          And Polisaj amiri butonuna tiklanir
          Then sifre ekraninda olundugu dogrulanir
          And sifre kutucuguna gecersiz bir data girillir
          And Sifre gizleme butonunun sifreyi gizledigi kontrol edllir
          And Sifre gizleme butonunun sifreyi tekrar gorunur hale getirdigi kontrol edllir
          And Giris yap butonuna tiklanir
          And Kullanicinin kendi sorumluluk sayfasina gecemedigi dogrulanir

Scenario: TC_11 "Lift montaj amiri"  butonu Anasayfada gorunur ve tiklanir olmalidir. (Positif Test)
          Then Lift montaj amiri butonunun gorunur oldugu dogrulanir
          And Lift montaj amiri butonuna tiklanir
          Then sifre ekraninda olundugu dogrulanir
          And sifre kutucuguna gecerli bir data girilir
          And Sifre gizleme butonunun sifreyi gizledigi kontrol edllir
          And Sifre gizleme butonunun sifreyi tekrar gorunur hale getirdigi kontrol edllir
          And Giris yap butonuna tiklanir
          Then Kullanicinin kendi sorumluluk sayfasina gectigi dogrulanir

Scenario: TC_12 Manuel Test

Scenario: TC_13"Lift Montaj Amiri"  butonu Anasayfada gorulemez veya tiklanamaz olmalidir. (Negatif Test)
          Then Lift Montaj Amiributonunun gorunur oldugu dogrulanir
          And Lift Montaj Amiri butonuna tiklanir
          Then sifre ekraninda olundugu dogrulanir
          And sifre kutucugu bos birakilir
          And Giris yap butonuna tiklanir
          And Kullanicinin kendi sorumluluk sayfasina gecemedigi dogrulanir

Scenario: TC_14"LIFT MONTAJ  AMIRI"  butonu Anasayfada gorulemezr veya tiklanamaz olmalidir. (Negatif Test)

          Then Lift Montaj Amiributonunun gorunur oldugu dogrulanir
          And Lift Montaj Amiri butonuna tiklanir
          Then sifre ekraninda olundugu dogrulanir
          And sifre kutucuguna gecersiz bir data girilir
          And  Sifre gizleme butonunun sifreyi gizledigi kontrol edllir
          And Sifre gizleme butonunun sifreyi tekrar gorunur hale getirdigi kontrol edllir
          And Giris yap butonuna tiklanir
          Then Kullanicinin kendi sorumluluk sayfasina gecemedigi dogrulanir

Scenario: TC_15 "Bloklift Montaj Amiri"  butonu Anasayfada gorunur ve tiklanir olmalidir. (Positif Test)

          Then Bloklift Montaj Amiri butonunun gorunur oldugu dogrulanir
          And Bloklift Montaj Amiri butonuna tiklanir
          Then sifre ekraninda olundugu dogrulanir
          And sifre kutucuguna gecerli bir data girilir
          And  Sifre gizleme butonunun sifreyi gizledigi kontrol edllir
          And Sifre gizleme butonunun sifreyi tekrar gorunur hale getirdigi kontrol edllir
          And Giris yap butonuna tiklanir
          Then Kullanicinin kendi sorumluluk sayfasina gectigi dogrulanir

Scenario:TC_16 "Bloklift Montaj Amiri"butonu Anasayfada gorulemez veya tiklanamaz olmalidir. (Negatif Test)
      //Manuel Test

Scenario:TC_17"Bloklift Montaj Amiri"butonu Anasayfada gorulemez veya tiklanamaz olmalidir.(Negatif Test)

          Then Bloklift Montaj Amiri butonunun gorunur oldugu dogrulanir
          And Bloklift Montaj Amiri butonuna tiklanir
          Then sifre ekraninda olundugu dogrulanir
          And sifre kutucugu bos birakilir
          And Giris yap butonuna tiklanir
          And Kullanicinin kendi sorumluluk sayfasina gecemedigi dogrulanir

Scenario:TC_18" Bloklift Montaj Amiri"butonu Anasayfada gorulemez veya tiklanamaz olmalidir.(Negatif Test)

          Then Bloklift Montaj Amiri butonunun gorunur oldugu dogrulanir
          And Bloklift Montaj Amiri butonuna tiklanir
          Then sifre ekraninda olundugu dogrulanir
          And sifre kutucuguna gecersiz bir data girilir
          And  Sifre gizleme butonunun sifreyi gizledigi kontrol edllir
          And Sifre gizleme butonunun sifreyi tekrar gorunur hale getirdigi kontrol edllir
          And Giris yap butonuna tiklanir
          And Kullanicinin kendi sorumluluk sayfasina gecemedigi dogrulanir

Scenario: TC_19 "Boyama ve Paketleme Amiri"  butonu Anasayfada gorunur ve tiklanir olmalidir. (Positif Test)

          Then Boyama ve Paketleme Amiri butonunun gorunur oldugu dogrulanir
          And Boyama ve Paketleme Amiri butonuna tiklanir
          Then sifre ekraninda olundugu dogrulanir
          And sifre kutucuguna gecerli bir data girilir
          And  Sifre gizleme butonunun sifreyi gizledigi kontrol edllir
          And Sifre gizleme butonunun sifreyi tekrar gorunur hale getirdigi kontrol edllir
          And Giris yap butonuna tiklanir
          Then Kullanicinin kendi sorumluluk sayfasina gectigi dogrulanir


Scenario: TC_20 Manuel Test

Scenario: TC_21 "Boyama ve Paketleme Amiri"  butonu Anasayfada gorulemez veya tiklanamaz olmalidir. (Negatif Test)

          Then Boyama ve Paketleme Amiri butonunun gorunur oldugu dogrulanir
          And BBoyama ve Paketleme Amiri butonuna tiklanir
          Then sifre ekraninda olundugu dogrulanir
          And sifre kutucugu bos birakilir
          And Giris yap butonuna tiklanir
          And Kullanicinin kendi sorumluluk sayfasina gecemedigi dogrulanir

Scenario: TC_22 "Boyama ve Paketleme Amiri"  butonu Anasayfada gorulemez veya tiklanamaz olmalidir. (Negatif Test)

          Then Boyama ve Paketleme Amiri butonunun gorunur oldugu dogrulanir
          And Boyama ve Paketleme Amiri butonuna tiklanir
          Then sifre ekraninda olundugu dogrulanir
          And sifre kutucuguna gecersiz bir data girilir
          And Sifre gizleme butonunun sifreyi gizledigi kontrol edllir
          And Sifre gizleme butonunun sifreyi tekrar gorunur hale getirdigi kontrol edllir
          And Giris yap butonuna tiklanir
          And Kullanicinin kendi sorumluluk sayfasina gecemedigi dogrulanir

Scenario: TC_23 "Kalite Kontrol" butonu Anasayfada gorunur ve tiklanir olmalidir. (Positif Test)

          Then Kalite Kontrol butonunun gorunur oldugu dogrulanir
          And Kalite Kontrol butonuna tiklanir
          Then sifre ekraninda olundugu dogrulanir
          And sifre kutucuguna gecerli bir data girilir
          And Sifre gizleme butonunun sifreyi gizledigi kontrol edllir
          And Sifre gizleme butonunun sifreyi tekrar gorunur hale getirdigi kontrol edllir
          And Giris yap butonuna tiklanir
          Then Kullanicinin kendi sorumluluk sayfasina gectigi dogrulanir

Scenario: TC_24 "Kalite Kontrol"  butonu Anasayfada gorulemez veya tiklanamaz olmalidir. (Negatif Test)
//Manuel Test


Scenario: TC_25 "Kalite Kontrol"  butonu Anasayfada gorulemez veya tiklanamaz olmalidir. (Negatif Test)

          Then Kalite Kontrol butonunun gorunur oldugu dogrulanir
          And Kalite Kontrol butonuna tiklanir
          Then sifre ekraninda olundugu dogrulanir
          And sifre kutucugu bos birakilir
          And Giris yap butonuna tiklanir
          And Kullanicinin kendi sorumluluk sayfasina gecemedigi dogrulanir

Scenario: TC_26 "Kalite Kontrol"  butonu Anasayfada gorulemez veya tiklanamaz olmalidir. (Negatif Test)

          Then Kalite Kontrol  butonunun gorunur oldugu dogrulanir
          And Kalite Kontrol butonuna tiklanir
          Then sifre ekraninda olundugu dogrulanir
          And sifre kutucuguna gecersiz bir data girilir
          And Sifre gizleme butonunun sifreyi gizledigi kontrol edllir
          And Sifre gizleme butonunun sifreyi tekrar gorunur hale getirdigi kontrol edllir
          And Giris yap butonuna tiklanir
          And Kullanicinin kendi sorumluluk sayfasina gecemedigi dogrulanir

Scenario: TC_27  "Uterim Planlama "  butonu Anasayfada gorunur ve tiklanir olmalidir. (Positif Test)

          Then Uterim Planlama butonunun gorunur oldugu dogrulanir
          And Uterim Planlama butonuna tiklanir
          Then sifre ekraninda olundugu dogrulanir
          And sifre kutucuguna gecerli bir data girilir
          And Sifre gizleme butonunun sifreyi gizledigi kontrol edllir
          And Sifre gizleme butonunun sifreyi tekrar gorunur hale getirdigi kontrol edllir
          And Giris yap butonuna tiklanir
          Then Kullanicinin kendi sorumluluk sayfasina gectigi dogrulanir


Scenario: TC_28 "Uretim Planlama"  butonu Anasayfada gorulemezr veya tiklanamaz olmalidir. (Negatif Test)
//Manuel Test

Scenario: TC_29 "Uretim Planlama"  butonu Anasayfada gorulemez veya tiklanamaz olmalidir. (Negatif Test)

          Then Uretim Planlama butonunun gorunur oldugu dogrulanir
          And Uretim Planlama butonuna tiklanir
          Then sifre ekraninda olundugu dogrulanir
          And sifre kutucugu bos birakilir
          And Giris yap butonuna tiklanir
          And Kullanicinin kendi sorumluluk sayfasina gecemedigi dogrulanir

Scenario: TC_30 "Uretim Planlama"  butonu Anasayfada gorulemez veya tiklanamaz olmalidir. (Negatif Test)

          Then Uretim Planlama butonunun gorunur oldugu dogrulanir
          And Uretim Planlama butonuna tiklanir
          Then sifre ekraninda olundugu dogrulanir
          And sifre kutucuguna gecersiz bir data girilir
          And Sifre gizleme butonunun sifreyi gizledigi kontrol edllir
          And Sifre gizleme butonunun sifreyi tekrar gorunur hale getirdigi kontrol edllir
          And Giris yap butonuna tiklanir
          And Kullanicinin kendi sorumluluk sayfasina gecemedigi dogrulanir

Scenario: TC_31"Yonetim"  butonu Anasayfada gorunur ve tiklanir olmalidir. (Positif Test)#

          Then Yonetim butonunun gorunur oldugu dogrulanir
          And Yonetim Planlama butonuna tiklanir
          Then sifre ekraninda olundugu dogrulanir
          And sifre kutucuguna gecerli bir data girilir
          And Sifre gizleme butonunun sifreyi gizledigi kontrol edllir
          And Sifre gizleme butonunun sifreyi tekrar gorunur hale getirdigi kontrol edllir
          And Giris yap butonuna tiklanir
          Then Kullanicinin kendi sorumluluk sayfasina gectigi dogrulanir

  Scenario: TC_32 "YONETIM"  butonu Anasayfada gorulemezr veya tiklanamaz olmalidir. (Negatif Test)
    //Manuel Test

    Scenario: TC_33  "Yonetim"  butonu Anasayfada gorulemez  veya tiklanamaz olmalidir. (Negatif Test)

              Then Yonetim butonunun gorunur oldugu dogrulanir
              And Yonetim  butonuna tiklanir
              Then sifre ekraninda olundugu dogrulanir
              And sifre kutucugu bos birakilir
              And Giris yap butonuna tiklanir
              And Kullanicinin kendi sorumluluk sayfasina gecemedigi dogrulanir

      Scenario: TC_34"Yonetim"  butonu Anasayfada gorulemezr veya tiklanamaz olmalidir. (Negatif Test)
                Then Uretim Planlama  butonunun gorunur oldugu dogrulanir
                And Uretim Planlama butonuna tiklanir
                Then sifre ekraninda olundugu dogrulanir
                And sifre kutucuguna gecersiz bir data girilir
                And Sifre gizleme butonunun sifreyi gizledigi kontrol edllir
                And Sifre gizleme butonunun sifreyi tekrar gorunur hale getirdigi kontrol edllir
                And Giris yap butonuna tiklanir
                And Kullanicinin kendi sorumluluk sayfasina gecemedigi dogrulanir





























































































































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

