Feature: Login to the application

Scenario Outline: Login to application with different User
Given User is on login page
When User enters "<Username>" on the login page
And User enters "<Password>" on the login page
Then User failed to login to the application

Examples:
| Username | Password |
| invaliduser | 1234 |
| poojak | invalidpwd |
| invaliduser | invalidpwd |