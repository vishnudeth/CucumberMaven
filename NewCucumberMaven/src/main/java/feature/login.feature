Feature: Facebook login
 
Scenario: Facebook Login Scenario

Given user is already on login page
When title of the login page is facebook login
Then user enters username and password
Then user clicks submit button
Then user enters to home page 