Feature: login functionality

Scenario Outline: unsuccessful login attempt
Given user should be on login page
Then user invalid "<username>"
And user enters invalid "<password>" 
Then user clicks on login button
And user should able to see landing page
Examples:

|username|password|
|uddv|fdgh|
|pandya|kaakdi|



 