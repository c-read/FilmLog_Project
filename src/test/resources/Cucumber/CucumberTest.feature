Feature: CucumberTest
  User Story : As the developer….I want create a new entry for a young actor....so the database stays current

  Scenario: create new entry
    GIVEN there is no current entry for this actor
    WHEN i enter the details of the actor into the create actor method
    THEN a message is displayed indicating the entry has been successful
