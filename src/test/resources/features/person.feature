Feature: Test getPerson method
  As a client,
  I want to test the getPerson method
  So that I can ensure it is working correctly

  Scenario: Test getPerson method returns correct object
    Given the getPerson method has been called
    When the response is received
    Then the response should contain a person object with name "Freja" and address "Spaden"