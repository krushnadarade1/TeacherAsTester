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
    
  #Code wrie By Kiran
  @ContactPage
  Scenario: Test Functionality of Contact Page
  	When user click on contact page link
  	Then  user is on Home Page validate Contact page Title
  	And validate Contact page Url
  	And click on add button
  	And enter firstname lastname middlename and select catogory and select status
  	And click on save button
