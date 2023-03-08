Feature:


  Scenario Outline: user insert correct account information on find transaction tab and see information
      #given: i will choose option one by one and collect needed inputs by "tableTakeInputs" List<String>
      #if i want result to be not corect i will make "tableTakeInputs" List<String> nested switch.
    Given user on Account Activity page
    When user click find transaction tab to search option <option> <any> <description>
      # any create a void method that choose dropdown option by String as a paramiter
    And user choose type of transaction <any>
      #hear i will use already created method - void input_click_clear(List<String> input, WebElement bar)
    Then user input correct information <input> to see transaction details
      #Assert the result (if it correct parent table shood contain description name), if not - no result

    Examples:
      | any   | description   | option | input         |
      | "any" | "description" | 0      | "description" |
      | "any" | "description" | 1      | "description" |
      | "any" | "description" | 2      | "description" |
      | "any" | "description" | 3      | "description" |
      | "any" | "description" | 5      | "description" |
      | "any" | "description" | 4      | "description" |

      | "any" | "data"        | 0      | "dataF"       |
      | "any" | "data"        | 1      | "dataF"       |
      | "any" | "data"        | 2      | "dataF"       |
      | "any" | "data"        | 3      | "dataF"       |
      | "any" | "data"        | 4      | "dataF"       |
      | "any" | "data"        | 5      | "dataF"       |

      | "any" | "data"        | 0      | "dataT"       |
      | "any" | "data"        | 1      | "dataT"       |
      | "any" | "data"        | 2      | "dataT"       |
      | "any" | "data"        | 3      | "dataT"       |
      | "any" | "data"        | 4      | "dataT"       |
      | "any" | "data"        | 5      | "dataT"       |


      | "any" | "deposit"     | 0      | "amountF"     |
      | "any" | "deposit"     | 1      | "amountF"     |
      | "any" | "deposit"     | 2      | "amountF"     |
      | "any" | "deposit"     | 3      | "amountF"     |
      | "any" | "deposit"     | 4      | "amountF"     |
      | "any" | "deposit"     | 5      | "amountF"     |

      | "any" | "deposit"     | 0      | "amountT"     |
      | "any" | "deposit"     | 1      | "amountT"     |
      | "any" | "deposit"     | 2      | "amountT"     |
      | "any" | "deposit"     | 3      | "amountT"     |
      | "any" | "deposit"     | 4      | "amountT"     |
      | "any" | "deposit"     | 5      | "amountT"     |

      | "any" | "withdrawal"  | 0      | "amountF"     |
      | "any" | "withdrawal"  | 1      | "amountF"     |
      | "any" | "withdrawal"  | 2      | "amountF"     |
      | "any" | "withdrawal"  | 3      | "amountF"     |
      | "any" | "withdrawal"  | 4      | "amountF"     |
      | "any" | "withdrawal"  | 5      | "amountF"     |

      | "any" | "withdrawal"  | 0      | "amountT"     |
      | "any" | "withdrawal"  | 1      | "amountT"     |
      | "any" | "withdrawal"  | 2      | "amountT"     |
      | "any" | "withdrawal"  | 3      | "amountT"     |
      | "any" | "withdrawal"  | 4      | "amountT"     |
      | "any" | "withdrawal"  | 5      | "amountT"     |



    Examples:
    Examples:
      | any       | description   | option | input         |
      | "deposit" | "description" | 0      | "description" |
      | "deposit" | "description" | 1      | "description" |
      | "deposit" | "description" | 2      | "description" |
      | "deposit" | "description" | 3      | "description" |
      | "deposit" | "description" | 5      | "description" |
      | "deposit" | "description" | 4      | "description" |

      | "deposit" | "data"        | 0      | "dataF"       |
      | "deposit" | "data"        | 1      | "dataF"       |
      | "deposit" | "data"        | 2      | "dataF"       |
      | "deposit" | "data"        | 3      | "dataF"       |
      | "deposit" | "data"        | 4      | "dataF"       |
      | "deposit" | "data"        | 5      | "dataF"       |

      | "deposit" | "data"        | 0      | "dataT"       |
      | "deposit" | "data"        | 1      | "dataT"       |
      | "deposit" | "data"        | 2      | "dataT"       |
      | "deposit" | "data"        | 3      | "dataT"       |
      | "deposit" | "data"        | 4      | "dataT"       |
      | "deposit" | "data"        | 5      | "dataT"       |


      | "deposit" | "deposit"     | 0      | "amountF"     |
      | "deposit" | "deposit"     | 1      | "amountF"     |
      | "deposit" | "deposit"     | 2      | "amountF"     |
      | "deposit" | "deposit"     | 3      | "amountF"     |
      | "deposit" | "deposit"     | 4      | "amountF"     |
      | "deposit" | "deposit"     | 5      | "amountF"     |

      | "deposit" | "deposit"     | 0      | "amountT"     |
      | "deposit" | "deposit"     | 1      | "amountT"     |
      | "deposit" | "deposit"     | 2      | "amountT"     |
      | "deposit" | "deposit"     | 3      | "amountT"     |
      | "deposit" | "deposit"     | 4      | "amountT"     |
      | "deposit" | "deposit"     | 5      | "amountT"     |

      | "deposit" | "withdrawal"  | 0      | "amountF"     |
      | "deposit" | "withdrawal"  | 1      | "amountF"     |
      | "deposit" | "withdrawal"  | 2      | "amountF"     |
      | "deposit" | "withdrawal"  | 3      | "amountF"     |
      | "deposit" | "withdrawal"  | 4      | "amountF"     |
      | "deposit" | "withdrawal"  | 5      | "amountF"     |

      | "deposit" | "withdrawal"  | 0      | "amountT"     |
      | "deposit" | "withdrawal"  | 1      | "amountT"     |
      | "deposit" | "withdrawal"  | 2      | "amountT"     |
      | "deposit" | "withdrawal"  | 3      | "amountT"     |
      | "deposit" | "withdrawal"  | 4      | "amountT"     |
      | "deposit" | "withdrawal"  | 5      | "amountT"     |

    Examples:
      | any          | description   | option | input         |
      | "withdrawal" | "description" | 0      | "description" |
      | "withdrawal" | "description" | 1      | "description" |
      | "withdrawal" | "description" | 2      | "description" |
      | "withdrawal" | "description" | 3      | "description" |
      | "withdrawal" | "description" | 5      | "description" |
      | "withdrawal" | "description" | 4      | "description" |

      | "withdrawal" | "data"        | 0      | "dataF"       |
      | "withdrawal" | "data"        | 1      | "dataF"       |
      | "withdrawal" | "data"        | 2      | "dataF"       |
      | "withdrawal" | "data"        | 3      | "dataF"       |
      | "withdrawal" | "data"        | 4      | "dataF"       |
      | "withdrawal" | "data"        | 5      | "dataF"       |

      | "withdrawal" | "data"        | 0      | "dataT"       |
      | "withdrawal" | "data"        | 1      | "dataT"       |
      | "withdrawal" | "data"        | 2      | "dataT"       |
      | "withdrawal" | "data"        | 3      | "dataT"       |
      | "withdrawal" | "data"        | 4      | "dataT"       |
      | "withdrawal" | "data"        | 5      | "dataT"       |


      | "withdrawal" | "deposit"     | 0      | "amountF"     |
      | "withdrawal" | "deposit"     | 1      | "amountF"     |
      | "withdrawal" | "deposit"     | 2      | "amountF"     |
      | "withdrawal" | "deposit"     | 3      | "amountF"     |
      | "withdrawal" | "deposit"     | 4      | "amountF"     |
      | "withdrawal" | "deposit"     | 5      | "amountF"     |

      | "withdrawal" | "deposit"     | 0      | "amountT"     |
      | "withdrawal" | "deposit"     | 1      | "amountT"     |
      | "withdrawal" | "deposit"     | 2      | "amountT"     |
      | "withdrawal" | "deposit"     | 3      | "amountT"     |
      | "withdrawal" | "deposit"     | 4      | "amountT"     |
      | "withdrawal" | "deposit"     | 5      | "amountT"     |

      | "withdrawal" | "withdrawal"  | 0      | "amountF"     |
      | "withdrawal" | "withdrawal"  | 1      | "amountF"     |
      | "withdrawal" | "withdrawal"  | 2      | "amountF"     |
      | "withdrawal" | "withdrawal"  | 3      | "amountF"     |
      | "withdrawal" | "withdrawal"  | 4      | "amountF"     |
      | "withdrawal" | "withdrawal"  | 5      | "amountF"     |

      | "withdrawal" | "withdrawal"  | 0      | "amountT"     |
      | "withdrawal" | "withdrawal"  | 1      | "amountT"     |
      | "withdrawal" | "withdrawal"  | 2      | "amountT"     |
      | "withdrawal" | "withdrawal"  | 3      | "amountT"     |
      | "withdrawal" | "withdrawal"  | 4      | "amountT"     |
      | "withdrawal" | "withdrawal"  | 5      | "amountT"     |


  Scenario Outline: user insert incorrect account information on find transaction tab and don't see result
      #given: i will choose option one by one and collect needed inputs by "tableTakeInputs" List<String>
      #if i want result to be not corect i will make "tableTakeInputs" List<String> nested switch.
    Given user on Account Activity page
    When user click find transaction tab to search option <description>
      # any create a void method that choose dropdown option by String as a paramiter
    And user choose type of transaction <any>
      #hear i will use already created method - void input_click_clear(List<String> input, WebElement bar)
    Then user input incorrect information <input> to see transaction details <information>
      #Assert the result (if it correct parent table shood contain description name), if not - no result
    Examples:
      | any   | description   | input         | information          |
      | "any" | "description" | "dataT"       | "1990-03-12"         |
      | "any" | "description" | "dataF"       | "2050-03-01"         |
      | "any" | "description" | "amountT"     | "0"                  |
      | "any" | "description" | "amountF"     | "10000000"           |
      | "any" | "description" | "description" | "badTransaction"     |
      | "any" | "description" | "description" | "veryBadTransaction" |