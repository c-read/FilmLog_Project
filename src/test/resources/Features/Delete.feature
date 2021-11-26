Feature: Delete
  User Story :  As the developer...I want to delete a film from the database...to keep the database current

  Scenario: pass
    Given new film added
    When i delete a film
    Then i should be told film deleted