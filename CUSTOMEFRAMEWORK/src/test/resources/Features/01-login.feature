Feature: login

  Scenario: verify that login page should open
    Given user open "edge" browser and enter "http://tutorialsninja.com/demo"
    When user click on my account link
    And user click on login link
    Then verify that login page should open

  @Smoke
  Scenario: Verify that user should be able to login
    Given user open "edge" browser and enter "http://tutorialsninja.com/demo"
    When user click on my account link
    And user click on login link
    Then verify that login page should open
    When user enter "<email>" in email textbox
    And user enter "<password>" in password textbox
    And user click on login button
    Then verify that user should be able to login

    Examples:
      | email              | password    |
      | test1234@gmail.com | testpass123 |
      | qa1@gmail.com      | qa@1234     |
      
