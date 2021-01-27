Feature: Quick edit a page

  Scenario: Edit title and slug from Quick edit of a page
    Given Actor login the system
    When he decides to Quick edit the page
    And update de content in the fields
    Then the page should be Quick edited