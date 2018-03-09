Feature:
  As a user
  I want to be able to register account
  So that i can see my account page

  Scenario: Register a new user
    Given I am on main page
    When I open Registration form
    And I fill my Name "Mark Cook" into Name field
    And I fill my email address "markCook34@gmail.com" into Email field
    And I fill my desired password "Mark2000" into Password field
    And I click on Register button
    Then I should see page with "Личные данные" title