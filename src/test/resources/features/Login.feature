@login @smoke @regression @all
Feature: DevEx Login Test
  //work in progress. Belirli testleri calistirmak icin ikinci bir assertion eklenip onunla cagrilir
  @teacher
  Scenario: Login as a teacher
    Given The user is on the login page
    When The user enters with teacher credentials
    Then The user should be able to login

  @student
  Scenario: Login as a student
    Given The user is on the login page
    When The user enters with student credentials
    Then The user should be able to login

  @d
  Scenario: Login as a developer
    Given The user is on the login page
    When The user enters with developer credentials
    Then The user should be able to login

   # @sdet @wip
   # Scenario: Login as a SDET
   #  Given The user is on the login page
   # When The user enters with SDET credentials
   # Then The user should be able to login

    # to format the page structure ctrl + alt + L
    # @wip = work in progress