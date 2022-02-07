@sanity @register
Feature: to register the trainer

  Scenario: register valid trainer
    Given the application is working
    When trainer details are valid
    Then register the trainer
