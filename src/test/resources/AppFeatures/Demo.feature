Feature: Google Search

Scenario: Validate the google search
Given user navigates to google.com
Then enters the search values as "Dinesh UK"
And users clicks the search button
Then search result should be displayed sucessfully 
