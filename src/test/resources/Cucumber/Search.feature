Feature: Search
  User Story :  As the developer…I want find a film in the database by film_id....to see what film corresponds to that id number

  Scenario: pass
    Given film in database
    When i search for film
    Then i should be told "LOTR" in database


