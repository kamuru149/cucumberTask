Feature: I want to give multi input to register
  I want to give multi input to register

  @tag1
  Scenario Outline: Generate a Customer id
    Given User should launch browser and load url.
    When User provides valid detail "<fname>","<lname>","<email>","<addr>","<telephoneno>"
    Then the Customer id should be displayed.

    Examples: 
      | fname | lname | email           | addr      | telephoneno |
      | kamur | basha | kamur@gmail.com | chennai   |       12345 |
      | john  | jo    | john@gmail.com  | bangalore |       56789 |
