
Feature: Validating the google search feature
@Smoke
Scenario: Validating the search function with iphone keyword
 Given open an browser
 Given load the url
 When In the textbox provide iphone has input and press enter key
 And close
 Then verify the results
  