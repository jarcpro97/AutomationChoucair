Feature: Quick edit a post

  Scenario: Edit title and slug from Quick edit of a post
    Given Actor login the system
    When he decides to Quick edit the post
    And update de content in the fields
    Then the post should be Quick edited