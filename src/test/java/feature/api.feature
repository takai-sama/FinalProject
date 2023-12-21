Feature: Test Automation Rest API

  @api
  Scenario: Test Get List Data
    Given prepare url for "HOST_DUMMYAPI_USER"
    And hit api get list users
    Then validation status code is equals 200
    Then validation response body get list users
    Then validation response json with JSONSchema "get_list_user_dummyapi.json"

  @api
  Scenario: Test Create New User
    Given prepare url for "CREATE_NEW_USERS"
    And hit api post create new user
    Then validation status code is equals 200
    Then validation response body post create new user
    Then validation response json with JSONSchema "post_create_newuser_dummyapi.json"

  @api
  Scenario: Test Delete User
    Given prepare url for "CREATE_NEW_USERS"
    And hit api post create new user
    Then validation status code is equals 200
    Then validation response body post create new user
    And prepare url for "HOST_DUMMYAPI_USER"
    And hit api delete new
    Then validation status code is equals 200

  @api
  Scenario: Test Update User
    Given prepare url for "CREATE_NEW_USERS"
    And hit api post create new user
    Then validation status code is equals 200
    Then validation response body post create new user
    And prepare url for "HOST_DUMMYAPI_USER"
    And hit api update data
    Then validation status code is equals 200
    Then validation response body post update data