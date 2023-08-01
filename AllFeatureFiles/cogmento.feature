Feature: Test cogmento application

  @LoginPage
  Scenario: Test login functionality
    Given User on login page
    When User enter valid username and password and click on login button
