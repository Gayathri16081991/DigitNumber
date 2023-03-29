Feature: Count the number of digits in the integer part of a number

    Scenario Outline: 01 - positive case
        Given a java number parameter <number>
        When count digits in the integer
        Then result should be <expectedDigitCount>

    Examples:
      | number | expectedDigitCount |
      | 100    | 3                  |
      | -3214  | 4                  |
      | 0000   | 1                  |

  Scenario Outline: 02 - decimal case
    And a java float number parameter <number> and <expectedDigitCount>

    Examples:
      | number   | expectedDigitCount |
      | 100.546f | 3                  |
      | -3214.12f | 4                  |
      | 0001.35f  | 1                  |