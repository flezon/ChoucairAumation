Feature: Recruitment Process

  @hiringProcess
  Scenario: Complete recruitment process for a new candidate
    Given the user is on the login page
    When the user logs in with valid credentials
    And navigates to the Recruitment page
    And adds a new candidate with the following details:
      | Full Name | Middle Name | Last Name | Email                 | Vacancy    |
      | Jaime     | Pardo       | Pardo     | jaimepardo@gmail.com  | Payroll Administrator  |
      | Prueba2   | Pardo       | Pardo     | jaimepardo@gmail.com  | Payroll Administrator  |
    And the user completes the hiring process with the following details:
      | Interview Title | Interviewer | Date       |
      | Prueba          | a           | 2024-04-09 |
      | Prueba2         | a           | 2024-04-09 |
    And the user should see the new employee in the Recruitment page
    Then the user takes a screenshot of the Recruitment page