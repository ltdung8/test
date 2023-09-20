Feature: User do registry function to registry into the system
  Scenario: User clicks on the "Create account" button without entering the required fields
    Given User opens the Open an account Private investor screen on the PC browser
    When User goes to the Open an account Private investor screen
    And User doesn't enter data at the required fields
    And Check at the checkbox of general terms agreement
    And Clicks Create account button
    Then Display the message as "This field is required" at below of each required field

  Scenario Outline: User clicks on the "Create account" button without checking at the checkbox of general terms agreement
    Given User opens the Open an account Private investor screen on the PC browser
    When User goes to the Open an account Private investor screen
    And User enter data at the required fields as "<firstname_string>" "<lastname_string>" "<email_string>" "<password_string>" "<repeat_password_string>"
    And Un-check at the checkbox of general terms agreement
    And Clicks Create account button
    Then Display the message as "You must accept the terms and conditions and the data protection policy in order to continue."

    Examples:
    |firstname_string|lastname_string|email_string|password_string|repeat_password_string|
    |Hoang|Chi Tai|08c1a@gmail.com|12345678a|12345678a|

  Scenario Outline: User clicks Create account button after entered wrong format email
    Given User opens the Open an account Private investor screen on the PC browser
    When User goes to the Open an account Private investor screen
    And Enters wrong format email as "<email_string>"
    And Clicks Create account button
    Then Display the message as "Something does not look right. Please check the e-mail address and try again."

    Examples:
    |email_string|
    |123@@343.com|

#  Scenario RSP_008: User clicks Create account button after entered an email existed in the database
#    Given User opens the Open an account (Private investor)  screen on the PC browser
#    When User goes to the Open an account (Private investor)  screen
#    And Enters invalid email
#    And Clicks Create account button
#    Then Display the message as 'This email address already has an account’

  Scenario Outline: User clicks Create account button after re-entered a password not matched with Password
    Given User opens the Open an account Private investor screen on the PC browser
    When User goes to the Open an account Private investor screen
    And Enters password as "<password_string>"
    And Enters repeat password as "<repeat_string>"
    And Clicks Create account button
    Then Display the message as Both passwords should match.

    Examples:
    |password_string|repeat_string|
    |123456|12345678|

  Scenario: User clicks Create account button after entered wrong format password
    Given User opens the Open an account Private investor screen on the PC browser
    When User goes to the Open an account Private investor screen
    And Enters password as "<password_string>"
    And Clicks Create account button
    Then Display the message as 8 characters or more, at least one letter and one number.

  Scenario Outline: User clicks Create account button after entered valid data at all of fields and checked the checkbox general terms agreement.
    Given User opens the Open an account Private investor screen on the PC browser
    When User goes to the Open an account Private investor screen
    And And Enters First name  "<firstname_string>"
    And Enters Last name as "<lastname_string>"
    And Enters E-mail address as "<email_string>"
    And Enters password as "<password_string>"
    And Enters repeat password as "<repeat_password_string>"
    And Check at the checkbox of general terms agreement
    And Clicks Create account button
    Then An verification email will be sent to user's email address and show a message as "Success!...We have"

    Examples:
    |firstname_string|lastname_string|email_string|password_string|repeat_password_string|
    |Hoang|Chi Tai|08c1a@gmail.com|12345678a|12345678a|

  Scenario: User click "Already registered Login." link
    Given User opens the Open an account Private investor screen on the PC browser
    When User goes to the Open an account Private investor screen
    And Clicks link Already registered_Login
    Then The UI will be back to the Login screen
