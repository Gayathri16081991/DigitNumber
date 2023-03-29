Feature: Count the number of digits in the integer part of a number

    Scenario Outline: 01 - positive case
        Given a java number parameter <number>
        When count digits in the integer
        Then result should be <expectedDigitCount>

    Examples:
     | number | expectedDigitCount |
     | 100    | 3 |

