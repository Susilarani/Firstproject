Feature: Logging into Orangehrm website


  @login
  Scenario: Valid credentials
    Given I am on the Orangehrm login page
    When I sign in with Username and Password
    Then I should be logged in