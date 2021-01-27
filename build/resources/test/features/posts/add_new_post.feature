Feature: add new post

  Scenario: Create a simple post
    Given Actor login the system
    And add new post
    When he write the content
    And save the page
    Then the post should be created