Feature: Login feature

  Background:
   #Given user is navigated to HRMS application  these 2 steps are in hooks
    #Then user close the browser
  @smoke1 @regression @sprint1
  Scenario Outline: Valid admin login
    * user enters valid admin "<username>" and "<password>"
    * user clicks on login button
    * "<admin>" user is successfully logged in
  Examples:
  |username|password|admin|
  |Admin   |Hum@nhrm123|Admin|

  @smoke
  Scenario: Valid ess login
    When user enters valid ess username and password
    And user clicks on login button
    Then admin user is successfully logged in

  @login
  Scenario Outline: negative login test
    When user enters different "<username>" and "<password>" and verify the "<error>" for all the combinations
    Examples:
      | username | password | error |
      |Admin     |xyz       | Invalid credentials|
      | hfjasds| Hum@hrm123| Invalid credentials|
      |        | Hum@hrm123 | Username cannot be empty|
      |Admin   |            | Password cannot be empty|









