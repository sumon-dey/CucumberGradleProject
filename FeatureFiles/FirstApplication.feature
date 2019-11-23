@FirstApplicationFeature

Feature: This is the First Application
This is a sample application

@ScenarioFirst1
Scenario: This is Scenario 1 of the First Application
and this is opened in the Chrome browser
  Given user opens the "Chrome" browser
  And user is using the application "Web"
  And user opens the URL "https://www.google.com" in the browser
  And user enters the text "Hello Web" in the textbox "Search"
  And user clicks on the "Search" button
  And user clicks on the "User" radiobutton

@ScenarioFirst2
Scenario: This is Scenario 2 of the First Application
  Given user opens the "IE" browser
  And user is using the application "Mobile"
  And user opens the URL "https://www.facebook.com" in the browser
  And user enters the text "Hello Mobile" in the textbox "Search"
  And user clicks on the "Search" button
  And user clicks on the "User" radiobutton

@ScenarioFirst3
Scenario: This is Scenario 3 of the First Application
  Given user opens the "Firefox" browser
  And user is using the application "Web"
  And user opens the URL "https://www.cricbuzz.com" in the browser
  And user enters the text "Hello Mobile" in the textbox "Search"
  And user clicks on the "Search" button
  And user clicks on the "User" radiobutton
  
@ScenarioFirst4
Scenario Outline: This is Scenario 4 of the First Application
  Given user opens the "<browserName>" browser
  And user is using the application "<applicationName>"
  Examples:
  |browserName|applicationName|
  |Chrome             |Web                       |
  |Firefox               |Mobile                   |

