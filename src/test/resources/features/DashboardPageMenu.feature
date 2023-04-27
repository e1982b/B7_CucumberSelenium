@all
Feature: Dashboard Page Menu

  Scenario: User should be able to see Dashboard Menu after login
    Given The user is on the login page
    When The user logs in using "eurotech@gmail.com" and "Test12345!"
    Then The welcome message contains "Welcome Teacher"
    And The user should be able to see following menu
    |Developers|
    |All Posts|
    |My Account|

  Scenario: Login as a specific user
    Given The user is on the login page
    When The user logs in using following credentials
    |username|eurotech@gmail.com|
    |password|Test12345!|
    |message|Welcome Teacher|
    Then The user should be able to login
    And The user should be able to see following menu
      |Developers|
      |All Posts|
      |My Account|
  @wip
  Scenario: User should be able to see Edit-Add Menu after login
    Given The user is on the login page
    When The user logs in using "eurotech@gmail.com" and "Test12345!"
    Then The welcome message contains "Welcome Teacher"
    And The user should be able to see followings
      |Edit Profile  |
      |Add Experience|
      |Add Education |