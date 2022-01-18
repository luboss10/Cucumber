Feature: Add Employees

  Background:
    When user enters valid admin username and password
    And user clicks on login button
    Then admin user is successfully logged in
    When user clicks on PIM option
    And user clicks on Add employee button

@smoke @sprint1
  Scenario Outline: Add employee

    And user enters "<firstName>" and "<lastName>"
    And user clicks on save button
    Then employee added successfully

    Examples:
    |firstName|lastName|
    |Lubo     |Ch      |
    |Hanicka  |Ch      |


  @cucumber
  Scenario: Adding one employee using cucumber feature

    And user enters "Miska" and "Ch"
    And user clicks on save button
    Then employee added successfully

  @dataTable
  Scenario: Add employee
    When user add multiple employees and verify they are added

    |firstName|lastName|
    |test12343|klobasa |
    |test09876|kolobasa2|
    |test57643|klobasa3 |
