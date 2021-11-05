Feature: Add
  User Story :  As the developer...I want to add a film to the database...to keep the database current

  Scenario: pass
  GIVEN all inputs are provided
  WHEN i try to add a film
  THEN a string is returned 'saved'

  Scenario: fail
  GIVEN all inputs are not provided
  WHEN i try to add a film
  THEN a string is returned 'error'

