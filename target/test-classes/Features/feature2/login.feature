

Feature: login

  Scenario: Login as a user
    Given user is on facebook page
    When user Enters username password
    And click on login button
    Then user should land to home page
