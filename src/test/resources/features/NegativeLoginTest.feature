@negative @all
Feature: Negative Login Test

  Background:
    Given The user is on the login page

  Scenario Outline: Negative Login Test
    Given The user is on the login page
    When The user logs in using "<userType>" and "<password>"
    Then The warning message contains '<message>'
    Examples:
      | userType          | password   | message                                                                             |
      | eurotech          | Test12345! | Lütfen e-posta adresine bir "@" işareti ekleyin. "eurotech" adresinde "@" eksik.    |
      | eurotech@         | Test12345! | Lütfen "@" işaretinden sonra gelen kısmı ekleyin. "eurotech@", tam bir adres değil. |
      | eurotech@gmail    | Test12345! | Please include a valid email!                                                       |
      | eurotec@gmail.com | Test12345! | Invalid Credentials!                                                                |