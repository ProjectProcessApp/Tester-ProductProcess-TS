
Feature: US1

  Background:  Anasayfa ve dogrulama
          When Anasayfaya gidilir
          Then Anasayfada oldugu dogrulanir

     Scenario: TC_01 "TALASLI IMALAT AMIRI"  butonu Anasayfada gorunur ve tiklanir olmalidir. (Positif Test)
          Then Talasli Imalat Amiri Butonu gorunur oldugu dogrulanir
          And Talasli Imalat Amiri Butonuna tiklanir
          Then Sifre ekraninda oldugu dogrulanir

    Scenario:TC_02 "Anasayfa" ya girilebilir olmalidir (Negativ Test)
        When Ana giris ekraninda hicbir kullanici unvanina tiklamadan sifre giris ekranina erisememelidir

    Scenario:TC_03 "TALASLI IMALAT AMIRI"  butonu Anasayfada gorunur ve tiklanir olmalidir. (Positif Test)
          Then Talasli Imalat Amiri Butonu gorunur oldugu dogrulanir
          And Talasli Imalat Amiri Butonuna tiklanir
          Then Sifre ekraninda oldugu dogrulanir
          And Talasli imalat amiri sifre kutucuguna gecerli bir "data" girilir
          And Sifre gizleme butonunun sifreyi gizledigi kontrol edllir
          And Sifre gizleme butonunun sifreyi tekrar gorunur hale getirdigi kontrol edllir
          And Giris yap butonuna tiklanir
          Then Kullanicinin kendi sorumluluk sayfasina gectigi dogrulanir

      Scenario: TC_05 manuel olarak test edilecegi icin buraya yazilmadi

     Scenario Outline: TC_06 "TALASLI IMALAT AMIRI"  gecersiz sifre denemesi. (Negatif Test)

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

     Scenario: TC_07 "Polisaj amiri"  butonu Anasayfada gorunur ve tiklanir olmalidir. (Positif Test)
          Then Polisaj amiri butonunun gorunur oldugu dogrulanir
          And Polisaj amiri butonuna tiklanir
          Then Sifre ekraninda oldugu dogrulanir
          And Polisaj amiri sifre kutucuguna gecerli bir data girilir
          And Sifre gizleme butonunun sifreyi gizledigi kontrol edllir
          And Sifre gizleme butonunun sifreyi tekrar gorunur hale getirdigi kontrol edllir
          And Giris yap butonuna tiklanir
          Then Kullanicinin kendi sorumluluk sayfasina gectigi dogrulanir

      Scenario: TC_08 Manuel test

      Scenario Outline: TC_10 "Polisaj Amiri"  butonu Anasayfada gorulemez veya tiklanamaz olmalidir. (Negatif Test)
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

     Scenario: TC_11 "Lift montaj amiri"  butonu Anasayfada gorunur ve tiklanir olmalidir. (Positif Test)
          Then Lift montaj amiri butonunun gorunur oldugu dogrulanir
          And Lift montaj amiri butonuna tiklanir
          Then Sifre ekraninda oldugu dogrulanir
          And Lift montaj amiri sifre kutucuguna gecerli bir "data" girilir
          And Sifre gizleme butonunun sifreyi gizledigi kontrol edllir
          And Sifre gizleme butonunun sifreyi tekrar gorunur hale getirdigi kontrol edllir
          And Giris yap butonuna tiklanir
          Then Kullanicinin kendi sorumluluk sayfasina gectigi dogrulanir

       Scenario: TC_12 Manuel Test

       Scenario Outline: TC_14" LIFT MONTAJ  AMIRI"  butonu Anasayfada gorulemezr veya tiklanamaz olmalidir. (Negatif Test)

          Then Lift Montaj Amiributonunun gorunur oldugu dogrulanir
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

      Scenario: TC_15 "Bloklift Montaj Amiri"  butonu Anasayfada gorunur ve tiklanir olmalidir. (Positif Test)

          Then Bloklift Montaj Amiri butonunun gorunur oldugu dogrulanir
          And Bloklift Montaj Amiri butonuna tiklanir
          Then Sifre ekraninda oldugu dogrulanir
          And Bloklift Montaj Amiri sifre kutucuguna gecerli bir "data" girilir
          And  Sifre gizleme butonunun sifreyi gizledigi kontrol edllir
          And Sifre gizleme butonunun sifreyi tekrar gorunur hale getirdigi kontrol edllir
          And Giris yap butonuna tiklanir
          Then Kullanicinin kendi sorumluluk sayfasina gectigi dogrulanir

      Scenario:TC_16 "Bloklift Montaj Amiri"butonu Anasayfada gorulemez veya tiklanamaz olmalidir. (Negatif Test)
      //Manuel Test

      Scenario Outline:TC_18 " Bloklift Montaj Amiri" butonu Anasayfada gorulemez veya tiklanamaz olmalidir.(Negatif Test)

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

      Scenario: TC_19 "Boyama ve Paketleme Amiri"  butonu Anasayfada gorunur ve tiklanir olmalidir. (Positif Test)

          Then Boyama ve Paketleme Amiri butonunun gorunur oldugu dogrulanir
          And Boyama ve Paketleme Amiri butonuna tiklanir
          Then Sifre ekraninda oldugu dogrulanir
          And Boyama ve Paketleme Amiri sifre kutucuguna gecerli bir "data" girilir
          And  Sifre gizleme butonunun sifreyi gizledigi kontrol edllir
          And Sifre gizleme butonunun sifreyi tekrar gorunur hale getirdigi kontrol edllir
          And Giris yap butonuna tiklanir
          Then Kullanicinin kendi sorumluluk sayfasina gectigi dogrulanir


      Scenario: TC_20 Manuel Test

      Scenario Outline: TC_22 "Boyama ve Paketleme Amiri"  butonu Anasayfada gorulemez veya tiklanamaz olmalidir. (Negatif Test)

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

       Scenario: TC_23 "Kalite Kontrol" butonu Anasayfada gorunur ve tiklanir olmalidir. (Positif Test)

          Then Kalite Kontrol butonunun gorunur oldugu dogrulanir
          And Kalite Kontrol butonuna tiklanir
          Then Sifre ekraninda oldugu dogrulanir
          And Kalite Kontrol sifre kutucuguna gecerli bir "data" girilir
          And Sifre gizleme butonunun sifreyi gizledigi kontrol edllir
          And Sifre gizleme butonunun sifreyi tekrar gorunur hale getirdigi kontrol edllir
          And Giris yap butonuna tiklanir
          Then Kullanicinin kendi sorumluluk sayfasina gectigi dogrulanir

        Scenario: TC_24 "Kalite Kontrol"  butonu Anasayfada gorulemez veya tiklanamaz olmalidir. (Negatif Test)
        //Manuel Test

        Scenario Outline: TC_26 "Kalite Kontrol"  butonu Anasayfada gorulemez veya tiklanamaz olmalidir. (Negatif Test)

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

        Scenario: TC_27  "Uretim Planlama " butonu Anasayfada gorunur ve tiklanir olmalidir. (Positif Test)

          Then Uretim Planlama butonunun gorunur oldugu dogrulanir
          And Uretim Planlama butonuna tiklanir
          Then Sifre ekraninda oldugu dogrulanir
          And Uretim Planlama sifre kutucuguna gecerli bir "data" girilir
          And Sifre gizleme butonunun sifreyi gizledigi kontrol edllir
          And Sifre gizleme butonunun sifreyi tekrar gorunur hale getirdigi kontrol edllir
          And Giris yap butonuna tiklanir
          Then Kullanicinin kendi sorumluluk sayfasina gectigi dogrulanir


        Scenario: TC_28 "Uretim Planlama"  butonu Anasayfada gorulemezr veya tiklanamaz olmalidir. (Negatif Test)
        //Manuel Test

        Scenario Outline: TC_30 "Uretim Planlama"  butonu Anasayfada gorulemez veya tiklanamaz olmalidir. (Negatif Test)

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


        Scenario: TC_31 "Yonetim"  butonu Anasayfada gorunur ve tiklanir olmalidir. (Positif Test)

          Then Yonetim butonunun gorunur oldugu dogrulanir
          And Yonetim butonuna tiklanir
         Then Yonetim Sifre ekraninda oldugu dogrulanir
          And gecerli bir email adresi "data1" girilir
          And sifre kutucuguna gecerli bir "data2" girilir
          And Sifre gizleme butonunun sifreyi gizledigi kontrol edllir
          And Sifre gizleme butonunun sifreyi tekrar gorunur hale getirdigi kontrol edllir
          And yonetim Giris yap butonuna tiklanir
          Then Kullanicinin kendi sorumluluk sayfasina gectigi dogrulanir

         Scenario: TC_32 "YONETIM"  butonu Anasayfada gorulemezr veya tiklanamaz olmalidir. (Negatif Test)
          //Manuel Test

          Scenario: TC_33  "Yonetim"  butonu Anasayfada gorulemez  veya tiklanamaz olmalidir. (Negatif Test)

            Then Yonetim butonunun gorunur oldugu dogrulanir
            And Yonetim butonuna tiklanir
            Then Yonetim Sifre ekraninda oldugu dogrulanir
            And  gecerli bir email adresi "data" girilir
            And yonetim sifre kutucugu bos birakilir
            And yonetim Giris yap butonuna tiklanir
            And Kullanicinin kendi sorumluluk sayfasina gecemedigi dogrulanir

        Scenario: TC_34 "Yonetim" butonu Anasayfada gorulemez  veya tiklanamaz olmalidir. (Negatif Test)

            Then Yonetim butonunun gorunur oldugu dogrulanir
            And Yonetim butonuna tiklanir
            Then Yonetim Sifre ekraninda oldugu dogrulanir
            And  email kutucugu bos birakilir
            And yonetim sifre kutucuguna gecerli bir "data" girilir
            And yonetim Giris yap butonuna tiklanir
            And Kullanicinin kendi sorumluluk sayfasina gecemedigi dogrulanir

        Scenario: TC_35 "Yonetim" butonu Anasayfada gorulemez veya tiklanamaz olmalidir. (Negatif Test)

             Then Yonetim butonunun gorunur oldugu dogrulanir
              And Yonetim butonuna tiklanir
              Then Yonetim Sifre ekraninda oldugu dogrulanir
              And  email kutucugu bos birakilir
              And yonetim sifre kutucugu bos birakilir
              And yonetim Giris yap butonuna tiklanir
              And Kullanicinin kendi sorumluluk sayfasina gecemedigi dogrulanir

        Scenario Outline: TC_36 "Yonetim" butonu Anasayfada gorulemez veya tiklanamaz olmalidir. (Negatif Test)
                Then Yonetim butonunun gorunur olmadigi dogrulanir
                And Yonetim butonunun tiklanir olmadigi dogrulanir
                Then Yonetim Sifre ekraninda oldugu dogrulanir
                And email kutucuguna gecersiz bir <Dataemail> yazilir
                And sifre kutucuguna gecersiz bir <Datasifre> girilir
                And Sifre gizleme butonunun sifreyi gizledigi kontrol edllir
                And Sifre gizleme butonunun sifreyi tekrar gorunur hale getirdigi kontrol edllir
                And yonetim Giris yap butonuna tiklanir
                And Kullanicinin kendi sorumluluk sayfasina gecemedigi dogrulanir
          Examples:
            | Dataemail | Datasifre |


