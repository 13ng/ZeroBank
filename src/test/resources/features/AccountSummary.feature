@account_summary
Feature: Account Summary


  Background:
    Given user on "Account Summary" page


  Scenario Outline: user choose account with balance not 0
    When user click on account <account>
    And user see transactions information
    Then user click on link <link>
    # - solve the problem with Assert
    Examples:
      | account | link              |
      | "0"     | "Account Summary" |
      | "1"     | "Account Summary" |
      | "2"     | "Account Summary" |
      | "3"     | "Account Summary" |
      | "4"     | "Account Summary" |
      | "5"     | "Account Summary" |

  Scenario Outline: user choose account with balance 0
    When user click on account with balance zero <account>
    And user can not see transactions information
    Then user click on link <link>
    Examples:
      | account | link   |
      | "2"     | "link" |
