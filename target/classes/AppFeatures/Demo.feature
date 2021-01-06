Feature: Google Search

Scenario: Validate the google search
Given user opens the browser
When user navigates to google.com
Then enters the search values as "Dinesh"
And users clicks the search button
Then search result should be displayed sucessfully 
