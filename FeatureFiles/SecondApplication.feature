@SecondApplicationFeature

Feature: This is the Second Application
This is a sample application

  @ScenarioSecond1
  Scenario: This is Scenario 1 of the Second Application
    Given user opens the "IE" browser
    And user is using the application "Mobile"
    And user opens the URL "https://www.facebook.com" in the browser
    And user enters the text "Hello Mobile" in the textbox "Search"
    And user clicks on the "Search" button
    And user clicks on the "User" radiobutton

  @ScenarioSecond2
  Scenario: This is Scenario 2 of the Second Application
    Given user opens the "Firefox" browser
    And user is using the application "Web"
    And user opens the URL "https://www.cricbuzz.com" in the browser
    And user enters the text "Hello Mobile" in the textbox "Search"
    And user clicks on the "Search" button
    And user clicks on the "User" radiobutton

  @ScenarioSecond3
  Scenario Outline: This is Scenario 3 of the Second Application
    Given user opens the "<browserName>" browser
    And user is using the application "<applicationName>"

    Examples: 
      | browserName | applicationName |
      | Chrome      | Web             |
      | Firefox     | Mobile          |
