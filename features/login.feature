@Facebook
Feature: Facebook feature
  I want to test facebook application

  @LoginTag
  Scenario: Login scenario
    Given I am a user of facebook application
    When User enter username
    And  User enter password
    And  User click on login button
    Then User should be able to login successfully
 

 
