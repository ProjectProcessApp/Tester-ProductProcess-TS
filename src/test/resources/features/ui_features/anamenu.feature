
Feature: US1

  Background:  Anasayfa ve dogrulama
          When Anasayfaya gidilir
          Then Anasayfada oldugu dogrulanir

    Scenario:TC_01 "Anasayfa" ya girilebilir olmalidir (Negativ Test)
        When Ana giris ekraninda hicbir kullanici unvanina tiklamadan sifre giris ekranina erisememelidir

    Scenario:TC_02 "TALASLI IMALAT AMIRI"  butonu Anasayfada gorunur ve tiklanir olmalidir. (Positif Test)
          Then Talasli Imalat Amiri Butonu gorunur oldugu dogrulanir
          And Talasli Imalat Amiri Butonuna tiklanir
          Then Sifre ekraninda oldugu dogrulanir
          And Talasli imalat amiri sifre kutucuguna gecerli bir "data" girilir
          And Sifre gizleme butonunun sifreyi gizledigi kontrol edllir
          And Sifre gizleme butonunun sifreyi tekrar gorunur hale getirdigi kontrol edllir
          And Giris yap butonuna tiklanir
          Then Kullanicinin kendi sorumluluk sayfasina gectigi dogrulanir

      Scenario: TC_03 manuel olarak test edilecegi icin buraya yazilmadi

     Scenario Outline: TC_04 "TALASLI IMALAT AMIRI"  gecersiz sifre denemesi. (Negatif Test)

          Then Talasli Imalat Amiri Butonu gorunur oldugu dogrulanir
          And Talasli Imalat Amiri Butonuna tiklanir
          Then Sifre ekraninda oldugu dogrulanir
          And sifre kutucuguna gecersiz bir "<data>" girilir
          And Sifre gizleme butonunun sifreyi gizledigi kontrol edllir
          And Sifre gizleme butonunun sifreyi tekrar gorunur hale getirdigi kontrol edllir
          And Giris yap butonuna tiklanir
          Then Kullanicinin kendi sorumluluk sayfasina gecemedigi dogrulanir
      Examples:
        | data |
        |      |
       |Techpro|
       |123456 |
       |?.¿0p9 |

     Scenario: TC_05 "Polisaj amiri"  butonu Anasayfada gorunur ve tiklanir olmalidir. (Positif Test)
          Then Polisaj amiri butonunun gorunur oldugu dogrulanir
          And Polisaj amiri butonuna tiklanir
          Then Sifre ekraninda oldugu dogrulanir
          And Polisaj amiri sifre kutucuguna gecerli bir data girilir
          And Sifre gizleme butonunun sifreyi gizledigi kontrol edllir
          And Sifre gizleme butonunun sifreyi tekrar gorunur hale getirdigi kontrol edllir
          And Giris yap butonuna tiklanir
          Then Kullanicinin kendi sorumluluk sayfasina gectigi dogrulanir

      Scenario: TC_06 Manuel test

      Scenario Outline: TC_7 "Polisaj Amiri"  butonu Anasayfada gorulemez veya tiklanamaz olmalidir. (Negatif Test)
          Then Polisaj amiri butonunun gorunur oldugu dogrulanir
          And Polisaj amiri butonuna tiklanir
          Then Sifre ekraninda oldugu dogrulanir
          And sifre kutucuguna gecersiz bir "<data>" girilir
          And Sifre gizleme butonunun sifreyi gizledigi kontrol edllir
          And Sifre gizleme butonunun sifreyi tekrar gorunur hale getirdigi kontrol edllir
          And Giris yap butonuna tiklanir
          And Kullanicinin kendi sorumluluk sayfasina gecemedigi dogrulanir
        Examples:
          | data |
          |      |
          |Techpro|
          |123456 |
          |?.¿0p9 |

     Scenario: TC_8 "Lift montaj amiri"  butonu Anasayfada gorunur ve tiklanir olmalidir. (Positif Test)
          Then Lift montaj amiri butonunun gorunur oldugu dogrulanir
          And Lift montaj amiri butonuna tiklanir
          Then Sifre ekraninda oldugu dogrulanir
          And Lift montaj amiri sifre kutucuguna gecerli bir "data" girilir
          And Sifre gizleme butonunun sifreyi gizledigi kontrol edllir
          And Sifre gizleme butonunun sifreyi tekrar gorunur hale getirdigi kontrol edllir
          And Giris yap butonuna tiklanir
          Then Kullanicinin kendi sorumluluk sayfasina gectigi dogrulanir

       Scenario: TC_9 Manuel Test

       Scenario Outline: TC_10" LIFT MONTAJ  AMIRI"  butonu Anasayfada gorulemezr veya tiklanamaz olmalidir. (Negatif Test)

         Then Lift montaj amiri butonunun gorunur oldugu dogrulanir
          And Lift montaj amiri butonuna tiklanir
         Then Sifre ekraninda oldugu dogrulanir
         And sifre kutucuguna gecersiz bir "<data>" girilir
          And  Sifre gizleme butonunun sifreyi gizledigi kontrol edllir
          And Sifre gizleme butonunun sifreyi tekrar gorunur hale getirdigi kontrol edllir
          And Giris yap butonuna tiklanir
          Then Kullanicinin kendi sorumluluk sayfasina gecemedigi dogrulanir
         Examples:
           | data |
           |      |
           |Techpro|
           |123456 |
           |?.¿0p9 |

      Scenario: TC_11 "Bloklift Montaj Amiri"  butonu Anasayfada gorunur ve tiklanir olmalidir. (Positif Test)

          Then Bloklift Montaj Amiri butonunun gorunur oldugu dogrulanir
          And Bloklift Montaj Amiri butonuna tiklanir
          Then Sifre ekraninda oldugu dogrulanir
          And Bloklift Montaj Amiri sifre kutucuguna gecerli bir "data" girilir
          And  Sifre gizleme butonunun sifreyi gizledigi kontrol edllir
          And Sifre gizleme butonunun sifreyi tekrar gorunur hale getirdigi kontrol edllir
          And Giris yap butonuna tiklanir
          Then Kullanicinin kendi sorumluluk sayfasina gectigi dogrulanir

      Scenario:TC_12 "Bloklift Montaj Amiri"butonu Anasayfada gorulemez veya tiklanamaz olmalidir. (Negatif Test)
      //Manuel Test

      Scenario Outline:TC_13 "Bloklift Montaj Amiri" butonu Anasayfada gorulemez veya tiklanamaz olmalidir.(Negatif Test)

          Then Bloklift Montaj Amiri butonunun gorunur oldugu dogrulanir
          And Bloklift Montaj Amiri butonuna tiklanir
          Then Sifre ekraninda oldugu dogrulanir
           And sifre kutucuguna gecersiz bir "<data>" girilir
          And  Sifre gizleme butonunun sifreyi gizledigi kontrol edllir
          And Sifre gizleme butonunun sifreyi tekrar gorunur hale getirdigi kontrol edllir
          And Giris yap butonuna tiklanir
          And Kullanicinin kendi sorumluluk sayfasina gecemedigi dogrulanir
        Examples:
          | data |
          |      |
          |Techpro|
          |123456 |
          |?.¿0p9 |

      Scenario: TC_14 "Boyama ve Paketleme Amiri"  butonu Anasayfada gorunur ve tiklanir olmalidir. (Positif Test)

          Then Boyama ve Paketleme Amiri butonunun gorunur oldugu dogrulanir
          And Boyama ve Paketleme Amiri butonuna tiklanir
          Then Sifre ekraninda oldugu dogrulanir
          And Boyama ve Paketleme Amiri sifre kutucuguna gecerli bir "data" girilir
          And  Sifre gizleme butonunun sifreyi gizledigi kontrol edllir
          And Sifre gizleme butonunun sifreyi tekrar gorunur hale getirdigi kontrol edllir
          And Giris yap butonuna tiklanir
          Then Kullanicinin kendi sorumluluk sayfasina gectigi dogrulanir


      Scenario: TC_15 Manuel Test

      Scenario Outline: TC_16 "Boyama ve Paketleme Amiri"  butonu Anasayfada gorulemez veya tiklanamaz olmalidir. (Negatif Test)

          Then Boyama ve Paketleme Amiri butonunun gorunur oldugu dogrulanir
          And Boyama ve Paketleme Amiri butonuna tiklanir
          Then Sifre ekraninda oldugu dogrulanir
          And sifre kutucuguna gecersiz bir "<data>" girilir
          And Sifre gizleme butonunun sifreyi gizledigi kontrol edllir
          And Sifre gizleme butonunun sifreyi tekrar gorunur hale getirdigi kontrol edllir
          And Giris yap butonuna tiklanir
          And Kullanicinin kendi sorumluluk sayfasina gecemedigi dogrulanir
        Examples:
          | data |
          |      |
          |Techpro|
          |123456 |
          |?.¿0p9 |

       Scenario: TC_17 "Kalite Kontrol" butonu Anasayfada gorunur ve tiklanir olmalidir. (Positif Test)

          Then Kalite Kontrol butonunun gorunur oldugu dogrulanir
          And Kalite Kontrol butonuna tiklanir
          Then Sifre ekraninda oldugu dogrulanir
          And Kalite Kontrol sifre kutucuguna gecerli bir "data" girilir
          And Sifre gizleme butonunun sifreyi gizledigi kontrol edllir
          And Sifre gizleme butonunun sifreyi tekrar gorunur hale getirdigi kontrol edllir
          And Giris yap butonuna tiklanir
          Then Kullanicinin kendi sorumluluk sayfasina gectigi dogrulanir

        Scenario: TC_18 "Kalite Kontrol"  butonu Anasayfada gorulemez veya tiklanamaz olmalidir. (Negatif Test)
        //Manuel Test

        Scenario Outline: TC_19 "Kalite Kontrol"  butonu Anasayfada gorulemez veya tiklanamaz olmalidir. (Negatif Test)

          Then Kalite Kontrol butonunun gorunur oldugu dogrulanir
          And Kalite Kontrol butonuna tiklanir
          Then Sifre ekraninda oldugu dogrulanir
          And sifre kutucuguna gecersiz bir "<data>" girilir
          And Sifre gizleme butonunun sifreyi gizledigi kontrol edllir
          And Sifre gizleme butonunun sifreyi tekrar gorunur hale getirdigi kontrol edllir
          And Giris yap butonuna tiklanir
          And Kullanicinin kendi sorumluluk sayfasina gecemedigi dogrulanir
          Examples:
            | data |
            |      |
            |Techpro|
            |123456 |
            |?.¿0p9 |

        Scenario: TC_20  "Uretim Planlama " butonu Anasayfada gorunur ve tiklanir olmalidir. (Positif Test)

          Then Uretim Planlama butonunun gorunur oldugu dogrulanir
          And Uretim Planlama butonuna tiklanir
          Then Sifre ekraninda oldugu dogrulanir
          And Uretim Planlama sifre kutucuguna gecerli bir "data" girilir
          And Sifre gizleme butonunun sifreyi gizledigi kontrol edllir
          And Sifre gizleme butonunun sifreyi tekrar gorunur hale getirdigi kontrol edllir
          And Giris yap butonuna tiklanir
          Then Kullanicinin kendi sorumluluk sayfasina gectigi dogrulanir


        Scenario: TC_21 "Uretim Planlama"  butonu Anasayfada gorulemezr veya tiklanamaz olmalidir. (Negatif Test)
        //Manuel Test

        Scenario Outline: TC_22 "Uretim Planlama"  butonu Anasayfada gorulemez veya tiklanamaz olmalidir. (Negatif Test)

          Then Uretim Planlama butonunun gorunur oldugu dogrulanir
          And Uretim Planlama butonuna tiklanir
          Then Yonetim Sifre ekraninda oldugu dogrulanir
          And sifre kutucuguna gecersiz bir "<data>" girilir
          And Sifre gizleme butonunun sifreyi gizledigi kontrol edllir
          And Sifre gizleme butonunun sifreyi tekrar gorunur hale getirdigi kontrol edllir
          And Giris yap butonuna tiklanir
          And Kullanicinin kendi sorumluluk sayfasina gecemedigi dogrulanir
          Examples:
            | data |
            |      |
            |Techpro|
            |123456 |
            |?.¿0p9 |

        Scenario: TC_23 "Yonetim"  butonu Anasayfada gorunur ve tiklanir olmalidir. (Positif Test)

          Then Yonetim butonunun gorunur oldugu dogrulanir
          And Yonetim butonuna tiklanir
         Then Yonetim Sifre ekraninda oldugu dogrulanir
          And yonetici sifre kutucuguna gecerli bir "data" girilir
          And Yonetici Sifre gizleme butonunun sifreyi gizledigi kontrol edllir
          And Yonetici Sifre gizleme butonunun sifreyi tekrar gorunur hale getirdigi kontrol edllir
          And yonetim Giris yap butonuna tiklanir
          Then Kullanicinin kendi sorumluluk sayfasina gectigi dogrulanir

         Scenario: TC_24 "YONETIM"  butonu Anasayfada gorulemezr veya tiklanamaz olmalidir. (Negatif Test)
          //Manuel Test

        Scenario Outline: TC_25 "Yonetim" butonu Anasayfada gorulemez veya tiklanamaz olmalidir. (Negatif Test)
          Then Yonetim butonunun gorunur oldugu dogrulanir
          And Yonetim butonuna tiklanir
          Then Yonetim Sifre ekraninda oldugu dogrulanir
          And yonetici sifre kutucuguna gecersiz bir "<data>" girilir
          And Yonetici Sifre gizleme butonunun sifreyi gizledigi kontrol edllir
          And Yonetici Sifre gizleme butonunun sifreyi tekrar gorunur hale getirdigi kontrol edllir
          And yonetim Giris yap butonuna tiklanir
          And Kullanicinin kendi sorumluluk sayfasina gecemedigi dogrulanir
          Examples:
            | data |
            |      |
            |Techpro|
            |123456 |
            |?.¿0p9 |



