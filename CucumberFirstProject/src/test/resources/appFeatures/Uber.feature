Feature: Uber Search

@SmokeTest
Scenario: Booking Sedan Cab
Given User wants to select car type "Sedan" from uber app
When User selects car type as "Sedan" and pickup location is "Pune" and drop location is "Mumbai"
Then Driver starts the journney
And Driver ends the journey
Then User pays 1000 USD

@RegressionTest
Scenario: Booking Mini Cab
Given User wants to select car type "Sedan" from uber app
When User selects car type as "Mini" and pickup location is "Pune" and drop location is "Mumbai"
Then Driver starts the journney
And Driver ends the journey
Then User pays 1000 USD

@ProdTest
Scenario: Booking Honda Cab
Given User wants to select car type "Sedan" from uber app
When User selects car type as "Honda" and pickup location is "Pune" and drop location is "Mumbai"
Then Driver starts the journney
And Driver ends the journey
Then User pays 1000 USD