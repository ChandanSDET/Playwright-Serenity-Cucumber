Feature: Demo feature

  Scenario: Verify search functionality
    Given User open amazon landing page
    When user search for books
    Then validate title of the page contains book