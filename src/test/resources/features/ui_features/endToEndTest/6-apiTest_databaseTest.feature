@endtoend
Feature: Api Test ve Database Test

  Scenario:Api Test

    And bir siparis POST edilir ve Apiden test edilir
    And 1 id numarali siparis Api ile GET edilir
    And 3000000003 order numarali siparis API ile GET edilir
    And 933352 order numarali siparis DELETE edilir ve apiden test edilir

  Scenario:Databased Test

    #And yeni siparis kaydi eklenir
    #And siparis guncellenir
    #And siparis silinebilir
    And butun kayitlar getirilir