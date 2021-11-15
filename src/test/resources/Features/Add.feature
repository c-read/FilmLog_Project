Feature: Add
  User Story :  As the developer...I want to add a film to the database...to keep the database current

  Scenario: pass
    Given string title provided
    When i add a film
    Then i should be told film added