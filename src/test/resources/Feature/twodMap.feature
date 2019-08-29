Feature: Using two dimensional Map to register
  I want to use two dimensional Map to register

  @tag1
  Scenario: Generate a Customer id
    Given User should launch browser and load url.
    When User provides valid detail
      | fname | lname | email           | addr    | telephoneno |
      | kamur | basha | kamur@gmail.com | chennai |      111111 |
      | john  | jo    | john@gmail.com  | chennai |      222222 |
    Then the Customer id should be displayed.
