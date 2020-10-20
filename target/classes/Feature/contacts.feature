Feature: Free CRM Add Contacts Feature

Scenario Outline: FreeCRM Login Test Scenario

Given User is already on login page
When Title of login page is Free CRM
Then User enters "<username>" and "<password>"
Then User clicks on login button
Then User is on HomePage
Then User moves to new contacts page
Then User types "<firstname>", "<lastname>" and "<position>"
Then Close Browser
 
Examples:
	|username|password|firstname|lastname|position|
	|raviteja|hero|ravi|teja|sr. qa engineer|
	|namename|passpass|namer|namey|hithere|

#Pending step definitions