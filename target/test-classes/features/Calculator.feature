Feature: Penjumlahan pada Kalkulator DDT

  Scenario Outline: Menjumlahkan dua angka dengan data driven test
    Given saya menekan tombol clear
    And saya menekan tombol nilai "<angka1>"
    And saya menekan tombol plus
    And saya menekan tombol nilai "<angka2>"
    When saya menekan tombol sama dengan
    Then saya mendapatkan hasil "<hasil>"

    Examples:
      | angka1 | angka2 | hasil |
      | 10     | 20     | 30    |
      | 200    | 30     | 230   |