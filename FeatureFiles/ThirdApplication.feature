@ThirdApplicationFeature

Feature: This is the Third Application
This is a sample application

  @ScenarioThird1
  Scenario: This is Scenario 1 of the Third Application
    Given user opens the "Chrome" browser
    And user is using the application "Web"
    And user opens the URL "https://www.web.com" in the browser
    And user enters the text "Hello Web" in the textbox "SearchWeb"
    And user clicks on the "SearchWeb" button
    And user clicks on the "Web User" radiobutton

  @ScenarioThird2
  Scenario: This is Scenario 2 of the Third Application
    Given user opens the "IE" browser
    And user is using the application "Mobile"
    And user opens the URL "https://www.mobile.com" in the browser
    And user enters the text "Hello Mobile" in the textbox "SearchMobile"
    And user clicks on the "SearchMobile" button
    And user clicks on the "Mobile User" radiobutton
