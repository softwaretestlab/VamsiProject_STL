
Feature: HN Homepage
  @SecondScenario
  Scenario: Navigate to HN website
    Given open browser and enter url and navigate to HN website
    Then get title and assert
@Regression
  Scenario: Login to Homepage
  Given Enter username
  Then Enter Password
  And click on login button
  Then should be on Account screen




#test

    #one feature file can have multiple Scenarios under it
#Featrue = user story
  #Scenario = test case
      #    #Steps
      #    Given
      #    When
      #    Then
      #    But
      #    AND
      #    *