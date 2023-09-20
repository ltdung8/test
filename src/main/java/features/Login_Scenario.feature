#Feature: User do Login function to login into the system
#
#  Scenario Outline: User clicks Login button after entered invalid email
#    Given Go to the Login screen
#    When User enters invalid email as "<email_string>"
#    And Does not enter password
#    And Click Login button
#    Then Display an error message for invalid email
#
#    Examples:
#    | email_string |
#    | abc@@abc.com |
#
#  Scenario: User clicks Login button after entered nothing
#    Given Go to the Login screen
#    When Does not enter email
#    And Does not enter password
#    And Click Login button
#    Then Display an error message for required fields
#
#  Scenario: User clicks text "Forgot your password?"
#    Given Go to the Login screen
#    When Click text "Forgot your password"
#    Then Will go to forgot password page
#
#  Scenario: User clicks text "Didn't receive a verification email?"
#    Given Go to the Login screen
#    When Click text "Didn't receive a verification email"
#    Then Will go to verification email page
#
#  Scenario: User clicks text "Don't have an account yet? Sign up."
#    Given Go to the Login screen
#    When Click text "Don't have an account yet"
#    Then Will go to signup page
#
#  # Test back button
#  Scenario: User clicks button Back after go to page forgot password
#    Given Go to the Login screen
#    When Click text "Forgot your password"
#    And Click back button
#    Then Will go to login page
#
#  Scenario: User clicks button Back after go to page verification email
#    Given Go to the Login screen
#    When Click text "Didn't receive a verification email"
#    And Click back button
#    Then Will go to login page
#
#  Scenario: User clicks button Back after go to page Sign up
#    Given Go to the Login screen
#    When Click text "Don't have an account yet"
#    And Click back button
#    Then Will go to login page
#
#
#
#
