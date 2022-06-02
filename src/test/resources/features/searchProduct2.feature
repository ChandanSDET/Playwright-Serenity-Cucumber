Feature: Demo feature2

  Scenario: Verify search functionality2
    Given User open amazon landing page
    When user search for books
    Then validate title of the page contains book