Feature: contactus

  Scenario: Verify Contact Us page shoud be open
    Given user open "edge" browser and enter "http://tutorialsninja.com/demo"
    When user click on contact us link
    Then verify that contact us page is open
    When user  fill the contact us form
    And click on submit button
