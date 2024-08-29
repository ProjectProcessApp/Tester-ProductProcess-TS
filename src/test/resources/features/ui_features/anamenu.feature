@US01
Feature: US1

  Background:  Anasayfa ve dogrulama
    When Anasayfaya gidilir
    Then Anasayfada oldugu dogrulanir

  Scenario:TC_01 "Anasayfa" ya girilebilir olmalidir (Negativ Test)
    When Ana giris ekraninda hicbir kullanici unvanina tiklamadan sifre giris ekranina erisememelidir

  Scenario:TC_02 "TALASLI IMALAT AMIRI" butonu Anasayfada gorunur ve tiklanir olmalidir. (Positif Test)
    Then Talasli Imalat Amiri Butonu gorunur oldugu dogrulanir
    And Talasli Imalat Amiri Butonuna tiklanir
    Then Talasli Imalat Amiri Sifre ekraninda oldugu dogrulanir
    And Talasli imalat amiri sifre kutucuguna gecerli bir "data" girilir
    And Sifre gizleme butonunun sifreyi gizledigi kontrol edllir
    And Sifre gizleme butonunun sifreyi tekrar gorunur hale getirdigi kontrol edllir
    And Giris yap butonuna tiklanir
    Then Talasli Imalat Amirinin kendi sorumluluk sayfasina gectigi dogrulanir
    And Kullanici logout yapar


  Scenario Outline: TC_04 "TALASLI IMALAT AMIRI"  gecersiz sifre denemesi. (Negatif Test)

    Then Talasli Imalat Amiri Butonu gorunur oldugu dogrulanir
    And Talasli Imalat Amiri Butonuna tiklanir
    Then Talasli Imalat Amiri Sifre ekraninda oldugu dogrulanir
    And sifre kutucuguna gecersiz bir "<data>" girilir
    And Sifre gizleme butonunun sifreyi gizledigi kontrol edllir
    And Sifre gizleme butonunun sifreyi tekrar gorunur hale getirdigi kontrol edllir
    And Giris yap butonuna tiklanir
    Then uygun hata mesajinin goruntulendigi dogrulanir "<error_message>"

    Examples:
      | data    | error_message                      |
      |         | Şifre alanı boş bırakılamaz        |
      | Techpro | Girdiğiniz şifre eksik veya hatalı |
      | 123456  | Girdiğiniz şifre eksik veya hatalı |
      | ?.¿0p9  | Girdiğiniz şifre eksik veya hatalı |


  Scenario: TC_05 "Polisaj amiri"  butonu Anasayfada gorunur ve tiklanir olmalidir. (Positif Test)
    Then Polisaj amiri butonunun gorunur oldugu dogrulanir
    And Polisaj amiri butonuna tiklanir
    Then Polisaj amiri ekraninda oldugu dogrulanir
    And Polisaj amiri sifre kutucuguna gecerli bir "data" girilir
    And Sifre gizleme butonunun sifreyi gizledigi kontrol edllir
    And Sifre gizleme butonunun sifreyi tekrar gorunur hale getirdigi kontrol edllir
    And Giris yap butonuna tiklanir
    Then Polisaj amirinin kendi sorumluluk sayfasina gectigi dogrulanir
    And Kullanici logout yapar

  Scenario: TC_06 Manuel test

  Scenario Outline: TC_7 "Polisaj Amiri"  butonu Anasayfada gorulemez veya tiklanamaz olmalidir. (Negatif Test)
    Then Polisaj amiri butonunun gorunur oldugu dogrulanir
    And Polisaj amiri butonuna tiklanir
    Then Polisaj amiri ekraninda oldugu dogrulanir
    And sifre kutucuguna gecersiz bir "<data>" girilir
    And Sifre gizleme butonunun sifreyi gizledigi kontrol edllir
    And Sifre gizleme butonunun sifreyi tekrar gorunur hale getirdigi kontrol edllir
    And Giris yap butonuna tiklanir
    Then uygun hata mesajinin goruntulendigi dogrulanir "<error_message>"

    Examples:
      | data    | error_message                      |
      |         | Şifre alanı boş bırakılamaz        |
      | Techpro | Girdiğiniz şifre eksik veya hatalı |
      | 123456  | Girdiğiniz şifre eksik veya hatalı |
      | ?.¿0p9  | Girdiğiniz şifre eksik veya hatalı |

  Scenario: TC_8 "Lift montaj amiri"  butonu Anasayfada gorunur ve tiklanir olmalidir. (Positif Test)
    Then Lift montaj amiri butonunun gorunur oldugu dogrulanir
    And Lift montaj amiri butonuna tiklanir
    Then Lift montaj amiri ekraninda oldugu dogrulanir
    And Lift montaj amiri sifre kutucuguna gecerli bir "data" girilir
    And Sifre gizleme butonunun sifreyi gizledigi kontrol edllir
    And Sifre gizleme butonunun sifreyi tekrar gorunur hale getirdigi kontrol edllir
    And Giris yap butonuna tiklanir
    Then Lift montaj amirinin kendi sorumluluk sayfasina gectigi dogrulanir
    And Kullanici logout yapar

  Scenario: TC_9 Manuel Test

  Scenario Outline: TC_10" LIFT MONTAJ  AMIRI"  butonu Anasayfada gorulemezr veya tiklanamaz olmalidir. (Negatif Test)

    Then Lift montaj amiri butonunun gorunur oldugu dogrulanir
    And Lift montaj amiri butonuna tiklanir
    Then Lift montaj amiri ekraninda oldugu dogrulanir
    And sifre kutucuguna gecersiz bir "<data>" girilir
    And  Sifre gizleme butonunun sifreyi gizledigi kontrol edllir
    And Sifre gizleme butonunun sifreyi tekrar gorunur hale getirdigi kontrol edllir
    And Giris yap butonuna tiklanir
    Then uygun hata mesajinin goruntulendigi dogrulanir "<error_message>"

    Examples:
      | data    | error_message                      |
      |         | Şifre alanı boş bırakılamaz        |
      | Techpro | Girdiğiniz şifre eksik veya hatalı |
      | 123456  | Girdiğiniz şifre eksik veya hatalı |
      | ?.¿0p9  | Girdiğiniz şifre eksik veya hatalı |

  Scenario: TC_11 "Bloklift Montaj Amiri"  butonu Anasayfada gorunur ve tiklanir olmalidir. (Positif Test)

    Then Bloklift Montaj Amiri butonunun gorunur oldugu dogrulanir
    And Bloklift Montaj Amiri butonuna tiklanir
    Then Bloklift Montaj Amiri ekraninda oldugu dogrulanir
    And Bloklift Montaj Amiri sifre kutucuguna gecerli bir "data" girilir
    And  Sifre gizleme butonunun sifreyi gizledigi kontrol edllir
    And Sifre gizleme butonunun sifreyi tekrar gorunur hale getirdigi kontrol edllir
    And Giris yap butonuna tiklanir
    Then Bloklift Montaj Amirinin kendi sorumluluk sayfasina gectigi dogrulanir
    And Kullanici logout yapar

  Scenario:TC_12 "Bloklift Montaj Amiri"butonu Anasayfada gorulemez veya tiklanamaz olmalidir. (Negatif Test)
  //Manuel Test

  Scenario Outline:TC_13 "Bloklift Montaj Amiri" butonu Anasayfada gorulemez veya tiklanamaz olmalidir.(Negatif Test)

    Then Bloklift Montaj Amiri butonunun gorunur oldugu dogrulanir
    And Bloklift Montaj Amiri butonuna tiklanir
    Then Bloklift Montaj Amiri ekraninda oldugu dogrulanir
    And sifre kutucuguna gecersiz bir "<data>" girilir
    And  Sifre gizleme butonunun sifreyi gizledigi kontrol edllir
    And Sifre gizleme butonunun sifreyi tekrar gorunur hale getirdigi kontrol edllir
    And Giris yap butonuna tiklanir
    Then uygun hata mesajinin goruntulendigi dogrulanir "<error_message>"

    Examples:
      | data    | error_message                      |
      |         | Şifre alanı boş bırakılamaz        |
      | Techpro | Girdiğiniz şifre eksik veya hatalı |
      | 123456  | Girdiğiniz şifre eksik veya hatalı |
      | ?.¿0p9  | Girdiğiniz şifre eksik veya hatalı |

  Scenario: TC_14 "Boyama ve Paketleme Amiri"  butonu Anasayfada gorunur ve tiklanir olmalidir. (Positif Test)

    Then Boyama ve Paketleme Amiri butonunun gorunur oldugu dogrulanir
    And Boyama ve Paketleme Amiri butonuna tiklanir
    Then Boyama ve Paketleme Amiri ekraninda oldugu dogrulanir
    And Boyama ve Paketleme Amiri sifre kutucuguna gecerli bir "data" girilir
    And  Sifre gizleme butonunun sifreyi gizledigi kontrol edllir
    And Sifre gizleme butonunun sifreyi tekrar gorunur hale getirdigi kontrol edllir
    And Giris yap butonuna tiklanir
    Then Boyama ve Paketleme Amirinin kendi sorumluluk sayfasina gectigi dogrulanir
    And Kullanici logout yapar


  Scenario: TC_15 Manuel Test

  Scenario Outline: TC_16 "Boyama ve Paketleme Amiri"  butonu Anasayfada gorulemez veya tiklanamaz olmalidir. (Negatif Test)

    Then Boyama ve Paketleme Amiri butonunun gorunur oldugu dogrulanir
    And Boyama ve Paketleme Amiri butonuna tiklanir
    Then Boyama ve Paketleme Amiri ekraninda oldugu dogrulanir
    And sifre kutucuguna gecersiz bir "<data>" girilir
    And Sifre gizleme butonunun sifreyi gizledigi kontrol edllir
    And Sifre gizleme butonunun sifreyi tekrar gorunur hale getirdigi kontrol edllir
    And Giris yap butonuna tiklanir
    Then uygun hata mesajinin goruntulendigi dogrulanir "<error_message>"
    Examples:
      | data    | error_message                      |
      |         | Şifre alanı boş bırakılamaz        |
      | Techpro | Girdiğiniz şifre eksik veya hatalı |
      | 123456  | Girdiğiniz şifre eksik veya hatalı |
      | ?.¿0p9  | Girdiğiniz şifre eksik veya hatalı |

  Scenario: TC_17 "Kalite Kontrol" butonu Anasayfada gorunur ve tiklanir olmalidir. (Positif Test)

    Then Kalite Kontrol butonunun gorunur oldugu dogrulanir
    And Kalite Kontrol butonuna tiklanir
    Then Kalite Kontrol ekraninda oldugu dogrulanir
    And Kalite Kontrol sifre kutucuguna gecerli bir "data" girilir
    And Sifre gizleme butonunun sifreyi gizledigi kontrol edllir
    And Sifre gizleme butonunun sifreyi tekrar gorunur hale getirdigi kontrol edllir
    And Giris yap butonuna tiklanir
    Then Kalite Kontrol sayfasina gectigi dogrulanir
    And Kullanici logout yapar

  Scenario: TC_18 "Kalite Kontrol"  butonu Anasayfada gorulemez veya tiklanamaz olmalidir. (Negatif Test)
  //Manuel Test

  Scenario Outline: TC_19 "Kalite Kontrol"  butonu Anasayfada gorulemez veya tiklanamaz olmalidir. (Negatif Test)

    Then Kalite Kontrol butonunun gorunur oldugu dogrulanir
    And Kalite Kontrol butonuna tiklanir
    Then Kalite Kontrol ekraninda oldugu dogrulanir
    And sifre kutucuguna gecersiz bir "<data>" girilir
    And Sifre gizleme butonunun sifreyi gizledigi kontrol edllir
    And Sifre gizleme butonunun sifreyi tekrar gorunur hale getirdigi kontrol edllir
    And Giris yap butonuna tiklanir
    Then uygun hata mesajinin goruntulendigi dogrulanir "<error_message>"
    Examples:
      | data    | error_message                      |
      |         | Şifre alanı boş bırakılamaz        |
      | Techpro | Girdiğiniz şifre eksik veya hatalı |
      | 123456  | Girdiğiniz şifre eksik veya hatalı |
      | ?.¿0p9  | Girdiğiniz şifre eksik veya hatalı |

  Scenario: TC_20  "Uretim Planlama " butonu Anasayfada gorunur ve tiklanir olmalidir. (Positif Test)

    Then Uretim Planlama butonunun gorunur oldugu dogrulanir
    And Uretim Planlama butonuna tiklanir
    Then Uretim Planlama ekraninda oldugu dogrulanir
    And Uretim Planlama sifre kutucuguna gecerli bir "data" girilir
    And Sifre gizleme butonunun sifreyi gizledigi kontrol edllir
    And Sifre gizleme butonunun sifreyi tekrar gorunur hale getirdigi kontrol edllir
    And Giris yap butonuna tiklanir
    Then Uretim Planlama sayfasina gectigi dogrulanir
    And Kullanici logout yapar


  Scenario: TC_21 "Uretim Planlama"  butonu Anasayfada gorulemezr veya tiklanamaz olmalidir. (Negatif Test)
  //Manuel Test

  Scenario Outline: TC_22 "Uretim Planlama"  butonu Anasayfada gorulemez veya tiklanamaz olmalidir. (Negatif Test)

    Then Uretim Planlama butonunun gorunur oldugu dogrulanir
    And Uretim Planlama butonuna tiklanir
    Then Uretim Planlama ekraninda oldugu dogrulanir
    And sifre kutucuguna gecersiz bir "<data>" girilir
    And Sifre gizleme butonunun sifreyi gizledigi kontrol edllir
    And Sifre gizleme butonunun sifreyi tekrar gorunur hale getirdigi kontrol edllir
    And Giris yap butonuna tiklanir
    Then uygun hata mesajinin goruntulendigi dogrulanir "<error_message>"
    Examples:
      | data    | error_message                      |
      |         | Şifre alanı boş bırakılamaz        |
      | Techpro | Girdiğiniz şifre eksik veya hatalı |
      | 123456  | Girdiğiniz şifre eksik veya hatalı |
      | ?.¿0p9  | Girdiğiniz şifre eksik veya hatalı |

  Scenario: TC_23 "Yonetim"  sayfasina gecer. (Positif Test)

    Then Yonetim butonunun gorunur oldugu dogrulanir
    And Yonetim butonuna tiklanir
    Then Yonetim Sifre ekraninda oldugu dogrulanir
    And yonetici sifre kutucuguna gecerli bir "data" girilir
    And Yonetici Sifre gizleme butonunun sifreyi gizledigi kontrol edllir
    And Yonetici Sifre gizleme butonunun sifreyi tekrar gorunur hale getirdigi kontrol edllir
    And yonetim Giris yap butonuna tiklanir
    Then yonetim sayfasina gectigi dogrulanir
    And Kullanici logout yapar

  Scenario: TC_24 "YONETIM" sayfasina gecer ve kullanicilara sifre atar. (Pozitif Test)
    Then Yonetim butonunun gorunur oldugu dogrulanir
    And Yonetim butonuna tiklanir
    Then Yonetim Sifre ekraninda oldugu dogrulanir
    And yonetici sifre kutucuguna gecerli bir "data" girilir
    And Yonetici Sifre gizleme butonunun sifreyi gizledigi kontrol edllir
    And Yonetici Sifre gizleme butonunun sifreyi tekrar gorunur hale getirdigi kontrol edllir
    And yonetim Giris yap butonuna tiklanir
    Then yonetim sayfasina gectigi dogrulanir
    And yonetici kullaniciya sifre atama butonuna tiklar
    And yonetici return back butonuna tiklar
    And yonetici kullaniciya sifre atama ekranina gectigini dogrular
    And yonetici kullanici secer, yeni sifre atar, guncelle butonunu tiklar ve guncellendigini kontrol eder
    And Kullanici logout yapar

  Scenario Outline: TC_25 "Yonetim" sayfasina gecemez. (Negatif Test)
    Then Yonetim butonunun gorunur oldugu dogrulanir
    And Yonetim butonuna tiklanir
    Then Yonetim Sifre ekraninda oldugu dogrulanir
    And yonetici sifre kutucuguna gecersiz bir "<data>" girilir
    And Yonetici Sifre gizleme butonunun sifreyi gizledigi kontrol edllir
    And Yonetici Sifre gizleme butonunun sifreyi tekrar gorunur hale getirdigi kontrol edllir
    And yonetim Giris yap butonuna tiklanir
    Then uygun hata mesajinin goruntulendigi dogrulanir "<error_message>"

    Examples:
      | data    | error_message                      |
      |         | Şifre alanı boş bırakılamaz        |
      | Techpro | Girdiğiniz şifre eksik veya hatalı |
      | 123456  | Girdiğiniz şifre eksik veya hatalı |
      | ?.¿0p9  | Girdiğiniz şifre eksik veya hatalı |









