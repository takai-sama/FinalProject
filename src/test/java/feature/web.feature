Feature: Test Automation Web UI

  @web
  Scenario: Test Web Login
    Given user go to demoblaze url
    And user navigate to login page
    And user input username "tes"
    And user input password "tes"
    When user click button login
    Then home page is opened and welcome text is displayed