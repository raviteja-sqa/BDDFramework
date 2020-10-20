Feature: Free CARM login Feature

Scenario: FreeCRM Login Test Scenario

# Simple data-driven testing without Examples Keyword

Given User is already on login page
When Title of login page is Free CRM
Then User enters "hi@gmail.com" and "1234"
Then User clicks on login button
Then Close Browser

#With Examples Keyword

Scenario Outline: FreeCRM Login Test Scenario

Given User is already on login page
When Title of login page is Free CRM
Then User enters "<username>" and "<password>"
Then User clicks on login button
Then Close Browser

Examples:
	|username|password|
	|raviteja|hithere|
	|namename|passpass|

