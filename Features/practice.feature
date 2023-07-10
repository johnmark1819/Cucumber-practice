Feature: Validating the login functionality
 Scenario Outline: Validating  the different inputs
 Given open a chrome browser
 When  load a url
 When provide <username> and <password> in text fields
 And click submit button
 Then verify the outcome
  
  Examples:
  | username | password    |
  | student  | Password123 |
  | student  |Password123  |