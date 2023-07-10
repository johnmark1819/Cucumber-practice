Feature: validate the browser search
Scenario: validate the seaching keyword with value
Given open the chromebrowser
And load the urlofchrome
When provide the input as "frank" and click enter
Then quit
