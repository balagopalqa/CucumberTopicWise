Feature: Login feature checking

Scenario Outline: Check login with multiple username and password
Given user is on login page
When user enters "<username>"
And  user enters1 "<password>"
And clicks login button


Examples:
|username|password|
|balagopal|Test@123|
|sairam|new@123|

