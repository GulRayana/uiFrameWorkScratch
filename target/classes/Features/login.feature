
Feature: Login functionality

  Background: land to home page
    Given Go to login page "https://gulsultan.talentlms.com/"
     @smoke
    Scenario: Positive login with valid credentials as Admin
      Given Enter "gulsultan" in userName or Email input field
      And Enter "grhi95janna" in password input field
      When user click on login button
      Then user should successfully logged in