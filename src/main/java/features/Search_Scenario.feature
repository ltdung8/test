Feature: User do search function to search into the system
  Scenario Outline: User clicks on the "Create account" button without entering the required fields
    Given User opens 'Dịch vụ công' screen on the PC browser
    When User enter data at input search as "<text_search>"
    And User press enter from keyboard
    And User press and hold ctrl after click
    Then Check sum of record result and preview at console of terminal
  Examples:
  |text_search|
  |công dân|


  Scenario: User clicks on the "Create account" button without entering the required fields
    Given User opens 'Dịch vụ công' screen on the PC browser
    When User enter data at input search "công dân"
    And User press enter from keyboard
    Then Check sum of record result and preview at console of terminal.

