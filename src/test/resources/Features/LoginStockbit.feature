Feature: Test Login functionally

  Scenario: Check login is successful with valid credentials
    Given Browser is open
    And User is on login page
    When User enters username and password
    And user Click on button login
    Then User Navigated  to the home page