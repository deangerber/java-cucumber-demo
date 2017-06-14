Feature: Greeter

  Background:
    Given a greeter

  Scenario: with a name
    When given the name "World"
    Then it returns the greeting "Hello, World!"