# new feature
# Tags: optional

Feature: Login Vytruck

  Scenario: Login test for VyTruck
    Given User is on login page
    Then user Enters "storemanager85" and "UserUser123"
    And click on login button
    Then user on homepage
