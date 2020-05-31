@test1
Feature: Test Cucumber

  Scenario: search Apple on google
    When user enters Apple in search goes
    Then reloads google and enters "umsung"

  Scenario: search Motorolla on google
    When user enters motorolla in search goes
    Then reloads google and enters "umsung"


