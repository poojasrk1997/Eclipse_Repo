
Feature: Amazon Order Search
  I have to search previous orders and cancelled orders

  Background: 
    Given You are existing user
    Given You are on login page
    When You enter username
    And You enter password
    And Login to Amazon
    

@Smoke @Regression
  Scenario: Search Previous Orders
    Then Go to Previous order link
    
@Regression
  Scenario: Search Cancelled Orders
    Then Go to Cancelled order link
