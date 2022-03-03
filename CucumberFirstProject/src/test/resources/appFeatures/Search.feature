
Feature: Amazon Search

@Smoke
Scenario: Search a apple Product
Given I have search field on Amazon page 
When I have search the product "Apple Macbook Air" and price 1000
Then Product with name "Apple Macbook Air" should be displayed

@Regression
Scenario: Search a samsung Product
Given I have search field on Amazon page 
When I have search the product "Apple Macbook Air" and price 1000
Then Product with name "Apple Macbook Air" should be displayed