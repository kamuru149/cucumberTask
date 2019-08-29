Feature: Using one dimensional list to register
 I want to use one dimensional list to register
  @tag1
  Scenario: Generate a Customer id
    Given User should launch browser and load url.
    When User provides valid detail
      | kamur | basha | kamur@gmail.com | chennai   |       12345 |
 
    Then the Customer id should be displayed.
