@endtoend
Feature: Api Test
  Scenario:

    And bir siparis POST edilir ve Apiden test edilir
    And 1 id numarali siparis Api ile GET edilir
    And 3000000003 order numarali siparis API ile GET edilir
    And 933352 order numarali siparis DELETE edilir ve apiden test edilir

  Scenario:Databaseden veri alma

    #And yeni siparis kaydi eklenir
    #And siparis guncellenir
    #And siparis silinebilir
    And butun kayitlar getirilir