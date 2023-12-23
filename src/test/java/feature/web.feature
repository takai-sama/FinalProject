Feature: Test Automation Web UI

  @web
  Scenario: Test Web Signup With New Account
    Given user go to demoblaze url
    And user navigate to signup page
    And user input username on register form
    And user input password on register form
    When user click button signup
    Then alert signup successful is displayed and click ok

  @web
  Scenario: Test Web Signup With Account Already Exist
    Given user go to demoblaze url
    And user navigate to signup page
    And user input username "tes" on register form
    And user input password "tes" on register form
    When user click button signup
    Then alert this user already exist is displayed and click ok

  @web
  Scenario: Test Web Login with Valid Account
    Given user go to demoblaze url
    And user navigate to login page
    And user input username on login form
    And user input password on login form
    When user click button login
    Then home page is opened and welcome text is displayed

  Scenario: Test Web Login with Invalid Account
    Given user go to demoblaze url
    And user navigate to login page
    And user input username "tes12344" on login form
    And user input password "tes12344" on login form
    When user click button login
    Then alert User does not exist is displayed and click ok