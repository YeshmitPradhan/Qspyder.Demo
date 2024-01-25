#Author : Susis

Feature: Login to Vtiger application

Scenario: Login to application with valid credentials
Given I want to launch the browser
And I want to load the url
When Login page is displayed enter Username and Password
And Click on login button
Then Validate for homepage