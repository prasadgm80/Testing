Feature: Application login


//Background:
//Given validate the browser
//When Browser is triggered
//Then Check if browser is started


@Regression
Scenario: HomePage default login
Given User is on login page
When  User logged in with username "efgh" and password "5678"
Then Home page is populated
And cards are displayed "True"

@Smoke
Scenario: HomePage default login
Given User is on login page
When  User logged in with username "abcd" and password "1234"
Then Home page is populated
And cards are displayed "False"

@Sanity
Scenario: HomePage default login
Given User is on login page
When User sign up with following detils
| Ned | Stark | ned.stark@got.com | Winterfell | 123456 |
Then Home page is populated
And cards are displayed "False"

@Regression @Smoke
Scenario Outline: HomePage default login
Given User is on login page
When User logged in to application with username <Username> and password <Password> 
Then Home page is populated
And cards are displayed "True"

Examples:
| Username | Password |
| User1    | Pass1    |
| User2    | Pass1    |
| User3    | Pass3    |
| User4    | Pass4    |
| User5    | Pass5    |
