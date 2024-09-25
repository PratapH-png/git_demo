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
@Regression
Feature: Login Page Feature
  I want to use this template for my loginPage feature file

Background: Pre Condition
Given I am the user of an application
  @test-1
  Scenario: To validate valid login scenario
    When User enter valid username
    And User enter valid password
    And User click on login button
    Then User should be able to login successfully

  @test-2
  Scenario: To validate invalid login scenario
 	 	When User enter invalid username
    And User enter invalid password
    And User click on login button
    Then User should not be able to login successfully