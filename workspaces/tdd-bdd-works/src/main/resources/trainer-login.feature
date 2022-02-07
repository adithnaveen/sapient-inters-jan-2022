# the comments are written like this

@sanity @login 
Feature: this is login feature

  Scenario: 
    Given the application is loaded
    When username is "sangita"
    And password is "secret"
    Then validate the user
    And show dashboard

  Scenario: 
    Given the application is loaded
    When username is "manshu"
    And password is "keepguessing"
    Then validate the user
    And show dashboard

	@invalidpwd
  Scenario: 
    Given the application is loaded
    When username is "sumedh"
    And password is "jkl"
    Then validate the user
    And show dashboard
    