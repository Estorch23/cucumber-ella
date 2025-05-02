Feature: Adding employees

  @add
  Scenario: Adding one employee
     #Given user is able to access HRMS application
    When user enters valid username and password
    And user clicks on login button
    Then user is successfully logged in
    When user clicks on PIM option
    And user clicks on Add Employee option
    When user enters firstname and middlename and lastname
    And user clicks on save button
    Then user is added successfully
