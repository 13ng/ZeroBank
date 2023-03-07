Feature:


  Scenario Outline: user make a transaction from positive balance account
    Given user on Transfer Funds page
    When user choose account <account1> to make transaction from
    And user choose account <account2> to make transaction to
    And user enter amount <amount> for transfer
    And user enter description name <description>
    And user clicks continue button
    And user confirms transaction
    Then user see message about successful transaction
    Examples:
      | account1 | account2 | amount |description|
      | 0        | 2        | "1"      |"testDescription1"|
      | 2        | 3        | "1"      |"testDescription2"|
      | 3        | 4        | "1"      |"testDescription3"|
      | 5        | 5        | "1"      |"testDescription4"|


  Scenario Outline: user make a transaction from negative balance account
    Given user on Transfer Funds page
    When user choose account <account1> to make transaction from
    And user choose account <account2> to make transaction to
    And user enter amount <amount> for transfer
    And user enter description name <description>
    And user clicks continue button
    And user confirms transaction
    Then  user can not see message about successful transaction
    Examples:
      | account1 | account2 | amount |description|
      | 1       | 2        | "1"      |"testDescription5"|
      | 4        | 3        | "1"      |"testDescription6"|

  @wip
Scenario Outline: user try to find new transaction by description
  Given user on Account Activity page
  When user click on find transaction tab
  And user input new description in description bar <description>
  And user click find button
  Then user see new transaction information in a table
  Examples:
    | description       |
    | "testDescription1" |
    | "testDescription2" |
    | "testDescription3" |
    | "testDescription4" |
    | "testDescription5" |
    | "testDescription6" |