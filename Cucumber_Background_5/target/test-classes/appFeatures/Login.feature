Feature: Login feature checking

Background:
Given chrome browser is launched
When url is put in the browser
And enter key is pressed

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
