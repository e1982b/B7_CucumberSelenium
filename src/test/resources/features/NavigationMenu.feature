@NavigationMenu @all
Feature: Navigation Menu

  Background: # precondition seklinde calisir. Tüm scenariolarda ortak varsa yazilir
    Given The user is on the login page

  @developer
  Scenario: Navigation to Developers menu
    #Given The user is on the login page
    When The user enters with developer credentials
    Then The user should be able to see welcome message
    When The user navigates to Developers menu
    Then The user should be able to see Developer text

  @smoke
  Scenario: Navigation to All Posts menu
    #Given The user is on the login page
    When The user enters with student credentials
    Then The user should be able to see welcome message
    When The user navigates to All Posts menu
    Then The user should be able to see Posts text

  Scenario: Navigation to My Account menu
    #Given The user is on the login page
    When The user enters with developer credentials
    Then The user should be able to see welcome message
    When The user navigates to My Account menu
    Then The user should be able to see Dashboard text