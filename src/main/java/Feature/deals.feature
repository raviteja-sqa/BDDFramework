Feature: Deal Data Creation

# Scenario outline only for examples
@SmokeTest
Scenario: FreeCRM Login Test Scenario


Given User is already on login page
When Title of login page is Free CRM
Then User enters username and password
|ravi|test123|  
Then User clicks on login button
Then User is on HomePage
Then User moves to new deals page
Then User types deals details
|testdeal|1000|5|10|
Then Close Browser