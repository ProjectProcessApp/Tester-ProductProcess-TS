@US01
Feature: Database testing
  Scenario:Databaseden veri alma

    Then Database baglanilir
    And "query" siparis sorgusu yapilir
    And "query" siparis guncellenir
    And "query" siparis silinebilir