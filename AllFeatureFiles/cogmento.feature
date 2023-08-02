Feature: Test cogmento application

  @LoginPage
  Scenario: Test login functionality
    Given User on login page
    When User enter valid username and password and click on login button

  #Code Write by Kreeti
  @HomePage
  Scenario: Test functionality of home Page
    When User is on home page validate home page logo
    And Validate home page Title
    And Validate home page Url
