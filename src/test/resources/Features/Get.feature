Feature: Get
  User Story :  As the developer…I want find a films in the database....to search

  Scenario: pass
    Given films in database
    When i search for films
    Then i should be told films in database


