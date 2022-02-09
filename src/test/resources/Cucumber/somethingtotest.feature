package com

Feature: Is it Spanish?
  People want to know if it's Spanish
  Scenario: Language is not Spanish
    Given The film is available
    When Film is not in "Spanish"
    Then I should be told "No"

    Scenario: Language is Spanish
      Given The film is available
      When Film is in "Spanish"
      Then I should be told "Yes"