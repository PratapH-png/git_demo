#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Test Rubix Functionality

  Scenario: Check Rubix web page is successful
    Given browser is open
    When the user launches the application
    And the application should open successfully on the respective platform
    And the user should be navigated to the respective page displaying its content
		 And a user clicks on the "AI INTERNSHIP" module
    And the drop-down menu should appear, displaying all relevant contents
    And clicking on any item in the drop-down menu
    And a user clicks on the back button or the logo
    And a user enters their name, email address, and mobile number into the fields on the "Contact Us" page and clicks the "Send Message" button
    Then the information should be submitted successfully