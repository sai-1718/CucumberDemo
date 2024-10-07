Feature: Login
  user trying to login to the application

  Scenario: User trying to login to the application with valid credentials
    Given User should navigated to the login page
    When User is entered the valid email
    And User entered valid password
    And User clicked on submit button
    Then user should successfully login and see account