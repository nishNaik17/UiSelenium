@tag
Feature: Login to ShettyPage Website
  I want to use this template for my feature file

Background:
Given I land on the Website Page



  @tag1
  Scenario Outline: Title of your scenario outline
    Given The User enters the username <name> and password <password>
    When I click on the submit button
    Then I verify the ErrorMessage <ErrorMessage> in step
    And Logout the Website

    Examples: 
      | name  | password           | ErrorMessage                    |
      | rahul | rahulshettyacademy | You are successfully logged in. |
