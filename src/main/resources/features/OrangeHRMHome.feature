Feature: Validation of OrangeHRM home page

  @SmokeTest
  Scenario: Validation of OrangeHRM logo
    Given launch chrome browser
    When user navigates to OrangeHRM home page
    Then verify OrangeHRM logo
    And close the browser

  @RegressionTest
  Scenario: Validation email address field
    Given launch chrome browser
    When user navigates to OrangeHRM home page
    Then enter valid email address
    And close the browser