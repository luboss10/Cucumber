Feature: US-12345 Employee search

  Background:
    When user enters valid admin username and password
    And user clicks on login button
    Then admin user is successfully logged in
    When user navigates to employee list page

@smoke
  Scenario: Search employee by id
    * user enters valid employee id
    * user clicks on search button
    * user see employee information is displayed

 @regression
 Scenario: Search employee by name
    When user enters valid employee name
    And user clicks on search button
    Then user see employee information is displayed
