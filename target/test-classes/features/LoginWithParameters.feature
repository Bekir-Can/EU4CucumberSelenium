Feature: Login as different users

  Scenario: login as a driver user
    Given the user is on the login page
    When the user logs in using "User10" and "UserUser123"
    Then the user should be able to login
    And the title contains "Dashboard"
  @wip
    Scenario: Verify Create Calendar Event
      Given the user is on the login page
      And the user enters the sales manager information
      When the user navigates to "Activities" "Calendar Events"
      Then the title contains "Calendars"
#added "s" at the end of Calendar to give fail to get report and screenshot.It can be any codes just gives fail...
        #homework
  Scenario: login as a driver
    Given the user logged in as "usertype"
    Then the user should be able to login
    And the title contains "Dashboard"
    #driver,storemanager,salesmanager
   #you will have one step definition and it will handle different user types