Feature: edit a post

  Scenario: Edit post from the edit option of the table
    Given Actor login the system
    When he decides to edit the post
    And update the content
    Then the post should be edited