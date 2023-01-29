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

@new1
Scenario:Check login with valid username and invalid password
Given user is on login page
When user enters valid username "Balagopal"
And  user enters  invalid password "1233"
And clicks login button