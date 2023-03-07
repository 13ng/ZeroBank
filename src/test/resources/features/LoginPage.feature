@login
Feature: ZeroBank app login feature

  Background:
    Given User on the login page

    Scenario Outline:  user successfully login
    When user enters username <username>
    And user enters password <password>
    And user puts signIn button
      And user gets on a <page>
     Then user logouts
      Examples:
         | username  | password | page |
         | "true"  | "true" | "Home" |


  Scenario Outline: user puts wrong username
       When user enters username <username>
        And user enters password <password>
        And user puts signIn button
        Then user see error message
    Examples:
      | username  | password |
      | "Abdula"  | "true" |
      | "NeAbdula"  | "true" |
      | "Cat"  | "true" |
      | "Dog"  | "true" |
      | "Sirena"  | "true" |
      #  Then user should see - Login and/or password are wrong.
  Scenario Outline: user puts wrong password
    When user enters username <username>
    And user enters password <password>
    And user puts signIn button
    Then user see error message
    Examples:
      | username  | password |
      | "true"  | "false" |
      | "true"  | "false" |
      | "true"  | "false" |
      | "true"  | "false" |
      | "true"  | "false" |
  Scenario Outline: user puts empty password
    When user enters username <username>
    And user enters password <password>
    And user puts signIn button
    Then user see error message
    Examples:
      | username  | password |
      | "true"  | "empty" |


  Scenario Outline: user puts empty username
    When user enters username <username>
    And user enters password <password>
    And user puts signIn button
    Then user see error message
    Examples:
      | username  | password |
      |  "empty"  | "true" |


  Scenario Outline: user puts blank username
    When user enters username <username>
    And user enters password <password>
    And user puts signIn button
    Then user see error message
    Examples:
      | username  | password |
      |  "blank"  | "true" |


  Scenario Outline: user puts blank password
    When user enters username <username>
    And user enters password <password>
    And user puts signIn button
    Then user see error message
    Examples:
      | username  | password |
      | "true"  | "blank"  |

