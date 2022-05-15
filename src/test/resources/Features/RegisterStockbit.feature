Feature: Test Register Functionally

  Scenario: Check Register Proses
    Given User open Browser
    And User on Register page
    When User enters Name
    And User enters Email
    And User enters username
    And User enters passwordd
    And User enters confrim password
    And User Click Register
    Then User Navigated to Verification message