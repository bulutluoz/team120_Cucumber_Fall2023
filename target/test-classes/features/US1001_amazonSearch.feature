
  Feature: US1001 Kullanici amazon anasayfada arama yapar

    Scenario: TC01 Kullanici amazonda Nutella aratir

      Given kullanici amazonUrl anasayfaya gider
      And arama kutusuna Nutella yazip aratir
      Then arama sonuclarinin Nutella icerdigini test eder
      And sayfayi kapatir

