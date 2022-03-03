Feature: User Registration

Scenario: User able to register with different data
Given User is on registration page 
When User enters following details
| pooja | kharatmol | pk@gmail.com | 8888 |
| rimpa | ghosh | rg@gmail.com | 9999 |
Then user register successfully

Scenario: User able to register with different data in columns
Given User is on registration page 
When User enters following details with columns
| firstname | lastname | mail | phone|
| pooja | kharatmol | pk@gmail.com | 8888 |
| rimpa | ghosh | rg@gmail.com | 9999 |
Then user register successfully


