Feature: Application Login

  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User login to our application with "jin" and password "1234"
    Then Home page is populated
    And Display cards "true"


  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User login to our application with "John" and password "4321"
    Then Home page is populated
    And Display cards "false"


  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User signs up with the following details
      | jenny | abcd | jenny@abdc.com | US | 5551234567 |
    Then Home page is populated
    And Display cards "false"

  Scenario Outline: Home page default login
    Given User is on NetBanking landing page
    When User logins into application with "<Username>" and password "<Password>"
    Then Home page is populated
    And Display cards "true"

    Examples:
    | Username  | Password  |
    | user1     | pass1     |
    | user2     | pass2     |
    | user3     | pass3     |
    | user4     | pass4     |




