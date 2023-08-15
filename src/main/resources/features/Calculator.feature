Feature: Calculator

  Scenario: Addition
    Given I have first number 3
    Given I have second number 5
    When I add the numbers
    Then I get 8 as result