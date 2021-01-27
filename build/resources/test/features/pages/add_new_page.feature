Feature: add new page

  Scenario: Create a simple page
    Given Actor login the system
    And add new page
    When he write the content
    And save the page
    Then the page should be created