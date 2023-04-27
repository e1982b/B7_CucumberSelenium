Feature: The user should be able to edit profile

  Background:
    Given The user is on the login page


  Scenario: Edit Profile
    When The user logs in using "emre@emre.com" and "9tZ8RYuGn4Tx3uY"
    Then The user should be able to login
    And The welcome message contains "Welcome Emre"
    Then The user navigates to "Edit Profile" menu
    And The user select "Manager" as a career
    And The user choose 7 years of work experience
    And The user add "company" "Amazon"
    And The user add "website" "Amazon.de"
    And The user add "location" "Germany"
    And The user add "skills" "Java, Selenium, Cucumber, Jira"
    And The user add "githubusername" "e1982b"
    And The user add "bio" "Engineer, QA Test Engineer, SDET, SDLC"
    Then The users profile should be saved
  @ep
  Scenario Outline: Edit Profile with SO
    When The user logs in using "<username>" and "<password>"
    Then The user should be able to login
    And The welcome message contains "<welcomeMessage>"
    Then The user navigates to "<menu>" menu
    And The user select "<status>" as a career
    And The user choose 7 years of work experience
    And The user add "company" "<company>"
    And The user add "website" "<website>"
    And The user add "location" "<location>"
    And The user add "skills" "<skills>"
    And The user add "githubusername" "<githubusername>"
    And The user add "bio" "<bio>"
    Then The users profile should be saved
    Examples:
      | username      | password        | welcomeMessage | menu         | status  | company | website   | location | skills                         | githubusername | bio                                    |
      | emre@emre.com | 9tZ8RYuGn4Tx3uY | Welcome Emre   | Edit Profile | Manager | Amazon  | Amazon.de | Germany  | Java, Selenium, Cucumber, Jira | e1982b         | Engineer, QA Test Engineer, SDET, SDLC |
