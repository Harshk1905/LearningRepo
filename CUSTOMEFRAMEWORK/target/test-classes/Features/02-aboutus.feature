Feature: aboutus

  Scenario: Verify that About Us page should be open
    Given user open "edge" browser and enter "http://tutorialsninja.com/demo"
    When user click on about us link
    Then verify the About us page is opened
