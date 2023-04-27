@all
Feature: Login with different user
  #Agile= As a user I should be able to login with different user
  @www
  Scenario: Login as a teacher with parameters
    Given The user is on the login page
    When The user logs in using "eurotech@gmail.com" and "Test12345!"
    Then The user should be able to login
    And The welcome message contains "Welcome Teacher"

  @www
  Scenario: Login as a student with parameters
    Given The user is on the login page
    When The user logs in using "emre@emre.com" and "9tZ8RYuGn4Tx3uY"
    Then The user should be able to login
    And The welcome message contains "Welcome Emre"

  @www
  Scenario: Login as a developer with parameters
    Given The user is on the login page
    When The user logs in using "jackbauer@gmail.com" and "Admin123"
    Then The user should be able to login
    And The welcome message contains "Welcome Jack Bauer"
