
Feature: Amazon test

  Scenario: urun arama ve karsilastirma

  When amazon.com sitesine git -search box'a thermos gir
  And search box'un sol tarafindaki kategoriden Sports & Outdoor sec
  And karsina cikan urunlerden soldan itibaren sayarak 12. urune tikla -urunun fiyatini  al
  And bir onceki sayfaya geri don 13. urune tikla  urun fiyatini al
  And 12. ve 13. urunlerin fiyatlarini karsilastir. ucuz olan urunu sepete at
  And sepeti yeni sekmede ac
  Then proceed to check out tikla ve sign in sayfasina yonlendirildigini dogrula