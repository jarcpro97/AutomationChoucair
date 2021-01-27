Feature: edit a page

  Scenario: Edit page from the edit option of the table
    Given Actor login the system
    When he decides to edit the page
    And update the content
    Then the page should be edited