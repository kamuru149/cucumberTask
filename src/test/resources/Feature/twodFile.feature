Feature: Using two dimensional list to register
  I want to use two dimensional list to register

  @tag1
  Scenario: Generate a Customer id
    Given User should launch browser and load url.
    When User provides valid details
      | kamur | basha | kamur@gmail.com | chennai | 12345 |
      | john | jo | john@gmail.com | chennai | 12345 |
    Then the Customer id should be displayed.
