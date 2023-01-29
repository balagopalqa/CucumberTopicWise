Feature: Login feature checking

Scenario:Check login with valid username and password
Given user is on login page
When user enters username
And  user enters password
And clicks login button

@smoke
Scenario:Check login with invalid username and password
Given user is on login page
When user enters invalid username
And  user enters  invalid password
And clicks login button

@regression
Scenario:Check login with blank username and password
Given user is on login page
When user leaves blank username
And  user leaves blank password
And clicks login button
