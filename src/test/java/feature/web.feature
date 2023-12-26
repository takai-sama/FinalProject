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

  @web
  Scenario: Test Web Login with Invalid Account
    Given user go to demoblaze url
    And user navigate to login page
    And user input username "tes12344" on login form
    And user input password "tes12344" on login form
    When user click button login
    Then alert User does not exist is displayed and click ok

  @web
  Scenario: Test Web Description Product Page
    Given user go to demoblaze url
    When user click product Samsung galaxy s6
    Then user redirect to corresponding product page
    Then Verify that the description of a product is the same on the homepage as on the product page
    Then Verify that the price of a product is the same on the homepage as on the product page

  @web
  Scenario:Test Web Category Product
    Given user go to demoblaze url
    When user click on category
    And click next for the rest result
    Then all product is displayed
    When user click on phones category
    Then only phones product is displayed
    When user click on laptop category
    Then only laptop product is displayed
    When user click on monitor category
    Then only monitor product is displayed

  @web
  Scenario: Test Web Add to Cart and Remove it
    Given user go to demoblaze url
    When user click product Samsung galaxy s6
    Then user redirect to corresponding product page
    When user add selected product to cart
    Then alert of item added is displayed and user accept that
    When user click cart button
    Then user navigate to cart page
    And user delete it from cart

  @web
  Scenario: Test Web Checkout
    Given user go to demoblaze url
    When user click product Samsung galaxy s6
    Then user redirect to corresponding product page
    When user add selected product to cart
    Then alert of item added is displayed and user accept that
    When user click cart button
    Then user navigate to cart page
    When user click on place order button
    And user fill all order information
    And user click on purchase button
    Then order invoice is displayed and user click ok

