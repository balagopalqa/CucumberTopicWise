Feature: User creation of Amazon

Scenario: Create multiple users
Given user is on registartion page
When user enters following user details
|naveen|automation|nav@gmail.com|9874|Bangalore|
|sai|manual|mav@gmail.com|6757|Chennai|
Then user registration successful
