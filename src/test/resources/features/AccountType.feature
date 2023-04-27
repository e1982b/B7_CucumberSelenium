@at @all
Feature: Account Type

  Background:
    Given The user is on the login page

  #Scenario: Teacher User
   # Given The user is on the login page
   # When The user logs in using "eurotech@gmail.com" and "Test12345!"
   # Then The welcome message contains "Welcome Teacher"


  #Scenario: Student User
   # Given The user is on the login page
   # When The user logs in using "emre@emre.com" and "9tZ8RYuGn4Tx3uY"
   # Then The welcome message contains "Welcome Emre"


  #Scenario: Developer User
   # Given The user is on the login page
   # When The user logs in using "jackbauer@gmail.com" and "Admin123"
   # Then The welcome message contains "Welcome Jack Bauer"

  Scenario Outline: Different user type
    When The user logs in using "<userType>" and "<password>"
    Then The welcome message contains "<welcomeMessage>"
    Examples:
      | userType            | password        | welcomeMessage     |
      | eurotech@gmail.com  | Test12345!      | Welcome Teacher    |
      | emre@emre.com       | 9tZ8RYuGn4Tx3uY | Welcome Emre       |
      | jackbauer@gmail.com | Admin123        | Welcome Jack Bauer |
