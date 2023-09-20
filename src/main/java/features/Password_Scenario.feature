Feature: User do password function to login into the system
  Scenario: User clicks Send button at page forgot password after after entered nothing
    Given Go to the Password screen
    When Does not enter email
    And Click Send button at forgot password page
    Then Display an error message for e-mail address fields

  Scenario: User click text "Did you already remember your password? Try logging in."
    Given Go to the Password screen
    When Click text "Did you already remember your password - Try logging in."
    Then Will go to login page







